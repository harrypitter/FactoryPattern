package Decorator;

public interface ISignInForThirdService extends ISignInService {
    public ResultMsg loginForQQ(String openId);

    public ResultMsg loginForWechat(String openId);

    public ResultMsg loginForToken(String token);

    public ResultMsg loginForTelephone(String telephone, String code);

    public ResultMsg loginForRegister(String username, String password);

    public ResultMsg login(String username, String password);
}
