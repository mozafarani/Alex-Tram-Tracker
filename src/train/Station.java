package train;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Station {

	private String stop;

	// constructor
	public Station(String stop) {
		this.stop = stop;
	}

	// getting a connection
	protected static Connection connect() {
		Connection conn = null;

		try {
			Class.forName("org.sqlite.JDBC");
			String dbURL = "jdbc:sqlite:train.db";
			conn = DriverManager.getConnection(dbURL);
			// System.out.println("Sqlite db con");

		} catch (Exception l) {
			System.out.println(l);
		}

		return conn;

	}

	protected String nextStop(int track) {

		if (stop.equals("Al Nasr")) {
			return null;
		}

		

		Connection conn = connect();
		String sql = "Select station_id from station where name = \"" + stop + "\"";
		// System.out.println(stop);
		try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

			if (rs.getInt("station_id") == 11) {
				if(track == 1) {
					return "Cleopatra Al Soghra";
				}else if(track == 2 || track == 3) {
					return "Zananere";
				}
				
			} else if (rs.getInt("station_id") == 14) {
				return "Mustafa Kamil";
			} else if (rs.getInt("station_id") == 20) {
				if(track == 3 || track == 1) {
					return "Al Wezara";
				}else {
					return "Al Hedaya";
				}
			} else if (rs.getInt("station_id") == 38) {
				return "San Stefano";
			} else {
				String sql2 = "Select name from station where station_id = " + (rs.getInt("station_id") + 1);
				try (Statement stmt2 = conn.createStatement(); ResultSet rs2 = stmt.executeQuery(sql2)) {

					return rs2.getString("name");

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	protected String prevStop(int track) {

		if (stop.equals("Ramlh")) {
			return null;
		}

		Connection conn = connect();
		String sql = "Select station_id from station where name = \"" + stop + "\"";
		try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

			if (rs.getInt("station_id") == 33) {
				return "Bolkly";
			} else if (rs.getInt("station_id") == 15) {
				return "Sporting Al Kobra";
			} else if (rs.getInt("station_id") == 26) {
				if(track == 1 || track == 3)
					return "Gianaclis";
				else {
					return "Kasr Al Safa";
				}
			} else if (rs.getInt("station_id") == 17) {
				if(track == 1)
					return ("Sidi Gaber Al Sheikh");
				else
					return ("Sidi Gaber Al Mahata");
			} else {
				String sql2 = "Select name from station where station_id = " + (rs.getInt("station_id") - 1) + ";";
				try (Statement stmt2 = conn.createStatement(); ResultSet rs2 = stmt.executeQuery(sql2)) {

					return rs2.getString("name");

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	protected String getStop() {
		return stop;
	}

	protected void setStop(String stop) {
		this.stop = stop;
	}

	// get time(1,2,track)

	protected int getTime(String stop1, String stop2, int track) {

		int num = 0;

		if (track == 1) {
			if (wayFront(stop1, stop2, 1) ) {

				num = getStationNumber(stop1, stop2, 1) * 5;

			}else {
				num = getStationNumber(stop1, stop2, 1) * 5;
			}
		} else if (track == 2) {
			if (wayFront(stop1, stop2, 1)) {

				num = getStationNumber(stop1, stop2,  2) * 2;

			}else {
				num = getStationNumber(stop1, stop2,  2) * 2;
			}
		} else if (track == 3) {
			if (wayFront(stop1, stop2, 3)) {

				num = getStationNumber(stop1, stop2,  3) * 1;

			}else {
				num = getStationNumber(stop1, stop2, 3) * 1;
			}
		}  else {

			return -1;

		}

		return num;
	}

	@SuppressWarnings("rawtypes")
	public int getStationNumber(String stop1, String stop2, int track) {

		int ans = 1;
		int way = 1;
		if(wayFront(stop1,stop2,track)) {
			way = 1;
		}else {
			way = 2;
		}

		if (way == 1) {
			this.stop = stop1;
			while (nextStop(track) != null) {

				

					if (nextStop(track).equals(stop2)) {
						break;
					}

					setStop((String) nextStop(track));

				
				
				ans++;
			}

		} else if (way == 2) {

			this.stop = stop1;
			while (prevStop(track) != null) {

				

					if (prevStop(track).equals(stop2)) {
						break;
					}

					setStop((String) prevStop(track));

				
				
				ans++;
			

			}
		}
		return ans;
	}

	@SuppressWarnings("rawtypes")
	protected boolean wayFront(String stop1, String stop2, int track) {

		this.stop = stop1;
		while (nextStop(track) != null) {

	
				if(nextStop(track).equals(stop2)) {
					return true;
				}
				
				setStop(nextStop(track));
				
			}

		

		return false;
	}

	@SuppressWarnings("rawtypes")
	protected boolean wayBack(String stop1, String stop2, int track) {

		this.stop = stop1;
		while (prevStop(track) != null) {

			if(prevStop(track).equals(stop2)) {
				return true;
			}
			
			setStop(prevStop(track));

		}

		return false;
	}

	protected boolean way(String stop1, String stop2, int track) {

		if (track == 1) {
			if (wayFront(stop1, stop2, 1) || wayBack(stop1, stop2, 1)) {
				return true;
			}
		}
		if (track == 2) {
			if (wayFront(stop1, stop2, 2) || wayBack(stop1, stop2, 2)) {
				return true;
			}
		}
		if (track == 3) {
			if (wayFront(stop1, stop2, 3) || wayBack(stop1, stop2, 3)) {
				return true;
			}
		}

		return false;
	}

	protected int getMoney(String stop1, String stop2, int track) {

		int num = 0;

		if (track == 1) {
			if (wayFront(stop1, stop2, 1) || wayBack(stop1, stop2, 1)) {

				num = (int) (getTime(stop1, stop2,1) * 0.25);

			}
		}
		if (track == 2) {
			if (wayFront(stop1, stop2, 2) || wayBack(stop1, stop2, 2)) {

				num = (int) (getTime(stop1, stop2,2) * 0.5);

			}
		}

		if (track == 3) {
			if (wayFront(stop1, stop2, 3) || wayBack(stop1, stop2, 3)) {

				num = getTime(stop1, stop2,3) * 2;

			}
		}

		return num;
	}

	protected String getCurrentStop(int tracknum) {
		String sql = "Select location from Train where train_no =" + tracknum + ";";
		Connection conn = connect();
		try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

			return rs.getString("location");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
}
