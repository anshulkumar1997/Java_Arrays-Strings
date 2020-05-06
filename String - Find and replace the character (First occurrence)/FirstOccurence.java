import java.util.*;
public class FirstOccurence{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        char a,c;
        int i;
        String s;
        boolean t=true;
        System.out.println("Enter the string:");
        s=sc.nextLine();
        char r[]=s.toCharArray();
        System.out.println("Enter the character to be searched:");
        a=sc.next().charAt(0);
        System.out.println("Enter the character to replace:");
        c=sc.next().charAt(0);
        for(i=0;i<r.length;i++)
        if(r[i]==a){
            r[i]=c;
            t=false;
            break;
        }
        if(t)
        System.out.println("character not found");
        else
        for(i=0;i<r.length;i++)
        System.out.print(r[i]);
    }
}