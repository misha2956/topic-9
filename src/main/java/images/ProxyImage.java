package images;

import lombok.Getter;

public class ProxyImage implements Image {
    private final @Getter
    String filename;
    private final RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
        realImage = new RealImage(filename);
    }

    @Override
    public void display() throws ImageNotLoadedException {
        realImage.loadFromDisk();
        realImage.display();
    }
}
