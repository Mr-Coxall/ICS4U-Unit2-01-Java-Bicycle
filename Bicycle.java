public class Bicycle {
        
    // the Bicycle class has
    // three fields
    int cadence;
    int gear;
    int speed;
    
    // and 1 method
    public void applyBrake(int decrement) {
        this.speed -= decrement;
    }
}
