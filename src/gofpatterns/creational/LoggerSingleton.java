package gofpatterns.creational;

public class LoggerSingleton {

    private LoggerSingleton() {
    }
    private int logCount = 0;
    private static LoggerSingleton loggerSingletonInstance = null;

    public static LoggerSingleton getInstance() {
        if (loggerSingletonInstance == null) {
            loggerSingletonInstance = new LoggerSingleton();
        }
        return loggerSingletonInstance;
    }
    public void log(String msg){
        logCount++;
        System.out.println("\n"+logCount+": "+msg);        
    }
}
