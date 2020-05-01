import java.util.Scanner;
public class Course{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        boolean t=false;
        String s;
        System.out.println("Enter no of course:");
        n=sc.nextInt();
        if(n<=0){
            System.out.println("Invalid Range");
            return;
        }
        System.out.println("Enter course names:");
        String c[]=new String[n];
        for (i=0;i<n ;i++ )
        c[i]=sc.next();
        System.out.println("Enter the course to be searched:");
        s=sc.next();
        for(i=0;i<n;i++)
        if(s.equals(c[i]))
        {t=true;break;}
        if(t)
        System.out.println(s+" course is available");
        else
        System.out.println(s+" course is not available");
        
    }
}