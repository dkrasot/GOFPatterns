package gofpatterns.creational;

public class ThreadSafeLoggerSingleton {

    private ThreadSafeLoggerSingleton() {
        //reading logCount from some file... 
    }
    private int logCount = 0;
    private static ThreadSafeLoggerSingleton instance = null;

    public static synchronized ThreadSafeLoggerSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLoggerSingleton();
        }
        return instance;
    }

    public void log(String msg) {
        logCount++;
        System.out.println("\n"+logCount+": "+msg);
    }
}
