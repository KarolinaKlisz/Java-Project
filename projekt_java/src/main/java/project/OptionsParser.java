package project;

import project.model.MoveDirection;

public class OptionsParser {
    public static MoveDirection[] parser(String[] args){

        int legalMoveCounter = 0;
        for (String arg : args) {
            if (arg.equals("f") || arg.equals("b") || arg.equals("l") || arg.equals("r"))
                legalMoveCounter++;
        }

        MoveDirection[] directions = new MoveDirection[legalMoveCounter];
        int i = 0;
        for(String arg: args){
            switch (arg){
                case "f":
                    directions[i] = MoveDirection.FORWARD;
                    i++;
                    break;
                case "b":
                    directions[i] = MoveDirection.BACKWARD;
                    i++;
                    break;
                case "r":
                    directions[i] = MoveDirection.RIGHT;
                    i++;
                    break;
                case "l":
                    directions[i] = MoveDirection.LEFT;
                    i++;
                    break;
                default:
                    break;
            }
        }
        return directions;
    }
}
