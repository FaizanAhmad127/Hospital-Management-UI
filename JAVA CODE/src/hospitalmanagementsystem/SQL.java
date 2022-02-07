

package hospitalmanagementsystem;
import java.sql.*;
import javax.swing.JOptionPane;
public class SQL 
{
    String dburl;
    Connection mycon;
    int prim=0;
    public SQL() 
    {
        dburl="jdbc:mysql://localhost:3306/hospital management system?zeroDateTimeBehavior=convertToNull";
    
    }
    
    // USERNAME CHECKING FOR NOT DUPLIATE
    boolean checkUsername(String u,String usernameColumn,String tableName  )
    {
           try
        {
        PreparedStatement ps;
        ps = getConnection().prepareStatement("SELECT "+usernameColumn+" FROM "+tableName);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            
            if(rs.getString(usernameColumn).equals(u))
            {
                return true;
            }
        }
        }
         catch(Exception ex)
        {
            System.out.println(ex);
        }
        return false;
    }
    
    // LOGIN AUTHENTICATION FOR ALL STAFF
    boolean login(String u,String p,String username,String password,String tablename)
    {
        try
        {
        PreparedStatement ps;
        ps = getConnection().prepareStatement("SELECT "+username+" , "+password+" FROM "+tablename);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            //System.out.println(rs.getString("AdminUsername")+" , "+rs.getString("AdminPassword"));
            if(rs.getString(username).equals(u) && rs.getString(password).equals(p))
            {
                return true;
            }
        }
        }
         catch(Exception ex)
        {
            System.out.println(ex);
        }
        return false;
    }
    
    //ADMIN SIGNUP
    public int getAdminPrimarykey(String adminUsername,String adminPassword)
    {
        
        
        try
        {
        Statement mystatement=getConnection().createStatement();
        String str="insert into adminauthentication (AdminUsername,AdminPassword) values ('"+adminUsername+"','"+adminPassword+"')";
        mystatement.executeUpdate(str);
        String s="select AdminId from adminauthentication order by AdminId Desc limit 1";
        ResultSet rs=mystatement.executeQuery(s);
        while(rs.next())
        {
            int i=rs.getInt("AdminId");
            return i;
        }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return 0;
               
    }
    public void enterAdminDescription(String adminUsername,String adminPassword,String firstName,String lastName,String email,String phone,String address,String qualification,String age)
    {
        try
        {
        Statement mystatement=getConnection().createStatement();
        String str="insert into admindescription (AdminIdFk,AdminFirstName, AdminLastName, AdminEmail, AdminContactNo, AdminAddress, AdminQualification, AdminAge) values ('"+getAdminPrimarykey(adminUsername,adminPassword)+"','"+firstName+"','"+lastName+"','"+email+"','"+phone+"','"+address+"','"+qualification+"','"+age+"')";
        mystatement.executeUpdate(str);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
   
    //DOCTOR SIGNUP
     public int getDoctorPrimarykey(String doctorUsername,String doctorPassword)
    {
        
        
        try
        {
        Statement mystatement=getConnection().createStatement();
        String str="insert into doctorauthentication (DoctorUsername,DoctorPassword) values ('"+doctorUsername+"','"+doctorPassword+"')";
        mystatement.executeUpdate(str);
        String s="select DoctorId from doctorauthentication order by DoctorId Desc limit 1";
        ResultSet rs=mystatement.executeQuery(s);
        while(rs.next())
        {
            int i=rs.getInt("DoctorId");
            return i;
        }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return 0;
               
    }
    public void enterDoctorDescription(String doctorUsername,String doctorPassword,String firstName,String lastName,String email,String phone,String address,String qualification,String age,String specialization)
    {
        try
        {
        Statement mystatement=getConnection().createStatement();
        String str="insert into doctordescription (DoctorIdFk,DoctorFirstName, DoctorLastName, DoctorEmail, DoctorContactNo, DoctorAddress, DoctorQualification, DoctorAge,DoctorSpecialization) values ('"+getDoctorPrimarykey(doctorUsername,doctorPassword)+"','"+firstName+"','"+lastName+"','"+email+"','"+phone+"','"+address+"','"+qualification+"','"+age+"','"+specialization+"')";
        mystatement.executeUpdate(str);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
    }
    
    //RECEPTIONIST SIGNUP 
        public int getReceptionistPrimarykey(String receptionistUsername,String receptionistPassword)
    {
        
        
        try
        {
        Statement mystatement=getConnection().createStatement();
        String str="insert into receptionistauthentication (ReceptionistUsername,ReceptionistPassword) values ('"+receptionistUsername+"','"+receptionistPassword+"')";
        mystatement.executeUpdate(str);
        String s="select ReceptionistId from receptionistauthentication order by ReceptionistId Desc limit 1";
        ResultSet rs=mystatement.executeQuery(s);
        while(rs.next())
        {
            int i=rs.getInt("ReceptionistId");
            return i;
        }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return 0;
               
    }
    public void enterReceptionistDescription(String receptionistUsername,String receptionistPassword,String firstName,String lastName,String email,String phone,String address,String qualification,String age)
    {
        try
        {
        Statement mystatement=getConnection().createStatement();
        String str="insert into receptionistdescription (ReceptionistIdFk,ReceptionistFirstName, ReceptionistLastName, ReceptionistEmail, ReceptionistContactNo, ReceptionistAddress, ReceptionistQualification, ReceptionistAge) values ('"+getReceptionistPrimarykey(receptionistUsername,receptionistPassword)+"','"+firstName+"','"+lastName+"','"+email+"','"+phone+"','"+address+"','"+qualification+"','"+age+"')";
        mystatement.executeUpdate(str);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    
    
    //PATIENT SIGNUP
       public int getPatientPrimarykey(String patientUsername,String patientPassword)
    {
        
        
        try
        {
        Statement mystatement=getConnection().createStatement();
        String str="insert into patientauthentication (PatientUsername,PatientPassword) values ('"+patientUsername+"','"+patientPassword+"')";
        mystatement.executeUpdate(str);
        String s="select PatientId from patientauthentication order by PatientId Desc limit 1";
        ResultSet rs=mystatement.executeQuery(s);
        while(rs.next())
        {
            int i=rs.getInt("PatientId");
            return i;
        }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return 0;
               
    }
    public void enterPatientDescription(String patientUsername,String patientPassword,String firstName,String lastName,String email,String phone,String address,String qualification,String age)
    {
        try
        {
        Statement mystatement=getConnection().createStatement();
        String str="insert into patientdescription (PatientIdFk,PatientFirstName, PatientLastName, PatientEmail, PatientContactNo, PatientAddress, PatientQualification, PatientAge) values ('"+getPatientPrimarykey(patientUsername,patientPassword)+"','"+firstName+"','"+lastName+"','"+email+"','"+phone+"','"+address+"','"+qualification+"','"+age+"')";
        mystatement.executeUpdate(str);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    
    
    
    
    
    //general getting connection
    public Connection getConnection()
    {
        try
        {
            if(mycon==null)
            {
                mycon=DriverManager.getConnection(dburl,"root","");
                return mycon;
            }
            else
            {
                return mycon;
            }
        }
        catch(Exception ex)
        {
            return null;
        }
    }
    
}
