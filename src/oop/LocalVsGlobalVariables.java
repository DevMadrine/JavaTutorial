package oop;

import java.util.Random;
//local variables
class DiceRoller{
    DiceRoller(){
        Random random = new Random();
        int number = 0;
        roll(random, number);
    }

    void roll(Random random, int number){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}


//global variables
class DiceRoller1 {
    Random random;
    int number;

    DiceRoller1(){
        random = new Random();
        roll();
    }

    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }

}

public class LocalVsGlobalVariables{
    public static void main(String[]args){
        System.out.println("Local variable version");
        DiceRoller dice1 = new DiceRoller();
        System.out.println(dice1);

        System.out.println("Global variable version");
        DiceRoller1 dice2 = new DiceRoller1();
        System.out.println(dice2);
    }

}
