import java.util.*;
public class Main{
    public static void main (String[] args) {
        String words[][]=new String[5][5];
        Scanner sc=new Scanner(System.in);
        int vc[][]=new int[5][5];
        int i=0,j=0,c=0;
        for(i=0;i<5;i++)
        for(j=0;j<5;j++)
        words[i][j]=sc.next();
        for(i=0;i<5;i++)
        for(j=0;j<5;j++){
            for(int k=0;k<words[i][j].length();k++){
                char ch=Character.toLowerCase(words[i][j].charAt(k));
                if(ch=='a' || ch=='e' ||ch=='i' || ch=='o' || ch=='u' )
                c++;
            }
            vc[i][j]=c;
            c=0;
        }
        for(i=0;i<5;i++)
        for(j=0;j<5;j++){
            int n=vc[i][j];
            if(n>5)
            vc[i][j]=8;
            else if(n==5)
            vc[i][j]=6;
            else if(n==4)
            vc[i][j]=4;
            else if(n==3)
            vc[i][j]=3;
            else if(n==2)
            vc[i][j]=1;
            else if(n==1)
            vc[i][j]=0;
        }
        for(i=0;i<5;i++){
            for(j=0;j<5;j++)
            System.out.print(vc[i][j]+"\t");
            System.out.println();
        }
        int max=0;
        c=0;
        int ar[]=new int[5];
        for(i=0;i<5;i++){
            for(j=0;j<5;j++)
            c=c+vc[i][j];
            ar[i]=c;
            c=0;
        }
        for(i=0;i<5;i++)
        System.out.println((i+1)+"\t"+ar[i]);
        for(i=0;i<5;i++)
        if(max<ar[i]&&ar[i]!=0)
        max=ar[i];
        String p="";
        for(i=0;i<5;i++)
        if(max==ar[i])
        p=p+"Student "+String.valueOf((i+1))+" ";
        if(max==0)
        System.out.println("No one has got any points");
        else
        System.out.println("The winner is "+p+"with points "+max);
    }
}