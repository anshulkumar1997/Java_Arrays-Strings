import java.util.*;
public class Shop{
    private String shopName,shopAddress,products[];
    public Shop(String sn,String sa,String[] p){
        this.shopName=sn;
        this.shopAddress=sa;
        this.products=p;
    }
    public String getShopName(){
        return this.shopName;
    }
    public String getShopAddress(){
        return this.shopAddress;
    }
    public String[] getProducts(){
        return this.products;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String sn,sa,pn;
        int n,i;
        System.out.println("Enter the shopname:");
        sn=sc.next();
        System.out.println("Enter the address:");
        sa=sc.next();
        System.out.println("Enter the number of products:");
        n=sc.nextInt();
        String p[]=new String[n];
        for(i=0;i<n;i++)
        p[i]=sc.next();
        Shop s=new Shop(sn,sa,p);
        System.out.println("Enter the product to be searched:");
        pn=sc.next();
        boolean t=s.checkProductAvailability(pn);
        if(t)
        System.out.println("Product is available at "+s.getShopName()+", "+s.getShopAddress());
        else
        System.out.println("Product is not available at "+s.getShopName()+", "+s.getShopAddress());
        
    }
    public boolean checkProductAvailability(String productname){
        for(int i=0;i<this.products.length;i++)
        if(this.products[i].equalsIgnoreCase(productname)){
            return true;}
            return false;
        
    }
}