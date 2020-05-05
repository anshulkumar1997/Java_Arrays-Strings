import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String n;
        int i,j,x=0;
        n=sc.next();
        char c[]=n.toCharArray();
        char r[]=new char[n.length()];
        for(i=0;i<c.length;i++){
            for(j=0;j<i;j++)
            if(c[i]==c[j])
            break;
            if(i==j)
            r[x++]=c[i];
        }
        Arrays.sort(r);
        for(i=r.length-1;i>-1;i--)
        System.out.print(r[i]);
    }
}