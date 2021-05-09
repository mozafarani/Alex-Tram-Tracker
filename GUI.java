
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.font.TextAttribute;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import static javax.swing.JOptionPane.showMessageDialog;

public class GUI implements ActionListener {

	private static JFrame main_menu;
	private static JPanel panel;
	private static JTextField usertext;
	private static JPasswordField passtext;
	private static JButton login_button;
	private static JButton guest_button;

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
		guest_button.setBounds(650, 69, 300, 40);
		guest_button.addActionListener(new GUI());
		panel.add(guest_button);

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

		////////////////////////////////////////////////////

	}

	// Make actions here
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == login_button) {

			Connection conn = null;

			try {
				Class.forName("org.sqlite.JDBC");
				String dbURL = "jdbc:sqlite:train.db";
				conn = DriverManager.getConnection(dbURL);
				System.out.println("Sqlite db con");

			} catch (Exception l) {
				System.out.println(l);
			}

			String user = usertext.getText();
			String password = passtext.getText();

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

			guestScreen();
		}

	}

	private static void userScreen(boolean bool) {

		if (bool) {
			System.out.println("This is an admin! ");
		}

		JFrame main_window = new JFrame();
		main_window.setSize(1280, 720);
		main_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main_window.setResizable(false);

		JPanel panel2 = new JPanel();

		main_window.add(panel2);
		panel2.setLayout(null);

		ImageIcon icon = new ImageIcon("t6gPzo.jpg");
		JLabel train = new JLabel(icon);
		train.setBounds(0, 0, 1280, 720);
		panel2.add(train);

		main_window.setVisible(true);

	}

	private static void guestScreen() {

		JFrame main_window = new JFrame();
		main_window.setSize(1280, 720);
		main_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main_window.setResizable(false);

		JPanel panel2 = new JPanel();

		main_window.add(panel2);
		panel2.setLayout(null);

		ImageIcon icon = new ImageIcon("t6gPzo.jpg");
		JLabel train = new JLabel(icon);
		train.setBounds(0, 0, 1280, 720);
		panel2.add(train);

		main_window.setVisible(true);

	}
}
