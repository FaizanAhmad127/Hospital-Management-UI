

package hospitalmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateInfoOfDoctorController 
{
    UpdateInfoOfDoctorView UIODView;

    public UpdateInfoOfDoctorController(UpdateInfoOfDoctorView UIODView) 
    {
        this.UIODView=UIODView;
        this.UIODView.UIODHandler(new UIODController());
    }
    public class UIODController implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==UIODView.submitButton)
            {
                UIODView.frame.dispose();
                //DoctorSignupView DSView=new DoctorSignupView("Come from admin home frame");
                //DoctorSignupController DSController=new DoctorSignupController(DSView);
                DoctorUpdateView DUView=new DoctorUpdateView("Come from admin home frame");
                DoctorUpdateController DUController=new DoctorUpdateController(DUView);
                
            }
        }
    }
    
}
