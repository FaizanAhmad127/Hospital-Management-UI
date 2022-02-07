

package hospitalmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteDoctorController 
{
    DeleteDoctorView DDView;
    public DeleteDoctorController(DeleteDoctorView DDView) 
    {
        this.DDView=DDView;
        this.DDView.DDHandler(new DDController());
    }
    public class DDController implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==DDView.deleteDoctorButton)
            {
                
            }
        }
    }
    
}
