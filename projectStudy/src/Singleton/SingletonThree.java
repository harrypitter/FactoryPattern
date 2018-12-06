package Singleton;

public class SingletonThree {
    private static boolean initialized = false;

    //private SingletonThree SingletonThree();
    private SingletonThree()
    {
        synchronized (SingletonThree.class){
            if(initialized==false)
            {
                initialized=!initialized;
            }
            else
                throw new RuntimeException("单例被侵犯");

        }
    }

    public static final  SingletonThree getInstance(){
        return LasyHolder.Lazy;
    }

    public static class LasyHolder
    {
        private static final SingletonThree Lazy = new SingletonThree();
    }
}
