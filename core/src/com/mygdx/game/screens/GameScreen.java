package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

/**
 * Created by Lluis_2 on 15/02/2017.
 */

public class GameScreen implements Screen {
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor (1,0,0,1); // Carrega color vermell al buffer
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); // Indica que està habilitat per escriure colors
        Gdx.app.log ("fps", Double.toString (1/delta));

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
