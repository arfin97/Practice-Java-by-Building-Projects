package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    private int defaultPasswordLength = 8;
    private String companySuffix = "brainstation23";

    //constructor to receive first name and last name;
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Created User: " + firstName + " " + lastName);
        this.department = setDepartment();
        this.password = generateRandomPassword(defaultPasswordLength);
        this.email = generateEmail();
    }

    private String generateEmail() {
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + companySuffix + ".com";
    }
    //generate a random password
    private String generateRandomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345677890!@#$%^&*()_+";
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            int randNum = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randNum);
        }
        String passwordGenerated = new String(password);
        return passwordGenerated;
    }

    //ask for the department
    public String setDepartment(){
        System.out.println("Please Choose a department: ");
        System.out.println("1. Sales");
        System.out.println("2. Development");
        System.out.println("3. Accounting");
        System.out.println("0. None");
        System.out.print("Enter your code: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if(departmentChoice == 1){
            return "sales";
        }
        else if(departmentChoice == 2){
            return "dev";
        }
        else if(departmentChoice == 3){
            return "acc";
        }
        else{
            return "";
        }
    }



    //set mailbox capacity
    public void setMailBoxCapacity(int mailBoxCapacity){
        this.mailBoxCapacity = mailBoxCapacity;
    }
    //set alternate email
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }
    //change password
    public void setPassword(String password){
        this.password = password;
    }

    //getters
    public int getMailBoxCapacity(){ return mailBoxCapacity;};
    public String getAlternateEmail(){return alternateEmail;};
    public String getPassword(){ return password;};

    //display everything
    public String display(){
        return
                "Display Name: " + firstName + " " + lastName + "\n"
                + "Email: " + email  + "\n"
                + "Deparatment: " + department + "\n"
                + "Email Capacity: " + mailBoxCapacity;

    }
}
