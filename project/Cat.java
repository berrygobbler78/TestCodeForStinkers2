
/*
 * the extends keyword refers to the parent class Animal. We can use this keyword in order to give the 
 * "children" of a class Animal the same attributes as the parent class. weight is an attribute of the 
 * parent class Animal, while typeOfCat is an attribute of the child class Cat. 
 */
public class Cat extends Animal {
    /* 
    * variables are set as private variables, instead of having public variables which would be confusing 
    * when classes can have multiple variables. Instead, we can use get and set methods to access the 
    * variables.
    */
    private String typeOfCat;
    private String favoriteFood;

    /* 
    * The constructor of the class Cat is called when an object of the class Cat is created. This is like the
    * main method of the class Cat.
    */
    public Cat(double weight, String typeOfCat) {
        /* 
        * The super keyword refers to the constructor of the parent class Animal. It is used to call the 
        * constructor of the parent class Animal with the variables we give it. 
        */
        super(weight);

        /* 
        * The this. keyword refers to the variable within "this" class. In this case it's refering to the 
        * String typeOfCat, created within this class. 
        */
        this.typeOfCat = typeOfCat;
    }

    /* 
    * You can overload constructers of a class by creating a constructure with different parameters. This can
    * give you option of what kind of constructor you want to use. 
    */
    public Cat(double weight, String typeOfCat, String favoriteFood) {
        super(weight);
        this.typeOfCat = typeOfCat;
        this.favoriteFood = favoriteFood;
    }
    /* 
    * get and set methods for variables are used within objects to get and set variables, instead of having
    * public variables 
    */
    public void settypeOfCat(String typeOfCat) {
        this.typeOfCat = typeOfCat;
    }

    public String gettypeOfCat() {
        return typeOfCat;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }
}
