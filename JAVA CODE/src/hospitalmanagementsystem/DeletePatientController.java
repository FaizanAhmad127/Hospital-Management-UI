

package hospitalmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeletePatientController 
{
    DeletePatientView DPView;
    public DeletePatientController(DeletePatientView DPView)
    {
        this.DPView=DPView;
        this.DPView.DPHandler(new DPController());
    }
    public class DPController implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==DPView.deleteButton)
            {
                
            }
            else if(ae.getSource()==DPView.backButton)
            {
                if(DPView.fromWhere.equalsIgnoreCase("Come from admin home frame"))
                {
                    DPView.frame.dispose();
                    AdminHomeFrameView AHFView=new AdminHomeFrameView();
                    AdminHomeFrameController AHFController=new AdminHomeFrameController(AHFView);
                }
            }
        }
    }
    

}
