import java.lang.reflect.Type;
import java.util.*;

import enums.VehicleType;
class Vehicle {
    private String number;
    private VehicleType type;
    Vehicle (String number , VehicleType type){
        this.number = number;
        this.type = type;
    }

    public String getNumber(){
        return number;
    }

    public VehicleType getType(){
        return type;
    }
}