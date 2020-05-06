import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.next();
        char c[]=s.toCharArray();
        int i,j,x=0,p,b=0;
        boolean t=true;
        int a[]=new int[c.length];
        char r[]=new char[c.length];
        r[x++]=c[0];
        for(i=0;i<c.length;i++){
            p=0;
            for(j=i;j<c.length;j++)
            if(c[i]!=c[j]){
                a[b++]=p;
                i=j-1;
                r[x++]=c[j];
                break;
            }
            else
            p++;
            if(j==c.length){
                a[b++]=p;
                break;
            }
        }
        r=Arrays.copyOf(r,x);
        a=Arrays.copyOf(a,b);
        for(i=0;i<a.length;i++)
        if(a[i]!=1){
            t=false;
            break;
        }
        if(t)
        for(i=0;i<r.length;i++)
        System.out.print(r[i]);
        else
        for(i=0;i<r.length;i++){
            System.out.print(r[i]);
            System.out.print(a[i]);
        }
    }
}