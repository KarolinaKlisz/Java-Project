package project;

import project.model.MoveDirection;

public class World {

     static void  main(String[] args) {
        for(String arg: args){
            System.out.println("1." + arg);
        }
        System.out.println("Start");
        run(OptionsParser.parser(args));
        System.out.println(("Stop"));
        Vector2d position1 = new Vector2d(1,2);
        System.out.println(position1);
        Vector2d position2 = new Vector2d(-2,1);
        System.out.println(position2);
        System.out.println(position1.add(position2));
        MapDirection direction = MapDirection.NORTH;
        System.out.println(direction);
        System.out.println(direction.next());
        System.out.println(direction.previous());
        System.out.println(direction.toUnitVector());


    }

    static void run(MoveDirection[] directions){
        for(MoveDirection direction: directions){
            switch(direction){
                case FORWARD -> System.out.println("Zwierzak idzie do przodu");
                case BACKWARD -> System.out.println("Zwierzak idzie do tylu");
                case LEFT -> System.out.println("Zwierzak skreca w lewo");
                case RIGHT -> System.out.println("Zwierzak skreca w prawo");
            }
        }
    }
}
