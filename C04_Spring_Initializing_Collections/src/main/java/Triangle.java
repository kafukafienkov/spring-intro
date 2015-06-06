import java.util.List;
import java.util.logging.Logger;

/**
 * author: Bartek
 */
public class Triangle {

    private List<Point> points;

    static Logger log = Logger.getLogger(Triangle.class.getName());

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw() {

        for (Point point : points) {

            System.out.println("Point A = (" + point.getX() + "), and Point B = (" + point.getY() + ")");
        }

    }
}
