package design.pattern.builder;

public class MemoryPlayerPatternBuilder extends PlayPatternBuilder {

    private Player player = new Player();
    
    @Override
    public void buildMenu() {
    }

    @Override
    public void buildPlaylist() {
    }

    @Override
    public void buildWindow() {
        player.setWindow("记忆模式主窗体");
    }

    @Override
    public void buildProgressBar() {
        player.setProgressBar("记忆模式进度条");
    }

    @Override
    public void buildFavoriteList() {
        player.setProgressBar("记忆模式收藏条");
    }

    public boolean isShowMenu() {
        return false;
    }
    
    public boolean isShowPlayList() {
        return false;
    }
    
    public boolean isShowFavoriteList() {
        return true;
    }

    @Override
    public Player getPlayer() {
        return player;
    }

}
