package ir.ac.kntu;

public class MakeSoldier {
    public static AllySoldier goroSoldier() {
        return new AllySoldier("Goro Majima", 4000.0, 4500.0, 4.0, 3);
    }

    public static AllySoldier ryujiSoldier() {
        return new AllySoldier("Ryuji Goda", 5000.0, 5000.0, 2.0, 1.0);
    }

    public static AllySoldier daigoSoldier() {
        return new AllySoldier("Daigi dojima", 4000.0, 4000.0, 2, 1);
    }

    public static AllySoldier osamuSoldier() {
        return new AllySoldier("Osamu kashiwagi", 4000.0, 3000.0, 1.0, 2.0);
    }

    public static AllySoldier kaoraSoldier() {
        return new AllySoldier("Kaora Sayama", 4500.0, 4500.0, 4.0, 2.0);
    }

    public static AllySoldier makotoSoldier() {
        return new AllySoldier("Makoto Date", 4500.0, 1800.0, 3.0, 2.0);
    }

    public static AllySoldier taigaSoldier() {
        return new AllySoldier("Taiga Saejima", 7000.0, 5000.0, 1.0, 1.0);
    }

    public static AllySoldier futoshiSoldier() {
        return new AllySoldier("Futoshi Shimano", 4200.0, 4000.0, 1.0, 2.0);
    }

    public static AllySoldier soheiSoldier() {
        return new AllySoldier("Sohei Dojima", 3000.0, 3000.0, 1.0, 1.0);
    }

    public static AllySoldier ryoSoldier() {
        return new AllySoldier("Ryo Takashima", 3600.0, 3800.0, 1.0, 1.0);
    }

    public static AllySoldier shintaroSoldier() {
        return new AllySoldier("Shintaro Kazama", 4500.0, 4500.0, 1.0, 2.0);
    }

    public static AllySoldier jiroSoldier() {
        return new AllySoldier("Jiro Kawara", 5500.0, 3200.0, 3.0, 3.0);
    }

    public static EnemySoldier redSoldier() {
        return new EnemySoldier("Red soldier", 1000.0, 500.0, 50.0);
    }

    public static EnemySoldier graySoldier() {
        return new EnemySoldier("Gray soldier", 1000.0, 800.0, 1.0);
    }

    public static EnemySoldier yellowSoldier() {
        return new EnemySoldier("Yellow soldier", 800.0, 1800.0, 2.0);
    }

    public static EnemySoldier bossLevel1() {
        return new EnemySoldier("Boss level1", 8000.0, 5000.0, 1.0);
    }

    public static EnemySoldier bossLevel2() {
        return new EnemySoldier("Boss level2", 20000.0, 12000.0, 1.0);
    }


}
