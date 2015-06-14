import org.springframework.beans.factory.annotation.Required;

/**
 * author: Bartek
 */
public class Circle implements Shape {


    private Point centre;

    public Point getCentre() {
        return centre;
    }

    @Required
    public void setCentre(Point centre) {
        this.centre = centre;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle ...");
        System.out.println("Circle point is: " + centre.getX() + " " + centre.getY());
    }
}
