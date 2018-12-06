package Observer.mouse;

import Observer.core.Event;

import java.lang.reflect.Method;

public class MouseTest {
    public static void main(String[] args) {
        try {
            Mouse mouse = new Mouse();

            MouseEventCallBack mouseEventCallBack = new MouseEventCallBack();

            //方法定义
            Method onClick = MouseEventCallBack.class.getMethod("onClick", Event.class);
            Method onDoubleClick = MouseEventCallBack.class.getMethod("onDoubleClick", Event.class);
            Method onUp = MouseEventCallBack.class.getMethod("onUp", Event.class);
            Method onDown = MouseEventCallBack.class.getMethod("onDown", Event.class);
            Method onWheel = MouseEventCallBack.class.getMethod("onWheel", Event.class);
            Method onOver = MouseEventCallBack.class.getMethod("onOver", Event.class);
            Method onMove = MouseEventCallBack.class.getMethod("onMove", Event.class);

            //加入监听
            mouse.addListener(MouseEventType.ON_CLICK,mouseEventCallBack,onClick);
            mouse.addListener(MouseEventType.ON_DOUBLE_CLICK,mouseEventCallBack,onDoubleClick);
            mouse.addListener(MouseEventType.ON_UP,mouseEventCallBack,onUp);
            mouse.addListener(MouseEventType.ON_DOWN,mouseEventCallBack,onDown);
            mouse.addListener(MouseEventType.ON_WHEEL,mouseEventCallBack,onWheel);
            mouse.addListener(MouseEventType.ON_OVER,mouseEventCallBack,onOver);
            mouse.addListener(MouseEventType.ON_MOVE,mouseEventCallBack,onMove);

            //被观察者执行相对应的动作
            mouse.click();
            mouse.doubleClick();
            mouse.up();
            mouse.down();
            mouse.wheel();
            mouse.over();
            mouse.move();

        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
