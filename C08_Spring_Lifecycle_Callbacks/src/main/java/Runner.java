import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author: Bartek
 */
public class Runner {

    public static void main(String[] args) {

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");
        context.registerShutdownHook();     //only for desktop apps
        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.draw();
    }
}
