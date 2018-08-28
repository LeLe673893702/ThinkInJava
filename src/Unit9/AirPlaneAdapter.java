package Unit9;

public class AirPlaneAdapter implements Fly {
    private AirPlane airPlane;

    public AirPlaneAdapter(AirPlane airPlane) {
        this.airPlane = airPlane;
    }

    @Override
    public void fly() {
        airPlane.fly();
    }
}
