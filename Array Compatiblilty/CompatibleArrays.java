import java.util.Scanner;
public class CompatibleArrays{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,i;
        System.out.println("Enter the size for First array:");
        n1=sc.nextInt();
        if(n1<=0){
            System.out.println("Invalid array size");
            return;
        }
        System.out.println("Enter the elements for First array:");
        int a1[]=new int[n1];
        for (i=0;i<n1 ;i++ )
        a1[i]=sc.nextInt();
        System.out.println("Enter the size for Second array:");
        n2=sc.nextInt();
        if(n2<=0){
            System.out.println("Invalid array size");
            return;
        }
        System.out.println("Enter the elements for Second array:");
        int a2[]=new int[n2];
        for(i=0;i<n2;i++)
        a2[i]=sc.nextInt();
        if(n1!=n2){
            System.out.println("Arrays are Not Compatible");
            return;
        }
        else if(n1==n2){
            for(i=0;i<n1;i++){
                if(a1[i]<a2[i]){
                    System.out.println("Arrays are Not Compatible");
                    return;
                }
            }
            System.out.println("Arrays are Compatible");
        }
    }
}