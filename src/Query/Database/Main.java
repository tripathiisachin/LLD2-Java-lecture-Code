package Query.Database;

public class Main {

    public static void main(String[] args) {

        MySQLDatabase database = new MySQLDatabase();

        MySQLQuery query = database.createQuery1();

        query.execute();

    }

}