package HotelMangementSystem;

public class InRoomcharge implements BaseRoomCharge{
    private Double cost;
    BaseRoomCharge baseRoomCharge;
    @Override
    public Double getCost() {
        return baseRoomCharge.getCost() + cost;
    }
    public void  setCost(Double cost){
        this.cost = cost;
    }
}
