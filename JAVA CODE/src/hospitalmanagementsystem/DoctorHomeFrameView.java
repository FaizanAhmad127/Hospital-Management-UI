

package hospitalmanagementsystem;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class DoctorHomeFrameView extends MainFrame
{
    JButton addIndoorPatient,checkAppointment,updateDoctorInfo,doctorLogout;
    JLabel doctorLabel,doctorPicLabel;
    public DoctorHomeFrameView() 
    {
        doctorLabel=new JLabel("Doctor Home Panel");
        doctorLabel.setBounds(370, 3, 400, 50);
        doctorLabel.setFont(new Font("TimesRoman", Font.BOLD, 30));
        panel.add(doctorLabel);
        
        addIndoorPatient=new JButton("Add Indoor Patient");
        addIndoorPatient.setBounds(10, 120, 200, 30);
        decorateButtons(addIndoorPatient);
        panel.add(addIndoorPatient);
        
        checkAppointment=new JButton("Check Appointments");
        checkAppointment.setBounds(10, 150, 200, 30);
        decorateButtons(checkAppointment);
        panel.add(checkAppointment);
        
        updateDoctorInfo=new JButton("Update Profile");
        updateDoctorInfo.setBounds(10, 180, 200, 30);
        decorateButtons(updateDoctorInfo);
        panel.add(updateDoctorInfo);
        
        doctorLogout=new JButton("LogOut");
        doctorLogout.setFont(new Font("Callibri",Font.BOLD,20));
        doctorLogout.setBounds(900, 10, 80, 45);
        decorateButtons(doctorLogout);
        panel.add(doctorLogout);
        
        doctorPicLabel=new JLabel(new ImageIcon("doctorPic.PNG"));
        doctorPicLabel.setBounds(5,4,100,100);
        panel.add(doctorPicLabel);
        
        this.addBackgroundPic();
        this.frame.setVisible(true);
    }
    public void DHFHandler(ActionListener DHFListener)
    {
        addIndoorPatient.addActionListener(DHFListener);
        checkAppointment.addActionListener(DHFListener);
        updateDoctorInfo.addActionListener(DHFListener);
        doctorLogout.addActionListener(DHFListener);
    }

}
