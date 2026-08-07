package FlyweightDesignPattern;

public class BulletType {

    private String color;
    private int weight;
    private int damage;
    private int speed;


    public BulletType(String color, int weight, int damage, int speed) {
        this.color = color;
        this.weight = weight;
        this.damage = damage;
        this.speed = speed;
    }

    public void display() {
        System.out.println("Color : " + color);
        System.out.println("Weight : " + weight);
        System.out.println("Damage : " + damage);
        System.out.println("Speed : " + speed);
    
    }
}