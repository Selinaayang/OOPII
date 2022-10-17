//A1063308

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class week5HW extends JFrame implements ActionListener{
	private JPanel textPanel,buttonPanel;
	private JTextField text;
	
	public week5HW() {
		super("計算機GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,380);
		setBackground(Color.white);
		setLayout(new BorderLayout());
		
		textPanel=new JPanel();
		textPanel.setBackground(Color.WHITE);
		text=new JTextField(25);
		text.setEditable(false);
		textPanel.add(text);
		add(textPanel,BorderLayout.NORTH);
		
		buttonPanel=new JPanel();
		buttonPanel.setBackground(Color.WHITE);
		buttonPanel.setLayout(new GridLayout(4,4,10,10));
		
		JButton seven=new JButton("7");
		seven.addActionListener(this);
		buttonPanel.add(seven);
		
		JButton eight=new JButton("8");
		eight.addActionListener(this);
		buttonPanel.add(eight);
		
		JButton nine=new JButton("9");
		nine.addActionListener(this);
		buttonPanel.add(nine);
		
		JButton div=new JButton("/");
		div.addActionListener(this);
		buttonPanel.add(div);
		
		JButton four=new JButton("4");
		four.addActionListener(this);
		buttonPanel.add(four);
		
		JButton five=new JButton("5");
		five.addActionListener(this);
		buttonPanel.add(five);
		
		JButton six=new JButton("6");
		six.addActionListener(this);
		buttonPanel.add(six);
		
		JButton mul=new JButton("*");
		mul.addActionListener(this);
		buttonPanel.add(mul);
		
		JButton one=new JButton("1");
		one.addActionListener(this);
		buttonPanel.add(one);
		
		JButton two=new JButton("2");
		two.addActionListener(this);
		buttonPanel.add(two);
		
		JButton three=new JButton("3");
		three.addActionListener(this);
		buttonPanel.add(three);
		
		JButton minus=new JButton("-");
		minus.addActionListener(this);
		buttonPanel.add(minus);
		
		JButton zero=new JButton("0");
		zero.addActionListener(this);
		buttonPanel.add(zero);
		
		JButton point=new JButton(".");
		point.addActionListener(this);
		buttonPanel.add(point);
		
		JButton equal=new JButton("=");
		equal.addActionListener(this);
		buttonPanel.add(equal);
		
		JButton plus=new JButton("+");
		plus.addActionListener(this);
		buttonPanel.add(plus);
		
		add(buttonPanel,BorderLayout.CENTER);
	}
	
	public void actionPerformed(ActionEvent e) {
		String actioncommand=e.getActionCommand();
		JOptionPane.showMessageDialog(null, actioncommand);
	}
	
	public static void main(String[] args) {
		week5HW gui=new week5HW();
		gui.setVisible(true);

	}

}
