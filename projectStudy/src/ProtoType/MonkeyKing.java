package ProtoType;

import java.io.*;
import java.util.Date;
import ProtoType.GoldRingedStaff;

public class MonkeyKing extends Monkey implements Cloneable,Serializable {
    private GoldRingedStaff goldRingedStaff;

    public MonkeyKing(){
        this.goldRingedStaff = new GoldRingedStaff();
        this.birthday = new Date();
        this.height = 150;
        this.weight = 324;
        System.out.println("------------");

    }

    public Object clone(){
        //浅克隆
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    //深刻隆 需要通过序列化操作
    public Object copy() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try{
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            MonkeyKing copy = (MonkeyKing)ois.readObject();
            copy.birthday = new Date();
            return copy;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public GoldRingedStaff getGoldRingedStaff() {
        return goldRingedStaff;
    }

    public void setGoldRingedStaff(GoldRingedStaff goldRingedStaff) {
        this.goldRingedStaff = goldRingedStaff;
    }

    public void change(){
        MonkeyKing origin = new MonkeyKing();
        MonkeyKing monkeyKingClone = (MonkeyKing)origin.clone();


        System.out.println("大圣本尊生日是：" + origin.getBirthday().getTime());
        System.out.println("---------浅拷贝-------\n");
        System.out.println("克隆大圣的生日是:" + monkeyKingClone.getBirthday().getTime());
        System.out.println("大圣本尊和克隆大圣是否为同一个对象:" + (origin == monkeyKingClone));
        System.out.println("大圣本尊持有的金箍棒跟克隆大圣持有金箍棒是否为同一个对象:" + (origin.getGoldRingedStaff() == monkeyKingClone.getGoldRingedStaff()));
        MonkeyKing monkeyKingCopy = (MonkeyKing)copy();
        System.out.println("---------深拷贝-------\n");
        System.out.println("克隆大圣的生日是:" + monkeyKingCopy.getBirthday().getTime());
        System.out.println("大圣本尊和克隆大圣是否为同一个对象:" + (origin == monkeyKingCopy));
        System.out.println("大圣本尊持有的金箍棒跟克隆大圣持有金箍棒是否为同一个对象:" + (origin.getGoldRingedStaff() == monkeyKingCopy.getGoldRingedStaff()));



    }

}
