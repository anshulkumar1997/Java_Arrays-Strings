import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        int i,j,n=-1,max=0;
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        String r[]=s.split(" ");
        int[] a=new int[r.length];
        for(i=0;i<r.length;i++){
            a[i]=0;
            for(j=i+1;j<r.length;j++)
            if(r[i].equals(r[j]))
                {n++;
                a[i]++;}
        }
        for(i=0;i<a.length;i++)
        if(max<a[i])
        max=a[i];
        if(n>-1){
            for(i=0;i<a.length;i++)
            if(a[i]==max)
            System.out.println(r[i]);
        }
        else
        System.out.println("No repetition of words");
    }
}