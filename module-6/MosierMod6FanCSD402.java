/**
 * Megan Mosier
 * CSD-402
 * Fan Class Assignment
 * June 28, 2026
 */
public class MosierMod6FanCSD402 {

    // Constants representing the possible fan speeds
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields (instance variables)
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /**
     * No-argument constructor.
     * Sets all fields to their default values:
     * speed = STOPPED, on = false, radius = 6, color = "white".
     */
    public MosierMod6FanCSD402() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    /**
     * Constructor that accepts arguments to set all field values.
     *
     * @param speed  the fan speed (use STOPPED, SLOW, MEDIUM, or FAST)
     * @param on     whether the fan is on
     * @param radius the radius of the fan
     * @param color  the color of the fan
     */
    public MosierMod6FanCSD402(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    /**
     * @return the current speed of the fan
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the fan's speed.
     *
     * @param speed the new speed (use STOPPED, SLOW, MEDIUM, or FAST)
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return true if the fan is on, false otherwise
     */
    public boolean isOn() {
        return on;
    }

    /**
     * Sets whether the fan is on or off.
     *
     * @param on true to turn the fan on, false to turn it off
     */
    public void setOn(boolean on) {
        this.on = on;
    }

    /**
     * @return the radius of the fan
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the fan.
     *
     * @param radius the new radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * @return the color of the fan
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the fan.
     *
     * @param color the new color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Returns a description of the fan's current state.
     *
     * @return a String describing the fan
     */
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Create a Fan using the no-argument constructor (all defaults)
        MosierMod6FanCSD402 defaultFan = new MosierMod6FanCSD402();

        // Create a Fan using the argument constructor (custom values)
        MosierMod6FanCSD402 customFan = new MosierMod6FanCSD402(FAST, true, 10, "black");

        System.out.println("Default Fan: " + defaultFan);
        System.out.println("Custom Fan: " + customFan);

        // Demonstrate the setter and getter methods on the default fan
        System.out.println("\nModifying the default fan...");
        defaultFan.setSpeed(MEDIUM);
        defaultFan.setOn(true);
        defaultFan.setRadius(8);
        defaultFan.setColor("blue");

        System.out.println("Updated Default Fan: " + defaultFan);

        // Demonstrate the getter methods individually
        System.out.println("\nCustom Fan's individual field values:");
        System.out.println("Speed: " + customFan.getSpeed());
        System.out.println("On: " + customFan.isOn());
        System.out.println("Radius: " + customFan.getRadius());
        System.out.println("Color: " + customFan.getColor());
    }
}