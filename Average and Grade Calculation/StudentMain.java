import java.util.Scanner;
public class StudentMain{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,id,i;
        Student s=new Student();
        System.out.println("Enter the id:");
        id=sc.nextInt();
        s.setId(id);
        System.out.println("Enter the name:");
        String na=sc.next();
        s.setName(na);
        System.out.println("Enter the no of subjects:");
        n=sc.nextInt();
        int m[]=new int[n];
        for(i=0;i<n;i++){
            System.out.println("Enter mark for subject "+(i+1)+":");
            m[i]=sc.nextInt();
        }
        s.setMarks(m);
        s.calculateAvg();
        s.findGrade();
        System.out.println("Id:"+s.getId());
        System.out.println("Name:"+s.getName());
        System.out.println("Average:"+s.getAverage());
        System.out.println("Grade:"+s.getGrade());
    }
}