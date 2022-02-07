

package hospitalmanagementsystem;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DeleteDoctorView extends AdminHomeFrameView
{
    JLabel enterDoctorUsernameLabel;
    JTextField enterDoctorTextField;
    JButton deleteDoctorButton;

    public DeleteDoctorView() 
    {
        
        this.panel.remove(picLabel);
        enterDoctorUsernameLabel=new JLabel("Enter doctor Username ");
        enterDoctorUsernameLabel.setBounds(400, 150, 140, 50);
        decorateLabels(enterDoctorUsernameLabel);
        panel.add(enterDoctorUsernameLabel);
        
        enterDoctorTextField=new JTextField();
        enterDoctorTextField.setBounds(550, 160, 200, 30);
        decorateTextFields(enterDoctorTextField);
        panel.add(enterDoctorTextField);
        
        deleteDoctorButton=new JButton("Delete");
        deleteDoctorButton.setBounds(670,230,80,35);
        decorateButtons(deleteDoctorButton);
        
        panel.add(deleteDoctorButton);
        
        this.addBackgroundPic();
          
    }
    public void DDHandler(ActionListener DDListener)
    {
        deleteDoctorButton.addActionListener(DDListener);
    }
    
    
}
