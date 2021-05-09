
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
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

public class test {

	public static void main(String[] args) {

		// working on user screen

		JFrame main_window = new JFrame();
		main_window.setSize(1280, 720);
		main_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main_window.setResizable(false);
		//main_window.setLayout(null);

		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		main_window.add(panel2);
		
		
		// LABELS
		
		JLabel findTrains = new JLabel("SEARCH FOR TRAINS");
		findTrains.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 25));
		findTrains.setBounds(1280/2 - 150,20,300,32);
		panel2.add(findTrains);
		
		////////////////////////////////////////////////////
		
		
		// BUTTONS
		ImageIcon icon = new ImageIcon("png-clipart-computer-icons-arrow-switch-volume-icon-miscellaneous-angle.png");
		Image image = icon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(40, 20,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		icon = new ImageIcon(newimg);  // transform it back
		
		JButton switcher = new JButton(icon);
		switcher.setBounds(325,89,40,20);
		panel2.add(switcher);
		
		
		////////////////////////////////////////////////////


		
		// OPTION BOXES
		String[] stations = new String[] {"From", "Ramlh", "Gamea' Ibrahim", "Azarita", "Al Shahid Moustafa Ziean",
				"Al Shobban Al Moslemin", "Al Shatby", "Al Gamaa", "Camp Caesar", "Al Ibrahimiyya",
				"Sporting Al Soghra", "Sporting Al Kobra", "Cleopatra Al Soghra", "Cleopatra Hammamat",
				"Sidi Gaber Al Sheikh", "Zananere", "Sidi Gaber Al Mahata", "Mustafa Kamil", "Mohammed Mahfouz",
				"Roushdy", "Bolkly", "Al Hedaya", "Saba Pasha", "Ramsis", "Al Fonoun Al Gamella", "Kasr Al Safa",
				"San Stefano", "Tharwat", "Loran", "Al Saraya", "Sidi Beshr", "Al Seyouf", "Al Nasr", "Al Wezara",
				"Al Karnak", "Baccos", "Safar", "Schutz", "Gianaclis" };

		JComboBox<String> from = new JComboBox<>(stations);

		from.setBounds(0, 0, 300, 200);
		panel2.add(from);
		
		String[] stations2 = new String[] {"To", "Ramlh", "Gamea' Ibrahim", "Azarita", "Al Shahid Moustafa Ziean",
				"Al Shobban Al Moslemin", "Al Shatby", "Al Gamaa", "Camp Caesar", "Al Ibrahimiyya",
				"Sporting Al Soghra", "Sporting Al Kobra", "Cleopatra Al Soghra", "Cleopatra Hammamat",
				"Sidi Gaber Al Sheikh", "Zananere", "Sidi Gaber Al Mahata", "Mustafa Kamil", "Mohammed Mahfouz",
				"Roushdy", "Bolkly", "Al Hedaya", "Saba Pasha", "Ramsis", "Al Fonoun Al Gamella", "Kasr Al Safa",
				"San Stefano", "Tharwat", "Loran", "Al Saraya", "Sidi Beshr", "Al Seyouf", "Al Nasr", "Al Wezara",
				"Al Karnak", "Baccos", "Safar", "Schutz", "Gianaclis" };

		JComboBox<String> to = new JComboBox<>(stations2);

		to.setBounds(400, 0, 300, 200);
		panel2.add(to);
		////////////////////////////////////////////////////

		
		
		// PICTURES 
		ImageIcon icon2 = new ImageIcon("t6gPzo.jpg");
        JLabel train = new JLabel(icon2);
        train.setBounds(0,0,1280,720);
        panel2.add(train);
		////////////////////////////////////////////////////



		main_window.setVisible(true);
		
		////////////////////////////////////////////////////

	}

}
