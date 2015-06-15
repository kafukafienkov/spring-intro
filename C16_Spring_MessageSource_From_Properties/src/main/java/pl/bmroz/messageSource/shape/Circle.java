package pl.bmroz.messageSource.shape;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * author: Bartek
 */

@Component
public class Circle implements Shape {

    private Point centre;
    @Autowired
    private MessageSource messageSource;

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public Point getCentre() {
        return centre;
    }

    @Resource
    public void setCentre(Point centre) {
        this.centre = centre;
    }

    @Override
    public void draw() {
        System.out.println("####" + this.messageSource.getMessage("drawing.circle", null, "drawing.circle", null));
        System.out.println("@@@@" + this.messageSource.getMessage("drawing.point",      // now we are getting a message with 2 values
                new Object[]{centre.getX(), centre.getY()}, "drawing.point", null));   // so we create an object to hold them
//        System.out.println("Message from the Circle class is: " + this.messageSource.getMessage // now we can get the message in the class
//                ("greeting", null, "Default greeting from Circle", null));           // as well as it also has access to messageSource
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
