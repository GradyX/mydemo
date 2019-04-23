package design.pattern.factorymethod;

public class client {

    public static void main(String []args) {
        PictureReaderFactory factory = new GIFPictureReaderFactory();
        PictureReader reader = factory.createPictureReader();
        reader.readPicture(null);
    }
    
}
