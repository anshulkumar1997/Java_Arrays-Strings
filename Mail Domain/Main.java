import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,c=0,j,n;
        boolean t=false;
        n=sc.nextInt();
        String r[]=new String[n];
        for(i=0;i<r.length;i++)
        r[i]=sc.next();
        for(i=0;i<r.length;i++){
            char ch[]=r[i].toCharArray();
            for(j=0;j<ch.length;j++)
            if(ch[j]=='@')
            {
                String s=r[i].substring(j,ch.length);
                if(s.equals("@zeezee.com")==false)
                { System.out.println(r[i]);
                t=true;
                break;}
            }
        }
        if(!t)
        System.out.println("No personal mail id");
        
    }
}