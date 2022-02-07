

package hospitalmanagementsystem;
import java.awt.*;
import javax.swing.*;

public class MainFrame 
{
    JFrame frame;
    JPanel panel;
    JLabel picLabel;
    
    MainFrame()
    {
        frame=new JFrame("Hospital Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        frame.setLocationRelativeTo(frame);
        
        panel=new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 1000, 600);
        frame.add(panel);
        
    }
    public void addBackgroundPic()
    {
        picLabel=new JLabel(new ImageIcon("FrameBackground.JPEG"));
        picLabel.setBounds(0,0,1000,600);
        panel.add(picLabel); 
    }
    public void decorateButtons(JButton btn)
    {
        btn.setBackground(new Color(9,88,255));
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
       // btn.setBorder(BorderFactory.createTitledBorder("+"));
        btn.setBorder(BorderFactory.createBevelBorder(1, Color.white, Color.blue));
    }
    public void decorateTextFields(JTextField textField)
    {
        textField.setOpaque(false);
        textField.setForeground(Color.blue);
        
        
    }
    public void decorateLabels(JLabel label)
    {
        label.setForeground(new Color(9,88,255));
    }
}
