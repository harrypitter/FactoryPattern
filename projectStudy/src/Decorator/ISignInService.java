package Decorator;

public interface ISignInService {
    /**
     * 注册接口
     * @param username
     * @param password
     * @return
     */
    public ResultMsg register(String username, String password);


    /**
     * 登录的接口
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username, String password);
}
