package javashop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Adam Małota
 */
public class Basket {
    private List <Product> list = new ArrayList();
    
    public void addProduct(Product product){
        if(product==null){
            throw new IllegalArgumentException("Produkt nie może być null");
        }
        list.add(product);
    }
    
    public void removeProduct(String name){
        Iterator<Product> iter = list.iterator();
        Product product = iter.next();
        while(iter.hasNext()){
            if(iter.next().getName().equals(name)){
                iter.remove();  
                break;
            }
           
        }
    }
    
    public double sum(){
        double sum=0;
        for(Product product : list){
            sum+=product.getPrice();
        }
        return sum;
    }
    
    public void showProducts(){
        for(Product product : list){
            System.out.printf("Nazwa: "+product.getName()+" cena: "+"%.2f",product.getPrice());
            System.out.println("zł");
        }
    }
    
}
