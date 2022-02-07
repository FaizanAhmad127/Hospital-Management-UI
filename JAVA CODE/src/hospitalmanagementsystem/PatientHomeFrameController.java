

package hospitalmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatientHomeFrameController 
{
    PatientHomeFrameView PHFView;
    public PatientHomeFrameController(PatientHomeFrameView PHFView) 
    {
        this.PHFView=PHFView;
        this.PHFView.PHFHandler(new PHFController());
    }
    public class PHFController implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==PHFView.checkAppointment)
            {
                PHFView.frame.dispose();
                CheckAppointmentView CAView=new CheckAppointmentView("come from patient home frame");
                CheckAppointmentController CAController=new CheckAppointmentController(CAView);
            }
            else if(ae.getSource()==PHFView.viewBill)
            {
                PHFView.frame.dispose();
                ViewBillView VBView=new ViewBillView("come from patient home frame");
                ViewBillController VBController=new ViewBillController(VBView);
                
            }
            else if(ae.getSource()==PHFView.updateInfoOfPatient)
            {
                PHFView.frame.dispose();
                PatientUpdateView PUView=new PatientUpdateView("come from patient home frame");
                PatientUpdateController PUController=new PatientUpdateController(PUView);
            }
            else if(ae.getSource()==PHFView.patientLogout)
            {
                PHFView.frame.dispose();
                SignupLoginFrameView SLFView=new SignupLoginFrameView();
                SignupLoginFrameController SLFController=new SignupLoginFrameController(SLFView);
            }
        }
    }
    

}
