package designPattern.fatoryPattern;

import java.util.Scanner;

public class EnemyShipTesting {
    public static void main(String[] args) {
        EnemyShipFactory enemyShipFactory=new EnemyShipFactory();
        EnemyShip enemyShip=null;
        Scanner userInput=new Scanner(System.in);
        System.out.print("What type of ship? (U / R / B)");
        if (userInput.hasNextLine()){
            String typeOfShip = userInput.nextLine();

            enemyShip = enemyShipFactory.makeEnemyShip(typeOfShip);
            if(enemyShip != null){

                doStuffEnemy(enemyShip);

            } else System.out.print("Please enter U, R, or B next time");

        }

//        EnemyShip enemyShip=null;
//        // Old way of creating objects
//        // When we use new we are not being dynamic
//
//        EnemyShip ufoShip = new UFOEnemyShip();
//
//        doStuffEnemy(ufoShip);
//
//        System.out.print("\n");
//
//        // -----------------------------------------
//
//        // This allows me to make the program more dynamic
//        // It doesn't close the code from being modified
//        // and that is bad!
//
//        // Defines an input stream to watch: keyboard
//        Scanner userInput = new Scanner(System.in);
//
//        String enemyShipOption = "";
//
//        System.out.print("What type of ship? (U or R)");
//
//        if (userInput.hasNextLine()){
//
//            enemyShipOption = userInput.nextLine();
//
//        }
//
//        if (enemyShipOption .equals("U")){
//
//            enemyShip = new UFOEnemyShip();
//
//
//        } else
//
//        if (enemyShipOption.equals("R")){
//
//            enemyShip = new RocketEnemyShip();
//
//        } else {
//
//            enemyShip = new BigUFOEnemyShip();
//
//        }
//
//        doStuffEnemy(enemyShip);
//
    }

    // Executes methods of the super class

    public static void doStuffEnemy(EnemyShip anEnemyShip){

        anEnemyShip.displayEnemyShip();

        anEnemyShip.followHeroShip();

        anEnemyShip.enemyShipShoot();

    }

}
