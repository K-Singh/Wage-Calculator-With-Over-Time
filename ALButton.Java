package MainPack;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import MainPack.*;
import javax.swing.JButton;


public class ALButton implements ActionListener {

	
	public void actionPerformed(ActionEvent e) {
	Double WageD;
	Double HoursD;
	Double OTD;
	Double OTRateD;
	Double AnswerD;
	Double OTAnswerD;
		
		WageD = Double.parseDouble(MainPack.WageCalcGui.Wage.getText());
		HoursD = Double.parseDouble(MainPack.WageCalcGui.Hours.getText());
		OTD = Double.parseDouble(MainPack.WageCalcGui.OT.getText());
		OTRateD = Double.parseDouble(MainPack.WageCalcGui.OTRate.getText());
		AnswerD = WageD * HoursD;
		OTAnswerD = AnswerD + ((WageD * OTD) + ((WageD * OTD) * OTRateD));
		if(OTD > 0  && OTD != null && OTRateD > 0 && OTRateD != null){
			MainPack.WageCalcGui.Answer.setText(OTAnswerD.toString());
		}
		else {
			MainPack.WageCalcGui.Answer.setText(AnswerD.toString());
		}
	}

}
