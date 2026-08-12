package Query.Database;

import javax.management.Query;

public class MySQLDatabase implements database {

    public MySQLQuery createQuery1() {
        return new MySQLQuery();
    }

    public Query createQuery() {
        
        throw new UnsupportedOperationException("Unimplemented method 'createQuery'");
    }

}