

package hospitalmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ReceptionistSignupController 
{
    ReceptionistSignupView RSView;
    SQL s=new SQL();
    public ReceptionistSignupController(ReceptionistSignupView RSView)
    {
        this.RSView=RSView;
        this.RSView.RSHandler(new RSController());
        
    }
    public class RSController implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==RSView.signupButton)
            {
                 if(s.checkUsername(RSView.getUsername(),"ReceptionistUsername","receptionistauthentication")==true)
                {
                    JOptionPane.showMessageDialog(RSView.frame,"Username already in use");
                }
                else
                {
                s.enterReceptionistDescription(RSView.getUsername(), RSView.getPassword(),RSView.getFirstName(), RSView.getLastName(), RSView.getEmail(), RSView.getContact(), RSView.getAddress(), RSView.getQualification(), RSView.getAge());
                JOptionPane.showMessageDialog(RSView.frame,"Signup succesfull");
                
                RSView.frame.dispose();
                SignupLoginFrameView SLFView=new SignupLoginFrameView();
                SignupLoginFrameController SLFController=new SignupLoginFrameController(SLFView); 
                }
            }
            else if(ae.getSource()==RSView.backButton)
            {
                if(RSView.fromWhere.equalsIgnoreCase("Come from signup login frame"))
                {
                    RSView.frame.dispose();
                    SignupLoginFrameView SLFView=new SignupLoginFrameView();
                    SignupLoginFrameController SLFController=new SignupLoginFrameController(SLFView);
                }
                else if(RSView.fromWhere.equalsIgnoreCase("Come from admin home frame"))
                {
                    RSView.frame.dispose();
                    AdminHomeFrameView AHFView=new AdminHomeFrameView();
                    AdminHomeFrameController AHFController=new AdminHomeFrameController(AHFView);
                }
               
            }
        }
    }
    
}
