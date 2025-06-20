public class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println("Logger Constructor");
    }

    public static Logger getInstance(){
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void printMessage(String message) {
        System.out.println("Output: " + message);
    }

}
