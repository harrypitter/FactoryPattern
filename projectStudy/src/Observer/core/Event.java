package Observer.core;

import java.lang.reflect.Method;

public class Event {
    //事件源
    private Object source;
    //通知目标
    private Object target;
    //回调方法
    private Method callback;
    //触发
    private String trigger;

    private Long time;

    public Event(Object target, Method callback) {
        this.target = target;
        this.callback = callback;
    }

    public Object getSource() {
        return source;
    }

    Event setSource(Object source) {
        this.source = source;
        return this;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getCallback() {
        return callback;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    public String getTrigger() {
        return trigger;
    }

    Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public Long getTime() {
        return time;
    }

    Event setTime(Long time) {
        this.time = time;
        return this;
    }

    @Override
    public String toString() {
        return "Event{" +
                "\n\tsource=" + source + ",\n" +
                "\ttarget=" + target + ",\n" +
                "\tcallback=" + callback + ",\n" +
                "\ttrigger='" + trigger + '\'' + "\n" +
                '}';
    }


}
