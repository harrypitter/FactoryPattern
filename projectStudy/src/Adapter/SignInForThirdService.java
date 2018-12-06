package Adapter;

public class SignInForThirdService extends SignInService{
    public ResultMsg loginForQQ(String openId){
        //1、openId是全局唯一，我们可以把它当做是一个用户名(加长)
        //2、密码默认为QQ_EMPTY
        //3、注册（在原有系统里面创建一个用户）

        //4、调用原来的登录方法
        String QQDefaultPasswords = "QQ_EMPTY";
        //这里省略查重验证，默认为新用户，实际项目执行会有

        System.out.println("QQ登录");

        return loginForRegister(openId,QQDefaultPasswords);
    }

    public ResultMsg loginForWechat(String openId){
        String WechatDefaultPasswords = "WECHAT_EMPTY";
        System.out.println("wechat登录");
        return loginForRegister(openId,WechatDefaultPasswords);

    }

    public ResultMsg loginForToken(String token){
        //通过token拿到用户信息，然后再重新登陆了一次
        User user = new User();
        System.out.println("token自动登录");
        return login(user.getUsername(),user.getPassword());
    }

    public ResultMsg loginForTelephone(String telephone,String code){

        String telephoneDefaultPasswords = "TELEPHONE_EMPTY";
        System.out.println("手机号登录");
        return loginForRegister(telephone,telephoneDefaultPasswords);
    }

    public ResultMsg loginForRegister(String username,String password){
        super.register(username,password);
        return super.login(username,password);
    }

    public ResultMsg login(String username,String password){
        super.register(username,password);
        return super.login(username,password);
    }
}
