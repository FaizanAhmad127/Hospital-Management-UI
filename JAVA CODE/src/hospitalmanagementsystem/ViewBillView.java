

package hospitalmanagementsystem;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ViewBillView  extends MainFrame
{
    JLabel enterPatientUsernameLabel;
    JTextField enterPatientUsernameTextField;
    JButton checkBillButton,backButton;
    String fromWhere;

    public ViewBillView(String fromWhere) 
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
        
        checkBillButton=new JButton("Check Bill");
        decorateButtons(checkBillButton);
        checkBillButton.setBounds(670,230,80,35);
        panel.add(checkBillButton);
        
        backButton=new JButton(new ImageIcon("back.PNG"));
        backButton.setBounds(10, 490, 140, 62);
        panel.add(backButton);
        
        this.addBackgroundPic();
        this.frame.setVisible(true);
        
    }
    public void VBHandler(ActionListener VBListener)
    {
        checkBillButton.addActionListener(VBListener);
        backButton.addActionListener(VBListener);
    }
    }
    
