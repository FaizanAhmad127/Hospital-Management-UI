

package hospitalmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoctorUpdateController 
{
    DoctorUpdateView DUView;

    public DoctorUpdateController(DoctorUpdateView DUView) 
    {
        this.DUView=DUView;
        this.DUView.DUHandler(new DUController());
        
    }
    public class DUController implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==DUView.updateButton)
            {
                
            }
            else if(ae.getSource()==DUView.backButton)
            {
                if(DUView.fromWhere.equalsIgnoreCase("Come from admin home frame"))
                {
                    DUView.frame.dispose();
                    AdminHomeFrameView AHFView=new AdminHomeFrameView();
                    AdminHomeFrameController AHFController=new AdminHomeFrameController(AHFView);
                }
               if(DUView.fromWhere.equalsIgnoreCase("Come from doctor home frame"))
                {
                    DUView.frame.dispose();
                    DoctorHomeFrameView DHFView=new DoctorHomeFrameView();
                    DoctorHomeFrameController DHFController=new DoctorHomeFrameController(DHFView);
                }
                
            }
        }
    }
    

}
