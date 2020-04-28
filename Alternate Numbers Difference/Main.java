import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,sum=0,in=0;
        n=sc.nextInt();
        if(n<3){
            System.out.println("Invalid array size");
            return;
        }
        int[] a = new int[n];
        for (i=0;i<a.length ;i++ )
        a[i] = sc.nextInt();
        for (i=0;i<n-2 ;i++ ){
            if(sum<Math.abs(a[i]-a[i+2])){
                sum=Math.abs(a[i]-a[i+2]);
                if(a[i]<a[i+2])
                in=i;
                else
                in=i+2;
            }
        }
        System.out.println(in);
    }
}