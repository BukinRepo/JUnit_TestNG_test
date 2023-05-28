public class Main {
    public static void main(String[] args) {
        Man man1 = new Man("Vasya", "Petrov", 65, "Single");
        Woman woman1 = new Woman("Lida", "Koval", 55, "Single");
        System.out.println(man1.isRetired());
        System.out.println(woman1.isRetired());
        woman1.registerPartnership(man1);
        woman1.deregisterPartnership(false, man1);
        woman1.deregisterPartnership(true, man1);
    }
}
