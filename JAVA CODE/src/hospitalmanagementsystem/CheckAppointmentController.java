

package hospitalmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckAppointmentController 
{
    CheckAppointmentView CAView;
    public CheckAppointmentController(CheckAppointmentView CAView) 
    {
        this.CAView=CAView;
        this.CAView.CAHandler(new CAController());
    }
    public class CAController implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==CAView.backButton)
            {
                if(CAView.fromWhere.equalsIgnoreCase("come from admin home frame"))
                {
                    CAView.frame.dispose();
                    AdminHomeFrameView AHFView=new AdminHomeFrameView();
                    AdminHomeFrameController AHFController=new AdminHomeFrameController(AHFView);
                }
                else if(CAView.fromWhere.equalsIgnoreCase("come from doctor home frame"))
                {
                    CAView.frame.dispose();
                    DoctorHomeFrameView DHFView=new DoctorHomeFrameView();
                    DoctorHomeFrameController DHFController=new DoctorHomeFrameController(DHFView);
                }
                else if(CAView.fromWhere.equalsIgnoreCase("come from receptionist home frame"))
                {
                    CAView.frame.dispose();
                    ReceptionistHomeFrameView RHFView=new ReceptionistHomeFrameView();
                    ReceptionistHomeFrameController RHFController=new ReceptionistHomeFrameController(RHFView);
                }
                else if(CAView.fromWhere.equalsIgnoreCase("come from patient home frame"))
                {
                    CAView.frame.dispose();
                    PatientHomeFrameView PHFView=new PatientHomeFrameView();
                    PatientHomeFrameController PHFController=new PatientHomeFrameController(PHFView);
                }
            }
        }
    }
    

}
