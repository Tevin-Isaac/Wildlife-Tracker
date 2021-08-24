import org.sql2o.*;
import java.net.URI;
import java.net.URISyntaxException;

public class DB {
    public static Sql2o sql2o;

    static {

        try {
            URI dbUri;
            if (System.getenv("DATABASE_URL") == null) {
                dbUri = new URI("postgres://ec2-18-235-45-217.compute-1.amazonaws.com:5432/d44flrup4mfkeu");
//                dbUri = new URI("postgres://localhost:5432/wildlife_tracker");

            } else {
                dbUri = new URI(System.getenv("DATABASE_URL"));
            }

            int port = dbUri.getPort();
            String host = dbUri.getHost();
            String path = dbUri.getPath();
//            String username = (dbUri.getUserInfo() == null) ? "tevin" : dbUri.getUserInfo().split(":")[0];
            String username = (dbUri.getUserInfo() == null) ? "tssrzehvcomwew" : dbUri.getUserInfo().split(":")[0];
//            String password = (dbUri.getUserInfo() == null) ? "index" : dbUri.getUserInfo().split(":")[1];
            String password = (dbUri.getUserInfo() == null) ? "0550b8bc76bb53081fce5ce6adb09ccc8bb50761eb2490b8e147eaf368e748da" : dbUri.getUserInfo().split(":")[1];

            sql2o = new Sql2o("jdbc:postgresql://" + host + ":" + port + path, username, password);
        } catch (URISyntaxException ignored) {
        }
    }
}
