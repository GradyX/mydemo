package design.pattern.command;

public abstract class Command {

    private BoardScreen boardScreen;
    
    public abstract void execute();

    public void setBoardScreen(BoardScreen boardScreen) {
        this.boardScreen = boardScreen;
    }
    
}
