package com.loal.flappybird.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.loal.flappybird.FlappyBird;
import com.loal.flappybird.sprites.Bird;

public class PlayState extends State{

    private Bird bird;

    protected PlayState(GameStateManager gameStateManager) {
        super(gameStateManager);

        bird = new Bird(50 ,320);
        camera.setToOrtho(false , FlappyBird.WIDTH / 2, FlappyBird.HEIGHT / 2);
    }

    @Override
    protected void handleInput() {
        if(Gdx.input.justTouched()){
            bird.jump();
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
        bird.update(dt);
    }

    @Override
    public void render(SpriteBatch spriteBatch) {
        spriteBatch.setProjectionMatrix(camera.combined);
        spriteBatch.begin();
        spriteBatch.draw(bird.getBird() ,bird.getPosition().x ,bird.getPosition().y);
        spriteBatch.end();
    }

    @Override
    public void dispose() {

    }
}
