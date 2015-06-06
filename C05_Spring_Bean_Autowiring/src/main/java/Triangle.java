import java.util.logging.Logger;

/**
 * author: Bartek
 */
public class Triangle {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    static Logger log = Logger.getLogger(Triangle.class.getName());

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {

        System.out.println("Point A = (" + getPointA().getX() + "), and Point B = (" + getPointA().getY() + ")");
        System.out.println("Point A = (" + getPointB().getX() + "), and Point B = (" + getPointB().getY() + ")");
        System.out.println("Point A = (" + getPointC().getX() + "), and Point B = (" + getPointC().getY() + ")");


    }
}
