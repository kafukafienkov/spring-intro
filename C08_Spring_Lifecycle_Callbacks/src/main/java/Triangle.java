import java.util.logging.Logger;

/**
 * author: Bartek
 */
public class Triangle {

    static Logger log = Logger.getLogger(Triangle.class.getName());

    private Point pointA;
    private Point pointB;
    private Point pointC;

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

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("InitializingBean init method called for Triangle");
//        log.info("InitializingBean init method called for Triangle");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("DisposableBeans destroy method called for the Triangle");
//        log.info("DisposableBeans destroy method called for the Triangle");
//    }

    public void myInit() {
        System.out.println("My method called for Triangle initialization");
    }

    public void cleanUp() {
        System.out.println("My method called for Triangle - cleanUp()");
    }
}
