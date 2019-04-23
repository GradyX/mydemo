package design.pattern.factorymethod;

public class JPGPictureReader implements PictureReader {

    @Override
    public void readPicture(Object picture) {
        System.out.println("read a JPG picture");
    }

}
