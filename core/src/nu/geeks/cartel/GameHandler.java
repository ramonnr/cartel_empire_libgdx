package nu.geeks.cartel;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

/**
 * Created by roddan on 11/29/2015.
 */
public class GameHandler {
    private static int levelStage;

    /**
     * Navigates the game.
     * @param type Chooses the type of screen.
     * @param levelStage Sets the current level.
     */
    public static void changeScreen(String type, int levelStage) {
        setLevelStage(levelStage);

        if (type.equals("Splash")){
            ((Game) Gdx.app.getApplicationListener()).setScreen(new Splash());
        }

        if (type.equals("PlayScreen")){
            ((Game) Gdx.app.getApplicationListener()).setScreen(new PlayScreen());
        }




    }
    public static int getLevelStage() {
        return levelStage;
    }


    public static void setLevelStage(int levelStage) {
        GameHandler.levelStage = levelStage;
    }
}
