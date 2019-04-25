package design.pattern.builder;

public class PlayerGeneratorDirector {
    
    public Player getPlayer(PlayPatternBuilder playerPatternBuiler) {
        if(playerPatternBuiler.isShowMenu())
            playerPatternBuiler.buildMenu();
        if(playerPatternBuiler.isShowPlayList())
            playerPatternBuiler.buildPlaylist();
        if(playerPatternBuiler.isShowProgressBar())
            playerPatternBuiler.buildProgressBar();
        if(playerPatternBuiler.isShowWindow())
            playerPatternBuiler.buildWindow();
        if(playerPatternBuiler.isShowFavoriteList())
            playerPatternBuiler.buildFavoriteList();
        return playerPatternBuiler.getPlayer();
    }
    
}
