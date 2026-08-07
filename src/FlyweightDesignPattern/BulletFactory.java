package FlyweightDesignPattern;

import java.util.HashMap;

public class BulletFactory {

    private static HashMap<String, BulletType> map = new HashMap<>();

    public static BulletType getBulletType(String type) {

        if (!map.containsKey(type)) {

            if (type.equals("AK47")) {

                map.put(type,
                        new BulletType(
                                "Black",
                                50,
                                300,
                                300));
            }

            else if (type.equals("M416")) {

                map.put(type,
                        new BulletType(
                                "Gray",
                                45,
                                280,
                                300));
            }

        }

        return map.get(type);
    }

}
