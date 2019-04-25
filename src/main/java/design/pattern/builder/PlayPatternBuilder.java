package design.pattern.builder;

public abstract class PlayPatternBuilder {

    public abstract void buildMenu();
    public abstract void buildPlaylist();
    public abstract void buildWindow();
    public abstract void buildProgressBar();
    public abstract void buildFavoriteList();
    
    public abstract Player getPlayer();
    
    public boolean isShowMenu() {
        return true;
    }
    
    public boolean isShowPlayList() {
        return true;
    }
    
    public boolean isShowWindow() {
        return true;
    }
    
    public boolean isShowProgressBar() {
        return true;
    }
    
    public boolean isShowFavoriteList() {
        return false;
    }
    
}
