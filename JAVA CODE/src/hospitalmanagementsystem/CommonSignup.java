

package hospitalmanagementsystem;
import java.awt.Font;
import javax.swing.*;

public class CommonSignup extends MainFrame
{
    JLabel firstNameLabel,lastNameLabel,usernameLabel,passwordLabel,emailLabel,contactLabel,addressLabel,qualificationLabel,ageLabel;
    JTextField firstNameTextField,lastNameTextField,usernameTextField,passwordTextField,emailTextField,contactTextField,addressTextField,qualificationTextField,ageTextField;
    JButton signupButton,backButton;
    
    public CommonSignup() 
    {
       
        //LABELS
        firstNameLabel=new JLabel("First Name ");
        firstNameLabel.setBounds(50, 90, 100, 30);
        decorateLabels(firstNameLabel);
        panel.add(firstNameLabel);
        
        lastNameLabel=new JLabel("Last Name ");
        lastNameLabel.setBounds(370, 90, 100, 30);
        decorateLabels(lastNameLabel);
        panel.add(lastNameLabel);
        
        usernameLabel=new JLabel("Username ");
        usernameLabel.setBounds(50, 140, 100, 30);
        decorateLabels(usernameLabel);
        panel.add(usernameLabel);
        
        passwordLabel=new JLabel("Password ");
        passwordLabel.setBounds(370, 140, 100, 30);
        decorateLabels(passwordLabel);
        panel.add(passwordLabel);
        
        emailLabel=new JLabel("Email ");
        emailLabel.setBounds(50, 190, 100, 30);
        decorateLabels(emailLabel);
        panel.add(emailLabel);
        
        contactLabel=new JLabel("Phone ");
        contactLabel.setBounds(370, 190, 100, 30);
        decorateLabels(contactLabel);
        panel.add(contactLabel);
        
        addressLabel=new JLabel("Address ");
        addressLabel.setBounds(50, 240, 100, 30);
        decorateLabels(addressLabel);
        panel.add(addressLabel);
        
        qualificationLabel=new JLabel("Qualifcation ");
        qualificationLabel.setBounds(370, 240, 100, 30);
        decorateLabels(qualificationLabel);
        panel.add(qualificationLabel);
        
        ageLabel=new JLabel("Age ");
        ageLabel.setBounds(50, 290, 100, 30);
        decorateLabels(ageLabel);
        panel.add(ageLabel);
        
        //TEXTFIELDS 
        firstNameTextField=new JTextField();
        firstNameTextField.setBounds(120, 90, 150, 30);
        decorateTextFields(firstNameTextField);
        panel.add(firstNameTextField);
        
        lastNameTextField=new JTextField();
        lastNameTextField.setBounds(470, 90, 150, 30);
        decorateTextFields(lastNameTextField);
        panel.add(lastNameTextField);
        
        usernameTextField=new JTextField();
        usernameTextField.setBounds(120, 140, 150, 30);
        decorateTextFields(usernameTextField);
        panel.add(usernameTextField);
        
        passwordTextField=new JTextField();
        passwordTextField.setBounds(470, 140, 150, 30);
        decorateTextFields(passwordTextField);
        panel.add(passwordTextField);
        
        emailTextField=new JTextField();
        emailTextField.setBounds(120, 190, 150, 30);
        decorateTextFields(emailTextField);
        panel.add(emailTextField);
        
        contactTextField=new JTextField();
        contactTextField.setBounds(470, 190, 150, 30);
        decorateTextFields(contactTextField);
        panel.add(contactTextField);
        
        addressTextField=new JTextField();
        addressTextField.setBounds(120, 240, 150, 30);
        decorateTextFields(addressTextField);
        panel.add(addressTextField);
        
        qualificationTextField=new JTextField();
        qualificationTextField.setBounds(470, 240, 150, 30);
        decorateTextFields(qualificationTextField);
        panel.add(qualificationTextField);
        
        ageTextField=new JTextField();
        ageTextField.setBounds(120, 290, 150, 30);
        decorateTextFields(ageTextField);
        panel.add(ageTextField);
        
        // SIGNUP BUTTON
        signupButton=new JButton(new ImageIcon("signup.PNG"));
        signupButton.setBounds(830,490,140,60);
        panel.add(signupButton);
        
        backButton=new JButton(new ImageIcon("back.PNG"));
        backButton.setBounds(10, 490, 140, 62);
        panel.add(backButton);
   
    }
    public String getFirstName()
    {
        return firstNameTextField.getText();
    }
    public String getLastName()
    {
        return lastNameTextField.getText();
    }
    public String getUsername()
    {
        return usernameTextField.getText();
    }
    public String getPassword()
    {
        return passwordTextField.getText();
    }
    public String getEmail()
    {
        return emailTextField.getText();
    }
    public String getContact()
    {
        return contactTextField.getText();
    }
    public String getAddress()
    {
        return addressTextField.getText();
    }
    public String getQualification()
    {
        return qualificationTextField.getText();
    }
    public String getAge()
    {
        return ageTextField.getText();
    }
    
}
