public class Main {
    public static void main(String[] args) {
        Logger log1 = Logger.instance();
        Logger log2 = Logger.instance();
        log1.log("First log message.");
        log2.log("Second log message.");
        System.out.println("Both instances are same: " + (log1 == log2));
    }
}
