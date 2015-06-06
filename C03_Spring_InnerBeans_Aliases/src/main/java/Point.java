import java.util.logging.Logger;

/**
 * author: Bartek
 */
public class Point {

    private int x;
    private int y;

    static Logger log = Logger.getLogger(Point.class.getName());

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
