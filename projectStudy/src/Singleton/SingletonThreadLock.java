package Singleton;

public class SingletonThreadLock {
    private static SingletonThreadLock instance;
    private SingletonThreadLock(){};
    //利用双重锁的方式这样颗粒度变小了，但还是利用同步的方式来解决资源共享问题。其实这上面两种写法称之为“懒加载”，即在用到的时候再来实例化。
    public static  SingletonThreadLock GetInstance(){
        if(instance == null)
        {
            synchronized (SingletonThreadLock.class){
                if(instance == null){
                    instance = new SingletonThreadLock();
                }
            }
        }
        return  instance;
    }
}
