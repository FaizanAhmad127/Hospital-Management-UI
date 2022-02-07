

package hospitalmanagementsystem;
import java.awt.Color;
import java.awt.event.*;
public class SignupLoginFrameController 
{
    SignupLoginFrameView SLFView;

    public SignupLoginFrameController(SignupLoginFrameView SLFView) 
    {
        this.SLFView=SLFView;
        this.SLFView.slfHandler(new SLFController());
    }
    
    private class SLFController implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==SLFView.signup)
            {
                SLFView.frame.dispose();
                if(getComboIndex()=="Admin")
                {
                    
                    AdminSignupView ASView=new AdminSignupView();
                    AdminSignupController ASController=new AdminSignupController(ASView);
                }
                else if(getComboIndex()=="Doctor")
                {
                    DoctorSignupView DSView=new DoctorSignupView("Come from signup login frame");
                    DoctorSignupController DSController=new DoctorSignupController(DSView);
                }
                else if(getComboIndex()=="Receptionist")
                {
                    ReceptionistSignupView RSView=new ReceptionistSignupView("Come from signup login frame");
                    ReceptionistSignupController RSController=new ReceptionistSignupController(RSView);
                }
                else if(getComboIndex()=="Patient")
                {
                    PatientSignupView PSView=new PatientSignupView("Come from signup login frame");
                    PatientSignupController PSController=new PatientSignupController(PSView);
                }
            }
            if(ae.getSource()==SLFView.login)
            {
                SLFView.frame.dispose();
                if(getComboIndex()=="Admin")
                {
                    LoginFrameView LFView=new LoginFrameView("Admin");
                    LoginFrameController LFController=new LoginFrameController(LFView);
                }
                else if(getComboIndex()=="Doctor")
                {
                    LoginFrameView LFView=new LoginFrameView("Doctor");
                    LoginFrameController LFController=new LoginFrameController(LFView);
                }
                else if(getComboIndex()=="Receptionist")
                {
                    LoginFrameView LFView=new LoginFrameView("Receptionist");
                    LoginFrameController LFController=new LoginFrameController(LFView);
                }
                else if(getComboIndex()=="Patient")
                {
                    LoginFrameView LFView=new LoginFrameView("Patient");
                    LoginFrameController LFController=new LoginFrameController(LFView);
                }
                
            }
        }
    }
    public String getComboIndex()
    {
        if(SLFView.comboBox.getSelectedIndex()==0)
        {
            return "Admin";
        }
        else if(SLFView.comboBox.getSelectedIndex()==1)
        {
            return "Doctor";
        }
        else if(SLFView.comboBox.getSelectedIndex()==2)
        {
            return "Receptionist";
        }
        else if(SLFView.comboBox.getSelectedIndex()==3)
        {
            return "Patient";
        }
        else
            return null;
    }
}
