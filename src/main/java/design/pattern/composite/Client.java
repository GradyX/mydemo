package design.pattern.composite;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Window window, subWindow;
        window =  new Window();
        subWindow  = new Window();
        window.addComponent(subWindow);
        Component text, button, buttonOfSub, textOfSub;
        text = new Text();
        button = new Button();
        window.addComponent(text);
        window.addComponent(button);
        textOfSub = new Text();
        buttonOfSub = new Button();
        subWindow.addComponent(textOfSub);
        subWindow.addComponent(buttonOfSub);
        window.show();
        
    }

}
