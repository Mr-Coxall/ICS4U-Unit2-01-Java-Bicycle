/**
 * The Bicycle program implements an application that
 * uses the Bicycle Class.
 *
 * By:      Mr. Coxall
 * Version: 1.0
 * Since:   2020-01-01
 */

 /**
* This is the standard Main() class starting point.
*/
final class Main {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
	public static void main(final String[] args) {
		// use Bicycle class
		final Bicycle someBicycleVariable = new Bicycle();

		System.out.println("\nSet speed to 10.");
		someBicycleVariable.speed = 10;
    	System.out.println("The current speed is: " + 
		                    someBicycleVariable.speed);

    	System.out.println("Apply the brake with value 2.");
    	someBicycleVariable.applyBrake(2);
    	System.out.println("The new speed is: " + someBicycleVariable.speed);

        System.out.println("\nDone.");
	}
}
