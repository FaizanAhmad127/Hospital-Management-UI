

package hospitalmanagementsystem;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UpdateInfoOfDoctorView extends AdminHomeFrameView
{
    JLabel enterDoctorUsernameLabel;
    JTextField enterDoctorTextField;
    JButton submitButton;
    public UpdateInfoOfDoctorView() 
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
        
        submitButton=new JButton("Submit");
        submitButton.setBounds(670,230,80,35);
        decorateButtons(submitButton);
        
        panel.add(submitButton);
        
        this.addBackgroundPic();
    }
    public void UIODHandler(ActionListener UIODListener)
    {
        submitButton.addActionListener(UIODListener);
    }
}
