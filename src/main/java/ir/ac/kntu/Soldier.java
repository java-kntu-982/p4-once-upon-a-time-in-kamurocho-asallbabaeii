package ir.ac.kntu;

import javafx.scene.shape.Circle;

public class Soldier {
    private String name;
    private double health;
    private double attack;
    private double attackRange;
    private Circle circle;

    public Soldier(String name, double health, double attack, double attackRange) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.attackRange = attackRange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(double attackRange) {
        this.attackRange = attackRange;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", attackRange=" + attackRange +
                ", circle=" + circle +
                '}';
    }
}