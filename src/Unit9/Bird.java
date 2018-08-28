package Unit9;

public class Bird implements Fly {
    @Override
    public void fly() {
        System.out.println("Bird can fly");
    }
}

class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Eagle can fly");
    }
}

class Swallow extends Bird {
    @Override
    public void fly() {
        System.out.println("Swallow can fly");
    }
}


