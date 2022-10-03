/**
 * The Bicycle Class.
 *
 * By:      Mr. Coxall
 * Version: 1.0
 * Since:   2020-01-01
 */

public class Bicycle {
    /**
     * the number of revolutions of the peddles per minute
    */
    int cadence;

    /**
     * what gear the bike is in
    */
    int gear;

    /**
     * the current speed of the bike
    */
    int speed;

    /**
    * The applyBrake() function.
    *
    * @param decrement -  how much to slow down
    */
    public void applyBrake(int decrement) {
        this.speed -= decrement;
    }
}
