package ir.ac.kntu;

public class MakeMaterials {
    public static BuildingMaterials makeContainer() {
        return new BuildingMaterials(3000.0, "Container");
    }

    public static BuildingMaterials makeVan() {
        return new BuildingMaterials(6000.0, "Van");
    }

    public static BuildingMaterials makeTruck() {
        return new BuildingMaterials(5000.0, "Truck");
    }

}
