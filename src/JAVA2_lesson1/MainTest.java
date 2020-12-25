package JAVA2_lesson1;

public class MainTest {
    public static void main(String[] args) {
//  1) Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
//  Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль)
        Human human = new Human();
        Cat cat = new Cat();
        Robot robot = new Robot();

        System.out.println("1-е задание:");
        human.voice();
        human.run();
        human.voice();
        human.jump();

        cat.voice();
        cat.run();
        cat.voice();
        cat.jump();

        robot.voice();
        robot.run();
        robot.voice();
        robot.jump();

//  2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать),
//  результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
        System.out.println("2-е задание:");
        Treadmill treadmill = new Treadmill();
        Wall wall = new Wall();

        human.passingTreadmill(treadmill);
        human.passingWall(wall);
        cat.passingTreadmill(treadmill);
        cat.passingWall(wall);
        robot.passingTreadmill(treadmill);
        robot.passingWall(wall);

//  3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
        System.out.println("3-е задание:");
        Participant[] participants = {human, cat, robot};
        Obstacle[] obstacles = {wall, treadmill};

        for (Participant participant : participants) {
            participant.passingWall(wall);
            participant.passingTreadmill(treadmill);
        }
//  4. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
//  Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
        System.out.println("4*-е задание:");
        for (int i = 0; i < participants.length; i++) {
            Participant[] p = participants;
            boolean passingResult;
            for (int j = 0; j < obstacles.length; j++) {
                Obstacle[] o = obstacles;
                passingResult = p[i].passingObstacle(o[j]);

                if (!passingResult) {
                    p[i].voice();
                    System.out.println(" я не прошел все препятствия");
                    break;
                }
            }
        }


    }
}


