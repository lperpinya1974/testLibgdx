package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.helpers.AssetManager;
import com.mygdx.game.screens.GameScreen;

public class MyGdxGame extends Game {
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {

		Gdx.app.log("LifeCyCle", "create");
        AssetManager.load();
        setScreen (new GameScreen());

	}

	@Override
	public void render () {
		super.render();
		Gdx.app.log("LifeCyCle", "render");
	}
	
	@Override
	public void dispose () {
		Gdx.app.log("LifeCyCle", "dispose");
	}

	@Override
	public void pause() {
		super.pause();
		Gdx.app.log("LifeCyCle", "pause");
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
		Gdx.app.log ("LifeCytcle", "resize(" + Integer.toString(width) + "," + Integer.toString(height)+")");
	}

	@Override
	public void resume() {
		super.resume();
		Gdx.app.log("LifeCyCle", "resume");
	}
}
