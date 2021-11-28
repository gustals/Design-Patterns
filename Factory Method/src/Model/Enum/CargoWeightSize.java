package Model.Enum;

public enum CargoWeightSize {
    SEA_SMALL_MIN_KG_DELIVER(1),
    SEA_SMALL_MAX_KG_DELIVER(49),
    SEA_BIG_MIN_KG_DELIVER(50),
    SEA_BIG_MAX_KG_DELIVER(200),

    EARTH_SMALL_MIN_KG_DELIVER(1),
    EARTH_SMALL_MAX_KG_DELIVER(49),
    EARTH_BIG_MIN_KG_DELIVER(50),
    EARTH_BIG_MAX_KG_DELIVER(200);

    private final double value;

    CargoWeightSize (double value){
        this.value = value;
    }
    public double value(){
        return value;
    }
}
