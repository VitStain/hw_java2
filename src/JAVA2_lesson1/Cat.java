package JAVA2_lesson1;

public class Cat implements Participant, Obstacle {

    @Override
    public void voice() {
        System.out.print("Кот: мяу, мяу,");
    }

    @Override
    public int limitRun() {
        return 100;
    }

    @Override
    public int limitJump() {
        return 3;
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
