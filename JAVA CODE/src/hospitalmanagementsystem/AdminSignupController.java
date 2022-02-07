 

package hospitalmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class AdminSignupController 
{
    AdminSignupView ASView;
    SQL s=new SQL();
    public AdminSignupController(AdminSignupView ASView)
    {
        this.ASView=ASView;
        this.ASView.ASHandler(new ASController());
    }
    
    public class ASController implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==ASView.signupButton)
            {
                if(s.checkUsername(ASView.getUsername(),"AdminUsername","adminauthentication")==true)
                {
                    JOptionPane.showMessageDialog(ASView.frame,"Username already in use");
                }
                else
                {
                s.enterAdminDescription(ASView.getUsername(), ASView.getPassword(),ASView.getFirstName(), ASView.getLastName(), ASView.getEmail(), ASView.getContact(), ASView.getAddress(), ASView.getQualification(), ASView.getAge());
                JOptionPane.showMessageDialog(ASView.frame,"Signup succesfull");
                
                ASView.frame.dispose();
                SignupLoginFrameView SLFView=new SignupLoginFrameView();
                SignupLoginFrameController SLFController=new SignupLoginFrameController(SLFView); 
                }
                }
            else if(ae.getSource()==ASView.backButton)
            {
                ASView.frame.dispose();
                SignupLoginFrameView SLFView=new SignupLoginFrameView();
                SignupLoginFrameController SLFController=new SignupLoginFrameController(SLFView);  
            }
        }
    }
    
}
