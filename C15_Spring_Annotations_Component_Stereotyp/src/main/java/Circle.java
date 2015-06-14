import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
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

    @PostConstruct                  // initialized when the bean is about to initialize
    public void initializeCircle() {
        System.out.println("Init of the circle ...");
    }

    @PreDestroy                     // initialized when the bean is about to be destroyed
    public void destroyCircle() {
        System.out.println("Destruction of the circle ...");
    }
}
