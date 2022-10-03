/**
 * The Bicycle Class.
 *
 * By:      Mr. Coxall
 * Version: 1.0
 * Since:   2020-01-01
 */
public class Bicycle {
    /*
     * the Bicycle class has 3 fields
    */
    int cadence;
    int gear;
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
