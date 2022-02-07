

package hospitalmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddIndoorPatientController 
{
    AddIndoorPatientView AIPView;
    public AddIndoorPatientController(AddIndoorPatientView AIPView)
    {
        this.AIPView=AIPView;
        this.AIPView.AIPHandler(new AIPController());
        
    }
    public class AIPController implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==AIPView.addButton)
            {
                
            }
            else if(ae.getSource()==AIPView.backButton)
            {
                if(AIPView.fromWhere.equalsIgnoreCase("Come from admin home frame"))
                {
                    AIPView.frame.dispose();
                    AdminHomeFrameView AHFView=new AdminHomeFrameView();
                    AdminHomeFrameController AHFController=new AdminHomeFrameController(AHFView);
                }
                else if(AIPView.fromWhere.equalsIgnoreCase("Come from doctor home frame"))
                {
                    AIPView.frame.dispose();
                    DoctorHomeFrameView DHFView=new DoctorHomeFrameView();
                    DoctorHomeFrameController DHFController=new DoctorHomeFrameController(DHFView);
                }
            }
            }
        }
    }
    

