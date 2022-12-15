package designPattern.strategyPattern;

public class Animal {
    public Flys flyingType;
    private String name;
    private double height;
    private int weight;
    private String favFood;
    private double speed;
    private String sound;

    /**
     * Instead of using an interface in a traditional way
     * we use an instance variable that is a subclass of the Flys interface.
     * nimal doesn't care what flyingType does, it just knows the behavior is available to its subclasses
     * This is known as Composition : Instead of inheriting an ability through inheritance the class is composed with Objects with the right ability
     * Composition allows you to change the capabilities of objects at run time!
     */

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int newWeight) {
        if (newWeight > 0) {
            weight = newWeight;
        } else {
            System.out.println("Weight must be bigger than 0");
        }
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String newFavFood) {
        favFood = newFavFood;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double newSpeed) {
        speed = newSpeed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String newSound) {
        sound = newSound;
    }

    /**
     * You don't want to add methods to the super class.
     * You need to separate what is different between subclasses and the super class
     *  public void fly(){
     *         System.out.println("I'm flying");
     *     }
     */

    public String tryToFly() {
        return flyingType.fly();
    }

    public void setFlyingAbility(Flys newFlyType) {
        flyingType = newFlyType;
    }
}

