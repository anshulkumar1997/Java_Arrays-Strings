import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,j,sum=0;
        n=sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (i=0;i<a.length ;i++ ){
            a[i]=sc.nextInt();
        }
        for (i=0;i<a.length ;i++ ){
            sum=0;
        for (j=0;j<a.length ;j++ ){
            if(i!=j)
            sum+=a[j]*a[j];
        } 
    b[i]=sum;}
    
    for (i=0;i<b.length ;i++ )
    System.out.println(b[i]);
    }
}