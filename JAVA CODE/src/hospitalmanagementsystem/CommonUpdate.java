

package hospitalmanagementsystem;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CommonUpdate extends CommonSignup
{
    JButton updateButton;
    public CommonUpdate() 
    {
        this.panel.remove(signupButton);
        
        updateButton=new JButton(new ImageIcon("update.PNG"));
        updateButton.setBounds(830,490,140,60);
        panel.add(updateButton);
        
       // this.addBackgroundPic();
        
    }
    
    
}
