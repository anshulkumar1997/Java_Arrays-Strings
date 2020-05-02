import java.util.Scanner;
public class InitCap{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        boolean t=false;
        int i,j,c=0;
        System.out.println("Enter the String:");
        s=sc.nextLine();
        String n[]=s.split(" ");
        for(i=0;i<n.length;i++)
        if(Character.toUpperCase(n[i].charAt(0))==n[i].charAt(0))
        c++;
        if(c==n.length){
            System.out.println("First character of each word is already in uppercase");
            return;}
        else{
            for(i=0;i<n.length;i++){
                for(j=0;j<n[i].length();j++)
                if(j==0)
                System.out.print(Character.toUpperCase(n[i].charAt(j)));
                else
                System.out.print(n[i].charAt(j));
                if(i!=n.length-1)
                System.out.print(" ");
            }
        }
        }
}