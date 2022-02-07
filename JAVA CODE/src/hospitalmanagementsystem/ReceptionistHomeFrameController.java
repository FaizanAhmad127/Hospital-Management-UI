

package hospitalmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReceptionistHomeFrameController 
{
    ReceptionistHomeFrameView RHFView;
    public ReceptionistHomeFrameController(ReceptionistHomeFrameView RHFView) 
    {
        this.RHFView=RHFView;
        this.RHFView.RHFHandler(new RHFController());
    }
    public class RHFController implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==RHFView.setAppointment)
            {
                RHFView.frame.dispose();
                SetAppointmentView SAView=new SetAppointmentView("come from receptionist home frame");
                SetAppointmentController SAController=new SetAppointmentController(SAView);
            }
            else if(ae.getSource()==RHFView.checkAppointment)
            {
                RHFView.frame.dispose();
                CheckAppointmentView CAView=new CheckAppointmentView("come from receptionist home frame");
                CheckAppointmentController CAController=new CheckAppointmentController(CAView);
            }
            else if(ae.getSource()==RHFView.addOutdoorPatient)
            {
                RHFView.frame.dispose();
                PatientSignupView PSView=new PatientSignupView("come from receptionist home frame");
                PatientSignupController PSController=new PatientSignupController(PSView);
            }
            else if(ae.getSource()==RHFView.updateInfoOfPatient)
            {
                RHFView.frame.dispose();
                PatientUpdateView PUView=new PatientUpdateView("come from receptionist home frame");
                PatientUpdateController PUController=new PatientUpdateController(PUView);
                
            }
            else if(ae.getSource()==RHFView.viewBill)
            {
                RHFView.frame.dispose();
                ViewBillView VBView=new ViewBillView("come from receptionist home frame");
                ViewBillController VBController=new ViewBillController(VBView);
                
            }
            else if(ae.getSource()==RHFView.updateInfoOfReceptionist)
            {
                RHFView.frame.dispose();
               ReceptionistUpdateView RUView=new ReceptionistUpdateView("come from receptionist home frame");
               ReceptionistUpdateController RUController=new ReceptionistUpdateController(RUView);
                
            }
            else if(ae.getSource()==RHFView.receptionistLogout)
            {
                RHFView.frame.dispose();
                SignupLoginFrameView SLFView=new SignupLoginFrameView();
                SignupLoginFrameController SLFController=new SignupLoginFrameController(SLFView);
                
            }
        }
    }

}
