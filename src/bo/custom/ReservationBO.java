package bo.custom;

import dto.ReservationDTO;

/**
 * @author : Gihan Madhusankha
 * 2022-06-27 1:35 PM
 **/

public interface ReservationBO {
    String generateRoomIdByRoomType(String typeId, String type);

}