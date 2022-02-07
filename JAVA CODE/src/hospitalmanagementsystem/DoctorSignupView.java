

package hospitalmanagementsystem;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DoctorSignupView extends CommonSignup
{
    
    JLabel doctorLabel,specializationLabel;
    JTextField specializationTextField;
    String fromWhere;
    public DoctorSignupView(String fromWhere) 
    {
        this.fromWhere=fromWhere;
        
        doctorLabel=new JLabel("Doctor Signup Panel");
        doctorLabel.setBounds(270, 3, 400, 50);
        doctorLabel.setFont(new Font("TimesRoman", Font.BOLD, 30));
        panel.add(doctorLabel);
        
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
   public String getSpecialization()
   {
       return specializationTextField.getText();
   }
   public void DSHandler(ActionListener DSListener)
   {
       signupButton.addActionListener(DSListener);
       backButton.addActionListener(DSListener);
   }
}
