package ch.viascom.hipchat.api.response;

import ch.viascom.hipchat.api.models.Room;
import ch.viascom.hipchat.api.response.models.GetAllRoomsResponseItem;
import lombok.Data;

import java.util.ArrayList;

/**
 * Created by patrickboesch on 12.04.16.
 */
@Data
public class GetAllRoomsResponse {
    private ArrayList<Room> items;
    private int startIndex;
    private int	maxResults;
}
