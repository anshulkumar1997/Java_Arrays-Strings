import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,s;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(i=0;i<n-1;i++){
            if(i%2==0){
                if(a[i]<a[i+1])
                continue;
                else{
                    s=a[i];
                    a[i]=a[i+1];
                    a[i+1]=s;
                }}
            else{
                if(a[i]>a[i+1])
                continue;
                else{
                    s=a[i];
                    a[i]=a[i+1];
                    a[i+1]=s;
                }
            }    
            
        }
        for(i=0;i<n;i++)
        System.out.println(a[i]);
    }
}