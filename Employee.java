import java.lang.reflect.Array;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String department;
    private final String password;
    private final int MAILBOX_CAPACITY = 15;

    public Employee(String firstName, String lastName,String department ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        password = password();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String password(){
        String stringArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#";
        //System.out.println(stringArray.charAt(0));
        String password = "";
        for(int i = 0; i < 8; i++){
            int j = (int)(Math.random()*64);
            password = password + stringArray.charAt(j);
        }

        return password;
    }

    public String getDepartment() {
        return department;
    }
    @Override
    public String toString(){ 
        return "Employee email:" +
                firstName + '.' 
                + lastName + '.' +
                department + "@company.com" +"\nYour password: "+password;
    }

    
}
