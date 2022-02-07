

package hospitalmanagementsystem;

import java.awt.event.ActionListener;
import javax.swing.*;

public class AddIndoorPatientView extends MainFrame
{
    JLabel enterPatientUsernameLabel;
    JTextField enterPatientUsernameTextField;
    JButton addButton,backButton;
    String fromWhere;
    public AddIndoorPatientView(String fromWhere) 
    {
        this.fromWhere=fromWhere;
        enterPatientUsernameLabel=new JLabel("Enter Patient Username ");
        decorateLabels(enterPatientUsernameLabel);
        enterPatientUsernameLabel.setBounds(360, 150, 170, 50);
        panel.add(enterPatientUsernameLabel);
        
        enterPatientUsernameTextField=new JTextField();
        decorateTextFields(enterPatientUsernameTextField);
        enterPatientUsernameTextField.setBounds(550, 160, 200, 30);
        panel.add(enterPatientUsernameTextField);
        
        addButton=new JButton("ADD");
        decorateButtons(addButton);
        addButton.setBounds(670,230,80,35);
        panel.add(addButton);
        
        backButton=new JButton(new ImageIcon("back.PNG"));
        backButton.setBounds(10, 490, 140, 62);
        panel.add(backButton);
        
        this.addBackgroundPic();
        this.frame.setVisible(true);
        
    }
    public void AIPHandler(ActionListener AIPListener)
    {
        addButton.addActionListener(AIPListener);
        backButton.addActionListener(AIPListener);
    }
    

}
