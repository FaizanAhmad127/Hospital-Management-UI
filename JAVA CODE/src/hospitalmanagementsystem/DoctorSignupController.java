

package hospitalmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class DoctorSignupController 
{
    DoctorSignupView DSView;
    SQL s=new SQL();
    public DoctorSignupController(DoctorSignupView DSView)
    {
        this.DSView=DSView;
        this.DSView.DSHandler(new DSController());
    }
    public class DSController implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            
            if(ae.getSource()==DSView.signupButton)
            {
                 if(s.checkUsername(DSView.getUsername(),"DoctorUsername","doctorauthentication")==true)
                {
                    JOptionPane.showMessageDialog(DSView.frame,"Username already in use");
                }
                else
                {
                s.enterDoctorDescription(DSView.getUsername(), DSView.getPassword(),DSView.getFirstName(), DSView.getLastName(), DSView.getEmail(), DSView.getContact(), DSView.getAddress(), DSView.getQualification(), DSView.getAge(),DSView.getSpecialization());
                JOptionPane.showMessageDialog(DSView.frame,"Signup succesfull");
                
                DSView.frame.dispose();
                SignupLoginFrameView SLFView=new SignupLoginFrameView();
                SignupLoginFrameController SLFController=new SignupLoginFrameController(SLFView); 
                }
            }
            else if(ae.getSource()==DSView.backButton)
            {
                
                if(DSView.fromWhere.equalsIgnoreCase("Come from signup login frame"))
                {
                    DSView.frame.dispose();
                    SignupLoginFrameView SLFView=new SignupLoginFrameView();
                    SignupLoginFrameController SLFController=new SignupLoginFrameController(SLFView);
                }
                else if(DSView.fromWhere.equalsIgnoreCase("Come from admin home frame"))
                {
                    DSView.frame.dispose();
                    AdminHomeFrameView AHFView=new AdminHomeFrameView();
                    AdminHomeFrameController AHFController=new AdminHomeFrameController(AHFView);
                }
               
            }
        }
    }
}
