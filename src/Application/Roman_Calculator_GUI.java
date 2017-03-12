package Application;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Roman_Calculator_GUI {

	private JFrame frame;
	private JTextField textFieldFirstRoman;
	private JTextField textFieldSecondRoman;
	private JTextField textFieldResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Roman_Calculator_GUI window = new Roman_Calculator_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Roman_Calculator_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 446, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldFirstRoman = new JTextField();
		textFieldFirstRoman.setBounds(10, 11, 200, 40);
		frame.getContentPane().add(textFieldFirstRoman);
		textFieldFirstRoman.setColumns(10);
		
		textFieldSecondRoman = new JTextField();
		textFieldSecondRoman.setColumns(10);
		textFieldSecondRoman.setBounds(220, 11, 200, 40);
		frame.getContentPane().add(textFieldSecondRoman);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldResult.setText(Roman_Calculator.addRomans(textFieldFirstRoman.getText(), textFieldSecondRoman.getText()));
			}
		});
		btnAdd.setBounds(10, 62, 200, 40);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSubtract = new JButton("SUBTRACT");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldResult.setText(Roman_Calculator.subtractRomans(textFieldFirstRoman.getText(), textFieldSecondRoman.getText()));
			}
		});
		btnSubtract.setBounds(220, 62, 200, 40);
		frame.getContentPane().add(btnSubtract);
		
		textFieldResult = new JTextField("");
		textFieldResult.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				e.consume();
			}
		});
		textFieldResult.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldResult.setFont(new Font("Times New Roman", Font.BOLD, 30));
		textFieldResult.setBounds(10, 113, 410, 40);
		frame.getContentPane().add(textFieldResult);
		textFieldResult.setColumns(10);
	}
}
