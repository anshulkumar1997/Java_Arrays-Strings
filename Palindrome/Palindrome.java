import java.util.*;
import java.io.*;
public class Palindrome{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String n;
        int i;
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter the word:");
        n=sc.nextLine();
        for(i=0;i<n.length();i++)
        if(Character.isLetter(n.charAt(i)) == false)
        {System.out.println("Invalid Input");return;}
        sb.append(n);
        sb=sb.reverse();
        if(n.equalsIgnoreCase(sb.toString()))
            System.out.println(n+" is a Palindrome");
        else
        System.out.println(n+" is not a Palindrome");
        
    }
}