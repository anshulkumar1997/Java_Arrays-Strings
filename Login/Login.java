import java.util.Scanner;
public class Login{
    private String userName,password;
    public Login(String userName,String password){
        this.userName=userName;
        this.password=password;
    }
    public String getUserName(){
        return this.userName;
    }
    public String getPassword(){
        return this.password;
    }
    public boolean validate(){
        if(this.userName.equals("john") && this.password.equals("123abc"))
        return true;
        else 
        return false;
    }
    public static void main (String[] args) {
        String us,pass;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username:");
        us=sc.next();
        System.out.println("Enter the password:");
        pass=sc.next();
        Login l = new Login(us,pass);
        boolean b=l.validate();
        if(b)
        System.out.println("Valid user");
        else
        System.out.println("Invalid user");
    }
}