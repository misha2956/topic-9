import images.ImageNotLoadedException;
import images.ProxyImage;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        try {
            ProxyImage proxyImage = new ProxyImage("image.jpg");
            proxyImage.display();
        } catch (ImageNotLoadedException e) {
            e.printStackTrace();
        }
    }
}
