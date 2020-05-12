public class FastFoodFactory{

    public FastFood getFastFood(String type){
        switch(type){
            case "hamburger": return new Hamburger();
            case "sandwich": return new Sandwich();
            case "hotdog": return new HotDog();
            default: return null; 
        }
    } 

}