

package hospitalmanagementsystem;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class PatientHomeFrameView extends MainFrame
{
    JButton checkAppointment,viewBill,updateInfoOfPatient,patientLogout;
    JLabel patientLabel,patientPicLabel;
    public PatientHomeFrameView() 
    {
         checkAppointment=new JButton("Check Appointment");
        checkAppointment.setBounds(10, 120, 200, 30);
        decorateButtons(checkAppointment);
        panel.add(checkAppointment);
        
        viewBill=new JButton("View Bill");
        viewBill.setBounds(10, 150, 200, 30);
        decorateButtons(viewBill);
        panel.add(viewBill);
        
        updateInfoOfPatient=new JButton("Update info of Patient");
        updateInfoOfPatient.setBounds(10, 180, 200, 30);
        decorateButtons(updateInfoOfPatient);
        panel.add(updateInfoOfPatient);
        
        patientLogout=new JButton("LogOut");
        patientLogout.setFont(new Font("Callibri",Font.BOLD,20));
        patientLogout.setBounds(900, 10, 80, 45);
        decorateButtons(patientLogout);
        panel.add(patientLogout);
        
        patientLabel=new JLabel("Patient Home Panel");
        patientLabel.setBounds(370, 3, 400, 50);
        patientLabel.setFont(new Font("TimesRoman", Font.BOLD, 30));
        panel.add(patientLabel);
        

        
        patientPicLabel=new JLabel(new ImageIcon("adminPic.PNG"));
        patientPicLabel.setBounds(5,4,100,100);
        panel.add(patientPicLabel);
        
        this.addBackgroundPic();
        this.frame.setVisible(true);
    }
    public void PHFHandler(ActionListener PHFListener)
    {
        checkAppointment.addActionListener(PHFListener);
        viewBill.addActionListener(PHFListener);
        updateInfoOfPatient.addActionListener(PHFListener);
        patientLogout.addActionListener(PHFListener);
    }
    
}
