public class Singleton {
    public static Singleton singleton = new Singleton();
    private Singleton(){}

    public static Singleton getInstance(){
        return singleton;
    }

    protected static void demoMethod (){
        System.out.println("demoMethod for Singleton");
    }
}
