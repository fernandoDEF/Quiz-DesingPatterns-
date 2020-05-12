public class Restaurant1Factory extends RestaurantAbstractFactory{
    public FastFood getFastFood(String type){
        switch(type){
            case "hamburger": return new Hamburger();
            case "sandwich": return new Sandwich();
            case "hotdog": return new HotDog();
            default: return null; 
        }
    } 

    public Drink getDrink(String type){
        switch(type){
            case "soda": return new Soda();
            default: return null;
        }
    }


}