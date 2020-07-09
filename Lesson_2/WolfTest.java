public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        // initialize
        wolf.setGender("man");
        wolf.setName("Predator");
        wolf.setColor("grey");
        wolf.setWeight(5);
        wolf.setAge(7);

        // out to console
        System.out.println("Gender is " + wolf.getGender());
        System.out.println("Name is " + wolf.getName());
        System.out.println("Color is " + wolf.getColor());
        System.out.println("Weight is " + wolf.getWeight() + " kg");
        System.out.println("Age is " + wolf.getAge() + " years");
    }
}