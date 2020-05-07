import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,x=0,min=10000000;
        n=sc.nextInt();
        int disc[]=new int[n];
        int a[]=new int[n];
        String s[]=new String[n];
        for (i=0;i<n ;i++ )
        s[i]=sc.next();
        for(i=0;i<n;i++){
        String r[]=s[i].split(",");
        disc[i]=(Integer.valueOf(r[2])*Integer.valueOf(r[1])/100);
        if(min>disc[i]){
            min=disc[i];
            }
        }
        for(i=0;i<n;i++)
        if(disc[i]==min)
        a[x++]=i;
        a=Arrays.copyOf(a,x);
        for(i=0;i<a.length;i++){
        String r[]=s[a[i]].split(",");
        if(i==a.length-1)
        System.out.print(r[0]);
        else
        System.out.print(r[0]+",");
    }}
}