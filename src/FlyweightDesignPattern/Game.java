package FlyweightDesignPattern;

public class Game {

    public static void main(String[] args) {

        BulletType ak47 = BulletFactory.getBulletType("AK47");

        Bullet b1 = new Bullet(10, 20, ak47);

        Bullet b2 = new Bullet(30, 50, ak47);

        Bullet b3 = new Bullet(80, 90, ak47);

        b1.display();

        System.out.println();

        b2.display();

        System.out.println();

        b3.display();

    }

}
