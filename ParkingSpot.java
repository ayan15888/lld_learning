import enums.VehicleType;

import java.util.*;

public class ParkingSpot {
    private int id;
    private VehicleType type;
    private boolean occupied;

    public ParkingSpot(int id,VehicleType type,boolean occupied){
        this.id = id;
        this.type = type;
        this.occupied = occupied;
    }

    public int getId(){
        return id;
    }

    public VehicleType getType(){
        return type;
    }

    public boolean isOccupied(){
        return occupied;
    }

    void park(){
        occupied = true;
    }
    void unpark(){
        occupied = false;
    }
}