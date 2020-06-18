package ir.ac.kntu;

import java.awt.*;

public class BuildingMaterials {
    private double strange;
    private String name;
    private Rectangle rectangle;

    public BuildingMaterials(double strange, String name) {
        this.strange = strange;
        this.name = name;
    }

    public double getStrange() {
        return strange;
    }

    public void setStrange(double strange) {
        this.strange = strange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public String toString() {
        return "BuildingMaterials{" +
                "strange=" + strange +
                ", name='" + name + '\'' +
                ", rectangle=" + rectangle +
                '}';
    }
}
