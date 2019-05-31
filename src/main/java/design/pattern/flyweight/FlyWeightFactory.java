package design.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {

    private FlyWeightFactory flyWeightFactory = new FlyWeightFactory();
    
    private FlyWeightFactory() {
        
    }
    
    public FlyWeightFactory getFlyWeightFactory() {
        return flyWeightFactory;
    }
    
    private Map<String, Media> medias = new HashMap<String, Media>();
    
    public Media getMedia(String name, String type) throws Exception{
        String mediaName = type + "-" + name;
        Media addMedia = null;
        if((addMedia = medias.get(mediaName)) != null) {
            return addMedia;
        }
        else {
            switch(type) {
                case "1":
                    addMedia = new Pictrue();
                    break;
                case "2":
                    addMedia = new Cartoon();
                    break;
                case "3":
                    addMedia = new Video();
                    break;
                default:
                    throw new Exception("不存在此种类型");
            }
            medias.put(mediaName, addMedia);
            return addMedia;
        }
    }

}
