public class AstronautInfo {

    public static void main(String[] args) {
        // Assume that everything in this class and method is good.
        // It exists only to test your code in AstronautBuilder.

        // Create the objects.
        AstronautBuilder commander = new AstronautBuilder();
        AstronautBuilder lunarModulePilot = new AstronautBuilder();
        AstronautBuilder commandModulePilot = new AstronautBuilder();

        // Set the commander's info.
        commander.setName("Neil A. Armstrong");
        commander.setAge(38);
        commander.setAddress("1003 Woodland Dr.");
        commander.setPhone("281-326-1951");

        // Set the lunar module pilot's info.
        lunarModulePilot.setName("Edwin 'Buzz' E. Aldrin Jr.");
        lunarModulePilot.setAge(39);
        lunarModulePilot.setAddress("274 E Eau Gallie Blvd. 153");
        lunarModulePilot.setPhone("904-814-3330");

        // Set the command module pilot's info.
        commandModulePilot.setName("Michael Collins");
        commandModulePilot.setAge(39);
        commandModulePilot.setAddress("18503 Barbuda Ln.");
        commandModulePilot.setPhone("202-358-0000");

        // Display commander's info.
        System.out.println("Commander's information:");
        System.out.println("Name: " + commander.getName());
        System.out.println("Age: " + commander.getAge());
        System.out.println("Address: " + commander.getAddress());
        System.out.println("Phone: " + commander.getPhone());

        // Display lunar module pilot's info.
        System.out.println("\nLunar module pilot's information:");
        System.out.println("Name: " + lunarModulePilot.getName());
        System.out.println("Age: " + lunarModulePilot.getAge());
        System.out.println("Address: " + lunarModulePilot.getAddress());
        System.out.println("Phone: " + lunarModulePilot.getPhone());

        // Display command module pilot's info.
        System.out.println("\nCommand module pilot's information:");
        System.out.println("Name: " + commandModulePilot.getName());
        System.out.println("Age: " + commandModulePilot.getAge());
        System.out.println("Address: " + commandModulePilot.getAddress());
        System.out.println("Phone: " + commandModulePilot.getPhone());

        System.exit(0);
    }
}
