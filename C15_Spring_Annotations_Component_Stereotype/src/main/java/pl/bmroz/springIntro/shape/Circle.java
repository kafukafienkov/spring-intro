package pl.bmroz.springIntro.shape;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * author: Bartek
 */

@Component              // this tells Spring that this class is a bean, it is equal to declaration of a bean in XML
// but all the beans of this class will have only one behavior not as in case of previous
// XML file where bean had 3 different - pointA B and C
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
        Class c = this.getClass();
        System.out.println("Package is: " + c.getPackage());
        System.out.println("Drawing a circle ...");
        System.out.println("pl.bmroz.springIntro.shape.Circle point is: " + centre.getX() + " " + centre.getY());
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
