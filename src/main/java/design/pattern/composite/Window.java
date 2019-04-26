package design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Window implements Component {
    
    List<Component> components;
    
    public Window() {
        components = new ArrayList<Component>();
    }
    
    public void addComponent(Component componet) {
        components.add(componet);
    }

    @Override
    public void show() {
        System.out.println("show a window");
        for(int i = 0; i < components.size(); i++) {
            components.get(i).show();
        }
    }

}
