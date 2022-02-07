

package hospitalmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoctorHomeFrameController 
{
    DoctorHomeFrameView DHFView;
    public DoctorHomeFrameController(DoctorHomeFrameView DHFView) 
    {
        this.DHFView=DHFView;
        this.DHFView.DHFHandler(new DHFController());
    }
    public class DHFController implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==DHFView.addIndoorPatient)
            {
                DHFView.frame.dispose();
                AddIndoorPatientView AIPView=new AddIndoorPatientView("Come from doctor home frame");
                AddIndoorPatientController AIPController=new AddIndoorPatientController(AIPView);
            }
            else if(ae.getSource()==DHFView.checkAppointment)
            {
                DHFView.frame.dispose();
                CheckAppointmentView CAView=new CheckAppointmentView("Come from doctor home frame");
                CheckAppointmentController CAController=new CheckAppointmentController(CAView);
            }
            else if(ae.getSource()==DHFView.updateDoctorInfo)
            {
                DHFView.frame.dispose();
                DoctorUpdateView DUView=new DoctorUpdateView("Come from doctor home frame");
                DoctorUpdateController DUController=new DoctorUpdateController(DUView);
            }
            else if(ae.getSource()==DHFView.doctorLogout)
             {
                 DHFView.frame.dispose();
                 SignupLoginFrameView SLFView=new SignupLoginFrameView();
                 SignupLoginFrameController SLFController=new SignupLoginFrameController(SLFView);
             }
                    
        }
    }
    

}
