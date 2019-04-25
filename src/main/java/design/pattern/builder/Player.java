package design.pattern.builder;

public class Player {

    private String menu;
    private String playlist;
    private String window;
    private String progressBar;
    private String favoriteList;
    
    public String getProgressBar() {
        return progressBar;
    }
    public void setProgressBar(String progressBar) {
        this.progressBar = progressBar;
    }
    public String getFavoriteList() {
        return favoriteList;
    }
    public void setFavoriteList(String favoriteList) {
        this.favoriteList = favoriteList;
    }
    public String getMenu() {
        return menu;
    }
    public void setMenu(String menu) {
        this.menu = menu;
    }
    public String getPlaylist() {
        return playlist;
    }
    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }
    public String getWindow() {
        return window;
    }
    public void setWindow(String window) {
        this.window = window;
    }

}
