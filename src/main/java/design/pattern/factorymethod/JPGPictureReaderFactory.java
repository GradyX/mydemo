package design.pattern.factorymethod;

public class JPGPictureReaderFactory implements PictureReaderFactory {

    public PictureReader createPictureReader() {
        return new JPGPictureReader();
    }
    
}
