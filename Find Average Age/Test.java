import java.util.Scanner;
public class Test{
    public static void main (String[] args) {
        
    int n,i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter total no.of employees:");
    n=sc.nextInt();
    if(n<2){
        System.out.println("Please enter a valid employee count");
        return;
    }
    int age[] = new int[n];
    System.out.println("Enter the age for "+n+" employees:");
    for (i=0;i<n ;i++ ){
    age[i]=sc.nextInt();
        if(age[i]<28 || age[i]>40){
            System.out.println("Invalid age encountered!");
            return;
        }
    }
    Test t=new Test();
    double r;
    r=t.calculateAverage(age);
    System.out.println("The average age is "+(String.format("%.2f",r)));
    }
    public double calculateAverage(int[] age){
        int i,sum=0;
        double avg;
        for (i=0;i<age.length ;i++ )
        sum+=age[i];
        avg=(double)sum/(double)age.length;
        return avg;
    }
}