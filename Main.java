class Main {
	public static void main(String[] args) {
		// use Bicycle class
		Bicycle someBicycleVariable = new Bicycle();
		
		System.out.println("\nSet speed to 10.");
		someBicycleVariable.speed = 10;
    	System.out.println("The current speed is: " + someBicycleVariable.speed);
    	
    	System.out.println("Apply the brake with value 2.");
    	someBicycleVariable.applyBrake(2);
    	System.out.println("The new speed is: " + someBicycleVariable.speed);

        System.out.println("\nDone.");
	}
}
