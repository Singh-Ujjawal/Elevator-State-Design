package ElevatorDesign;

public class DoorOpenState implements ElevatorState {
    @Override
    public void requestFloor(int floor, Elevator elevator) {
        System.out.println("Cannot request a floor while doors are open. Close the doors first!");
    }

    @Override
    public void move(Elevator elevator) {
        System.out.println("Cannot move the elevator while doors are open!");
    }

    @Override
    public void openDoors(Elevator elevator) {
        System.out.println("Doors are already open!");
    }

    @Override
    public void closeDoors(Elevator elevator) {
        System.out.println("Doors closed!");
        elevator.setState(new IdleState());
    }
}
