package Demo;

import Fatcory.Factory;
import Fatcory.Fruit;

/**
 * Created by Lidu on 18/4/21.
 */
public class DemoTestFactory {
    public static void main(String[] args) {
        Factory factory = new Factory();

        //获取 appleFruit 的对象，并调用它的 showInf 方法
        Fruit fruit1 = factory.getFactoryByType("apple");

        //调用 appleFruit 的 showInf 方法
        fruit1.showInf();

        //获取 orangeFruit 的对象，并调用它的 showInf 方法
        Fruit fruit2 = factory.getFactoryByType("orange");

        //调用 orangeFruit 的 showInf 方法
        fruit2.showInf();

        //获取 grapeFruit 的对象，并调用它的 showInf 方法
        Fruit fruit3 = factory.getFactoryByType("grape");

        //调用 grapeFruit 的 showInf 方法
        fruit3.showInf();
    }
}
