package pages;

public class GitHubPage extends BasePage{

    private String userTextField = "//input[@id='loginusername']";
    private String passwordTextField = "//input[@id='loginpassword']";
    private String sigInButton =  "//a[@id='login2']";

    private String starLoginButton="//button[contains(text(),'Log in')]";

    private String signOutButton = "//a[@id='logout2']";


    public GitHubPage() {

        super(driver);
    }

    public void navigateToGithub() {

        navigateTo("https://www.demoblaze.com/index.html");
    }

    public void clickLogin(){
        clickElement(sigInButton);
    }

    public void enterUser(String user) {

        write(userTextField, user);
    }

    public void enterPassword(String pass){

        write(passwordTextField,pass);
    }


    public void clickSigInButton(){

        clickElement(starLoginButton);
    }

    public void closeSession(){

        clickElement(signOutButton);
    }

}
