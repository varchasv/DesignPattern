package HotelMangementSystem;

public class RoomServiceCharge implements BaseRoomCharge{
    BaseRoomCharge baseRoomCharge;
    double cost;
    @Override
    public Double getCost() {
        return baseRoomCharge.getCost() + cost;
    }
    public void setCost(double cost){
        this.cost= cost;
    }
}
