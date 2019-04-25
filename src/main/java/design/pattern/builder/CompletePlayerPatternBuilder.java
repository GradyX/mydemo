package design.pattern.builder;

public class CompletePlayerPatternBuilder extends PlayPatternBuilder {

    private Player player = new Player();
    
    @Override
    public void buildMenu() {
        player.setMenu("完整模式菜单");
    }

    @Override
    public void buildPlaylist() {
        player.setPlaylist("完整模式播放列表");
    }

    @Override
    public void buildWindow() {
        player.setWindow("完整模式主窗体");
    }

    @Override
    public void buildProgressBar() {
        player.setProgressBar("完整模式进度条");
    }

    @Override
    public void buildFavoriteList() {
        
    }

    public boolean isShowFavoriteList() {
        return false;
    }

    @Override
    public Player getPlayer() {
        return player;
    }

}
