package ElevatorDesign;

public class IdleState implements ElevatorState {
    @Override
    public void requestFloor(int floor, Elevator elevator) {
        if(floor < elevator.getMinFloor() || floor > elevator.getMaxFloor()) {
            System.out.println("Invalid floor requested!");
        }
        else {
            if(floor==elevator.getCurrentFloor()) {
                System.out.println("Same floor requested!");
            }
            else if(floor > elevator.getCurrentFloor()) {
                System.out.println("Request for upper floor!");
                elevator.setTargetFloor(floor);
                elevator.setState(new MovingUpState());
            }
            else {
                System.out.println("Request for lower floor!");
                elevator.setTargetFloor(floor);
                elevator.setState(new MovingDownState());
            }
        }
    }

    @Override
    public void move(Elevator elevator) {
        System.out.println("Elevator is idle. Request a floor first!");
    }

    @Override
    public void openDoors(Elevator elevator) {
        elevator.setState(new DoorOpenState());
        System.out.println("Doors opened!");
    }

    @Override
    public void closeDoors(Elevator elevator) {
        System.out.println("Doors are already closed!");
    }
}
