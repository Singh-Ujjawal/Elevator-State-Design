package ElevatorDesign;

public interface ElevatorState {
    void requestFloor(int floor, Elevator elevator);
    void move(Elevator elevator);
    void openDoors(Elevator elevator);
    void closeDoors(Elevator elevator);
}
