package ElevatorDesign;

public class Elevator {
    private ElevatorState state;
    private int currentFloor;
    private int targetFloor;
    private int maxFloor;
    private int minFloor;

    public Elevator(int minimumFloor, int maximumFloor) {
        this.minFloor = minimumFloor;
        this.maxFloor = maximumFloor;
        this.currentFloor = minimumFloor;
        this.state = new IdleState();
    }

    public void setState(ElevatorState state) {
        this.state = state;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getTargetFloor() {
        return targetFloor;
    }

    public void setTargetFloor(int targetFloor) {
        this.targetFloor = targetFloor;
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public int  getMinFloor() {
        return minFloor;
    }

    public void requestFloor(int floor) {
        state.requestFloor(floor,this);
    }

    public void move() {
        state.move(this);
    }

    public void openDoors() {
        state.openDoors(this);
    }

    public void closeDoors() {
        state.closeDoors(this);
    }

}
