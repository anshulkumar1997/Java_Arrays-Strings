import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,i,j,co=0;
        n1=sc.nextInt();
        int[] a = new int[n1];
        for (i=0;i<n1 ;i++ )
        {a[i]=sc.nextInt();
        if(a[i]<0){
            System.out.println("No Negative Elements");
            return;
        }}
        n2=sc.nextInt();
        if(n1!=n2){
            System.out.println("Invalid array size");
            return;
        }
        int[] b = new int[n2];
        for (i=0;i<n2 ;i++ ){
            b[i] = sc.nextInt();
            if (b[i]<0){
                System.out.println("No Negative Elements");
                return;
            } 
        }
        int[] c = new int[100];
        int[] d = new int[100];
        for (i=0,co=0;i<n1 ;i++ )
        {for (j=0;j<n2 ;j++ )
        if(a[i]==b[j])
        {c[co]=i+1;
        d[co]=j+1;
        co++;}}
        if(co==0)
        System.out.println("No matching scores");
        else
        {for (i=0;i<co ;i++ ) 
        System.out.print("("+c[i]+","+d[i]+")"); 
    }
}}