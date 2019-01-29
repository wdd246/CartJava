package javashop;

/**
 *
 * @author Adam Małota
 */
public class JavaShop {
    
    public static void main(String[] args) {
        Basket koszyk = new Basket();
        Product product;
        koszyk.addProduct(new Product("Winogrona",10));
        koszyk.addProduct(new Product("Jabłko",1));
        koszyk.addProduct(new Product("Gruszka",5));
        
        try{
            koszyk.addProduct(null);
            koszyk.addProduct(new Product("",1));
            koszyk.addProduct(new Product("Mleko",-10));
        }
        catch(IllegalArgumentException e){
            System.err.print("Prosze podać właściwy produkt");
        }
        
        koszyk.showProducts();
        System.out.println("Suma: "+koszyk.sum()+"zł");
        koszyk.removeProduct("Jabłko");
        koszyk.showProducts();
        System.out.println("Suma: "+koszyk.sum()+"zł");
    }
    
}
