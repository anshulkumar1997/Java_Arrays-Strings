import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        String r[]=s.split(" ");
        for(i=0;i<r.length;i++){
        for(j=0;j<r[i].length();j++){
            if(j>=i+1)
            System.out.print(Character.toUpperCase(r[i].charAt(j)));
            else
            System.out.print(r[i].charAt(j));
        }
        System.out.print(" ");
    }
}
}