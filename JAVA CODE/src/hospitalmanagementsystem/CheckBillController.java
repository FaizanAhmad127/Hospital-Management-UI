

package hospitalmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBillController 
{
    CheckBillView CBView;
    public CheckBillController(CheckBillView CBView) 
    {
        this.CBView=CBView;
        this.CBView.CBHandler(new CBController());
    }
    public class CBController implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==CBView.backButton)
            {
                if(CBView.fromWhere.equalsIgnoreCase("Come from admin home frame"))
                {
                    CBView.frame.dispose();
                    AdminHomeFrameView AHFView=new AdminHomeFrameView();
                    AdminHomeFrameController AHFController=new AdminHomeFrameController(AHFView);
                }
               else if(CBView.fromWhere.equalsIgnoreCase("Come from receptionist home frame"))
                {
                    CBView.frame.dispose();
                    ReceptionistHomeFrameView RHFView=new ReceptionistHomeFrameView();
                    ReceptionistHomeFrameController RHFController=new ReceptionistHomeFrameController(RHFView);
                }
                else if(CBView.fromWhere.equalsIgnoreCase("Come from patient home frame"))
                {
                    CBView.frame.dispose();
                    PatientHomeFrameView PHFView=new PatientHomeFrameView();
                    PatientHomeFrameController PHFController=new PatientHomeFrameController(PHFView);
                }
                
            }
        }
    }
    

}
