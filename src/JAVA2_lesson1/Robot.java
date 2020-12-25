package JAVA2_lesson1;

public class Robot implements Participant, Obstacle {


    @Override
    public void voice() {
        System.out.print("Робот:");
    }

    @Override
    public int limitRun() {
        return 10;
    }

    @Override
    public int limitJump() {
        return 1;
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
