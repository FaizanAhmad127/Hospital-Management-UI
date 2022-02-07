

package hospitalmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteReceptionistController 
{
    DeleteReceptionistView DRView;

    public DeleteReceptionistController(DeleteReceptionistView DRView) 
    {
        this.DRView=DRView;
        this.DRView.DRHandler(new DRController());
    }
    public class DRController implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==DRView.deleteReceptionistButton)
            {
                
            }
        }
    }
    

}
