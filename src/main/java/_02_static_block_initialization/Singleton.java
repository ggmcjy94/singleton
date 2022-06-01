package _02_static_block_initialization;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }
    static {
        try {
            instance = new Singleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static Singleton getInstance() {
        return instance;
    }
}
