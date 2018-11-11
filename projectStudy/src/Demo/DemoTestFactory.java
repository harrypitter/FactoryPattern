package Demo;

import Fatcory.Factory;
import Fatcory.Fruit;
import Sort.BubleSort;
import Sort.QuickSort;

import java.util.ArrayList;

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

        BubleSort bubleSort = new BubleSort();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0,1);
        arrayList.add(1,5);
        arrayList.add(2,9);
        arrayList.add(3,789);
        arrayList.add(4,87);
        arrayList.add(5,56);
        arrayList.add(6,-45);
        arrayList.add(7,99);

        bubleSort.getBubleSortData(arrayList);

        int []a ={4,5,7,2,74,5,3,9,22,132};
        int i;
        QuickSort quickSort = new QuickSort();
        //quickSort.quitSort(a,0,a.length-1);
        quickSort.sort1(a,0,a.length-1);
        for(i=0;i<a.length;i++)
        {
            System.out.printf("%d,",a[i]);
        }
    }
}
