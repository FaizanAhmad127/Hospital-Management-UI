

package hospitalmanagementsystem;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CheckBillView extends MainFrame 
{
    JTable table;
    JScrollPane scrollPane;
    JButton backButton;
    JLabel checkBill;
    DefaultTableModel model;
    String fromWhere;
    public CheckBillView(String fromWhere)
    {
        this.fromWhere=fromWhere;
        checkBill=new JLabel("Check Bill");
        checkBill.setBounds(400, 3, 400, 50);
        checkBill.setFont(new Font("TimesRoman", Font.BOLD, 30));
        panel.add(checkBill);
        
        Object rowData[][]=new Object[0][2]; 
        Object columnNames[]= { "Medicine", "Price" };
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
    
    public void CBHandler(ActionListener CBListener)
    {
        backButton.addActionListener(CBListener);
    }
    
    }
