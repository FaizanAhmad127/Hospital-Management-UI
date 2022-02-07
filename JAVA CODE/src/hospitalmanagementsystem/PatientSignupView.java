

package hospitalmanagementsystem;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class PatientSignupView extends CommonSignup
{
    JLabel patientLabel;
    String fromWhere;
    public PatientSignupView(String fromWhere)
    {
        this.fromWhere=fromWhere;
        
        patientLabel=new JLabel("Patient Signup Panel");
        patientLabel.setBounds(270, 3, 400, 50);
        patientLabel.setFont(new Font("TimesRoman", Font.BOLD, 30));
        panel.add(patientLabel);
        
        this.addBackgroundPic();
        frame.setVisible(true);
    }
    public void PSHandler(ActionListener PSListener)
    {
        signupButton.addActionListener(PSListener);
        backButton.addActionListener(PSListener);
    }
}
