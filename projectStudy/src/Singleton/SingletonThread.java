package Singleton;

//线程安全的单例模式
public class SingletonThread {
    private static SingletonThread instance;
    private SingletonThread(){}

    //synchronized 对整个方法加锁，形成同步机制，解决了单例模式的线程安全问题，但产生性能问题，对方法加锁颗粒度比较大
    public static synchronized SingletonThread GetInstance()
    {
        if(instance == null)
        {
            instance = new SingletonThread();
        }
        return  instance;
    }
}
