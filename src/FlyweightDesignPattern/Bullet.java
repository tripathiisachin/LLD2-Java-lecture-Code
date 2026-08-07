package FlyweightDesignPattern;

public class Bullet {

    private int x;
    private int y;

    private BulletType bulletType;

    public Bullet(int x, int y, BulletType bulletType) {
        this.x = x;
        this.y = y;
        this.bulletType = bulletType;
    }

    public void display() {

        bulletType.display();

        System.out.println("Position : (" + x + "," + y + ")");
    }
}