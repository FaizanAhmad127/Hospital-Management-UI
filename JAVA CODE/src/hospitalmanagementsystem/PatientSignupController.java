

package hospitalmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class PatientSignupController 
{
    PatientSignupView PSView;
    SQL s=new SQL();
    public PatientSignupController(PatientSignupView PSView) 
    {
        this.PSView=PSView;
        this.PSView.PSHandler(new PSController());
    }
    public class PSController implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==PSView.signupButton)
            {
                 if(s.checkUsername(PSView.getUsername(),"PatientUsername","patientauthentication")==true)
                {
                    JOptionPane.showMessageDialog(PSView.frame,"Username already in use");
                }
                else
                {
                s.enterPatientDescription(PSView.getUsername(), PSView.getPassword(),PSView.getFirstName(), PSView.getLastName(), PSView.getEmail(), PSView.getContact(), PSView.getAddress(), PSView.getQualification(), PSView.getAge());
                JOptionPane.showMessageDialog(PSView.frame,"Signup succesfull");
                
                PSView.frame.dispose();
                SignupLoginFrameView SLFView=new SignupLoginFrameView();
                SignupLoginFrameController SLFController=new SignupLoginFrameController(SLFView); 
                }
            }
            else if(ae.getSource()==PSView.backButton)
            {
                if(PSView.fromWhere.equalsIgnoreCase("Come from signup login frame"))
                {
                    PSView.frame.dispose();
                    SignupLoginFrameView SLFView=new SignupLoginFrameView();
                    SignupLoginFrameController SLFController=new SignupLoginFrameController(SLFView);
                }
                else if(PSView.fromWhere.equalsIgnoreCase("Come from admin home frame"))
                {
                    PSView.frame.dispose();
                    AdminHomeFrameView AHFView=new AdminHomeFrameView();
                    AdminHomeFrameController AHFController=new AdminHomeFrameController(AHFView);
                }
                else if(PSView.fromWhere.equalsIgnoreCase("come from receptionist home frame"))
                {
                    PSView.frame.dispose();
                    ReceptionistHomeFrameView RHFView=new ReceptionistHomeFrameView();
                    ReceptionistHomeFrameController RHFController=new ReceptionistHomeFrameController(RHFView);
                }
//                else if(PSView.fromWhere.equalsIgnoreCase("come from patient home frame"))
//                {
//                    PSView.frame.dispose();
//                    PatientHomeFrameView PHFView=new PatientHomeFrameView();
//                    PatientHomeFrameController PHFController=new PatientHomeFrameController(PHFView);
//                    
//                }
            }
        }
    }
}
