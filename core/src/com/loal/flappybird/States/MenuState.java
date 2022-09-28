package com.loal.flappybird.States;

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

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch spriteBatch) {
        spriteBatch.begin();
        //se oocupa para android
        spriteBatch.draw(background,0,0 , FlappyBird.WIDTH ,FlappyBird.HEIGHT);
        spriteBatch.end();
    }

    @Override
    public void dispose() {

    }
}
