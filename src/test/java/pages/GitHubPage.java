package pages;

public class GitHubPage extends BasePage{

    private String userTextField = "//input[@id='loginusername']";
    private String passwordTextField = "//input[@id='loginpassword']";
    private String sigInButton =  "//button[contains(text(),'Log in')]";
    private String menuButton = "//header/div[7]/details[1]/summary[1]/img[1]";
    private String signOutButton = "//button[contains(text(),'Sign out')]";


    public GitHubPage() {
        super(driver);
    }

    public void navigateToGithub() {

        navigateTo("https://www.demoblaze.com/index.html");
    }

    public void enterUser(String user) {

        write(userTextField, user);
    }

    public void enterPassword(String pass){

        write(passwordTextField,pass);
    }

    public void clickSigInButton(){

        clickElement(sigInButton);
    }

    public void closeSession(){
        clickElement(menuButton);
        clickElement(signOutButton);
    }

}
