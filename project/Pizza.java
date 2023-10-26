public class Pizza {
    private String[] toppings;
    private String[] cheese;

    private String sauce;
    private String crust;

    private char pizzaSize;

    public Pizza(String sauce, String[] cheese, String crust, char pizzaSize) {
        this.cheese = cheese;
        this.crust = crust;
        this.sauce = sauce;
        this.pizzaSize = pizzaSize;
    }

    public Pizza(String[] toppings, String sauce, String[] cheese, String crust, char pizzaSize) {
        this.cheese = cheese;
        this.crust = crust;
        this.sauce = sauce;
        this.toppings = toppings;
        this.pizzaSize = pizzaSize;
    }

    public double getPizzaArea() {
        double pizzaDiameter;
        switch(pizzaSize) {
            case 's' :
                pizzaDiameter = 8.0;
                break;
            case 'm' : 
                pizzaDiameter = 11.5;
                break;
            case'l' : 
                pizzaDiameter = 24.7;
                break;
            default:
                pizzaDiameter = 0.5;    
                toppings = new String[] {"Grass"};
                break;
        }

        System.out.println((pizzaDiameter / 2) * (pizzaDiameter / 2) * Math.PI);

        return (pizzaDiameter / 2) * (pizzaDiameter / 2) * Math.PI;
    }
    
    public int getPizzaCalories() {
        int pizzaCalories = (sauce.length() + crust.length()) * 50;

        for (String cheesString : cheese) {
            pizzaCalories += cheesString.length() * 50;
        }

        if(toppings != null) {
            for (String toppingss : toppings) {
                pizzaCalories += toppingss.length() * 50;
            }
        }

        
        return pizzaCalories * (int) (Math.round(getPizzaArea()));
    }

    public void setCheese(String[] cheese) {
        this.cheese = cheese;
    }
    
    public String[] getCheese() {
        return cheese;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }
    
    public String getCrust() {
        return crust;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getSauce() {
        return sauce;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }

    public String[] getToppings() {
        return toppings;
    }

    public char getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(char pizzaSize) {
        this.pizzaSize = pizzaSize;
    }
}

