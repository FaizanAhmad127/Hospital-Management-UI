

package hospitalmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetAppointmentController 
{
    SetAppointmentView SAView;
    public SetAppointmentController(SetAppointmentView SAView) 
    {
        this.SAView=SAView;
        this.SAView.SAHandler(new SAController());
    }
    public class SAController implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==SAView.setAppointmentButton)
            {
                
            }
            else if(ae.getSource()==SAView.backButton)
            {
                if(SAView.fromWhere.equalsIgnoreCase("come from admin home frame"))
                {
                    SAView.frame.dispose();
                    AdminHomeFrameView AHFView=new AdminHomeFrameView();
                    AdminHomeFrameController AHFController=new AdminHomeFrameController(AHFView);
                }
                else if(SAView.fromWhere.equalsIgnoreCase("come from receptionist home frame"))
                {
                    SAView.frame.dispose();
                    ReceptionistHomeFrameView RHFView=new ReceptionistHomeFrameView();
                    ReceptionistHomeFrameController RHFController=new ReceptionistHomeFrameController(RHFView);
                }
            }
        }
    }
    
}
