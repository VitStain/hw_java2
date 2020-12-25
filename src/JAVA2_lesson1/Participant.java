package JAVA2_lesson1;

public interface Participant {
    int limitRun();
    int limitJump();

    void voice();

    default void run() {
        System.out.println(" бегаю");
    }
    default void jump() {
        System.out.println(" прыгаю");
    }

    default int setLengthTreadmill() {
        return 0;
    }

    default int setHeightWall() {
        return 0;
    }

    default Treadmill treadmill() {
        return null;
    }
    default Wall wall() {
        return null;
    }


    default void passingTreadmill(Treadmill treadmill) {
        if (setLengthTreadmill() > 0 && setLengthTreadmill() <= limitRun()) {
            voice();
            System.out.println(" успешно пробежал " + setLengthTreadmill() + "м");
        } else {
            voice();
            System.out.println(" расстояние " + setLengthTreadmill() + "м за пределами моих способностей бегать. Могу только " + limitRun() + "м");
        }
    }

    default void passingWall(Wall wall) {
        if (setHeightWall() > 0 && setHeightWall() <= limitJump()) {
            voice();
            System.out.println(" успешно прыгнул " + setHeightWall() + "м");
        } else {
            voice();
            System.out.println(" высота " + setHeightWall() + "м за пределами моих способностей прыгать. Могу только " + limitJump() + "м");
        }
    }

    default boolean passingObstacle(Obstacle obstacle) {
        if (setLengthTreadmill() > limitRun() || setHeightWall() > limitJump()) {
            voice();
            System.out.println(" не могу преодолеть препятствие, дальше не могу идти.");
            return false;
        } else {
            voice();
            System.out.println(" успешно прошел!");
            return true;
        }
    }

}



