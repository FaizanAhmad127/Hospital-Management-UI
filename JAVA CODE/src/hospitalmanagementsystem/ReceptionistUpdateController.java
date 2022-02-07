

package hospitalmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReceptionistUpdateController 
{
    ReceptionistUpdateView RUView;
    public ReceptionistUpdateController(ReceptionistUpdateView RUView) 
    {
        this.RUView=RUView;
        this.RUView.RUHandler(new RUController());
    }
    public class RUController implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==RUView.updateButton)
            {
                
            }
            else if(ae.getSource()==RUView.backButton)
            {
                if(RUView.fromWhere.equalsIgnoreCase("Come from admin home frame"))
                {
                    RUView.frame.dispose();
                    AdminHomeFrameView AHFView=new AdminHomeFrameView();
                    AdminHomeFrameController AHFController=new AdminHomeFrameController(AHFView);
                }
                else if(RUView.fromWhere.equalsIgnoreCase("Come from receptionist home frame"))
                {
                    RUView.frame.dispose();
                    ReceptionistHomeFrameView RHFView=new ReceptionistHomeFrameView();
                    ReceptionistHomeFrameController RHFController=new ReceptionistHomeFrameController(RHFView);
                            
                }
            }
        }
    }
    

}
