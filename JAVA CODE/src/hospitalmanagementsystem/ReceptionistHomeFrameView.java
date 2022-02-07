

package hospitalmanagementsystem;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ReceptionistHomeFrameView extends MainFrame
{
      JButton receptionistLogout,setAppointment,checkAppointment,addOutdoorPatient,updateInfoOfPatient,viewBill,updateInfoOfReceptionist;
      JLabel receptionistLabel,receptionistPicLabel;
      public ReceptionistHomeFrameView() 
    {
        setAppointment=new JButton("Set Appointment");
        setAppointment.setBounds(10, 120, 200, 30);
        decorateButtons(setAppointment);
        panel.add(setAppointment);
        
        checkAppointment=new JButton("Check Appointment");
        checkAppointment.setBounds(10, 150, 200, 30);
        decorateButtons(checkAppointment);
        panel.add(checkAppointment);
        
        addOutdoorPatient=new JButton("Add Outdoor Patient");
        addOutdoorPatient.setBounds(10, 180, 200, 30);
        decorateButtons(addOutdoorPatient);
        panel.add(addOutdoorPatient);
        
        updateInfoOfPatient=new JButton("Update Info Of Patient");
        updateInfoOfPatient.setBounds(10, 210, 200, 30);
        decorateButtons(updateInfoOfPatient);
        panel.add(updateInfoOfPatient);
        
        viewBill=new JButton("View Bills");
        viewBill.setBounds(10, 240, 200, 30);
        decorateButtons(viewBill);
        panel.add(viewBill);
        
        updateInfoOfReceptionist=new JButton("Update profile");
        updateInfoOfReceptionist.setBounds(10, 270, 200, 30);
        decorateButtons(updateInfoOfReceptionist);
        panel.add(updateInfoOfReceptionist);
        
        receptionistLogout=new JButton("LogOut");
        receptionistLogout.setFont(new Font("Callibri",Font.BOLD,20));
        receptionistLogout.setBounds(900, 10, 80, 45);
        decorateButtons(receptionistLogout);
        panel.add(receptionistLogout);
        
        receptionistLabel=new JLabel("Receptionist Home Panel");
        receptionistLabel.setBounds(370, 3, 400, 50);
        receptionistLabel.setFont(new Font("TimesRoman", Font.BOLD, 30));
        panel.add(receptionistLabel);
        
//        adminWelcomeLabel=new JLabel("Welcome");
//        adminWelcomeLabel.setForeground(Color.BLUE);
//        adminWelcomeLabel.setBounds(430, 230, 400, 64);
//        adminWelcomeLabel.setFont(new Font("TimesRoman", Font.BOLD, 70));
//        panel.add(adminWelcomeLabel);
        
        
        
        receptionistPicLabel=new JLabel(new ImageIcon("adminPic.PNG"));
        receptionistPicLabel.setBounds(5,4,100,100);
        panel.add(receptionistPicLabel);
        
        this.addBackgroundPic();
        this.frame.setVisible(true);
    }
    public void RHFHandler(ActionListener RHFListener)
    {
        setAppointment.addActionListener(RHFListener);
        checkAppointment.addActionListener(RHFListener);
        addOutdoorPatient.addActionListener(RHFListener);
        updateInfoOfPatient.addActionListener(RHFListener);
        viewBill.addActionListener(RHFListener);
        updateInfoOfReceptionist.addActionListener(RHFListener);
        receptionistLogout.addActionListener(RHFListener);
    }
}
