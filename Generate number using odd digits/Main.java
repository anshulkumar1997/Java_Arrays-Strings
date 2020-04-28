import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,c;
        System.out.println("Enter the size of an array:");
        n=sc.nextInt();
        if(n<=0){
            System.out.println("Invalid array size");
            return;
        }
       int[] a = new int[n];
       System.out.println("Enter the array elements:");
       for (i=0;i<a.length ;i++ )
       a[i]=sc.nextInt();
       c=0;
       
       for(i=0;i<a.length;i++){
           if(a[i]<10 && a[i]%2!=0 && a[i]>0){
           System.out.print(a[i]);
           c++;
           }
       }
       if(c==0){
           System.out.println("Single digit odd number is not found in the array");
           return;
       }
    }
}