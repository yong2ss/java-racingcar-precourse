package racingcar.damain;

public class Car {
    private CarName carName;
    private Position position;

    public String getCarName() {
        return carName.getName();
    }

    public int getPosition() {
        return position.getPosition();
    }

    public Car(String carName) {
        this.carName = new CarName(carName);
        this.position = new Position();
    }

    public void tryoutMove() {
        position.tryoutMove();
    }
}
