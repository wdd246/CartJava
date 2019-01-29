package javashop;

/**
 *
 * @author Adam Małota
 */
public class Product {
    private String name;
    private double price;
    
    Product(){
        this.name="Domyslne jabłko";
        this.price=2;
    }
    
    Product(String name, double price){
        setName(name);
        setPrice(price);
    }
    
    String getName(){
        return name;
    }
    
    void setName(String name){
        if(name!=null && !name.equals("")){
            this.name=name;
        }
        else{
            throw new IllegalArgumentException();
        }
    }
    
    double getPrice(){
        return price;
    }
    
    void setPrice(double price){
        if(price>=0){
            this.price=price;
        }
        else{
            throw new IllegalArgumentException();
        }
    }
}

