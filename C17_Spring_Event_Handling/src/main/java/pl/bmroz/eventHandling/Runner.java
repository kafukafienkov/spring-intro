package pl.bmroz.eventHandling;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.bmroz.eventHandling.shape.Shape;

/**
 * author: Bartek
 */
public class Runner {

    public static void main(String[] args) {

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");
        context.registerShutdownHook();     //only for desktop apps
        Shape shape = (Shape) context.getBean("circle");
        shape.draw();
        String message = context.getMessage("greeting", null, "Default message to be displayed", null);
        System.out.println("Message from the bean is: " + message);
    }
}
