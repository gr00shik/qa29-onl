package tms.lesson9;

import tms.lesson9.domain.Animal;

public class MainApp {

    public static void main(String[] args) {

        byte test = 10;

        System.out.println((float) test);

        Animal smLab1 = new SmallLabrador("Chubik");

        smLab1.eat();
        smLab1.move();

        Object smLab2 = new SmallLabrador("Chubik");

        System.out.println(smLab1.equals(smLab2));

//        SmallLabrador test = (SmallLabrador) smLab2;



//        dog.move();
//
//        dog.eat();
//
//        dog.playBall();
//
//        dog.test();
//
//        dog.testPublic();


    }

}
