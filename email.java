import java.io.*;
import java.lang.*;
import java.util.*;

public class email {
    private String firstname;
    private String lastname;
    private String password;
    private String departmant;
    private String mail;
    private int mailboxCapacity = 500;

    //Constructor
    public email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        
        this.departmant = setDepartmant();
        
        this.password = generatePassword(6);
        
        mail = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + departmant.toLowerCase() + "." + "aicompany.com";
    } 

    // Ask for the departmant
    private String setDepartmant() {
        System.out.print("Enter the Departmant : ");
        Scanner sc = new Scanner(System.in);
        String dep = sc.nextLine();

        return dep;
    }

    // Random Password
    private String generatePassword(int length) {
        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@#%$*";
        char pass[] = new char[length];
        for(int i=0;i<length;i++){
            int r = (int) (Math.random() * charSet.length());
            pass[i] = charSet.charAt(r);
        }
        return new String(pass);
    } 

    public void setmailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Change the password
    public void changePassword(String newPass) {
        this.password = newPass;
    }

    // get Your password
    public String getPassword() { return password; }

    // Displaying info
    public void showInfo() {
        System.out.println("Name :  " + this.firstname + " " + this.lastname);
        System.out.println("Your Email :  " + this.mail);
        System.out.println("Your MailBox Capacity :  " + this.mailboxCapacity);
    }

}