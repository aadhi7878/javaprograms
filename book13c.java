

public class book13c {
    
    public static void main(String[] args) {
        ecomerce e=new amazon();
        ecomerce f=new flipcart();
        ecomerce g=new tataCLIQ();
        e.price();
        f.price();
        g.price();
     }
}
interface ecomerce{
    public void price();
}

class amazon implements ecomerce{
    public void price(){
        System.out.println("laptop price is 57000 RS");
    }
 }
 class flipcart implements ecomerce{
    public void price(){
        System.out.println("laptop price is 50000 RS");
    }
 }
 class tataCLIQ implements ecomerce{
    public void price(){
        System.out.println("laptop price is 75000 RS");
    }
 }