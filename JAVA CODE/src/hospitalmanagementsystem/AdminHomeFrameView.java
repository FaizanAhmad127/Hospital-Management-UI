

package hospitalmanagementsystem;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
public class AdminHomeFrameView extends MainFrame
{
    JButton addDoctor,deleteDoctor,updateInfoOfDoctor,setAppointments,checkAppointments,addReceptionist,deleteReceptionist,updateInfoOfReceptionist,addOutdoorPatient,addIndoorPatient,deletePatient,updateInfoOfPatient,viewBills;
    JButton adminLogout;
    JLabel adminPicLabel,adminLabel,adminWelcomeLabel;
    public AdminHomeFrameView() 
    {
        addDoctor=new JButton("Add Doctor");
        addDoctor.setBounds(10, 120, 200, 30);
        decorateButtons(addDoctor);
        panel.add(addDoctor);
        
        deleteDoctor=new JButton("Delete Doctor");
        deleteDoctor.setBounds(10, 150, 200, 30);
        decorateButtons(deleteDoctor);
        panel.add(deleteDoctor);
        
        updateInfoOfDoctor=new JButton("Update info of Doctor");
        updateInfoOfDoctor.setBounds(10, 180, 200, 30);
        decorateButtons(updateInfoOfDoctor);
        panel.add(updateInfoOfDoctor);
        
        setAppointments=new JButton("Set Appointments");
        setAppointments.setBounds(10, 210, 200, 30);
        decorateButtons(setAppointments);
        panel.add(setAppointments);
        
        checkAppointments=new JButton("Check Appointments");
        checkAppointments.setBounds(10, 240, 200, 30);
        decorateButtons(checkAppointments);
        panel.add(checkAppointments);
        
        addReceptionist=new JButton("Add Receptionist");
        addReceptionist.setBounds(10, 270, 200, 30);
        decorateButtons(addReceptionist);
        panel.add(addReceptionist);
        
        deleteReceptionist=new JButton("Delete Receptionist");
        deleteReceptionist.setBounds(10, 300, 200, 30);
        decorateButtons(deleteReceptionist);
        panel.add(deleteReceptionist);
        
        updateInfoOfReceptionist=new JButton("Update info of Receptionist");
        updateInfoOfReceptionist.setBounds(10, 330, 200, 30);
        decorateButtons(updateInfoOfReceptionist);
        panel.add(updateInfoOfReceptionist);
        
        addOutdoorPatient=new JButton("Add Outdoor Patient");
        addOutdoorPatient.setBounds(10, 360, 200, 30);
        decorateButtons(addOutdoorPatient);
        panel.add(addOutdoorPatient);
        
        addIndoorPatient=new JButton("Add Indoor Patient");
        addIndoorPatient.setBounds(10, 390, 200, 30);
        decorateButtons(addIndoorPatient);
        panel.add(addIndoorPatient);
        
        deletePatient=new JButton("Delete Patient");
        deletePatient.setBounds(10, 420, 200, 30);
        decorateButtons(deletePatient);
        panel.add(deletePatient);
        
        updateInfoOfPatient=new JButton("Update Info Of Patient");
        updateInfoOfPatient.setBounds(10, 450, 200, 30);
        decorateButtons(updateInfoOfPatient);
        panel.add(updateInfoOfPatient);
        
        viewBills=new JButton("View Bills");
        viewBills.setBounds(10, 480, 200, 30);
        decorateButtons(viewBills);
        panel.add(viewBills);
        
        adminLogout=new JButton("LogOut");
        adminLogout.setFont(new Font("Callibri",Font.BOLD,20));
        adminLogout.setBounds(900, 10, 80, 45);
        decorateButtons(adminLogout);
        panel.add(adminLogout);
        
        adminLabel=new JLabel("Admin Home Panel");
        adminLabel.setBounds(370, 3, 400, 50);
        adminLabel.setFont(new Font("TimesRoman", Font.BOLD, 30));
        panel.add(adminLabel);
        
//        adminWelcomeLabel=new JLabel("Welcome");
//        adminWelcomeLabel.setForeground(Color.BLUE);
//        adminWelcomeLabel.setBounds(430, 230, 400, 64);
//        adminWelcomeLabel.setFont(new Font("TimesRoman", Font.BOLD, 70));
//        panel.add(adminWelcomeLabel);
        
        
        
        adminPicLabel=new JLabel(new ImageIcon("adminPic.PNG"));
        adminPicLabel.setBounds(5,4,100,100);
        panel.add(adminPicLabel);
        
        this.addBackgroundPic();
        this.frame.setVisible(true);
        
    }
    public void AHFHandler(ActionListener AHFListener)
    {
        addDoctor.addActionListener(AHFListener);
        deleteDoctor.addActionListener(AHFListener);
        updateInfoOfDoctor.addActionListener(AHFListener);
        setAppointments.addActionListener(AHFListener);
        checkAppointments.addActionListener(AHFListener);
        addReceptionist.addActionListener(AHFListener);
        deleteReceptionist.addActionListener(AHFListener);
        updateInfoOfReceptionist.addActionListener(AHFListener);
        addOutdoorPatient.addActionListener(AHFListener);
        addIndoorPatient.addActionListener(AHFListener);
        deletePatient.addActionListener(AHFListener);
        updateInfoOfPatient.addActionListener(AHFListener);
        viewBills.addActionListener(AHFListener);
        adminLogout.addActionListener(AHFListener);
        
    }
    

}
