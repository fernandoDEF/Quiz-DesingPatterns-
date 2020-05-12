public class Restaurant2Factory extends RestaurantAbstractFactory{
    public FastFood getFastFood(String type){
        switch(type){
            case "pizza": return new Pizza();
            default: return null; 
        }
    } 

    public Drink getDrink(String type){
        switch(type){
            case "juice": return new Juice();
            case "beer": return new Beer();
            default: return null;
        }
    }
}