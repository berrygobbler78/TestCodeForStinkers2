public class Main { 
    public static void main(String[] args) {
        Pizza pizza = new Pizza(new String[] {"Pepperoni", "Mushrooms", "Grass"}, "Red sauce", new String[] {"Mozzerlla", "Cheddar", "Munster"}, "Thin crust", 'l');

        System.out.println(pizza.getPizzaCalories());
        // You can create variables and objects wihthout giving them a value
        Animal globert;
        int stinkMeter;

        // They can be assigned a value later
        globert = new Animal(100);
        stinkMeter = 100;

        /*
         * Creating an object is similar to creating a variable. You declare the type of the object, and you
         * create a new version of the constructor.
         */
        Animal gerald = new Animal(100);
        Cat hugeAlbert = new Cat(1000000, "Black cat");

        // You can create an object with different parameters using the overloaded constructors.
        Cat garfield = new Cat(1000, "Tabby", "Lasagna");

        System.out.println(garfield.gettypeOfCat());
        System.out.println(garfield.getWeight());
        System.out.println(garfield.getFavoriteFood());

        System.out.println(hugeAlbert.gettypeOfCat());
        System.out.println(hugeAlbert.getWeight());
        System.out.println(hugeAlbert.getFavoriteFood());
    }
}