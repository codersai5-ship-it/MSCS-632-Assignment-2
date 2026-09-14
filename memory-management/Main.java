public class Main {
    public static void main(String[] args) {
        String message = new String("Hello Java");

        System.out.println("Allocated value: " + message);

        message = null;
        System.gc();

        System.out.println("Object is now eligible for garbage collection.");
    }
}
