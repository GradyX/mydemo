package design.pattern.builder;

public class SimplePlayerPatternBuilder extends PlayPatternBuilder {

    private Player player = new Player();
    
    @Override
    public void buildMenu() {
    }

    @Override
    public void buildPlaylist() {
    }

    @Override
    public void buildWindow() {
        player.setWindow("精简模式主窗体");
    }

    @Override
    public void buildProgressBar() {
        player.setProgressBar("精简模式进度条");
    }

    @Override
    public void buildFavoriteList() {
        
    }

    public boolean isShowMenu() {
        return false;
    }
    
    public boolean isShowPlayList() {
        return false;
    }
    
    public boolean isShowFavoriteList() {
        return false;
    }

    @Override
    public Player getPlayer() {
        return player;
    }

}
