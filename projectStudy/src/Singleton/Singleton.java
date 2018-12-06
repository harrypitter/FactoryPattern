package Singleton;

public class Singleton {
    private static Singleton sin = new Singleton(); //直接初始化一个实例对象
    private Singleton(){} //private 类型的构造函数，保证其他类对象不能直接new一个该对象的实例
    public  static  Singleton getInstance(){
        return sin;
    }
}


