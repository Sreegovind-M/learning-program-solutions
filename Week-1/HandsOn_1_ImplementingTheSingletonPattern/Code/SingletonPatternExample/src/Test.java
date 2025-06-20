public class Test {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        log1.printMessage("First logger object message");

        Logger log2 = Logger.getInstance();
        log2.printMessage("Second logger object message");

        if (log1 == log2) {
            System.out.println("Both logger refer to same instance - Singleton Pattern");
        }
        else {
            System.out.println("Different instances! - Not a Singleton Pattern");
        }
    }
}
