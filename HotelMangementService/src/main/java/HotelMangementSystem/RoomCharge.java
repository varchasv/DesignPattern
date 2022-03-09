package HotelMangementSystem;

public class RoomCharge implements BaseRoomCharge{
    private RoomStyle roomStyle;
    private Double cost;
    @Override
    public Double getCost() {
        return cost;
    }
    public void setCost(double cost){
        if(roomStyle== RoomStyle.BASIC){
            this.cost = 1 + cost;
        }else if(roomStyle== RoomStyle.STANDARD){
            this.cost = 2 + cost;
        }else if(roomStyle== RoomStyle.DELUXE){
            this.cost = 3 + cost;
        }else{
            this.cost = 4 + cost;
        }
    }

    public void setRoomStyle (RoomStyle roomStyle){
        this.roomStyle=roomStyle;
    }
    public RoomStyle getRoomStyle (){
        return roomStyle;
    }
}
