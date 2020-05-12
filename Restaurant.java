import java.io.InputStream;
public class Restaurant {

    public static void main(String[] args) throws Exception {
        RestaurantFactoryProducer restaurantFactoryProducer = new RestaurantFactoryProducer();
        
        RestaurantAbstractFactory restaurantAbstractFactory1 = 
                            restaurantFactoryProducer.getRestaurantAbstractFactory(1);
                               
        System.out.println(restaurantAbstractFactory1.getFastFood("hamburger"));
        System.out.println(restaurantAbstractFactory1.getDrink("soda"));
        System.out.println(restaurantAbstractFactory1.getDrink("juice"));
        System.out.println("");

        System.out.println("Restaurante2: ");
        RestaurantAbstractFactory restaurantAbstractFactory2 = 
                            restaurantFactoryProducer.getRestaurantAbstractFactory(2);

        System.out.println(restaurantAbstractFactory2.getFastFood("pizza"));
        System.out.println(restaurantAbstractFactory2.getDrink("beer"));
        System.out.println(restaurantAbstractFactory2.getFastFood("sandwich"));   
    }
}