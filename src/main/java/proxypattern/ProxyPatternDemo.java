package proxypattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        RealImage realImage = new RealImage("roflan.png");
        ProxyImage proxyImage = new ProxyImage(realImage);

        proxyImage.display();
        proxyImage.loadImage();
        proxyImage.display();
        // If image is not needed anymore
        proxyImage.clearImage();
        proxyImage.display();
    }
}
