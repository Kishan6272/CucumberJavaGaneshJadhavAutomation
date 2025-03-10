package AnotherPackage;

public class FbScript {

    public static void main(String[] args) {
        HomePage homePage=new HomePage();

        homePage.sendFriendRequest();
        homePage.sendMessage();

        new LoginPage().doLogin().sendFriendRequest().sendMessage();

    }
}
