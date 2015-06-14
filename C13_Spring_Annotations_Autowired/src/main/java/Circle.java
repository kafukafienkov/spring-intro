import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * author: Bartek
 */
public class Circle implements Shape {

    private Point centre;

    public Point getCentre() {
        return centre;
    }

    @Autowired
    @Qualifier("circleRelated")         //with @Qualifier we let Spring find bean by its <qualifier> tag
    public void setCentre(Point centre) {
        this.centre = centre;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle ...");
        System.out.println("Circle point is: " + centre.getX() + " " + centre.getY());
    }
}
