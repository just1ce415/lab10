package proxypattern;

public class ProxyImage implements Image{
    private final RealImage realImage;

    ProxyImage(RealImage realImage){
        this.realImage = realImage;
    }
    @Override
    public void display() {
        if (realImage.getBits() == -1L){
            System.out.println("The image is not loaded.");
        } else {
            realImage.display();
        }
    }

    public void loadImage(){
        realImage.loadFromDisk();;
    }

    public void clearImage(){
        realImage.setBits(-1L);
    }
}
