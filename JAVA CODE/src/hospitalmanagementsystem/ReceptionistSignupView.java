

package hospitalmanagementsystem;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class ReceptionistSignupView  extends CommonSignup
{
    
    JLabel receptionistLabel;
    String fromWhere;
    public ReceptionistSignupView(String fromWhere) 
    {
        this.fromWhere=fromWhere;
        
        receptionistLabel=new JLabel("Receptionist Signup Panel");
        receptionistLabel.setBounds(270, 3, 400, 50);
        receptionistLabel.setFont(new Font("TimesRoman", Font.BOLD, 30));
        panel.add(receptionistLabel);
        
        this.addBackgroundPic();
        frame.setVisible(true);
    }
    public void RSHandler(ActionListener RSListener)
    {
        signupButton.addActionListener(RSListener);
        backButton.addActionListener(RSListener);
    }
    
}
