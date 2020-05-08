import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0,c=0;
        String n=sc.next();
        char b[]=n.toCharArray();
        for (i=n.length()-1;i>0 ;i-- )
        if(b[i]>b[i-1])
        break;
        if(i==0)
        System.out.println(n);
        else{
            char x=b[i-1];
            int min=i;
            for(int j=i;j<n.length();j++)
            if(b[j]>x&&b[j]<b[min])
            min=j;
            char temp=b[min];
            b[min]=b[i-1];
            b[i-1]=temp;
            Arrays.sort(b,i,n.length());
            for(char k:b)
            System.out.print(k);
        }
    }
}