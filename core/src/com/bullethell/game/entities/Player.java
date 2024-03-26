package com.bullethell.game.entities;

import com.bullethell.game.controllers.IControllable;
import com.bullethell.game.controllers.IShootable;
import com.bullethell.game.systems.AssetHandler;

public class Player extends Entity implements IControllable, IShootable {
    boolean isSlow = false;
    private static final float HITBOX_WIDTH = 30;
    private static final float HITBOX_HEIGHT = 30;

    public Player(float x, float y, AssetHandler assetHandler) {
        super(x, y, "player", assetHandler);
//        hitbox.setWidth(HITBOX_WIDTH);
//        hitbox.setHeight(HITBOX_HEIGHT);
//
//
//        hitbox.setPosition(x + sprite.getWidth() / 2 - HITBOX_WIDTH / 2,
//                y + sprite.getHeight() / 2 - HITBOX_HEIGHT / 2);
    }

    public void update () {
        super.update();
    }

    @Override
    public void shoot() {

    }

    @Override
    public void moveUp(float speedFactor) {
        this.position.y += speedFactor;
    }

    @Override
    public void moveDown(float speedFactor) {
        this.position.y -= speedFactor;
    }

    @Override
    public void moveLeft(float speedFactor) {
        this.position.x -= speedFactor;
    }

    @Override
    public void moveRight(float speedFactor) {
        this.position.x += speedFactor;
    }


    @Override
    public void slowMode(boolean isSlow) {
        this.isSlow = isSlow;
    }
}
