package Project;

import Project.Model.MoveDirection;
import Project.OptionsParser;

public class World {

     static void  main(String[] args) {
        for(String arg: args){
            System.out.println("1." + arg);
        }
        System.out.println("Start");
        run(OptionsParser.parser(args));
        System.out.println(("Stop"));
    }

    public static void run(MoveDirection[] directions){
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
