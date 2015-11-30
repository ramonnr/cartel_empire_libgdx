package nu.geeks.cartel;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.kotcrab.vis.ui.VisUI;
import com.kotcrab.vis.ui.widget.VisTable;

/**
 * Created by roddan on 11/29/2015.
 */
public class PlayScreen extends ApplicationAdapter implements Screen {

    Sprite bg;
    SpriteBatch sb;

    @Override
    public void show() {
        sb = new SpriteBatch();

        Texture splashTexture = new Texture(Gdx.files.internal("backgroundsmall.png"));
        bg = new Sprite(splashTexture);

        bg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        setupInput();
        VisUI.load();
        VisTable table = new VisTable(true);
        table.setName("test");
    }

    private void setupInput(){
        Gdx.input.setInputProcessor(new InputMultiplexer(new InputAdapter(){
            @Override
            public boolean touchDown(int screenX, int screenY, int pointer, int button) {

                System.out.println("Touch at x: " + screenX + ", y: " + screenY);

                return super.touchDown(screenX, screenY, pointer, button);
            }
        }));
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        sb.begin();
        bg.draw(sb);
        sb.end();
    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        sb.dispose();
        VisUI.dispose();
    }

}
