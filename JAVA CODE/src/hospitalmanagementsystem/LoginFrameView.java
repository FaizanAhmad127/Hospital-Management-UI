

package hospitalmanagementsystem;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JLabel;

public class LoginFrameView extends MainFrame
{
    JLabel usernameLabel,passwordLabel;
    JTextField usernameTextField,passwordTextField;
    JButton loginButton,backButton;
    String fromWhere;
    LoginFrameView(String fromWhere) 
    {
        this.fromWhere=fromWhere;
        
        usernameLabel=new JLabel("Username ");
        usernameLabel.setBounds(300, 200,100, 70);
        decorateLabels(usernameLabel);
        panel.add(usernameLabel);
        
        passwordLabel=new JLabel("Password");
        passwordLabel.setBounds(300, 300, 100, 70);
        decorateLabels(passwordLabel);
        panel.add(passwordLabel);
        
        usernameTextField=new JTextField();
        usernameTextField.setBounds(400,220,200,40);
        decorateTextFields(usernameTextField);
        panel.add(usernameTextField);
        
        passwordTextField=new JTextField();
        passwordTextField.setBounds(400, 320, 200, 40);
        decorateTextFields(passwordTextField);
        panel.add(passwordTextField);
        
        loginButton =new JButton(new ImageIcon("login.PNG"));
        loginButton.setBounds(600,420,140,60);
        panel.add(loginButton);
        
        backButton=new JButton(new ImageIcon("back.PNG"));
        backButton.setBounds(10, 490, 140, 62);
        panel.add(backButton);
        
        this.addBackgroundPic();
        
        frame.setVisible(true);
        
    }
    public void LFHandler(ActionListener lfListener)
    {
        loginButton.addActionListener(lfListener);
        backButton.addActionListener(lfListener);
                
    }
    public String getUsername()
    {
        
        return usernameTextField.getText();
    }
    public String getPassword()
    {
        return passwordTextField.getText();
    }
    
}
