

package hospitalmanagementsystem;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class ReceptionistUpdateView extends CommonUpdate
{
    JLabel updateLabel;
    String fromWhere;
    public ReceptionistUpdateView(String fromWhere) 
    {
        this.fromWhere=fromWhere;
        
        updateLabel=new JLabel("Receptionist Update Panel");
        updateLabel.setFont(new Font("TimesRoman", Font.BOLD, 30));
        updateLabel.setBounds(270, 3, 400, 50);
        this.panel.add(updateLabel);
        
        this.addBackgroundPic();
        frame.setVisible(true);
    }
    public void RUHandler(ActionListener RUListener)
    {
        backButton.addActionListener(RUListener);
        updateButton.addActionListener(RUListener);
    }
    

}
