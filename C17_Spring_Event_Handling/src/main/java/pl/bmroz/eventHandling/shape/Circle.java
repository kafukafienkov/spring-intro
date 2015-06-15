package pl.bmroz.eventHandling.shape;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import pl.bmroz.eventHandling.events.DrawEvent;

import javax.annotation.Resource;

/**
 * author: Bartek
 */

@Component
public class Circle implements Shape, ApplicationEventPublisherAware {

    private Point centre;
    private ApplicationEventPublisher publisher;
    @Autowired
    private MessageSource messageSource;

    @Override
    public void draw() {
        System.out.println("####" + this.messageSource.getMessage("drawing.circle", null, "Default message", null));
        System.out.println("@@@@" + this.messageSource.getMessage("drawing.point",      // now we are getting a message with 2 values
                new Object[]{centre.getX(), centre.getY()}, "Default message", null));   // so we create an object to hold them
        DrawEvent drawEvent = new DrawEvent(this);
        publisher.publishEvent(drawEvent);
        //TODO publisher not printing info about event
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

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
}
