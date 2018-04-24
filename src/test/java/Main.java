import com.codingame.game.ThibaudPlayer;
import com.codingame.gameengine.runner.GameRunner;

public class Main {
    public static void main(String[] args) {

        GameRunner gameRunner = new GameRunner();

        if (args.length < 2)
            return;

        //for (int i = 1; i < args.length; ++i)
        //    System.out.println(args[i]);


        // Adds as many player as you need to test your game
        //gameRunner.addAgent(Level1Player.class);
        //gameRunner.addAgent(ThibaudPlayer.class);

        //gameRunner.addCommandLinePlayer("python3 /home/user/player.py");
        //System.out.println(args[0]);
        //System.out.println(args[0]);
        //gameRunner.addAgent(CommandLinePlayerAgent(args[0]));
        gameRunner.addAgent(args[0]);
        gameRunner.addAgent(args[1]);
        //gameRunner.addAgent(Level1Player.class);

        gameRunner.start();
    }
}
