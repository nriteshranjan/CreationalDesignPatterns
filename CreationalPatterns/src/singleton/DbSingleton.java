package singleton;

public class DbSingleton {

    private static volatile DbSingleton instance = null; // static private instance to hold on to

    private DbSingleton() { // private constructor so that we can't use the new keyword to create their own instance of it
        if(instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingleton getInstance() {
        if(instance == null) {
            synchronized (DbSingleton.class) {
                if(instance == null) {
                    instance = new DbSingleton();
                }
            }

        }
        return instance;
    }
}
