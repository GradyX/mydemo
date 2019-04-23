package design.pattern.factorymethod;

public class GIFPictureReader implements PictureReader {

    @Override
    public void readPicture(Object picture) {
        System.out.println("read a GIF picture");
    }

}
