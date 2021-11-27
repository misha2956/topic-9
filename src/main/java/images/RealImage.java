package images;

import lombok.Getter;

public class RealImage implements Image {
    private final @Getter
    String filename;
    private boolean loaded = false;

    public RealImage(String filename) {
        this.filename = filename;
    }

    public void loadFromDisk() {
        System.out.println("Loading Image...");
        loaded = true;
    }

    @Override
    public void display() throws ImageNotLoadedException {
        if (!loaded) {
            throw new ImageNotLoadedException("Please load the image before displaying it.");
        }
        System.out.println(filename);
    }
}
