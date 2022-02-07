

package hospitalmanagementsystem;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DeletePatientView extends MainFrame
{

    JLabel enterPatientUsernameLabel;
    JTextField enterPatientUsernameTextField;
    JButton deleteButton,backButton;
    String fromWhere;
    public DeletePatientView(String fromWhere) 
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
        
        deleteButton=new JButton("Delete");
        decorateButtons(deleteButton);
        deleteButton.setBounds(670,230,80,35);
        panel.add(deleteButton);
        
        backButton=new JButton(new ImageIcon("back.PNG"));
        backButton.setBounds(10, 490, 140, 62);
        panel.add(backButton);
        
        this.addBackgroundPic();
        this.frame.setVisible(true);
        
    }
    public void DPHandler(ActionListener DPListener)
    {
        deleteButton.addActionListener(DPListener);
        backButton.addActionListener(DPListener);
    }
    
    }
    


