import javax.annotation.Resource;

/**
 * author: Bartek
 */
public class Circle implements Shape {

    private Point centre;

    public Point getCentre() {
        return centre;
    }

    @Resource        // now Spring is looking for a bean having same name as member variable - centre
    public void setCentre(Point centre) {
        this.centre = centre;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle ...");
        System.out.println("Circle point is: " + centre.getX() + " " + centre.getY());
    }
}
