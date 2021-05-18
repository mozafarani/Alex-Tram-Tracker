package train;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
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

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class test implements ActionListener {

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
	private static JButton goToMain;
	private static JMenuItem ticket;
	private static JMenuItem surprise;
	private static JMenuItem money;
	private static JMenuItem balance;
	private static JMenuItem searchTrain;

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

	private static JFrame nw1;
	

	public static void main(String[] args) {
		
		
		
	}

	////////////////////////////////////////////////////

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
