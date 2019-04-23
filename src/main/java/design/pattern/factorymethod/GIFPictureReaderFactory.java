package design.pattern.factorymethod;

public class GIFPictureReaderFactory implements PictureReaderFactory {

    public PictureReader createPictureReader() {
        return new GIFPictureReader();
    }
    
}
