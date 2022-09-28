package com.loal.flappybird.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.loal.flappybird.FlappyBird;

public class MenuState extends State{
    private Texture background,playButton;


    public MenuState(GameStateManager gameStateManager) {
        super(gameStateManager);

        //GENERA LA TEXTURA DEL BACKGROUND
        background = new Texture("bg.png");
        //TEXTURA PARA EL BOTTON
        playButton = new Texture("playbtn.png");
    }

    @Override
    protected void handleInput() {
        if (Gdx.input.justTouched()) {
            gsm.set(new PlayState(gsm));
            dispose();
        }
    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch spriteBatch) {
        spriteBatch.begin();
        //se oocupa para android
        spriteBatch.draw(background,0,0 , FlappyBird.WIDTH ,FlappyBird.HEIGHT);

        spriteBatch.draw(playButton ,(FlappyBird.WIDTH / 2) - (playButton.getWidth() / 2) ,(FlappyBird.HEIGHT / 2) - (playButton.getHeight() / 2));
        spriteBatch.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        playButton.dispose();
    }
}
