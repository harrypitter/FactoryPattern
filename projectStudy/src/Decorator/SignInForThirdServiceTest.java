package Decorator;

public class SignInForThirdServiceTest {
    public static void main(String[] args) {

        ISignInForThirdService iSignInForThirdService = new SignInForThirdService(new SignInService());

        //原来的功能依旧对外开放，依旧保留
        //新的功能同样的也可以使用
        iSignInForThirdService.loginForQQ("sdfgdgfwresdf9123sdf");
        iSignInForThirdService.loginForTelephone("1560017471","sdha");
        iSignInForThirdService.loginForToken("dsajdsakldjksafjhfkasljkla");
        iSignInForThirdService.loginForWechat("dhafkahkjdsada");

    }
}
