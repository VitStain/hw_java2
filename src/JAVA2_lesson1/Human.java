package JAVA2_lesson1;

public class Human implements Participant, Obstacle {

    @Override
    public void voice() {
        System.out.print("Человек:");
    }

    @Override
    public int limitRun() {
        return 100;
    }

    @Override
    public int limitJump() {
        return 2;
    }

    @Override
    public int setLengthTreadmill() {
        return lengthTreadmill;
    }

    @Override
    public int setHeightWall() {
        return heightWall;
    }

}
