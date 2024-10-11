package novostestes;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Screen extends JFrame implements ActionListener{
	Gaming gaming = new Gaming();
	
	JLabel txt = new JLabel();
	JButton firstButton = new JButton();
	JButton secondButton = new JButton();
	
	public Screen() {
		setTitle("Guess Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		
		firstButton.setText("Yes");
		firstButton.setBounds(150, 200, 80, 30);
		firstButton.setForeground(new Color(237, 241, 238));
		firstButton.setBackground(new Color(9, 10, 9));
		
		secondButton.setText("No");
		secondButton.setBounds(250, 200, 80, 30);
		secondButton.setForeground(new Color(237, 241, 238));
		secondButton.setBackground(new Color(9, 10, 9));
		
		add(firstButton);
		add(secondButton);
		
		firstButton.addActionListener(this::ButtonOne);
		secondButton.addActionListener(this::ButtonTwo);
		
		txt.setText("I hear you're good when it comes to getting it right, you want to test your luck?");
		txt.setFont(new Font("Arial", Font.BOLD, 12));
		txt.setBounds(20, 100, 1000, 30);
		add(txt);
			
		setVisible(true);
	}
	private void ButtonOne(ActionEvent actionevent) {
		dispose();
		gaming.gamer();
	}
	private void ButtonTwo(ActionEvent actionevent) {
		dispose();
		JOptionPane.showMessageDialog(null, "All right, I've understood everything, you're just scared!", "ONLY FOR LOSERS", JOptionPane.OK_CANCEL_OPTION);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
