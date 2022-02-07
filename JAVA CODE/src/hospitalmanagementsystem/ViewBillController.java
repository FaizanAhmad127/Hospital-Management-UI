

package hospitalmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewBillController 
{
    ViewBillView VBView;
    public ViewBillController(ViewBillView VBView) 
    {
        this.VBView=VBView;
        this.VBView.VBHandler(new VBController());
    }
    public class VBController implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==VBView.checkBillButton)
            {
                if(VBView.fromWhere.equalsIgnoreCase("Come from admin home frame"))
                {
                VBView.frame.dispose();
                CheckBillView CBView=new CheckBillView("Come from admin home frame");
                CheckBillController CBController=new CheckBillController(CBView);
                }
                else if(VBView.fromWhere.equalsIgnoreCase("Come from receptionist home frame"))
                {
                    VBView.frame.dispose();
                    CheckBillView CBView=new CheckBillView("Come from receptionist home frame");
                    CheckBillController CBController=new CheckBillController(CBView);
                }
                else if(VBView.fromWhere.equalsIgnoreCase("Come from patient home frame"))
                {
                    VBView.frame.dispose();
                    CheckBillView CBView=new CheckBillView("Come from patient home frame");
                    CheckBillController CBController=new CheckBillController(CBView);
                }
            }
            else if(ae.getSource()==VBView.backButton)
            {
                if(VBView.fromWhere.equalsIgnoreCase("Come from admin home frame"))
                {
                    VBView.frame.dispose();
                    AdminHomeFrameView AHFView=new AdminHomeFrameView();
                    AdminHomeFrameController AHFController=new AdminHomeFrameController(AHFView);
                }
               else if(VBView.fromWhere.equalsIgnoreCase("Come from receptionist home frame"))
                {
                    VBView.frame.dispose();
                    ReceptionistHomeFrameView RHFView=new ReceptionistHomeFrameView();
                    ReceptionistHomeFrameController RHFController=new ReceptionistHomeFrameController(RHFView);
                }
                else if(VBView.fromWhere.equalsIgnoreCase("Come from patient home frame"))
                {
                    VBView.frame.dispose();
                    PatientHomeFrameView PHFView=new PatientHomeFrameView();
                    PatientHomeFrameController PHFController=new PatientHomeFrameController(PHFView);
                }
            }
        }
    }
    
}
