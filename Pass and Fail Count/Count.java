import java.util.Scanner;
public class Count{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=0,f=0,n;
        System.out.println("Enter the no of subjects:");
        n=sc.nextInt();
        if(n<=0){
            System.out.println("Invalid input range");
            return;
        }
        int m[]=new int[n];
        for(int i=0;i<n;i++)
        m[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        if(m[i]<50)
        f++;
        else
        p++;
        if(p==n)
        {System.out.println("Ram passed in all subjects"); return;}
        if(f==n)
        {System.out.println("Ram failed in all subjects"); return;}
        System.out.println("Ram passed in "+p+" subjects and failed in "+f+" subjects");
        
    }
}