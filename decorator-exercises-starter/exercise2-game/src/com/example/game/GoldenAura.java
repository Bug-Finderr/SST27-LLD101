package com.example.game;

public class GoldenAura extends CharacterDecorator {
    public GoldenAura(Character character) {
        super(character);
    }

    @Override
    public void move() {
        System.out.println("[Golden Aura] Moving at speed " + getSpeed() + " with sprite " + getSprite());
        super.move();
    }

    @Override
    public void attack() {
        System.out.println("[Golden Aura] Attacking with damage " + getDamage() + " using sprite " + getSprite());
        super.attack();
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() + 2;
    }

    @Override
    public int getDamage() {
        return super.getDamage() + 2;
    }

    @Override
    public String getSprite() {
        return "Golden " + super.getSprite();
    }
    
}
