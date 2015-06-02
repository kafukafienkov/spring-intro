import java.util.logging.Logger;

/**
 * author: Bartek
 */
public class Triangle {

    static Logger log = Logger.getLogger(Triangle.class.getName());

    public void draw() {
        System.out.println("Triangle drawn");
        log.info("A triangle has just been drawn");
    }
}
