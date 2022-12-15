package designPattern.abstractFactoryPattern;

public class UFOBossEnemyShip extends EnemyShip{
    EnemyShipFactory shipFactory;

    // The enemy ship required parts list is sent to
    // this method. They state that the enemy ship
    // must have a weapon and engine assigned. That
    // object also states the specific parts needed
    // to make a Boss UFO versus a Regular UFO

    public UFOBossEnemyShip(EnemyShipFactory shipFactory){

        this.shipFactory = shipFactory;

    }

    // EnemyShipBuilding calls this method to build a
    // specific UFOBossEnemyShip
    @Override
    void makeShip() {
        // TODO Auto-generated method stub

        System.out.println("Making enemy ship " + getName());

        // The specific weapon & engine needed were passed in
        // shipFactory. We are assigning those specific part
        // objects to the UFOBossEnemyShip here

        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();
    }
}
