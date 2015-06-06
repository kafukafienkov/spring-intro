import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author: Bartek
 */
public class Runner {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        Triangle triangle = (Triangle) context.getBean("triangle-alias");
        triangle.draw();
    }
}
