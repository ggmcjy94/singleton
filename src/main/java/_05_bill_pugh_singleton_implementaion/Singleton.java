package _05_bill_pugh_singleton_implementaion;

public class Singleton {

    private Singleton() {}

    private static class SingletonHelper{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
