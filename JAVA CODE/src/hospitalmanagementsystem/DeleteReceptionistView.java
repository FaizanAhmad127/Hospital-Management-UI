

package hospitalmanagementsystem;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DeleteReceptionistView extends AdminHomeFrameView
{
    JLabel enterReceptionistUsernameLabel;
    JTextField enterReceptionistTextField;
    JButton deleteReceptionistButton;

    public DeleteReceptionistView() 
    {
        this.panel.remove(picLabel);
        enterReceptionistUsernameLabel=new JLabel("Enter Receptionist Username ");
        enterReceptionistUsernameLabel.setBounds(360, 150, 170, 50);
        decorateLabels(enterReceptionistUsernameLabel);
        panel.add(enterReceptionistUsernameLabel);
        
        enterReceptionistTextField=new JTextField();
        enterReceptionistTextField.setBounds(550, 160, 200, 30);
        decorateTextFields(enterReceptionistTextField);
        panel.add(enterReceptionistTextField);
        
        deleteReceptionistButton=new JButton("Delete");
        deleteReceptionistButton.setBounds(670,230,80,35);
        decorateButtons(deleteReceptionistButton);
        panel.add(deleteReceptionistButton);
        
        this.addBackgroundPic();
          
    }
    public void DRHandler(ActionListener DRListener)
    {
        deleteReceptionistButton.addActionListener(DRListener);
    }
    
    
}
