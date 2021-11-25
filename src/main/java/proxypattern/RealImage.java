package proxypattern;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

public class RealImage implements Image{
    private final String filename;
    @Getter
    @Setter
    private long bits;
    RealImage(String filename){
        this.filename = filename;
        this.bits = -1L;
    }

    @Override
    public void display() {
        System.out.println("Displaying image " + Long.toString(bits));
    }

    public void loadFromDisk(){
        System.out.println("Opening and reading " + filename + "...");
        Random random = new Random();
        bits = random.nextInt(1000000);
        bits += random.nextInt(100000);
        bits += random.nextInt(10000);
        bits += random.nextInt(1000);
    }
}
