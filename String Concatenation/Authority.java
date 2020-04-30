import java.util.Scanner;
import java.lang.*;
public class Authority{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String fn,ln;
        int i;
        boolean t=false;
        System.out.print("Inmate's name:");
        fn=sc.nextLine();
        System.out.print("Inmate's father's name:");
        ln=sc.nextLine();
        for(i=0;i<fn.length();i++)
        if(Character.isLetter(fn.charAt(i)) == true || fn.charAt(i)==' ')
        t=true;
        else{
            System.out.println("Invalid name");
            return;
        }
        for(i=0;i<ln.length();i++)
        if(Character.isLetter(ln.charAt(i))==true || ln.charAt(i)==' ')
        t=true;
        else
        {
            System.out.println("Invalid name");
            return;
        }
        if(t)
        System.out.println(fn.toUpperCase().concat(" ").concat(ln.toUpperCase()));
        
    }
}