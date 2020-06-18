package ir.ac.kntu;


import java.util.ArrayList;

public class EnemySoldier extends Soldier {
    public EnemySoldier(String name, double health, double attack, double attackRange) {
        super(name, health, attack, attackRange);
    }

    public void game(double nowX, double nowY, ArrayList<AllySoldier> allySoldiers, ArrayList<BuildingMaterials> materials) {
        while (true) {
            nowX += 10;
            for (AllySoldier allySoldier : allySoldiers) {

                if (Math.pow((nowX - allySoldier.getCircle().getCenterX()), 2) + Math.pow((nowY - allySoldier.getCircle().getCenterY()), 2) < 40) {
                    while (allySoldier.getHealth() > 0) {
                        allySoldier.setHealth(allySoldier.getHealth() - 1);
                    }
                } else {
                    for (BuildingMaterials material : materials) {
                        if (Math.pow(nowX - material.getRectangle().getX(), 2) + Math.pow(nowY - material.getRectangle().getY(), 2) < 40) {
                            while (material.getStrange() > 0) {
                                material.setStrange(material.getStrange() - 1);
                            }
                        }
                    }
                }
            }
        }

    }

}
