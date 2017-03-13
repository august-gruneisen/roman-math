/* 
 * This is a GUI for adding Roman numerals together and producing the result as a Roman numeral.
 * Uses the Roman_Calculator class.
 */
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

	private JFrame frmRomanCalculator;
	private JTextField textFieldFirstRoman;
	private JTextField textFieldSecondRoman;
	private JTextField textFieldResult;
	private JButton btnMultiply;
	private JButton btnDivide;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Roman_Calculator_GUI window = new Roman_Calculator_GUI();
					window.frmRomanCalculator.setVisible(true);
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
		frmRomanCalculator = new JFrame();
		frmRomanCalculator.setTitle("Roman Calculator");
		frmRomanCalculator.setBounds(100, 100, 446, 252);
		frmRomanCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRomanCalculator.getContentPane().setLayout(null);
		
		textFieldFirstRoman = new JTextField();
		textFieldFirstRoman.setBounds(10, 11, 200, 40);
		frmRomanCalculator.getContentPane().add(textFieldFirstRoman);
		textFieldFirstRoman.setColumns(10);
		
		textFieldSecondRoman = new JTextField();
		textFieldSecondRoman.setColumns(10);
		textFieldSecondRoman.setBounds(220, 11, 200, 40);
		frmRomanCalculator.getContentPane().add(textFieldSecondRoman);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldResult.setText(Roman_Calculator.addRomans(textFieldFirstRoman.getText(), textFieldSecondRoman.getText()));
			}
		});
		btnAdd.setBounds(10, 62, 200, 40);
		frmRomanCalculator.getContentPane().add(btnAdd);
		
		JButton btnSubtract = new JButton("SUBTRACT");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldResult.setText(Roman_Calculator.subtractRomans(textFieldFirstRoman.getText(), textFieldSecondRoman.getText()));
			}
		});
		btnSubtract.setBounds(220, 62, 200, 40);
		frmRomanCalculator.getContentPane().add(btnSubtract);
		
		textFieldResult = new JTextField("");
		textFieldResult.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				e.consume();
			}
		});
		textFieldResult.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldResult.setFont(new Font("Times New Roman", Font.BOLD, 30));
		textFieldResult.setBounds(10, 164, 410, 40);
		frmRomanCalculator.getContentPane().add(textFieldResult);
		textFieldResult.setColumns(10);
		
		btnMultiply = new JButton("MULTIPLY");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFieldResult.setText(Roman_Calculator.multiplyRomans(textFieldFirstRoman.getText(), textFieldSecondRoman.getText()));
			}
		});
		btnMultiply.setBounds(10, 113, 200, 40);
		frmRomanCalculator.getContentPane().add(btnMultiply);
		
		btnDivide = new JButton("DIVIDE");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldResult.setText(Roman_Calculator.divideRomans(textFieldFirstRoman.getText(), textFieldSecondRoman.getText()));
			}
		});
		btnDivide.setBounds(220, 113, 200, 40);
		frmRomanCalculator.getContentPane().add(btnDivide);
	}
}
