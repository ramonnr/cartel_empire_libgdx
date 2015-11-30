package nu.geeks.cartel;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.kotcrab.vis.ui.VisUI;

public class CartelMain extends Game {
	public static final String TITLE = "CartelEmpire", VERSION = "0.0";


	@Override
	public void create () {
//		Gdx.app.log(TITLE + ", version: " + VERSION, "create()");

		GameHandler.changeScreen("PlayScreen", 1);

	}

	@Override
	public void render () {
//		Gdx.app.log(TITLE, "render()");
		super.render();
	}

	public void pause(){
		Gdx.app.exit();
		super.pause();
	}

	public void dispose(){

		super.dispose();
	}

	public void resume(){
		super.resume();
	}

}
