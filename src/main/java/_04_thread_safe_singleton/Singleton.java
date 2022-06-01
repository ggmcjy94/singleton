package _04_thread_safe_singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance ==null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static Singleton doubleCheckedLockingSingleton() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
