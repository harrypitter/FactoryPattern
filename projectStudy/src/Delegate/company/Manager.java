package Delegate.company;

import java.util.HashMap;
import java.util.Map;

public class Manager  {
    private Map<String,Stuff> targets = new HashMap<String,Stuff>();

    public Manager() {
        targets.put("加密",new StuffA());
        targets.put("登录",new StuffB());
    }

    //项目经理自己不干活
    public void doing(String command){
        targets.get(command).doing(command);
    }
}
