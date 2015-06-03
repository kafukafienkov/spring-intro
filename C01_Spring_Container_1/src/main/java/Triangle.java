import java.util.logging.Logger;

/**
 * author: Bartek
 */
public class Triangle {

    static Logger log = Logger.getLogger(Triangle.class.getName());

    private String type;
    private int height;

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(int height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void draw() {
        System.out.println(getType() + " Triangle drawn of height: " + getHeight());
        log.info("A triangle has just been drawn");
    }
}
