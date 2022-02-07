

package hospitalmanagementsystem;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class CheckAppointmentView extends MainFrame
{
    JTable table;
    JScrollPane scrollPane;
    JButton backButton;
    JLabel checkAppointment;
    DefaultTableModel model;
    String fromWhere;
    public CheckAppointmentView(String fromWhere) 
    {
        this.fromWhere=fromWhere;
        checkAppointment=new JLabel("Check Appointment");
        checkAppointment.setBounds(350, 3, 400, 50);
        checkAppointment.setFont(new Font("TimesRoman", Font.BOLD, 30));
        panel.add(checkAppointment);
        
        Object rowData[][]=new Object[0][4]; 
        Object columnNames[]= { "Patient Name", "Doctor Name", "Date","Time" };
        model = new DefaultTableModel(rowData, columnNames);
        table = new JTable(model);
        table.setEnabled(false);
        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 100, 960, 400);
        panel.add(scrollPane);
        haha();
        
        
        backButton=new JButton(new ImageIcon("back.PNG"));
        backButton.setBounds(10, 490, 140, 62);
        panel.add(backButton);
        this.addBackgroundPic();
        frame.setVisible(true);
    
        
        
    }
    public void haha()
    {
       //model=(DefaultTableModel) table.getModel();  if you didn't create default table model already then use this code to get model of a table
        for(int i=0;i<100;i++)
        {
            model.insertRow(model.getRowCount(),new Object[]{i,"e","f","d"});   
        } 
    }
    
    public void CAHandler(ActionListener CAListener)
    {
        backButton.addActionListener(CAListener);
    }
    
    

}
