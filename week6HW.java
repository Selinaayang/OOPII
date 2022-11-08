//A1063308
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class week6HW extends JFrame implements ActionListener{
	private String[] eatingName= {"筒仔米糕","味增湯","開胃菜"};
	private String[] eating= {"001.jpg","002.jpg","003.jpg"};
	private JLabel picName,eatingPic;
	private Icon imag1,imag2,imag3;
	private JButton last,next;
	private int pageNum;
	public week6HW() {
		setTitle("小吃小圖");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,450);
		setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        JPanel picPanel=new JPanel();
        picPanel.setLayout(new BorderLayout());
        
        Font fLabel=new Font("宋體",Font.PLAIN,20);
        picName=new JLabel(eatingName[1],JLabel.CENTER);
        picName.setFont(fLabel);
        picPanel.add(picName,BorderLayout.NORTH);
        
        eatingPic=new JLabel("",JLabel.CENTER);
        imag1 = new ImageIcon(new ImageIcon(eating[0]).getImage().getScaledInstance(512, 342, Image.SCALE_SMOOTH));
        imag2 = new ImageIcon(new ImageIcon(eating[1]).getImage().getScaledInstance(512, 342, Image.SCALE_SMOOTH));
        imag3 = new ImageIcon(new ImageIcon(eating[2]).getImage().getScaledInstance(512, 342, Image.SCALE_SMOOTH));
        eatingPic.setIcon(imag2);
        picPanel.add(eatingPic,BorderLayout.CENTER);
        add(picPanel);
        
        JPanel buttonPanel=new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        last=new JButton("上一張");
        last.addActionListener(this);
        buttonPanel.add(last);
        
        next=new JButton("下一張");
        next.addActionListener(this);
        buttonPanel.add(next);
        add(buttonPanel,BorderLayout.SOUTH);
        
        pageNum=2;
	}
	
	public void actionPerformed(ActionEvent e) {
		String actioncommand=e.getActionCommand();
		if(actioncommand.equals("上一張")) {
			pageNum--;
			if(pageNum==1) {
				picName.setText(eatingName[0]);
				eatingPic.setIcon(imag1);		
			}
			if(pageNum==2) {
				picName.setText(eatingName[1]);
				eatingPic.setIcon(imag2);		
			}
			if(pageNum==0) {
				JOptionPane.showMessageDialog(null,"沒有圖片了","ERROR",JOptionPane.WARNING_MESSAGE);
				pageNum=1;
			}
		}
		
		if(actioncommand.equals("下一張")) {
			pageNum++;
			if(pageNum==2) {
				picName.setText(eatingName[1]);
				eatingPic.setIcon(imag2);		
			}
			if(pageNum==3) {
				picName.setText(eatingName[2]);
				eatingPic.setIcon(imag3);		
			}
			if(pageNum==4) {
				JOptionPane.showMessageDialog(null,"沒有圖片了","ERROR",JOptionPane.WARNING_MESSAGE);
				pageNum=3;
			}
		}
	}
	
	public static void main(String[] args) {
		week6HW gui=new week6HW();
		gui.setVisible(true);
	}

}
