import java.util.*;
public class Numerology{
      public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String a1[][]={{"A","B","C","D","E","F","G","H","I","J","K","L","M"},
                       {"N","O","P","Q","R","S","T","U","V","W","X","Y","Z"}};
                       int a2[][]={{1,2,3,4,5,8,3,5,1,1,2,3,4},{5,7,8,1,2,3,4,6,6,6,5,1,7}};
                       System.out.println("Enter your name:");
                       String s=sc.next();
                       int sum=0,flag=-1,i,j,k;
                       for(i=0;i<s.length();i++){
                           String s1=String.valueOf(s.charAt(i));
                           if(Character.isLowerCase(s.charAt(i)) || Character.isDigit(s.charAt(i)) || s1.equals(" ")){
                               flag++;
                               break;
                           }
                        for(j=0;j<2;j++)
                        for(k=0;k<13;k++)
                        if(a1[j][k].equals(s1))
                        sum+=a2[j][k];
                       }
                       if(flag==-1)
                       System.out.println("Your numerology no is "+sum);
                       else
                       System.out.println("Invalid name");
    }
}