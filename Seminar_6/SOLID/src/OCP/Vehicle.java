package OCP;

public class Vehicle {
    /**
     * - fields for Vehicle class
     */
    int maxSpeed;
    String type;

    /**
     * - Constructor for vehicle
     * @param maxSpeed
     * @param type
     */
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    /**
     *  - Getter and setter fo vehicle class
     * @return
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    public String getType() {
        return this.type;
    }
}
