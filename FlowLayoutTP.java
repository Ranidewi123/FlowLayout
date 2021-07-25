import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;

public class FlowLayoutTP {


	JFrame frame = new JFrame("TP1 Flow Layout");
	JPanel panel = new JPanel();
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panel5 = new JPanel();
	
	
	JLabel title1 = new JLabel("SATU");
	JLabel title2 = new JLabel("DUA");
	JLabel title3 = new JLabel("TIGA");
	JLabel title4 = new JLabel("EMPAT");
	JLabel title5 = new JLabel("LIMA");

	
	public FlowLayoutTP() {
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());

		panel1.setBackground(new Color(255, 198, 178));
		panel2.setBackground(new Color(255, 159, 139));
		panel3.setBackground(new Color(255, 123, 111));
		panel4.setBackground(new Color(219, 46, 61));
		panel5.setBackground(new Color(255, 63, 63));
		
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		panel1.add(title1);
		panel2.add(title2);
		panel3.add(title3);
		panel4.add(title4);
		panel5.add(title5);
	
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);
		frame.add(panel5);	
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new FlowLayoutTP();
			}
		});
	}
	
}
