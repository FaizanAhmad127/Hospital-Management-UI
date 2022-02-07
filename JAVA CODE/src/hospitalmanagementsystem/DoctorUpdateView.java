

package hospitalmanagementsystem;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DoctorUpdateView extends CommonUpdate
{
    JLabel updateLabel,specializationLabel;
    JTextField specializationTextField;
    String fromWhere;
    public DoctorUpdateView(String fromWhere) 
    { 
       this.fromWhere=fromWhere;
        
        updateLabel=new JLabel("Doctor Update Panel");
        updateLabel.setFont(new Font("TimesRoman", Font.BOLD, 30));
        updateLabel.setBounds(270, 3, 400, 50);
        this.panel.add(updateLabel);
        
        specializationLabel=new JLabel("Specialization ");
        specializationLabel.setBounds(370, 290, 150, 30);
        decorateLabels(specializationLabel);
        panel.add(specializationLabel);
        
        specializationTextField=new JTextField();
        specializationTextField.setBounds(470,290,150,30);
        decorateTextFields(specializationTextField);
        panel.add(specializationTextField);
        
        this.addBackgroundPic();
        frame.setVisible(true);
    }
        public void DUHandler(ActionListener DUListener)
    {
        backButton.addActionListener(DUListener);
        updateButton.addActionListener(DUListener);
    }
    
}
