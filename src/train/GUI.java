
package train;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.font.TextAttribute;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import static javax.swing.JOptionPane.showMessageDialog;

public class GUI implements ActionListener {

	private static String user = "";
	private static String password = "";
	private static int kks;
	private static int mmm;
	private static int j;
	private static boolean admin;
	private static String[] options = { "Options" };
	private static JFrame back;
	private static JFrame now;

	private static JFrame main_menu;
	private static JPanel panel;
	private static JTextField usertext;
	private static JPasswordField passtext;
	private static JButton login_button;
	private static JButton guest_button;
	private static JButton new_button;

	private static JFrame main_window;
	private static JFrame guest_window;
	private static JTextPane results;
	private static JButton switcher;
	private static JComboBox<String> from;
	private static JComboBox<String> to;
	private static JButton find_Trains;
	private static JComboBox<String> track;
	private static JLabel race;
	private static JButton newSearch;

	private static JMenuItem ticket;
	private static JMenuItem surprise;
	private static JMenuItem money;
	private static JMenuItem balance;
	private static JMenuItem searchTrain;
	private static JMenuItem train_locate;
	private static JMenuItem remove;
	private static JMenuItem addAdmin;

	private static JMenuItem ticket1;
	private static JMenuItem surprise1;
	private static JMenuItem money1;
	private static JMenuItem balance1;
	private static JMenuItem searchTrain1;
	private static JMenuItem train_locate1;
	private static JMenuItem remove1;
	private static JMenuItem addAdmin1;

	private static JButton enter2;
	private static JComboBox<String> allTrains;
	private static JLabel trainMove;

	private static JButton enter;
	private static JLabel option;
	private static JFrame nw;
	private static JPanel panel4;
	private static JComboBox<String> ops;
	private static JLabel train;
	private static JLabel count;
	private static JButton purchasee;
	private static JTextField county;
	private static JLabel pass_l;
	private static JPasswordField passt;
	private static JLabel user_l;
	private static JTextField usert;
	private static JLabel finalize;
	private static JButton finalle;
	private static JLabel amount;

	private static JTextField userte;
	private static JPasswordField passte;
	private static JButton add;
	private static JLabel wow;
	private static ImageIcon icon4;
	private static JLabel welcome;
	private static JLabel user_la;
	private static JLabel pass_la;
	private static JButton backMain;
	private static JLabel create;
	private static JLabel create2;
	private static JFrame nw2;

	private static JButton adde;
	private static JTextField baltext;
	private static JFrame nw5;

	private static JFrame nw6;

	private static JFrame nw7;
	private static JTextField whichUser;
	private static JButton removeUser;
	private static JLabel gif2;

	private static JFrame nw8;
	private static JButton addNewAdmin;
	private static JButton addPreUser;

	private static JFrame nw9;
	private static JTextField usertex;
	private static JPasswordField passtex;

	private static JFrame nw1;
	private static JButton userAdmin;
	private static JButton makeAdmin;

	public static void main(String args[]) {

		// Main menu stuff
		main_menu = new JFrame("Train App");
		main_menu.setSize(1280, 720);
		main_menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main_menu.setResizable(false);

		panel = new JPanel();

		main_menu.add(panel);
		panel.setLayout(null);

		// panel.setBackground(Color.red);

		// First Label
//		JLabel hey_label = new JLabel("Train Scheduler");
//		hey_label.setForeground(Color.white);
//		
//		Map<TextAttribute, Integer> fontAttributes = new HashMap<TextAttribute, Integer>();
//		fontAttributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
//		
//		hey_label.setFont(new Font("Courier New", Font.ITALIC|Font.BOLD, 32).deriveFont(fontAttributes));
//		
//		hey_label.setBounds(480,20,300,25);
//        panel.add(hey_label);

		// Or label

		JLabel or_label = new JLabel("OR");
		or_label.setForeground(Color.white);

		or_label.setFont(new Font("Proxima Nova", Font.ITALIC | Font.BOLD, 16));

		or_label.setBounds(580, 75, 300, 25);
		panel.add(or_label);

		// User_name and password

		JLabel user_label = new JLabel("Username :");
		user_label.setForeground(Color.white);
		user_label.setBounds(69, 50, 300, 32);
		user_label.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 25));
		panel.add(user_label);

		usertext = new JTextField();
		usertext.setBounds(240, 50, 300, 32);
		panel.add(usertext);

		JLabel pass_label = new JLabel("Password :");
		pass_label.setForeground(Color.white);
		pass_label.setBounds(69, 100, 300, 32);
		pass_label.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 25));
		panel.add(pass_label);

		passtext = new JPasswordField();
		passtext.setBounds(240, 100, 300, 32);
		panel.add(passtext);

		// Buttons
		login_button = new JButton("Login");
		login_button.setBounds(315, 170, 120, 40);
		login_button.addActionListener(new GUI());
		panel.add(login_button);

		guest_button = new JButton("Continue as a Guest");
		guest_button.setBounds(650, 48, 300, 35);
		guest_button.addActionListener(new GUI());
		panel.add(guest_button);

		new_button = new JButton("Create a new user");
		new_button.setBounds(650, 98, 300, 35);
		new_button.addActionListener(new GUI());
		panel.add(new_button);
		// Pictures

		ImageIcon icon = new ImageIcon("Bullet-Train-PNG-HD-2.png");
		JLabel train = new JLabel(icon);
		train.setBounds(320, 20, 1280, 720);
		panel.add(train);

		ImageIcon icon2 = new ImageIcon(
				"space-wallpaper-4k-desktop-images-backgrounds-space-hd-desktop-wallpapers-cool-tumblr-earth-astral-1280x720-1.jpg");
		JLabel background = new JLabel(icon2);
		background.setBounds(0, 0, 1280, 720);
		panel.add(background);

		main_menu.setVisible(true);
		now = main_menu;
		// TicketScreen();
		// makeNewAccount();
		// moveTrain();
		// removeUser();

		////////////////////////////////////////////////////

	}

	@SuppressWarnings("unchecked")
	public void actionPerformed(ActionEvent e) {

		Station x = new Station("Ramlh");

		Connection conn = Station.connect();
		String location = "";

		if (e.getSource() == login_button) {

			user = usertext.getText();
			password = passtext.getText();

			String sql = "SELECT * FROM User;";

			try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

				// loop through the result set
				boolean bool = false;
				boolean bool2 = false;
				while (rs.next()) {

					if (user.equals(rs.getString("username")) && password.equals(rs.getString("password"))) {

						JOptionPane.showMessageDialog(main_menu, "Login Successful!");

						if (rs.getInt("admin") == 1) {
							bool2 = true;
						}

						main_menu.setVisible(false);
						usertext.setText("");
						passtext.setText("");

						bool = true;

					}

				}
				if (bool)
					userScreen(bool2);
				else {
					JOptionPane.showMessageDialog(main_menu, "Login Failed! Try Again!");
					usertext.setText("");
					passtext.setText("");
				}
			} catch (SQLException l) {
				System.out.println(l.getMessage());
			}

		} else if (e.getSource() == guest_button) {

			main_menu.setVisible(false);
			guestScreen();

		}
		if (e.getSource() == switcher) {
			Object fro = from.getSelectedItem();
			Object t = to.getSelectedItem();

			to.setSelectedItem(fro);
			from.setSelectedItem(t);

		} else if (e.getSource() == find_Trains) {

			if (from.getSelectedItem().equals("From") || to.getSelectedItem().equals("To")
					|| track.getSelectedItem().equals("Tracks")
					|| from.getSelectedItem().equals(to.getSelectedItem())) {
				if (track.getSelectedItem().equals("Tracks")) {
					JOptionPane.showMessageDialog(main_window, "You need to select a Track!");
				} else if (from.getSelectedItem().equals("From") || to.getSelectedItem().equals("To"))
					JOptionPane.showMessageDialog(main_window, "You need to select a Station!");
				else
					JOptionPane.showMessageDialog(main_window, "The stations can't be the same!");
			} else {

				if (x.way((String) from.getSelectedItem(), (String) to.getSelectedItem(), 1)
						|| x.way((String) from.getSelectedItem(), (String) to.getSelectedItem(), 2)
						|| x.way((String) from.getSelectedItem(), (String) to.getSelectedItem(), 3)) {

					if (track.getSelectedItem().equals("Track(1) [Ramlh-Al Nasr, Al Nasr-Ramlh]")) {

						String sql = "Select location from train where train_no =1;";

						try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
							location = rs.getString("location");
						} catch (SQLException e1) {
							e1.printStackTrace();
						}

						if (x.wayFront((String) (from.getSelectedItem()), ((String) to.getSelectedItem()), 1)
								|| x.wayBack((String) (from.getSelectedItem()), (String) to.getSelectedItem(), 1)) {

							if (x.getTime((String) from.getSelectedItem(), location, 1) != -1) {

								results.setText("Train #1 is currently in " + location
										+ " Station and will be availabe at " + from.getSelectedItem() + " in "
										+ x.getTime(location, (String) from.getSelectedItem(), 1) + " minutes!\n"
										+ "The total duration from " + from.getSelectedItem() + " to "
										+ to.getSelectedItem() + " is "
										+ x.getTime((String) from.getSelectedItem(), (String) to.getSelectedItem(), 1)
										+ " minutes!");
								race.setVisible(true);
							} else {
								results.setText("Train #1 is currently in " + location + " Station.\n"
										+ "The total duration from " + from.getSelectedItem() + " to "
										+ to.getSelectedItem() + " is "
										+ x.getTime((String) from.getSelectedItem(), (String) to.getSelectedItem(), 1)
										+ " minutes!");
								race.setVisible(true);
							}

						} else {
							results.setText("Train #1 isn't availabe from " + from.getSelectedItem() + " to "
									+ to.getSelectedItem() + ". Try choosing another track.");
						}
					} else if (track.getSelectedItem().equals("Track(2) [Ramlh-Al Nasr, Al Nasr-Ramlh]")) {
						String sql = "Select location from train where train_no =2;";

						try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
							location = rs.getString("location");
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						if (x.wayFront((String) (from.getSelectedItem()), ((String) to.getSelectedItem()), 2)
								|| x.wayBack((String) (from.getSelectedItem()), (String) to.getSelectedItem(), 2)) {

							if (x.getTime((String) from.getSelectedItem(), location, 2) != -1) {

								results.setText("Train #2 is currently in " + location
										+ " Station and will be availabe at " + from.getSelectedItem() + " in "
										+ x.getTime(location, (String) from.getSelectedItem(), 2) + " minutes!\n"
										+ "The total duration from " + from.getSelectedItem() + " to "
										+ to.getSelectedItem() + " is "
										+ x.getTime((String) from.getSelectedItem(), (String) to.getSelectedItem(), 2)
										+ " minutes!");
								race.setVisible(true);
							} else {
								results.setText("Train #2 is currently in " + location + " Station.\n"
										+ "The total duration from " + from.getSelectedItem() + " to "
										+ to.getSelectedItem() + " is "
										+ x.getTime((String) from.getSelectedItem(), (String) to.getSelectedItem(), 2)
										+ " minutes!");
								race.setVisible(true);
							}
						} else {
							results.setText("Train #2 isn't availabe from " + from.getSelectedItem() + " to "
									+ to.getSelectedItem() + ". Try choosing another track.");
						}
					} else if (track.getSelectedItem().equals("Track(3) [Ramlh-San Estefano, San Estefano-Ramlh]")) {
						String sql = "Select location from train where train_no =3;";
						try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
							location = rs.getString("location");
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						if (x.way((String) from.getSelectedItem(), (String) to.getSelectedItem(), 3)) {
							if (x.getTime((String) from.getSelectedItem(), location, 3) != -1) {

								results.setText("Train #3 is currently in " + location
										+ " Station and will be availabe at " + from.getSelectedItem() + " in "
										+ x.getTime(location, (String) from.getSelectedItem(), 3) + " minutes!\n"
										+ "The total duration from " + from.getSelectedItem() + " to "
										+ to.getSelectedItem() + " is "
										+ x.getTime((String) from.getSelectedItem(), (String) to.getSelectedItem(), 3)
										+ " minutes!");
								race.setVisible(true);
							} else {
								results.setText("Train #3 is currently in " + location + " Station.\n"
										+ "The total duration from " + from.getSelectedItem() + " to "
										+ to.getSelectedItem() + " is "
										+ x.getTime((String) from.getSelectedItem(), (String) to.getSelectedItem(), 3)
										+ " minutes!");
								race.setVisible(true);
							}
						} else {
							results.setText("Train #3 isn't availabe from " + from.getSelectedItem() + " to "
									+ to.getSelectedItem() + ". Try choosing another track.");
						}
					}

				} else {
					results.setText("We are sorry to inform you that we currently don't have a way from "
							+ from.getSelectedItem() + " to " + to.getSelectedItem() + "!");
				}

			}
		} else if (e.getSource() == new_button) {
			makeNewAccount();
		} else if (e.getSource() == newSearch) {
			results.setText("");
			to.setSelectedItem("To");
			from.setSelectedItem("From");
			track.setSelectedItem("Tracks");
			race.setVisible(false);
		} else if (e.getSource() == ticket || e.getSource() == ticket1) {

			main_window.setVisible(false);

			TicketScreen(admin);

		} else if (e.getSource() == enter) {
			if (from.getSelectedItem().equals("From") || to.getSelectedItem().equals("To")
					|| from.getSelectedItem().equals(to.getSelectedItem())) {
				if (from.getSelectedItem().equals("From") || to.getSelectedItem().equals("To"))
					JOptionPane.showMessageDialog(main_window, "You need to select a Station!");
				else
					JOptionPane.showMessageDialog(main_window, "The stations can't be the same!");
			} else {

				String s1 = "", s2 = "", s3 = "";

				option.setText("Select any of the options:");
				if (x.way((String) from.getSelectedItem(), (String) to.getSelectedItem(), 1)) {

					String sql = "Select location from train where train_no =1;";
					try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
						location = rs.getString("location");
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					if (x.getTime((String) from.getSelectedItem(), location, 1) != -1) {
						s1 = ("Train #1  is (" + x.getTime((String) from.getSelectedItem(), location, 1)
								+ "  minutes) form " + from.getSelectedItem() + " [and will take ("
								+ x.getTime((String) from.getSelectedItem(), (String) to.getSelectedItem(), 1)
								+ " minutes) to reach " + to.getSelectedItem()) + " [and will cost "
								+ x.getMoney((String) (from.getSelectedItem()), (String) (to.getSelectedItem()), 1)
								+ " L.E. per ticket]";

					} else {
						s1 = ("Train #1  is now in " + from.getSelectedItem() + " [and will take ("
								+ x.getTime((String) from.getSelectedItem(), (String) to.getSelectedItem(), 1)
								+ " minutes) to reach " + to.getSelectedItem()) + " [and will cost "
								+ x.getMoney((String) (from.getSelectedItem()), (String) (to.getSelectedItem()), 1)
								+ " L.E. per ticket]";

					}
				}
				if (x.way((String) from.getSelectedItem(), (String) to.getSelectedItem(), 2)) {
					String sql = "Select location from train where train_no =2;";
					try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
						location = rs.getString("location");
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

					if (x.getTime((String) from.getSelectedItem(), location, 2) != -1) {
						s2 = ("Train #2  is (" + x.getTime((String) from.getSelectedItem(), location, 2)
								+ "  minutes) form " + from.getSelectedItem() + " [and will take ("
								+ x.getTime((String) from.getSelectedItem(), (String) to.getSelectedItem(), 2)
								+ " minutes) to reach " + to.getSelectedItem()) + " [and will cost "
								+ x.getMoney((String) (from.getSelectedItem()), (String) (to.getSelectedItem()), 2)
								+ " L.E. per ticket]";

					} else {
						s2 = ("Train #2  is now in " + from.getSelectedItem() + " [and will take ("
								+ x.getTime((String) from.getSelectedItem(), (String) to.getSelectedItem(), 2)
								+ " minutes) to reach " + to.getSelectedItem()) + " [and will cost "
								+ x.getMoney((String) (from.getSelectedItem()), (String) (to.getSelectedItem()), 2)
								+ " L.E. per ticket]";

					}

				}
				if (x.way((String) from.getSelectedItem(), (String) to.getSelectedItem(), 3)) {
					String sql = "Select location from train where train_no =3;";
					try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
						location = rs.getString("location");
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

					if (x.getTime((String) from.getSelectedItem(), location, 3) != -1) {
						s3 = ("Train #3  is (" + x.getTime((String) from.getSelectedItem(), location, 3)
								+ "  minutes) form " + from.getSelectedItem() + " [and will take ("
								+ x.getTime((String) from.getSelectedItem(), (String) to.getSelectedItem(), 3)
								+ " minutes) to reach " + to.getSelectedItem()) + " [and will cost "
								+ x.getMoney((String) (from.getSelectedItem()), (String) (to.getSelectedItem()), 3)
								+ " L.E. per ticket]";

					} else {
						s3 = ("Train #3  is now in " + from.getSelectedItem() + " [and will take ("
								+ x.getTime((String) from.getSelectedItem(), (String) to.getSelectedItem(), 3)
								+ " minutes) to reach " + to.getSelectedItem()) + " [and will cost "
								+ x.getMoney((String) (from.getSelectedItem()), (String) (to.getSelectedItem()), 3)
								+ " L.E. per ticket]";

					}

				}
				System.out.println(s1);
				panel4.remove(train);
				ops.addItem(s1);
				ops.addItem(s2);
				ops.addItem(s3);

				option.setVisible(true);

				if (!(x.way((String) from.getSelectedItem(), (String) to.getSelectedItem(), 1)
						|| x.way((String) from.getSelectedItem(), (String) to.getSelectedItem(), 2)
						|| x.way((String) from.getSelectedItem(), (String) to.getSelectedItem(), 3))) {
					count.setVisible(false);
					purchasee.setVisible(false);
					county.setVisible(false);
					ops.setVisible(false);

					option.setText("There is currently no way between these 2 stations! Select new stations please.");
					panel4.remove(ops);
				} else {
					to.setVisible(false);
					from.setVisible(false);
					switcher.setVisible(false);
					enter.setVisible(false);
					count.setVisible(true);
					ops.setVisible(true);
					purchasee.setVisible(true);
					county.setVisible(true);
				}
				panel4.add(ops);
				panel4.add(train);

			}
		} else if (e.getSource() == purchasee) {
			if (!isInteger(county.getText(), 10)) {
				JOptionPane.showMessageDialog(main_window, "Please enter a correct amount!");
			} else if (Integer.parseInt(county.getText()) < 0) {
				JOptionPane.showMessageDialog(main_window, "You can purhase a negative amount of tickets!");
			} else if (Integer.parseInt(county.getText()) > 10) {
				JOptionPane.showMessageDialog(main_window, "You can purhase up to 5 tickets!");
			} else if (ops.getSelectedItem().equals("Options") || ops.getSelectedItem().equals("")) {
				JOptionPane.showMessageDialog(main_window, "Please, Select one of the options!");
			} else {

				mmm = (Integer.parseInt(county.getText()));

				if (ops.getSelectedIndex() == 1) {
					kks = x.getMoney((String) (from.getSelectedItem()), (String) (to.getSelectedItem()), 1) * mmm;
					amount.setText("The total cost is " + kks + " L.E.");
				} else if (ops.getSelectedIndex() == 2) {
					kks = x.getMoney((String) (from.getSelectedItem()), (String) (to.getSelectedItem()), 2) * mmm;
					amount.setText("The total cost is " + kks + " L.E.");
				} else {
					kks = x.getMoney((String) (from.getSelectedItem()), (String) (to.getSelectedItem()), 3) * mmm;
					amount.setText("The total cost is " + kks + " L.E.");
				}
				amount.setVisible(true);
				finalize.setVisible(true);
				pass_l.setVisible(true);
				passt.setVisible(true);
				user_l.setVisible(true);
				usert.setVisible(true);
				finalle.setVisible(true);

			}
		} else if (e.getSource() == finalle) {

			if (user.equals(usert.getText()) && passt.getText().equals(password)) {
				Boolean success = false;

				String sql = "Select balance from user where username = \"" + user + "\";";
				try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

					j = rs.getInt("balance");

					if (j >= kks) {
						success = true;
					}

				} catch (SQLException e1) {
					e1.printStackTrace();
				}

				if (success) {

					sql = "UPDATE user SET balance = " + (j - kks) + " WHERE username = \"" + user + "\";";

					try (Statement stmt2 = conn.createStatement()) {

						stmt2.executeUpdate(sql);

					} catch (SQLException e1) {
						e1.printStackTrace();
					}

					int id = 0;

					sql = "SELECT MAX(purchase_id) FROM Purchased;";
					try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

						id = rs.getInt("MAX(purchase_id)");

					} catch (SQLException e1) {
						e1.printStackTrace();
					}

					sql = "INSERT INTO Purchased(username, purchase_id, amount, dollars) VALUES(\"" + user + "\","
							+ (id + 1) + "," + mmm + "," + kks + ");";
					try (Statement stmt = conn.createStatement()) {

						stmt.executeUpdate(sql);

					} catch (SQLException e1) {
						e1.printStackTrace();
					}

					JOptionPane.showMessageDialog(main_menu, "Purchse Successful!");

					nw.setVisible(false);
					main_window.setVisible(true);
					usertext.setText("");
					passtext.setText("");
				} else {

					JOptionPane.showMessageDialog(main_menu, "You don't have enough money in your account!");

				}

			} else {
				JOptionPane.showMessageDialog(main_menu,
						"Purchse Failed! Try entering the details corectly! (Use the same account you logged in with.)");
				usert.setText("");
				passt.setText("");
			}

		} else if (e.getSource() == add) {

			Boolean bool = false;
			user = userte.getText();
			password = passte.getText();

			String sql = "INSERT INTO User (username, password, admin,balance) VALUES(\"" + user + "\", \"" + password
					+ "\", 0,0);";

			try (Statement stmt2 = conn.createStatement()) {
				stmt2.executeUpdate(sql);
				bool = true;

			} catch (SQLException e1) {
				bool = false;
			}

			if (bool) {
				wow.setVisible(true);
				welcome.setVisible(true);
				userte.setVisible(false);
				passte.setVisible(false);
				user_la.setVisible(false);
				pass_la.setVisible(false);
				add.setVisible(false);
				backMain.setVisible(true);

				create.setText("Now go back to the");
				create.setBounds(360, 30, 600, 50);
				create2.setText("login menu and use it!");
				create2.setBounds(480, 100, 800, 50);

			} else {
				JOptionPane.showMessageDialog(main_menu, "The username already exits! Try entering a new one!");
				userte.setText("");
				passte.setText("");
			}
		} else if (e.getSource() == backMain) {
			nw2.setVisible(false);
			main_menu.setVisible(true);
			// (false);
		} else if (e.getSource() == money || e.getSource() == money1) {
			addBalance();
		} else if (e.getSource() == balance || e.getSource() == balance1) {
			whatIsMyBalance();
		} else if (e.getSource() == adde) {

			if (!isInteger(baltext.getText(), 10)) {
				JOptionPane.showMessageDialog(main_window, "Please enter a correct amount!");
			} else if (Integer.parseInt(baltext.getText()) < 0) {
				JOptionPane.showMessageDialog(main_window, "You can't add a negavtive amount!");
			} else if (Integer.parseInt(baltext.getText()) >= 1001) {
				JOptionPane.showMessageDialog(main_window, "You can add up to 1000 L.E.!");
			} else {

				String sql = "Select balance from user where username = \"" + user + "\";";
				int bal = 0;

				try (Statement stmt2 = conn.createStatement(); ResultSet rs = stmt2.executeQuery(sql)) {
					bal = rs.getInt("balance");

				} catch (SQLException e1) {
					e1.printStackTrace();
				}

				sql = "UPDATE user SET balance = " + (bal + Integer.parseInt(baltext.getText()))
						+ " WHERE username = \"" + user + "\";";

				try (Statement stmt2 = conn.createStatement()) {
					stmt2.executeUpdate(sql);

				} catch (SQLException e1) {
					e1.printStackTrace();
				}

				nw5.setVisible(false);
				JOptionPane.showMessageDialog(main_window, "Balance is increased by " + baltext.getText() + "!");

			}

		} else if (e.getSource() == searchTrain || e.getSource() == searchTrain1) {
			nw.setVisible(false);
			main_window.setVisible(true);
		} else if (e.getSource() == train_locate || e.getSource() == train_locate1) {
			moveTrain();
		} else if (e.getSource() == enter2) {

			if (allTrains.getSelectedItem() != "Options") {

				String dest = "";

				if (allTrains.getSelectedItem() == "Train #1") {

					dest = next(1);

				} else if (allTrains.getSelectedItem() == "Train #2") {

					dest = next(2);

				} else if (allTrains.getSelectedItem() == "Train #3") {

					dest = next(3);

				}

				trainMove.setText("The train has moved to " + dest);
				trainMove.setVisible(true);

			} else {
				JOptionPane.showMessageDialog(main_window, "Please select one of the options!");
			}
		} else if (e.getSource() == remove || e.getSource() == remove1) {
			removeUser();

		} else if (e.getSource() == removeUser) {
			if (whichUser.getText().equals("")) {
				JOptionPane.showMessageDialog(main_window, "Please enter a user's username!");
			} else {
				if (userExists(whichUser.getText())) {
					gif2.setVisible(true);
					String sql = "DELETE FROM user WHERE username = \"" + whichUser.getText() + "\";";

					try (Statement stmt2 = conn.createStatement();) {

						stmt2.execute(sql);

					} catch (SQLException e1) {
						System.out.println("lol");
					}
					removeUser.setVisible(false);

					SwingWorker<Boolean, Void> worker = new SwingWorker<Boolean, Void>() {
						@Override
						protected Boolean doInBackground() throws Exception {
							Thread.sleep(5500);
							return true;
						}

						protected void done() {
							boolean status;
							nw7.setVisible(false);
							try {
								status = get();

							} catch (InterruptedException e) {
								// This is thrown if the thread's interrupted.
							} catch (ExecutionException e) {
								// This is thrown if we throw an exception
								// from doInBackground.
							}
						}
					};
					worker.execute();

				} else {
					JOptionPane.showMessageDialog(main_window, "The username doesn't exist!");
				}
			}
		} else if (e.getSource() == addAdmin || e.getSource() == addAdmin1) {
			addAdmin();
		} else if (e.getSource() == addNewAdmin) {
			nw8.setVisible(false);
			addNewAdmin();
		} else if (e.getSource() == addPreUser) {
			nw8.setVisible(false);
			addPreUser();
		}else if(e.getSource() == makeAdmin) {
			
			if(userExists(usertex.getText())) {
				JOptionPane.showMessageDialog(null, "The username already exists choose another one!");
			}else {
				String sql = "INSERT INTO User (username, password, admin,balance) VALUES(\"" + usertex.getText() + "\", \"" + passtex.getText()
						+ "\", 1,0);";

				try (Statement stmt2 = conn.createStatement()) {
					stmt2.executeUpdate(sql);
					

				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Admin Added!");
				nw9.setVisible(false);
			}
			
		}else if (e.getSource() == userAdmin) {
			// not a user
			if(!userExists(usertext.getText())) {
				JOptionPane.showMessageDialog(null, "The user doesn't exist!");
				usertext.setText("");
			}else if (isAdmin(usertext.getText())) {
				// already an admin
				JOptionPane.showMessageDialog(null, "This username belongs to an admin!");
			}else {
				

				String sql = "Update user Set admin = 1 where username = \""+usertext.getText()+"\";";

				try (Statement stmt = conn.createStatement()) {

					stmt.execute(sql);
					

				} catch (SQLException l) {
					
					l.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, usertext.getText() + " has become an admin!");
				nw1.setVisible(false);
			}
			
			
		}

	}

	private static void userScreen(boolean bool) {
		if (bool) {
			admin = true;
		} else {
			admin = false;
		}

		main_window = new JFrame("SEARCH FOR TRAINS");
		main_window.setSize(1280, 720);
		main_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main_window.setResizable(false);
		// main_window.setLayout(null);

		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		main_window.add(panel2);

		// MENU BARS
		JMenuBar menuBar;
		JMenu menu;

		menuBar = new JMenuBar();

		// Build the first menu.
		menu = new JMenu("Menu");
		menu.setMnemonic(KeyEvent.VK_A);
		menuBar.add(menu);

		ticket = new JMenuItem("Purchase Ticket");
		menu.add(ticket);
		ticket.addActionListener(new GUI());

		surprise = new JMenuItem("Surprise Me");
		menu.add(surprise);
		surprise.addActionListener(new GUI());

		menu = new JMenu("Balance");
		menu.setMnemonic(KeyEvent.VK_A);
		menuBar.add(menu);

		balance = new JMenuItem("Check Balance");
		menu.add(balance);
		balance.addActionListener(new GUI());

		money = new JMenuItem("Add to Balance");
		menu.add(money);
		money.addActionListener(new GUI());

		if (bool) {
			menu = new JMenu("Admin");
			menu.setMnemonic(KeyEvent.VK_N);
			menuBar.add(menu);

			train_locate = new JMenuItem("Change Location of Train");
			menu.add(train_locate);
			train_locate.addActionListener(new GUI());

			remove = new JMenuItem("Remove User");
			menu.add(remove);
			remove.addActionListener(new GUI());

			addAdmin = new JMenuItem("Add an Admin");
			menu.add(addAdmin);
			addAdmin.addActionListener(new GUI());

		}
		main_window.setJMenuBar(menuBar);

		////////////////////////////////////////////////////

		// LABELS

		results = new JTextPane();
		results.setBounds(20, 250, 1200, 400);
		results.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 25));
		results.setOpaque(false);
		panel2.add(results);

		JLabel whichTrack = new JLabel("Which track do you plan on boarding from?");
		whichTrack.setBounds(200, 50, 500, 32);
		whichTrack.setForeground(Color.white);
		whichTrack.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 20));
		panel2.add(whichTrack);

		JLabel or_label = new JLabel("OR");
		or_label.setForeground(Color.white);

		or_label.setFont(new Font("Proxima Nova", Font.ITALIC | Font.BOLD, 16));

		or_label.setBounds(1043, 139, 300, 25);
		panel2.add(or_label);

		////////////////////////////////////////////////////

		// BUTTONS
		ImageIcon icon = new ImageIcon("png-clipart-computer-icons-arrow-switch-volume-icon-miscellaneous-angle.png");
		Image image = icon.getImage(); // transform it
		Image newimg = image.getScaledInstance(40, 20, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon = new ImageIcon(newimg); // transform it back

		switcher = new JButton(icon);
		switcher.setBounds(525, 139, 40, 20);
		switcher.addActionListener(new GUI());
		panel2.add(switcher);

		find_Trains = new CircleButton("Find Train/s");
		find_Trains.setBounds(920, 100, 130, 100);
		find_Trains.addActionListener(new GUI());
		panel2.add(find_Trains);

		newSearch = new JButton("Clear Search");
		newSearch.setBounds(1069, 139, 200, 30);
		newSearch.addActionListener(new GUI());
		panel2.add(newSearch);

		ImageIcon icon2 = new ImageIcon("back-button.png");
		Image image2 = icon2.getImage(); // transform it
		Image newimg2 = image2.getScaledInstance(100, 50, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon = new ImageIcon(newimg2); // transform it back

		////////////////////////////////////////////////////

		// OPTION BOXES
		String[] stations = new String[] { "From", "Ramlh", "Gamea' Ibrahim", "Azarita", "Al Shahid Moustafa Ziean",
				"Al Shobban Al Moslemin", "Al Shatby", "Al Gamaa", "Camp Caesar", "Al Ibrahimiyya",
				"Sporting Al Soghra", "Sporting Al Kobra", "Cleopatra Al Soghra", "Cleopatra Hammamat",
				"Sidi Gaber Al Sheikh", "Zananere", "Sidi Gaber Al Mahata", "Mustafa Kamil", "Mohammed Mahfouz",
				"Roushdy", "Bolkly", "Al Hedaya", "Saba Pasha", "Ramsis", "Al Fonoun Al Gamella", "Kasr Al Safa",
				"San Stefano", "Tharwat", "Loran", "Al Saraya", "Sidi Beshr", "Al Seyouf", "Al Nasr", "Al Wezara",
				"Al Karnak", "Baccos", "Safar", "Schutz", "Gianaclis" };

		Arrays.sort(stations, 1, stations.length);

		from = new JComboBox<>(stations);

		from.setBounds(200, 136, 300, 30);
		panel2.add(from);

		String[] stations2 = new String[] { "To", "Ramlh", "Gamea' Ibrahim", "Azarita", "Al Shahid Moustafa Ziean",
				"Al Shobban Al Moslemin", "Al Shatby", "Al Gamaa", "Camp Caesar", "Al Ibrahimiyya",
				"Sporting Al Soghra", "Sporting Al Kobra", "Cleopatra Al Soghra", "Cleopatra Hammamat",
				"Sidi Gaber Al Sheikh", "Zananere", "Sidi Gaber Al Mahata", "Mustafa Kamil", "Mohammed Mahfouz",
				"Roushdy", "Bolkly", "Al Hedaya", "Saba Pasha", "Ramsis", "Al Fonoun Al Gamella", "Kasr Al Safa",
				"San Stefano", "Tharwat", "Loran", "Al Saraya", "Sidi Beshr", "Al Seyouf", "Al Nasr", "Al Wezara",
				"Al Karnak", "Baccos", "Safar", "Schutz", "Gianaclis" };

		Arrays.sort(stations2, 1, stations2.length);
		to = new JComboBox<>(stations2);

		to.setBounds(600, 136, 300, 30);
		panel2.add(to);

		String[] tracks = new String[] { "Tracks", "Track(1) [Ramlh-Al Nasr, Al Nasr-Ramlh]",
				"Track(2) [Ramlh-Al Nasr, Al Nasr-Ramlh]", "Track(3) [Ramlh-San Estefano, San Estefano-Ramlh]" };
		track = new JComboBox<>(tracks);
		track.setBounds(700, 60, 300, 30);
		panel2.add(track);
		////////////////////////////////////////////////////

		// ANIMATIONS

		Icon icon3 = new ImageIcon("75e84c2a9bc75a097266ca39175c3f2b.gif");

		race = new JLabel(icon3);
		race.setBounds(220, 470, 800, 200);
		race.setVisible(false);
		panel2.add(race);
		////////////////////////////////////////////////////

		// PICTURES
		ImageIcon icon4 = new ImageIcon("b4bfafa2dccc4cf3fe24f774b3f13b12.jpg");
		Image image4 = icon4.getImage(); // transform it
		Image newimg4 = image4.getScaledInstance(1280, 720, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon = new ImageIcon(newimg4); // transform it back

		JLabel train = new JLabel(icon);
		train.setBounds(0, 0, 1280, 720);
		panel2.add(train);
		////////////////////////////////////////////////////

		main_window.setVisible(true);

		back = now;
		now = main_window;

	}

	private static void guestScreen() {

		guest_window = new JFrame("SEARCH FOR TRAINS");
		guest_window.setSize(1280, 720);
		guest_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guest_window.setResizable(false);
		// main_window.setLayout(null);

		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		guest_window.add(panel2);

		// LABELS

		results = new JTextPane();
		results.setBounds(20, 250, 1200, 400);
		results.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 25));
		results.setOpaque(false);
		panel2.add(results);

		JLabel whichTrack = new JLabel("Which track do you plan on boarding from?");
		whichTrack.setBounds(200, 50, 500, 32);
		whichTrack.setForeground(Color.white);
		whichTrack.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 20));
		panel2.add(whichTrack);

		JLabel or_label = new JLabel("OR");
		or_label.setForeground(Color.white);

		or_label.setFont(new Font("Proxima Nova", Font.ITALIC | Font.BOLD, 16));

		or_label.setBounds(1043, 139, 300, 25);
		panel2.add(or_label);

		////////////////////////////////////////////////////

		// BUTTONS
		ImageIcon icon = new ImageIcon("png-clipart-computer-icons-arrow-switch-volume-icon-miscellaneous-angle.png");
		Image image = icon.getImage(); // transform it
		Image newimg = image.getScaledInstance(40, 20, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon = new ImageIcon(newimg); // transform it back

		switcher = new JButton(icon);
		switcher.setBounds(525, 139, 40, 20);
		switcher.addActionListener(new GUI());
		panel2.add(switcher);

		find_Trains = new CircleButton("Find Train/s");
		find_Trains.setBounds(920, 100, 130, 100);
		find_Trains.addActionListener(new GUI());
		panel2.add(find_Trains);

		newSearch = new JButton("Clear Search");
		newSearch.setBounds(1069, 139, 200, 30);
		newSearch.addActionListener(new GUI());
		panel2.add(newSearch);

		ImageIcon icon2 = new ImageIcon("back-button.png");
		Image image2 = icon2.getImage(); // transform it
		Image newimg2 = image2.getScaledInstance(100, 50, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon = new ImageIcon(newimg2); // transform it back

		////////////////////////////////////////////////////

		// OPTION BOXES
		String[] stations = new String[] { "From", "Ramlh", "Gamea' Ibrahim", "Azarita", "Al Shahid Moustafa Ziean",
				"Al Shobban Al Moslemin", "Al Shatby", "Al Gamaa", "Camp Caesar", "Al Ibrahimiyya",
				"Sporting Al Soghra", "Sporting Al Kobra", "Cleopatra Al Soghra", "Cleopatra Hammamat",
				"Sidi Gaber Al Sheikh", "Zananere", "Sidi Gaber Al Mahata", "Mustafa Kamil", "Mohammed Mahfouz",
				"Roushdy", "Bolkly", "Al Hedaya", "Saba Pasha", "Ramsis", "Al Fonoun Al Gamella", "Kasr Al Safa",
				"San Stefano", "Tharwat", "Loran", "Al Saraya", "Sidi Beshr", "Al Seyouf", "Al Nasr", "Al Wezara",
				"Al Karnak", "Baccos", "Safar", "Schutz", "Gianaclis" };

		Arrays.sort(stations, 1, stations.length);

		from = new JComboBox<>(stations);

		from.setBounds(200, 136, 300, 30);
		panel2.add(from);

		String[] stations2 = new String[] { "To", "Ramlh", "Gamea' Ibrahim", "Azarita", "Al Shahid Moustafa Ziean",
				"Al Shobban Al Moslemin", "Al Shatby", "Al Gamaa", "Camp Caesar", "Al Ibrahimiyya",
				"Sporting Al Soghra", "Sporting Al Kobra", "Cleopatra Al Soghra", "Cleopatra Hammamat",
				"Sidi Gaber Al Sheikh", "Zananere", "Sidi Gaber Al Mahata", "Mustafa Kamil", "Mohammed Mahfouz",
				"Roushdy", "Bolkly", "Al Hedaya", "Saba Pasha", "Ramsis", "Al Fonoun Al Gamella", "Kasr Al Safa",
				"San Stefano", "Tharwat", "Loran", "Al Saraya", "Sidi Beshr", "Al Seyouf", "Al Nasr", "Al Wezara",
				"Al Karnak", "Baccos", "Safar", "Schutz", "Gianaclis" };

		Arrays.sort(stations2, 1, stations2.length);
		to = new JComboBox<>(stations2);

		to.setBounds(600, 136, 300, 30);
		panel2.add(to);

		String[] tracks = new String[] { "Tracks", "Track(1) [Ramlh-Al Nasr, Al Nasr-Ramlh]",
				"Track(2) [Ramlh-Al Nasr, Al Nasr-Ramlh]", "Track(3) [Ramlh-San Estefano, San Estefano-Ramlh]" };
		track = new JComboBox<>(tracks);
		track.setBounds(700, 60, 300, 30);
		panel2.add(track);
		////////////////////////////////////////////////////

		// ANIMATIONS

		Icon icon3 = new ImageIcon("75e84c2a9bc75a097266ca39175c3f2b.gif");

		race = new JLabel(icon3);
		race.setBounds(220, 470, 800, 200);
		race.setVisible(false);
		panel2.add(race);
		////////////////////////////////////////////////////

		// PICTURES
		ImageIcon icon4 = new ImageIcon("b4bfafa2dccc4cf3fe24f774b3f13b12.jpg");
		Image image4 = icon4.getImage(); // transform it
		Image newimg4 = image4.getScaledInstance(1280, 720, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon = new ImageIcon(newimg4); // transform it back

		JLabel train = new JLabel(icon);
		train.setBounds(0, 0, 1280, 720);
		panel2.add(train);
		////////////////////////////////////////////////////

		guest_window.setVisible(true);

		back = now;
		now = guest_window;
	}

	private static void makeNewAccount() {

		nw2 = new JFrame("Create a new user");
		nw2.setSize(1280, 720);
		nw2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nw2.setResizable(false);

		JPanel panel5 = new JPanel();

		nw2.add(panel5);
		panel5.setLayout(null);

		// Labels
		user_la = new JLabel("Username :");
		user_la.setForeground(Color.white);
		user_la.setBounds(119, 300, 300, 32);
		user_la.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 50));
		panel5.add(user_la);

		userte = new JTextField();
		userte.setBounds(470, 300, 300, 43);
		panel5.add(userte);

		pass_la = new JLabel("Password :");
		pass_la.setForeground(Color.white);
		pass_la.setBounds(119, 350, 300, 32);
		pass_la.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 50));
		panel5.add(pass_la);

		passte = new JPasswordField();
		passte.setBounds(470, 350, 300, 43);
		panel5.add(passte);

		create = new JLabel("Enter a username and password");
		create.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 50));
		// create.setForeground(Color.white);
		create.setBounds(190, 30, 900, 50);
		panel5.add(create);

		create2 = new JLabel("to create a new user:");
		create2.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 50));
		// create2.setForeground(Color.white);
		create2.setBounds(285, 100, 1280, 40);
		panel5.add(create2);

		////////////////////////////////////////////////////

		// Images

		ImageIcon icon2 = new ImageIcon("427-4272671_circle-png-download-transparent-blue-semi-circle-png-2.png");
		Image image2 = icon2.getImage(); // transform it
		Image newimg2 = image2.getScaledInstance(1700, 400, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon2 = new ImageIcon(newimg2); // transform it back

		JLabel circle = new JLabel(icon2);
		circle.setBounds(-210, -100, 1700, 400);
		// circle.setHorizontalAlignment((int) JFrame.CENTER_ALIGNMENT);
		panel5.add(circle);

		////////////////////////////////////////////////////

		// BUTTONS

		ImageIcon icon9 = new ImageIcon("Main-Menu-button.png");
		Image image9 = icon9.getImage(); // transform it
		Image newimg9 = image9.getScaledInstance(1000, 150, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon9 = new ImageIcon(newimg9); // transform it back

		backMain = new JButton(icon9);
		backMain.setBounds(119, 300, 1000, 150);
		backMain.addActionListener(new GUI());
		backMain.setVisible(false);
		panel5.add(backMain);

		ImageIcon icon3 = new ImageIcon("Add_User1-512.png");
		Image image3 = icon3.getImage(); // transform it
		Image newimg3 = image3.getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon3 = new ImageIcon(newimg3); // transform it back

		add = new JButton(icon3);
		add.setBounds(870, 297, 200, 100);
		add.addActionListener(new GUI());
		// circle.setHorizontalAlignment((int) JFrame.CENTER_ALIGNMENT);
		panel5.add(add);

		////////////////////////////////////////////////////

		icon4 = new ImageIcon("sm_5ab4a26e8d73b.png");
		Image image4 = icon4.getImage(); // transform it
		Image newimg4 = image4.getScaledInstance(1090, 510, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon4 = new ImageIcon(newimg4); // transform it back

		wow = new JLabel(icon4);
		wow.setBounds(50, 330, 1090, 545);
		wow.setVisible(false);
		panel5.add(wow);

		Icon icon10 = new ImageIcon("5e78affab2547d678e4c5458dd931381.gif");

		welcome = new JLabel(icon10);
		welcome.setBounds(220, 470, 800, 200);
		welcome.setVisible(false);
		panel5.add(welcome);

		ImageIcon icon = new ImageIcon("1092758.jpg");
		Image image = icon.getImage(); // transform it
		Image newimg = image.getScaledInstance(1280, 720, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon = new ImageIcon(newimg); // transform it back

		JLabel train = new JLabel(icon);
		train.setBounds(0, 0, 1280, 720);
		panel5.add(train);

		nw2.setVisible(true);

	}

	private static void TicketScreen(boolean bool) {

		nw = new JFrame();
		nw.setSize(1280, 720);
		nw.setResizable(false);
		nw.setLocationRelativeTo(null);
		nw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel4 = new JPanel();

		nw.add(panel4);
		panel4.setLayout(null);

		// LABELS

		JLabel purchase = new JLabel("Purchase a new Ticket:");
		Map<TextAttribute, Integer> fontAttributes = new HashMap<TextAttribute, Integer>();
		fontAttributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		purchase.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 32).deriveFont(fontAttributes));
		purchase.setForeground(Color.white);
		purchase.setBounds(150, 20, 700, 25);
		panel4.add(purchase);

		option = new JLabel("");
		option.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 20));
		option.setForeground(Color.white);
		option.setBounds(69, 200, 1000, 25);
		option.setVisible(false);
		panel4.add(option);

		ops = new JComboBox<>(options);
		ops.setBounds(400, 200, 650, 30);
		ops.setVisible(false);
		panel4.add(ops);

		count = new JLabel("How many tickets do you want to buy?");
		count.setBounds(69, 270, 700, 25);
		count.setForeground(Color.white);
		count.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 20));
		count.setVisible(false);
		panel4.add(count);

		pass_l = new JLabel("Password :");
		pass_l.setForeground(Color.white);
		pass_l.setBounds(69, 500, 300, 32);
		pass_l.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 25));
		pass_l.setForeground(Color.white);
		pass_l.setVisible(false);
		panel4.add(pass_l);

		passt = new JPasswordField();
		passt.setBounds(240, 500, 300, 32);
		passt.setVisible(false);
		panel4.add(passt);

		user_l = new JLabel("Username :");
		user_l.setForeground(Color.white);
		user_l.setBounds(69, 450, 300, 32);
		user_l.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 25));
		user_l.setVisible(false);
		panel4.add(user_l);

		usert = new JTextField();
		usert.setBounds(240, 450, 300, 32);
		usert.setVisible(false);
		panel4.add(usert);

		finalize = new JLabel("Enter your username and password to confirm your purchase:");
		finalize.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 25));
		finalize.setForeground(Color.white);
		finalize.setBounds(69, 400, 900, 32);
		finalize.setVisible(false);
		panel4.add(finalize);

		amount = new JLabel("");
		amount.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 20));
		amount.setForeground(Color.white);
		amount.setBounds(69, 335, 900, 32);
		amount.setVisible(false);
		panel4.add(amount);
		////////////////////////////////////////////////////

		// Text Boxes

		county = new JTextField();
		county.setBounds(569, 273, 100, 20);
		county.setVisible(false);
		panel4.add(county);

		////////////////////////////////////////////////////

		// MENU STUFF

		JMenuBar menuBar;
		JMenu menu;

		menuBar = new JMenuBar();

		// Build the first menu.
		menu = new JMenu("Menu");
		menu.setMnemonic(KeyEvent.VK_A);
		menuBar.add(menu);

		searchTrain1 = new JMenuItem("Search for Trains");
		menu.add(searchTrain1);
		searchTrain1.addActionListener(new GUI());

		surprise1 = new JMenuItem("Surprise Me");
		menu.add(surprise1);
		surprise1.addActionListener(new GUI());

		menu = new JMenu("Balance");
		menu.setMnemonic(KeyEvent.VK_A);
		menuBar.add(menu);

		balance1 = new JMenuItem("Check Balance");
		menu.add(balance1);
		balance1.addActionListener(new GUI());

		money1 = new JMenuItem("Add to Balance");
		menu.add(money1);
		money1.addActionListener(new GUI());

		if (bool) {
			menu = new JMenu("Admin");
			menu.setMnemonic(KeyEvent.VK_N);
			menuBar.add(menu);

			train_locate1 = new JMenuItem("Change Location of Train");
			menu.add(train_locate1);
			train_locate1.addActionListener(new GUI());

			remove1 = new JMenuItem("Remove User");
			menu.add(remove1);
			remove1.addActionListener(new GUI());

			addAdmin1 = new JMenuItem("Add an Admin");
			menu.add(addAdmin1);
			addAdmin1.addActionListener(new GUI());

		}
		nw.setJMenuBar(menuBar);
		////////////////////////////////////////////////////

		// OPTION BOXES
		String[] stations = new String[] { "From", "Ramlh", "Gamea' Ibrahim", "Azarita", "Al Shahid Moustafa Ziean",
				"Al Shobban Al Moslemin", "Al Shatby", "Al Gamaa", "Camp Caesar", "Al Ibrahimiyya",
				"Sporting Al Soghra", "Sporting Al Kobra", "Cleopatra Al Soghra", "Cleopatra Hammamat",
				"Sidi Gaber Al Sheikh", "Zananere", "Sidi Gaber Al Mahata", "Mustafa Kamil", "Mohammed Mahfouz",
				"Roushdy", "Bolkly", "Al Hedaya", "Saba Pasha", "Ramsis", "Al Fonoun Al Gamella", "Kasr Al Safa",
				"San Stefano", "Tharwat", "Loran", "Al Saraya", "Sidi Beshr", "Al Seyouf", "Al Nasr", "Al Wezara",
				"Al Karnak", "Baccos", "Safar", "Schutz", "Gianaclis" };

		Arrays.sort(stations, 1, stations.length);

		from = new JComboBox<>(stations);

		from.setBounds(69, 136, 300, 30);
		panel4.add(from);

		String[] stations2 = new String[] { "To", "Ramlh", "Gamea' Ibrahim", "Azarita", "Al Shahid Moustafa Ziean",
				"Al Shobban Al Moslemin", "Al Shatby", "Al Gamaa", "Camp Caesar", "Al Ibrahimiyya",
				"Sporting Al Soghra", "Sporting Al Kobra", "Cleopatra Al Soghra", "Cleopatra Hammamat",
				"Sidi Gaber Al Sheikh", "Zananere", "Sidi Gaber Al Mahata", "Mustafa Kamil", "Mohammed Mahfouz",
				"Roushdy", "Bolkly", "Al Hedaya", "Saba Pasha", "Ramsis", "Al Fonoun Al Gamella", "Kasr Al Safa",
				"San Stefano", "Tharwat", "Loran", "Al Saraya", "Sidi Beshr", "Al Seyouf", "Al Nasr", "Al Wezara",
				"Al Karnak", "Baccos", "Safar", "Schutz", "Gianaclis" };

		Arrays.sort(stations2, 1, stations2.length);
		to = new JComboBox<>(stations2);

		to.setBounds(479, 136, 300, 30);
		panel4.add(to);

		////////////////////////////////////////////////////

		// BUTTONS

		ImageIcon icon = new ImageIcon("png-clipart-computer-icons-arrow-switch-volume-icon-miscellaneous-angle.png");
		Image image = icon.getImage(); // transform it
		Image newimg = image.getScaledInstance(40, 20, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon = new ImageIcon(newimg); // transform it back

		switcher = new JButton(icon);
		switcher.setBounds(404, 139, 40, 20);
		switcher.addActionListener(new GUI());
		panel4.add(switcher);

		ImageIcon icon2 = new ImageIcon("unnamed.png");
		Image image2 = icon2.getImage(); // transform it
		Image newimg2 = image2.getScaledInstance(100, 40, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon = new ImageIcon(newimg2); // transform it back

		enter = new JButton(icon);
		enter.setBounds(809, 132, 100, 35);
		enter.addActionListener(new GUI());
		panel4.add(enter);

		ImageIcon icon5 = new ImageIcon("purchase-12-918095.png");
		Image image5 = icon5.getImage(); // transform it
		Image newimg5 = image5.getScaledInstance(100, 35, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon = new ImageIcon(newimg5); // transform it back

		purchasee = new JButton(icon);
		purchasee.setBounds(750, 263, 100, 35);
		purchasee.addActionListener(new GUI());
		purchasee.setVisible(false);
		panel4.add(purchasee);

		ImageIcon icon6 = new ImageIcon("Buy-PNG-Clipart.png");
		Image image6 = icon6.getImage(); // transform it
		Image newimg6 = image6.getScaledInstance(100, 50, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon = new ImageIcon(newimg6); // transform it back

		finalle = new JButton(icon);
		finalle.setBounds(650, 474, 100, 50);
		finalle.addActionListener(new GUI());
		finalle.setVisible(false);
		panel4.add(finalle);

		ImageIcon icon10 = new ImageIcon("back-button.png");
		Image image10 = icon10.getImage(); // transform it
		Image newimg10 = image10.getScaledInstance(100, 50, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon = new ImageIcon(newimg10); // transform it back

		////////////////////////////////////////////////////

		// BACKGROUND
		ImageIcon icon3 = new ImageIcon("t6gPzo.jpg");
		train = new JLabel(icon3);
		train.setBounds(0, 0, 1280, 720);
		panel4.add(train);

		nw.setVisible(true);

		back = now;
		now = nw;
	}

	private static void whatIsMyBalance() {

		JFrame nw3 = new JFrame();
		nw3.setSize(640, 310);
		nw3.setResizable(false);
		nw3.setLocationRelativeTo(null);
		// nw3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel6 = new JPanel();
		panel6.setLayout(null);
		nw3.add(panel6);

		String sql = "Select balance from user where username = \"" + user + "\";";
		int bal = 0;

		Connection conn = Station.connect();

		try (Statement stmt2 = conn.createStatement(); ResultSet rs = stmt2.executeQuery(sql)) {
			bal = rs.getInt("balance");

		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		JLabel label = new JLabel("Your balance associated to the ");
		label.setBounds(10, 20, 1000, 32);
		label.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 32));
		panel6.add(label);

		JLabel label2 = new JLabel("account \"" + user + "\" is: " + bal + " L.E.");
		label2.setBounds(10, 50, 1000, 32);
		label2.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 32));
		panel6.add(label2);

//		JButton button = new JButton("Back");
//		button.setBounds(250,150,100,50);
//		panel6.add(button);

		nw3.setVisible(true);

	}

	private static void addBalance() {

		nw5 = new JFrame("Add funds to your account");
		nw5.setSize(320, 155);
		nw5.setResizable(false);
		nw5.setLocationRelativeTo(null);
		// nw5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		nw5.add(panel);

		JLabel label = new JLabel("How much do you want to add to your account?");
		label.setForeground(Color.black);
		label.setBounds(10, 20, 500, 30);
		panel.add(label);

		baltext = new JTextField();
		baltext.setBounds(20, 50, 200, 40);
		panel.add(baltext);

		ImageIcon icon = new ImageIcon("31390-200.png");
		Image image = icon.getImage(); // transform it
		Image newimg = image.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon = new ImageIcon(newimg); // transform it back

		adde = new JButton(icon);
		adde.setBounds(230, 50, 50, 50);
		adde.addActionListener(new GUI());
		panel.add(adde);

		nw5.setVisible(true);

	}

	private static void moveTrain() {

		nw6 = new JFrame("Move the train to the next stop");
		nw6.setSize(640, 310);
		nw6.setResizable(false);
		nw6.setLocationRelativeTo(null);
		// nw6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		nw6.add(panel);

		JLabel label = new JLabel("Choose one of the trains to move:");
		label.setForeground(Color.black);
		label.setBounds(10, 10, 400, 40);
		label.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 20));
		panel.add(label);

		trainMove = new JLabel("");
		trainMove.setBounds(10, 150, 620, 40);
		trainMove.setVisible(false);
		trainMove.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 20));

		panel.add(trainMove);

		String[] trains = new String[] { "Options", "Train #1", "Train #2", "Train #3" };
		allTrains = new JComboBox<String>(trains);
		allTrains.setBounds(420, 13, 200, 40);
		panel.add(allTrains);

		ImageIcon icon2 = new ImageIcon("unnamed.png");
		Image image2 = icon2.getImage(); // transform it
		Image newimg2 = image2.getScaledInstance(100, 50, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon2 = new ImageIcon(newimg2); // transform it back

		enter2 = new JButton(icon2);
		enter2.setBounds(270, 70, 100, 50);
		enter2.addActionListener(new GUI());
		panel.add(enter2);

		ImageIcon icon = new ImageIcon("spot-light-background_1284-4685.jpg");
		Image image = icon.getImage(); // transform it
		Image newimg = image.getScaledInstance(640, 600, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon = new ImageIcon(newimg); // transform it back

		train = new JLabel(icon);
		train.setBounds(0, -30, 640, 310);
		panel.add(train);

		nw6.setVisible(true);

	}

	private static void removeUser() {

		nw7 = new JFrame("REMOVE USERS");
		nw7.setSize(640, 310);
		nw7.setResizable(false);
		nw7.setLocationRelativeTo(null);
		// nw7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		nw7.add(panel);

		JLabel label = new JLabel("Enter the username of the user you want to remove:");
		label.setBounds(10, 10, 480, 40);
		label.setForeground(Color.white);
		label.setFont(new Font("Proxima Nova", Font.ITALIC | Font.BOLD, 19));
		panel.add(label);

		whichUser = new JTextField();
		whichUser.setBounds(490, 22, 100, 20);
		panel.add(whichUser);

		ImageIcon icon2 = new ImageIcon("ezgif.com-crop-2-1.png");
		Image image2 = icon2.getImage(); // transform it
		Image newimg2 = image2.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon2 = new ImageIcon(newimg2); // transform it back

		removeUser = new JButton(icon2);
		removeUser.setBounds(396, 130, 60, 60);
		removeUser.addActionListener(new GUI());
		panel.add(removeUser);

		ImageIcon image10 = new ImageIcon("ezgif.com-crop-2.gif");

		int width = 60;
		int height = 60;
		image10.setImage(image10.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));

		gif2 = new JLabel(image10);
		gif2.setBounds(396, 130, 60, 60);
		gif2.setVisible(false);
		panel.add(gif2);

		ImageIcon icon = new ImageIcon(
				"programming-code-coding-hacker-background-programming-code-icon-made-with-binary-code_127544-815.jpg.png");
		Image image = icon.getImage(); // transform it
		Image newimg = image.getScaledInstance(640, 310, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon = new ImageIcon(newimg); // transform it back

		train = new JLabel(icon);
		train.setBounds(0, 0, 640, 310);
		panel.add(train);

		nw7.setVisible(true);

	}

	private static void addAdmin() {
		nw8 = new JFrame("ADD ADMINS");
		nw8.setSize(640, 310);
		nw8.setResizable(false);
		nw8.setLocationRelativeTo(null);
		nw8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		nw8.add(panel);

		addNewAdmin = new JButton("Add a new admin (New Account)");
		addNewAdmin.setBounds(20, 80, 600, 60);
		addNewAdmin.addActionListener(new GUI());
		panel.add(addNewAdmin);

		addPreUser = new JButton("Make a user an admin");
		addPreUser.setBounds(20, 140, 600, 60);
		addPreUser.addActionListener(new GUI());
		panel.add(addPreUser);

		ImageIcon icon = new ImageIcon(
				"programming-code-coding-hacker-background-programming-code-icon-made-with-binary-code_127544-815.jpg.png");
		Image image = icon.getImage(); // transform it
		Image newimg = image.getScaledInstance(1280, 720, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon = new ImageIcon(newimg); // transform it back

		train = new JLabel(icon);
		train.setBounds(0, 0, 640, 310);
		panel.add(train);

		nw8.setVisible(true);
	}

	private static void addNewAdmin() {
		nw9 = new JFrame("ADD NEW ACCOUNT");
		nw9.setSize(640, 310);
		nw9.setResizable(false);
		nw9.setLocationRelativeTo(null);
		//nw9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		nw9.add(panel);

		// User_name and password

		JLabel user_label = new JLabel("Username :");
		user_label.setForeground(Color.white);
		user_label.setBounds(69, 50, 300, 32);
		user_label.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 25));
		panel.add(user_label);

		usertex = new JTextField();
		usertex.setBounds(240, 50, 300, 32);
		panel.add(usertex);

		JLabel pass_label = new JLabel("Password :");
		pass_label.setForeground(Color.white);
		pass_label.setBounds(69, 100, 300, 32);
		pass_label.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 25));
		panel.add(pass_label);

		passtex = new JPasswordField();
		passtex.setBounds(240, 100, 300, 32);
		panel.add(passtex);

		// Buttons
		makeAdmin = new JButton("Add");
		makeAdmin.setBounds(315, 170, 120, 40);
		makeAdmin.addActionListener(new GUI());
		panel.add(makeAdmin);

		ImageIcon icon2 = new ImageIcon(
				"space-wallpaper-4k-desktop-images-backgrounds-space-hd-desktop-wallpapers-cool-tumblr-earth-astral-1280x720-1.jpg");
		JLabel background = new JLabel(icon2);
		background.setBounds(0, 0, 1280, 720);
		panel.add(background);

		nw9.setVisible(true);
	}

	private static void addPreUser() {

		nw1 = new JFrame("MAKE USER ADMIN");
		nw1.setSize(640, 310);
		nw1.setResizable(false);
		nw1.setLocationRelativeTo(null);
		//nw1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		nw1.add(panel);

		JLabel user_label = new JLabel("Username :");
		user_label.setForeground(Color.white);
		user_label.setBounds(69, 50, 300, 32);
		user_label.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 25));
		panel.add(user_label);

		usertext = new JTextField();
		usertext.setBounds(240, 50, 300, 32);
		panel.add(usertext);

		// Buttons
		userAdmin = new JButton("Make Admin");
		userAdmin.setBounds(250, 150, 120, 40);
		userAdmin.addActionListener(new GUI());
		panel.add(userAdmin);

		ImageIcon icon2 = new ImageIcon(
				"space-wallpaper-4k-desktop-images-backgrounds-space-hd-desktop-wallpapers-cool-tumblr-earth-astral-1280x720-1.jpg");
		JLabel background = new JLabel(icon2);
		background.setBounds(0, 0, 1280, 720);
		panel.add(background);

		nw1.setVisible(true);

	}

	public static boolean isInteger(String s, int radix) {
		if (s.isEmpty())
			return false;
		for (int i = 0; i < s.length(); i++) {
			if (i == 0 && s.charAt(i) == '-') {
				if (s.length() == 1)
					return false;
				else
					continue;
			}
			if (Character.digit(s.charAt(i), radix) < 0)
				return false;
		}
		return true;
	}

	public static String next(int num) {

		Connection conn = Station.connect();

		// getting the destination of the train
		String sql = "Select destination from Train where train_no = " + num + ";";
		String destination = "";

		try (Statement stmt2 = conn.createStatement(); ResultSet rs = stmt2.executeQuery(sql)) {

			destination = rs.getString("destination");

		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		// getting the direction of the train
		int way = 0;

		sql = "Select way from Train where train_no = " + num + ";";

		try (Statement stmt2 = conn.createStatement(); ResultSet rs = stmt2.executeQuery(sql)) {

			way = rs.getInt("way");

		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		Station x = new Station(destination);

		// changing it to the next stop
		if (way == 1 && destination.equals("Al Nasr")) {

			sql = "UPDATE Train SET location = \"" + destination
					+ "\", destination = \"Al Seyouf\", way = -1 Where train_no = " + num + ";";

			try (Statement stmt2 = conn.createStatement()) {

				stmt2.execute(sql);

			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} else if (way == -1 && destination.equals("Ramlh")) {
			sql = "UPDATE Train SET location = \"" + destination
					+ "\", destination = \"Gamea' Ibrahim\", way = 1 Where train_no = " + num + ";";

			try (Statement stmt2 = conn.createStatement()) {

				stmt2.execute(sql);

			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} else if (way == 1) {

			sql = "UPDATE Train SET location = \"" + destination + "\", destination = \"" + x.nextStop(num)
					+ "\" Where train_no = " + num + ";";

			try (Statement stmt2 = conn.createStatement()) {

				stmt2.execute(sql);

			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		} else if (way == -1) {
			sql = "UPDATE Train SET location = \"" + destination + "\", destination = \"" + x.prevStop(num)
					+ "\" Where train_no = " + num + ";";

			try (Statement stmt2 = conn.createStatement()) {

				stmt2.execute(sql);

			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}

		return destination;
	}

	private static boolean userExists(String s) {

		Connection conn = Station.connect();

		// getting the destination of the train
		String sql = "Select username from user where username = \"" + s + "\";";

		try (Statement stmt2 = conn.createStatement(); ResultSet rs = stmt2.executeQuery(sql)) {

			rs.getString("username");
			return true;
		} catch (SQLException e1) {
			return false;
		}

	}

	public static boolean isAdmin(String s) {

		Connection conn = Station.connect();

		String sql = "Select admin from user where username = \"" + s + "\";";

		try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

			if (rs.getInt("admin") == 1) {
				return true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
