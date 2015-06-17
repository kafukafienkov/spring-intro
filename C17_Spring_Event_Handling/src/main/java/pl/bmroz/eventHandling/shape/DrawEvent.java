package pl.bmroz.eventHandling.shape;

import org.springframework.context.ApplicationEvent;

/**
 * author: Bartek
 */
public class DrawEvent extends ApplicationEvent {

    public DrawEvent(Object source) {
        super(source);
    }

    public String toString() {
        return "Draw event has just occurred!";
    }
}
