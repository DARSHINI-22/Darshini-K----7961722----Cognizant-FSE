public class Logger {
    private static Logger instance;
    private Logger()
    {
        Logger.log("Logger instance created.");
    }

    public static Logger instance()
    {
        if(instance == null)
        {
            instance = new Logger();
        }
        return instance;
    }
    public static void log(String message)
    {
        System.out.println("LOG: " + message);
    }
}
