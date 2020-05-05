import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,j,x=0;
        String s;
        s=sc.next();
        char c[]=s.toCharArray();
        for(i=0;i<c.length;i++){
            for(j=0;j<i;j++)
            if(c[i]==c[j])
            break;
            if(i==j)
            c[x++]=c[i];
        }
        c=Arrays.copyOf(c,x);
        if(c.length%2==0)
        n=c.length/2;
        else
        n=Math.round(c.length/2)+1;
        char r1[]=Arrays.copyOfRange(c,0,n);
        char r2[]=Arrays.copyOfRange(c,n,c.length);
        Arrays.sort(r1);
        Arrays.sort(r2);
        for (i=r1.length-1;i>-1 ;i-- )
        System.out.print(r1[i]);
        for (i=0;i<r2.length ;i++ )
        System.out.print(r2[i]);
        
    }
}