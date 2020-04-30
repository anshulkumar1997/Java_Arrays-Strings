import java.util.Scanner;
public class Sum{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,max=0,min;
        System.out.println("Enter the size of an array:");
        n=sc.nextInt();
        if(n<=0){
            System.out.println("Invalid Array Size");
            return;
        }
        System.out.println("Enter the elements:");
        int a[]=new int[n];
        for (i=0;i<n ;i++ )
        a[i]=sc.nextInt();
        for (i=0,min=a[0];i<n ;i++ ){
            if(max<a[i])
            max=a[i];
            if(min>a[i])
            min=a[i];
        }
        System.out.println(max+min);
    }
}