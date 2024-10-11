package novostestes;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Gaming extends JFrame implements ActionListener{
	Random random = new Random();
	int number = random.nextInt(0, 100);
	int tentativa;
	int tryingNumbers;
	String getValues;
	
	JButton tryButton = new JButton();
	JTextField tryField = new JTextField();
	JLabel tryJLabel = new JLabel();
	
	public void gamer(){
		setTitle("Guess Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		
		tryButton.setText("Try guess");
		tryButton.setBounds(125, 100, 150, 20);
		add(tryButton);
		
		tryField.setText("");
		tryField.setBounds(125, 40, 150, 20);
		add(tryField);
		
		tryJLabel.setText("Waiting for you to write...");
		tryJLabel.setFont(new Font("Arial", Font.BOLD, 15));
		tryJLabel.setBounds(105, 60, 400, 20);
		add(tryJLabel);
		
		tryButton.addActionListener(this::button);
		
		setVisible(true);
	}
	private void button(ActionEvent actionevent1) {
		tryingNumbers++;
		getValues = tryField.getText();
		tentativa = Integer.parseInt(getValues);
		
		try {
			if (tentativa != ' ') {
				if (tentativa < number) 
				{
					tryJLabel.setText("The written value is very low");
				}
				else if (tentativa > number) 
				{
					tryJLabel.setText("The written value is very high");
				}
				else 
				{
					if (tryingNumbers <= 5) 
					{
						JOptionPane.showMessageDialog(null, "You got it right " + tryingNumbers + " attempts. You really are good!!!", "RESULTS", JOptionPane.OK_CANCEL_OPTION);
						dispose();
					}
					else 
					{
						JOptionPane.showMessageDialog(null, "You got it right " + tryingNumbers + " attempts. really are HORRIBLE!!", "Resultado", JOptionPane.OK_CANCEL_OPTION);
						dispose();
					}
				}
				
			}
		} catch (Exception e) {
			
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
