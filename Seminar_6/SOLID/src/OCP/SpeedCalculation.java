package OCP;

public class SpeedCalculation extends Vehicle {

    double multiplierForMaxSpeed;

    /**
     * - constructor for SpeedCalculation
     * @param maxSpeed
     * @param type
     * @param multiplierForMaxSpeed
     */
    public SpeedCalculation(int maxSpeed, String type, double multiplierForMaxSpeed) {
        super(maxSpeed, type);
        this.multiplierForMaxSpeed = multiplierForMaxSpeed;
    }

    /**
     * @return allowed speed
     */
    public double calculateAllowedSpeed(Vehicle vehicle) {
        if (vehicle.getType().equalsIgnoreCase("Car")) {
            return vehicle.getMaxSpeed() * 0.8;
        } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
            return vehicle.getMaxSpeed() * 0.6;
        }
        return 0.0;
    }
}
