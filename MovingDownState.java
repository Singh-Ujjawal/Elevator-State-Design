package ElevatorDesign;

public class MovingDownState implements ElevatorState {
    @Override
    public void requestFloor(int floor, Elevator elevator) {
        System.out.println("Cannot request another floor while moving!");
    }

    @Override
    public void move(Elevator elevator) {
        if(elevator.getCurrentFloor()!=elevator.getTargetFloor()){
            System.out.println("Elevator is moving down");
            elevator.setCurrentFloor(elevator.getCurrentFloor() - 1);
        }
        else {
            System.out.println("Reached target floor");
            elevator.setState(new DoorOpenState());
            System.out.println("Doors opened!");
        }
    }

    @Override
    public void openDoors(Elevator elevator) {
        System.out.println("Cannot open doors while elevator is moving!");
    }

    @Override
    public void closeDoors(Elevator elevator) {
        System.out.println("Elevator is moving; doors are already closed!");
    }
}
