//A1063308
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class week8HW extends JFrame implements ListSelectionListener{
	private JList<String> cityList;
	private JTextArea showTXT;
	
	public week8HW() {
		setTitle("各地特產");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,100,320,250);
		setLayout(new BorderLayout());
		
		JPanel listPanel=new JPanel();
		listPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JLabel jlb1=new JLabel("找各地名產：");
		listPanel.add(jlb1);
		
		String[] city= {"台北","桃園","台中","彰化","南投","嘉義","台南","高雄","屏東"};
		cityList=new JList<>(city);
		cityList.setVisibleRowCount(5);
		cityList.addListSelectionListener(this);
		
		JScrollPane jsp=new JScrollPane(cityList,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		listPanel.add(jsp);
		add(listPanel,BorderLayout.NORTH);
		
		
		JPanel TAPanel=new JPanel();
		showTXT=new JTextArea("請選取地名...",5,20);
		showTXT.setLineWrap(true);//換行
		JScrollPane jsp2=new JScrollPane(showTXT,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		TAPanel.add(jsp2);
		add(TAPanel,BorderLayout.CENTER);
	}
	
	public void valueChanged(ListSelectionEvent e) {
		showTXT.setText("");
		int[] num=cityList.getSelectedIndices();
		
		ListModel<String> listModel = cityList.getModel();
		for (int index : num) {
	          if(index==0) {
	        	  showTXT.append(listModel.getElementAt(index)+" 特產：淡水鐵蛋"+"\n");
	          }
	          if(index==1) {
	        	  showTXT.append(listModel.getElementAt(index)+" 特產：大溪豆乾"+"\n");
	          }
	          if(index==2) {
	        	  showTXT.append(listModel.getElementAt(index)+" 特產：太陽餅"+"\n");
	          }
	          if(index==3) {
	        	  showTXT.append(listModel.getElementAt(index)+" 特產：北斗肉園"+"\n");
	          }
	          if(index==4) {
	        	  showTXT.append(listModel.getElementAt(index)+" 特產：凍頂烏龍茶"+"\n");
	          }
	          if(index==5) {
	        	  showTXT.append(listModel.getElementAt(index)+" 特產：方塊酥"+"\n");
	          }
	          if(index==6) {
	        	  showTXT.append(listModel.getElementAt(index)+" 特產：麻豆文旦"+"\n");
	          }
	          if(index==7) {
	        	  showTXT.append(listModel.getElementAt(index)+" 特產：旗山香蕉"+"\n");
	          }
	          if(index==8) {
	        	  showTXT.append(listModel.getElementAt(index)+" 特產：林邊蓮霧"+"\n");
	          } 
	    }
		
	}
	
	public static void main(String[] args) {
		week8HW gui=new week8HW();
		gui.setVisible(true);
	}

}
