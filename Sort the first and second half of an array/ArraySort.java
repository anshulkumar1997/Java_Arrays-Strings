import java.util.*;
public class ArraySort{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,p;
        System.out.println("Enter the size of an array:");
        n=sc.nextInt();
        if(n<=0){
            System.out.println("Array size should be greater than 0");
            return;
        }
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for (i=0;i<n;i++ )
        a[i]=sc.nextInt();
        if(n%2==0)
        p=n;
        else
        p=n+1;
        int a1[]=Arrays.copyOfRange(a,0,p/2);
        int a2[]=Arrays.copyOfRange(a,p/2,p);
        Arrays.sort(a1);
        Arrays.sort(a2);
        for (i=0;i<a1.length ;i++)
        System.out.println(a1[i]);
        if(n%2==0)
        for (i=a2.length-1;i>-1 ;i-- )
        System.out.println(a2[i]);
        else
        for (i=a2.length-1;i>0 ;i-- )
        System.out.println(a2[i]);
        
    
}}