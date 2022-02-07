

package hospitalmanagementsystem;

import java.awt.event.ActionListener;
import javax.swing.*;

public class SetAppointmentView extends MainFrame
{
    JLabel enterPatientUsername,enterDoctorUsername,enterDateLabel,enterTimeLabel;
    JTextField enterPatientTextField,enterDoctorTextField,enterDateTextField,enterTimeTextField;
    JButton setAppointmentButton,backButton;
    String fromWhere;
    public SetAppointmentView(String fromWhere) 
    {
        this.fromWhere=fromWhere;
        
        enterPatientUsername=new JLabel("Enter Patient Username");
        decorateLabels(enterPatientUsername);
        enterPatientUsername.setBounds(250, 100, 200, 30);
        panel.add(enterPatientUsername);
        
        
        enterDoctorUsername=new JLabel("Enter Doctor Username");
        decorateLabels(enterDoctorUsername);
        enterDoctorUsername.setBounds(250, 200, 200, 30);
        panel.add(enterDoctorUsername);
        
        enterDateLabel=new JLabel("Enter Date DD/MM/YY");
        decorateLabels(enterDateLabel);
        enterDateLabel.setBounds(250, 300, 200, 30);
        panel.add(enterDateLabel);
        
        enterTimeLabel=new JLabel("Enter Time Hour/Min");
        decorateLabels(enterTimeLabel);
        enterTimeLabel.setBounds(250, 400, 200, 30);
        panel.add(enterTimeLabel);
        
        enterPatientTextField=new JTextField();
        decorateTextFields(enterPatientTextField);
        enterPatientTextField.setBounds(400, 100, 150, 30);
        panel.add(enterPatientTextField);
        
        enterDoctorTextField=new JTextField();
        decorateTextFields(enterDoctorTextField);
        enterDoctorTextField.setBounds(400, 200, 150, 30);
        panel.add(enterDoctorTextField);
        
        enterDateTextField=new JTextField("08/08/18");
        decorateTextFields(enterDateTextField);
        enterDateTextField.setBounds(400, 300, 100, 30);
        panel.add(enterDateTextField);
        
        enterTimeTextField=new JTextField("12/55");
        decorateTextFields(enterTimeTextField);
        enterTimeTextField.setBounds(400, 400, 100, 30);
        panel.add(enterTimeTextField);
        
        setAppointmentButton=new JButton("Submit");
        setAppointmentButton.setBounds(830,490,140,60);
        decorateButtons(setAppointmentButton);
        panel.add(setAppointmentButton);
        
        backButton=new JButton(new ImageIcon("back.PNG"));
        backButton.setBounds(10, 490, 140, 62);
        panel.add(backButton);
        
        this.addBackgroundPic();
        this.frame.setVisible(true);
    }
    public void SAHandler(ActionListener SAListener)
    {
        setAppointmentButton.addActionListener(SAListener);
        backButton.addActionListener(SAListener);
    }
    

}
