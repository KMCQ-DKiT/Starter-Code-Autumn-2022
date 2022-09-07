import java.util.Objects;

public class Room {

    String roomNum;
    int roomSize;

    public Room(String roomNum, int roomSize){
        this.roomNum=roomNum;
        this.roomSize=roomSize;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public int getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(int roomSize) {
        this.roomSize = roomSize;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNum='" + roomNum + '\'' +
                ", roomSize=" + roomSize +
                  '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        return roomSize == room.roomSize && Objects.equals(roomNum, room.roomNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomNum, roomSize);
    }
}
