package HotelMangementSystem;

import java.util.Date;
import java.util.List;

public class RoomBooking {
    int bookingId;
    Date startDate;
    int duration;
    BookingStatus bookingStatus;
    List<Guest> guestList;
    List<Room> roomList;
    BaseRoomCharge baseRoomCharge;
}
