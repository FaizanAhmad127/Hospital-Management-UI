

package hospitalmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatientUpdateController 
{
    PatientUpdateView PUView;
    public PatientUpdateController(PatientUpdateView PUView) 
    {
        this.PUView=PUView;
        this.PUView.PUHandler(new PUController());
    }
    public class PUController implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==PUView.updateButton)
            {
                
            }
            else if(ae.getSource()==PUView.backButton)
            {
                if(PUView.fromWhere.equalsIgnoreCase("Come from admin home frame"))
                {
                    PUView.frame.dispose();
                    AdminHomeFrameView AHFView=new AdminHomeFrameView();
                    AdminHomeFrameController AHFController=new AdminHomeFrameController(AHFView);
                }
                if(PUView.fromWhere.equalsIgnoreCase("Come from patient home frame"))
                {
                    PUView.frame.dispose();
                    PatientHomeFrameView PHFView=new PatientHomeFrameView();
                    PatientHomeFrameController PHFController=new PatientHomeFrameController(PHFView);
                            
                }
                 else if(PUView.fromWhere.equalsIgnoreCase("Come from receptionist home frame"))
                {
                    PUView.frame.dispose();
                    ReceptionistHomeFrameView RHFView=new ReceptionistHomeFrameView();
                    ReceptionistHomeFrameController RHFController=new ReceptionistHomeFrameController(RHFView);
                            
                }
                
            }
        }
    }

}
