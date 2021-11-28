package Model;

import Model.Enum.CargoWeightSize;

public class DeliverTruckBigCargo implements Transport {

    private final String DELIVERY_TYPE = "BIG-TRUCK";
    private final double MIN_KG_DELIVER;
    private final double MAX_KG_DELIVER;

    private final double CARGO_KG;

    public DeliverTruckBigCargo(double cargo_kg) {
        CARGO_KG = cargo_kg;
        MIN_KG_DELIVER = CargoWeightSize.EARTH_BIG_MIN_KG_DELIVER.value();
        MAX_KG_DELIVER = CargoWeightSize.EARTH_BIG_MAX_KG_DELIVER.value();
    }

    @Override
    public void deliver() {
        System.out.println("###### START DELIVER #####");
        System.out.println("CARGO_KG: " + CARGO_KG);
        System.out.println("##### GENERAL DETAILS #####");
        System.out.println("DELIVERY_TYPE: " + DELIVERY_TYPE);
        System.out.println("MIN_KG_DELIVER: " + MIN_KG_DELIVER);
        System.out.println("MAX_KG_DELIVER: " + MAX_KG_DELIVER);
    }
}
