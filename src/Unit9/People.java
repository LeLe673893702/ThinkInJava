package Unit9;

public  class People implements  Help {
    @Override
    public void canSwim() {

    }

    @Override
    public void canFight() {

    }

    @Override
    public void canHelp() {

    }
}

interface Swim {
    void canSwim();
}


interface Fight {
    void canFight();
}

interface Help extends Swim, Fight {
    void canHelp();
}
