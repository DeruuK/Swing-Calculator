package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	
	double num1 = 0;
	double num2 = 0;
	double result = 0;
	String answer = null;
	String operation = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Lucida Grande", Font.BOLD, 19));
		frame.setBounds(100, 100, 286, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(15, 4, 256, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnDel = new JButton("<-");
		btnDel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numb = textField.getText();
				if(numb.length()>0){
					numb = numb.substring(0, numb.length()-1);
				}
				textField.setText(numb);
			}
		});
		btnDel.setBounds(15, 60, 55, 55);
		frame.getContentPane().add(btnDel);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNum = textField.getText() + btn7.getText();
				textField.setText(enterNum);
			}
		});
		btn7.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn7.setBounds(15, 115, 55, 55);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNum = textField.getText() + btn8.getText();
				textField.setText(enterNum);
			}
		});
		btn8.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn8.setBounds(82, 115, 55, 55);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNum = textField.getText() + btn9.getText();
				textField.setText(enterNum);
			}
		});
		btn9.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn9.setBounds(149, 115, 55, 55);
		frame.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNum = textField.getText() + btn4.getText();
				textField.setText(enterNum);
			}
		});
		btn4.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn4.setBounds(15, 170, 55, 55);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNum = textField.getText() + btn5.getText();
				textField.setText(enterNum);
			}
		});
		btn5.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn5.setBounds(82, 170, 55, 55);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNum = textField.getText() + btn6.getText();
				textField.setText(enterNum);
			}
		});
		btn6.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn6.setBounds(149, 170, 55, 55);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNum = textField.getText() + btn1.getText();
				textField.setText(enterNum);
			}
		});
		btn1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn1.setBounds(15, 225, 55, 55);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNum = textField.getText() + btn2.getText();
				textField.setText(enterNum);
			}
		});
		btn2.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn2.setBounds(82, 225, 55, 55);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNum = textField.getText() + btn3.getText();
				textField.setText(enterNum);
			}
		});
		btn3.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn3.setBounds(149, 225, 55, 55);
		frame.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNum = textField.getText() + btn0.getText();
				textField.setText(enterNum);
			}
		});
		btn0.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn0.setBounds(15, 280, 55, 55);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().indexOf(".")==-1){
					String enterNum = textField.getText() + btnDot.getText();
					textField.setText(enterNum);
				}
			}
		});
		btnDot.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnDot.setBounds(82, 280, 55, 55);
		frame.getContentPane().add(btnDot);
		
		JButton btnRev = new JButton("+|-");
		btnRev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double numnow = (-1)*Double.parseDouble(textField.getText());
				textField.setText(String.valueOf(numnow));
			}
		});
		btnRev.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnRev.setBounds(149, 280, 55, 55);
		frame.getContentPane().add(btnRev);
		
		JButton btnClean = new JButton("C");
		btnClean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClean.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnClean.setBounds(82, 60, 55, 55);
		frame.getContentPane().add(btnClean);
		
		JButton btnPec = new JButton("%");
		btnPec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()==false){
					num1 = Double.parseDouble(textField.getText());
					operation = btnPec.getText();
					textField.setText(null);
				}	
			}
		});
		btnPec.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnPec.setBounds(149, 60, 55, 55);
		frame.getContentPane().add(btnPec);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()==false){
					num1 = Double.parseDouble(textField.getText());
					operation = btnAdd.getText();
					textField.setText(null);
				}	
			}
		});
		btnAdd.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnAdd.setBounds(216, 60, 55, 55);
		frame.getContentPane().add(btnAdd);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()==false){
					num1 = Double.parseDouble(textField.getText());
					operation = btnMinus.getText();
					textField.setText(null);
				}	
			}
		});
		btnMinus.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnMinus.setBounds(216, 115, 55, 55);
		frame.getContentPane().add(btnMinus);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()==false){
					num1 = Double.parseDouble(textField.getText());
					operation = btnMul.getText();
					textField.setText(null);
				}	
			}
		});
		btnMul.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnMul.setBounds(216, 170, 55, 55);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()==false){
					num1 = Double.parseDouble(textField.getText());
					operation = btnDiv.getText();
					textField.setText(null);
				}
			}
		});
		btnDiv.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnDiv.setBounds(216, 225, 55, 55);
		frame.getContentPane().add(btnDiv);
		
		JButton btnRst = new JButton("=");
		btnRst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()==false){
					num2 = Double.parseDouble(textField.getText());
					if(operation == "+"){
						result = num1 + num2;
					}else if(operation == "-"){
						result = num1 - num2;
					}else if(operation == "*"){
						result = num1 * num2;
					}else if(operation == "/" && num2!=0){
						result = num1 / num2;
					}else if(operation == "%" && num2!=0){
						result = num1 % num2;
					}else{
						result = num2;
					}
					answer = String.valueOf(result);
					textField.setText(answer);
					operation = null;
					num1 = 0;
					num2 = 0;
				}	
			}
		});
		btnRst.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnRst.setBounds(216, 280, 55, 55);
		frame.getContentPane().add(btnRst);
	}
}
