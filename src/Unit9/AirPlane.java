package Unit9;

public class AirPlane implements Fly {
    @Override
    public void fly() {
        System.out.println("AirPlane can fly");
    }
}

class Helicopter extends AirPlane {
    @Override
    public void fly() {
        System.out.println("Helicopter can fly");
    }
}

class Fighter extends AirPlane {
    @Override
    public void fly() {
        System.out.println("Fighter can fly");
    }
}
