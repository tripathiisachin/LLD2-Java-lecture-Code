package Query.Database;

import javax.management.Query;

public class MongoDatabase implements database {

    @Override
    public Query createQuery() {
        return new Query();
    }

}