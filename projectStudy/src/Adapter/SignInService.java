package Adapter;

public class SignInService {
    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg register(String username,String password){
        return  new ResultMsg(200,"注册成功",new User());
    }


    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        System.out.println("登陆成功");
        return null;
    }
}
