package net.codejava;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Main {
	public static void main(String[] args) {
		Main main = new Main();
	}

	public Main() {
		
		JFrame frame = new JFrame("View Meals in the Meal List");
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container pane = frame.getContentPane();
		
		JPanel mainPanel = new JPanel();
		JPanel panelNorth = new JPanel();
		JPanel panelSouth = new JPanel();
		
		pane.add(mainPanel);
		mainPanel.add(panelNorth);
		mainPanel.add(panelSouth);
		
		JButton btnViewMeals = new JButton("VIEW AVAILABLE MEALS");
		panelNorth.add(btnViewMeals);
		
		JButton btnEditMeals = new JButton("Edit Meals");
		panelNorth.add(btnEditMeals);
		
				
		btnEditMeals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EditMeals edit = new EditMeals();
				
				
			}
		});

		frame.revalidate();
		frame.setVisible(true);
		
		
		
		
	}

}
