

package hospitalmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminHomeFrameController 
{
    AdminHomeFrameView AHFrame;
    public AdminHomeFrameController(AdminHomeFrameView AHFrame) 
    {
        this.AHFrame=AHFrame;
        AHFrame.AHFHandler(new AHFController());
    }
    public class AHFController implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==AHFrame.addDoctor)
            {
                AHFrame.frame.dispose();
                DoctorSignupView ASView=new DoctorSignupView("Come from admin home frame");
                DoctorSignupController DSContoller=new DoctorSignupController(ASView);
                
            }
            else if(ae.getSource()==AHFrame.deleteDoctor)
            {
               // AHFrame.picLabel=null;
                AHFrame.frame.dispose();
                
                //AHFrame.frame.remove(AHFrame.picLabel);
                DeleteDoctorView DDView=new DeleteDoctorView();
                DeleteDoctorController DDController=new DeleteDoctorController(DDView);
                AdminHomeFrameController AHFController=new AdminHomeFrameController(DDView);
            }
            else if(ae.getSource()==AHFrame.updateInfoOfDoctor)
            {
                AHFrame.frame.dispose();
                UpdateInfoOfDoctorView UIODoctor=new UpdateInfoOfDoctorView();
                AdminHomeFrameController AHFController=new AdminHomeFrameController(UIODoctor);
                UpdateInfoOfDoctorController UIODController=new UpdateInfoOfDoctorController(UIODoctor);
            }
            else if(ae.getSource()==AHFrame.setAppointments)
            {
                AHFrame.frame.dispose();
                SetAppointmentView SAView=new SetAppointmentView("Come from admin home frame");
                SetAppointmentController SAController=new SetAppointmentController(SAView);
                
            }
            else if(ae.getSource()==AHFrame.checkAppointments)
            {
                AHFrame.frame.dispose();
                CheckAppointmentView CAView=new CheckAppointmentView("Come from admin home frame");
                CheckAppointmentController CAController=new CheckAppointmentController(CAView);
            }
             else if(ae.getSource()==AHFrame.addReceptionist)
            {
                AHFrame.frame.dispose();
                ReceptionistSignupView RSView=new ReceptionistSignupView("Come from admin home frame");
                ReceptionistSignupController RSController=new ReceptionistSignupController(RSView);
                
            }
             else if(ae.getSource()==AHFrame.deleteReceptionist)
            {
                AHFrame.frame.dispose();
                DeleteReceptionistView DRView=new DeleteReceptionistView();
                DeleteReceptionistController DRController=new DeleteReceptionistController(DRView);
                AdminHomeFrameController AHFController=new AdminHomeFrameController(DRView);
            }
             else if(ae.getSource()==AHFrame.updateInfoOfReceptionist)
            {
                AHFrame.frame.dispose();
                ReceptionistUpdateView RUView=new ReceptionistUpdateView("Come from admin home frame");
                ReceptionistUpdateController RUController=new ReceptionistUpdateController(RUView);
            }
             else if(ae.getSource()==AHFrame.addOutdoorPatient)
            {
                AHFrame.frame.dispose();
                PatientSignupView PSView=new PatientSignupView("Come from admin home frame");
                PatientSignupController PSController=new PatientSignupController(PSView);
            }
             else if(ae.getSource()==AHFrame.addIndoorPatient)
            {
                AHFrame.frame.dispose();
                AddIndoorPatientView AIPView=new AddIndoorPatientView("Come from admin home frame");
                AddIndoorPatientController AIPController=new AddIndoorPatientController(AIPView);
            }
             else if(ae.getSource()==AHFrame.deletePatient)
            {
                AHFrame.frame.dispose();
                DeletePatientView DPView=new DeletePatientView("Come from admin home frame");
                DeletePatientController DPController=new DeletePatientController(DPView);
            }
             else if(ae.getSource()==AHFrame.updateInfoOfPatient)
             {
                 AHFrame.frame.dispose();
                 PatientUpdateView PUView=new PatientUpdateView("Come from admin home frame");
                 PatientUpdateController PUController=new PatientUpdateController(PUView);
             }
             else if(ae.getSource()==AHFrame.viewBills)
             {
                 AHFrame.frame.dispose();
                 ViewBillView VBView=new ViewBillView("Come from admin home frame");
                 ViewBillController VBController=new ViewBillController(VBView);
             }
             else if(ae.getSource()==AHFrame.adminLogout)
             {
                 AHFrame.frame.dispose();
                 SignupLoginFrameView SLFView=new SignupLoginFrameView();
                 SignupLoginFrameController SLFController=new SignupLoginFrameController(SLFView);
             }
            
            
            
            
            
        }
    }
    
}
