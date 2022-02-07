

package hospitalmanagementsystem;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AdminSignupView extends CommonSignup
{
    
   
    JLabel adminLabel;
    AdminSignupView() 
    {
        
        adminLabel=new JLabel("Admin Signup Panel");
        adminLabel.setBounds(270, 3, 400, 50);
        adminLabel.setFont(new Font("TimesRoman", Font.BOLD, 30));
        panel.add(adminLabel);
        
        this.addBackgroundPic();
        frame.setVisible(true);
    }
    public void ASHandler(ActionListener ASListener)
    {
        backButton.addActionListener(ASListener);
        signupButton.addActionListener(ASListener);
    }
    
    
}
