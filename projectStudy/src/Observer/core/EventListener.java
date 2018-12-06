package Observer.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 事件的注册和监听
 */
public class EventListener {
    //注册器
    protected Map<Enum,Event> events = new HashMap<Enum,Event>();

    public void addListener(Enum eventType, Object target, Method callback){
        //注册事件
        //用反射调用这个方法
        events.put(eventType,new Event(target,callback));
    }

    private void trigger(Event e){
        e.setSource(this);
        e.setTime(System.currentTimeMillis());

        try {
            e.getCallback().invoke(e.getTarget(),e); //使用反射的方法
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    //当注册器中查到相对应的时间，那么触发回调
    protected void trigger(Enum call){
        if(!this.events.containsKey(call)){ return ;}
        trigger(this.events.get(call).setTrigger(call.toString()));
    }


}
