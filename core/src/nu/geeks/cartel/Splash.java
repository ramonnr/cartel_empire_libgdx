package nu.geeks.cartel;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by roddan on 11/29/2015.
 */
public class Splash implements Screen{

    private Sprite splash;
    private SpriteBatch batch; //ett tomt papper
//	private TweenManager tweenManager;

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

//		tweenManager.update(delta);

        batch.begin();
        splash.draw(batch);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {
		batch = new SpriteBatch();

        Texture splashTexture = new Texture(Gdx.files.internal("splashsmall.png"));
		splash = new Sprite(splashTexture);

		splash.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());



        GameHandler.changeScreen("MainMenu", 0);

    }

    @Override
    public void hide() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void dispose() {
        batch.dispose();
    }


}
