

package hospitalmanagementsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SignupLoginFrameView extends MainFrame
{
    
    JButton signup,login;
    JComboBox comboBox;
    JLabel hmsLabel;
    String comboArray[]={"Admin","Doctor","Receptionist","patient"};
    
    SignupLoginFrameView()
    {
        signup =new JButton(new ImageIcon("signup.PNG"));
        signup.setBounds(250,230,140,60);
        panel.add(signup);
        
        login =new JButton(new ImageIcon("login.PNG"));
        login.setBounds(600,230,140,60);
        panel.add(login);
        
        hmsLabel=new JLabel("Hospital Management System");
        hmsLabel.setBounds(270,0,500,100);
        hmsLabel.setFont(new Font("TimesRoman", Font.BOLD, 35)); 
        panel.add(hmsLabel);
        
        comboBox=new JComboBox(comboArray);
        comboBox.setBounds(445, 350, 120, 30);
        comboBox.setForeground(new Color(9,88,255));
        panel.add(comboBox);
        
        this.addBackgroundPic();
        
        
        
       frame.setVisible(true);
 
    }
    public void slfHandler(ActionListener slfListener)
    {
        signup.addActionListener(slfListener);
        login.addActionListener(slfListener);
        comboBox.addActionListener(slfListener);
    }
}
