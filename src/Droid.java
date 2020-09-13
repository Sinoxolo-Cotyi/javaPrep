public class Droid {
    String name;
    int batteryLevel;
    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100; // Every new instance of Droid will start at 100
    }

    public String toString() {
        return "Hello there I am " + name + ".";
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task + ".");
        batteryLevel -= 10;
        System.out.println("The battery level is at: " + batteryLevel + "!");
    }
    public static void main(String[] args) {
        Droid Codey = new Droid("Codey");
        System.out.println(Codey.toString());
        Codey.performTask("Eating");
        Codey.performTask("Drinking");
        Codey.performTask("Dancing");
        Codey.performTask("Running");

    }
}
