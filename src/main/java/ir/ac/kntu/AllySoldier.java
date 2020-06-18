package ir.ac.kntu;


import java.util.ArrayList;

public class AllySoldier extends Soldier {
    private double viewField;


    public AllySoldier(String name, double health, double attack, double attackRange, double viewField) {
        super(name, health, attack, attackRange);
        this.viewField = viewField;
    }

    public double getViewField() {
        return viewField;
    }

    public void setViewField(double viewField) {
        this.viewField = viewField;
    }

    public boolean isInRange(double nowXOfInternal, double nowXOfEnemy, double nowYOfInternal, double nowYOfEnemy) {
        return Math.pow((nowXOfInternal - nowXOfEnemy), 2) + Math.pow((nowYOfInternal - nowYOfEnemy), 2) < Math.pow(viewField, 2);
    }

    public void game(double nowX, double nowY, ArrayList<EnemySoldier> enemySoldiers) {
        for (int i = 0; i < enemySoldiers.size(); i++) {
            if (isInRange(nowX, enemySoldiers.get(i).getCircle().getCenterX(), nowY, enemySoldiers.get(i).getCircle().getCenterY())) {
                while (enemySoldiers.get(i).getHealth() > 0) {
                    enemySoldiers.get(i).setHealth(enemySoldiers.get(i).getHealth() - 1);
                    if (enemySoldiers.get(i).getHealth() == 0){
                        enemySoldiers.remove(i);
                    }
                }
            }
        }


    }

}
