/**
 *  Singleton Design Implementation.
 * The Singleton design pattern ensures that a class has only one instance and provides a global point of access to that instance
 * Singleton pattern is used in scenarios where having multiple instances of a class is unnecessary and could lead to issues.
 * such as global configurations , settings, database connections, thread pools, caches.
 * @author Divanshu Joshi
 * @version 1.0
 * @since 2023-10-02
 */

class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if(instance == null) {
            return new Singleton();
        }
        return instance;
    }


}
/**
 * Client Class.
 *
 * Class that will be used for singleton instantiation and use.
 *
 * @author Divanshu Joshi
 * @version 1.0
 * @since 2023-10-01
 */
public class SingletonDesign {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Are both singletons the same instance? " + (singleton1 == singleton2));
    }
}
