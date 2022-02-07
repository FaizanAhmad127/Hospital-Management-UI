

package hospitalmanagementsystem;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class LoginFrameController
{
    LoginFrameView LFView;
    SQL sql=new SQL();
    public LoginFrameController(LoginFrameView LFView) 
    {
        this.LFView=LFView;
        this.LFView.LFHandler(new LFContoller());
    }
    
    
    private class LFContoller implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==LFView.loginButton)
            {
                if(LFView.fromWhere.equalsIgnoreCase("Admin"))
                {
                    if(sql.login(LFView.getUsername(),LFView.getPassword(),"AdminUsername","AdminPassword","adminauthentication")==true)
                    {
                         LFView.frame.dispose();
                         AdminHomeFrameView AHFView=new AdminHomeFrameView();
                         AdminHomeFrameController AHFController=new AdminHomeFrameController(AHFView);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(LFView.frame,"Wrong ID or Password");
                    }
                   
                }
                else if(LFView.fromWhere.equalsIgnoreCase("Doctor"))
                {
                    if(sql.login(LFView.getUsername(),LFView.getPassword(),"DoctorUsername","DoctorPassword","doctorauthentication")==true)
                    {
                    LFView.frame.dispose();
                    DoctorHomeFrameView DHFView=new DoctorHomeFrameView();
                    DoctorHomeFrameController DHFController=new DoctorHomeFrameController(DHFView); 
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(LFView.frame,"Wrong ID or Password");
                    }
                }
                else if(LFView.fromWhere.equalsIgnoreCase("Receptionist"))
                {
                    if(sql.login(LFView.getUsername(),LFView.getPassword(),"ReceptionistUsername","ReceptionistPassword","receptionistauthentication")==true)
                    {
                    LFView.frame.dispose();
                    ReceptionistHomeFrameView RHFView=new ReceptionistHomeFrameView();
                    ReceptionistHomeFrameController RHFController=new ReceptionistHomeFrameController(RHFView);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(LFView.frame,"Wrong ID or Password");
                    }
                }
                else if(LFView.fromWhere.equalsIgnoreCase("Patient"))
                {
                    if(sql.login(LFView.getUsername(),LFView.getPassword(),"PatientUsername","PatientPassword","patientauthentication")==true)
                    {
                    LFView.frame.dispose();
                    PatientHomeFrameView PHFView=new PatientHomeFrameView();
                    PatientHomeFrameController PHFController=new PatientHomeFrameController(PHFView);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(LFView.frame,"Wrong ID or Password");
                    }
                }
            }
            else if(ae.getSource()==LFView.backButton)
            {
                LFView.frame.dispose();
                SignupLoginFrameView SLFView=new SignupLoginFrameView();
                SignupLoginFrameController SLFController=new SignupLoginFrameController(SLFView);
            }
        }
    }

}
