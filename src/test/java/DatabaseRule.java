import org.junit.rules.ExternalResource;
public class DatabaseRule extends ExternalResource {

//    @Override
//    protected void before() {
//        DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker", "tevin", "index");
//    }
//
//    @Override
//    protected void after() {
//        String deleteAnimalsQuery = "DELETE FROM animals *;";
//        String deleteEndangeredAnimalsQuery = "DELETE FROM endangered_animals *;";
//        String deleteSightingsQuery = "DELETE FROM sightings *;";
//        try(Connection con = DB.sql2o.open()) {
//            con.createQuery(deleteAnimalsQuery).executeUpdate();
//            con.createQuery(deleteEndangeredAnimalsQuery).executeUpdate();
//            con.createQuery(deleteSightingsQuery).executeUpdate();
//        }
//    }
}