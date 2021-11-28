package Factory;

import Model.*;
import Model.Enum.CargoWeightSize;

public abstract class DeliverFactory {

    public static Transport requestDelivery(String deliveryType, double orderWeight) {
        if("SEA".equals(deliveryType)) {
            return IsBIG(deliveryType, orderWeight) ? new DeliverShipBigCargo(orderWeight) :
                    new DeliverShipSmallCargo(orderWeight);
        }if("EARTH".equals(deliveryType)) {
            return IsBIG(deliveryType, orderWeight) ? new DeliverTruckBigCargo(orderWeight) :
                    new DeliverTruckSmallCargo(orderWeight);
        } else {
            throw new RuntimeException("Invalid delivery type!!");
        }
    }

    private static boolean IsBIG(String deliveryType, double orderWeight) {
        if("SEA".equals(deliveryType)) {
            verifyExceedLimitWeight(deliveryType, orderWeight);
            return orderWeight > CargoWeightSize.SEA_BIG_MIN_KG_DELIVER.value() ? true : false;
        } else {
            verifyExceedLimitWeight(deliveryType, orderWeight);
            return orderWeight > CargoWeightSize.EARTH_BIG_MIN_KG_DELIVER.value() ? true : false;
        }
    }

    private static void verifyExceedLimitWeight(String deliveryType, double orderWeight) {
        if(orderWeight<1) {
            throw new RuntimeException("Invalid order weight: too much small!");
        }
        if("SEA".equals(deliveryType)) {
            if(orderWeight > CargoWeightSize.SEA_BIG_MAX_KG_DELIVER.value()) {
                throw new RuntimeException(" Invalid order weight: too much bigger!");
            }
        } else {
            if(orderWeight > CargoWeightSize.EARTH_BIG_MAX_KG_DELIVER.value()) {
                throw new RuntimeException(" Invalid order weight: too much bigger!");
            }
        }
    }
}
