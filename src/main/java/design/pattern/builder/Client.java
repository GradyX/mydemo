package design.pattern.builder;

public class Client {

    public static void main(String[] args) {
        PlayPatternBuilder builder = new CompletePlayerPatternBuilder();
        PlayerGeneratorDirector director = new PlayerGeneratorDirector();
        Player player = director.getPlayer(builder);
        System.out.println(player.getWindow());
        builder = new SimplePlayerPatternBuilder();
        player = director.getPlayer(builder);
        System.out.println(player.getWindow());
        builder = new MemoryPlayerPatternBuilder();
        player = director.getPlayer(builder);
        System.out.println(player.getWindow());
    }

}
