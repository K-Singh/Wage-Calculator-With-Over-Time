package MainPack;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;


public class WageCalcGui extends JFrame {
	
	public static JPanel jp = new JPanel();
	public static JTextPane Wage = new JTextPane();
	public static JTextPane Hours = new JTextPane();
	public static JTextPane OT = new JTextPane();
	public static JTextPane OTRate = new JTextPane();
	public static JLabel Answer = new JLabel();
	public static JLabel WageL = new JLabel("Wage:");
	public static JLabel HoursL = new JLabel("Hours:");
	public static JLabel OTL = new JLabel("Over Time:");
	public static JLabel OtRateL = new JLabel("OT Rate:");
	public static JLabel Money = new JLabel("Money");
	public static JButton Calc = new JButton("Calculate");
	public static WageCalcGui WG = new WageCalcGui();
	public static ALButton AL = new ALButton();
	public static void main(String[] args){
		
		Calc.addActionListener(AL);
		WG.add(jp);
		jp.add(WageL);
		jp.add(Wage);
		jp.add(HoursL);
		jp.add(Hours);
		jp.add(OTL);
		jp.add(OT);
		jp.add(OtRateL);
		jp.add(OTRate);
		jp.add(Calc);
		jp.add(Money);
		jp.add(Answer);
		WG.setVisible(true);
		WG.setDefaultCloseOperation(EXIT_ON_CLOSE);
		WG.setSize(300, 300);
		WG.setResizable(false);
	}
}
