package pages;

public class RegisterUserPage extends BasePage{
    
private String menuUser ="//*[@id='menuUser']";
private String createAccount ="//a[contains(text(),'CREATE NEW ACCOUNT')]";
private String userName ="//*[@id='formCover']/div[1]/div[1]/sec-view[1]/div/input";
private String userEmail="//*[@id='formCover']/div[1]/div[1]/sec-view[2]/div/input";
private String userPassword="//*[@id='formCover']/div[1]/div[2]/sec-view[1]/div/input";
private String confirmPass="//*[@id='formCover']/div[1]/div[2]/sec-view[2]/div/input";
private String checkConditions="//body/div[3]/section[1]/article[1]/sec-form[1]/div[1]/div[2]/div[1]/sec-view[1]/div[1]/input[1]";
private String buttonRegister="//button[@id='register_btnundefined']";
private String firstResult = "//header/nav[1]/ul[1]/li[3]/a[1]/span[1]";
    
    public RegisterUserPage(){
        super(driver);
    }

        public void iAmOnTheAdvantageonlineshoppingLoginPage(){
            navigateTo("https://www.advantageonlineshopping.com/#/");        
        }

        public void clickOnTheCreateNewAccountButton()throws InterruptedException{
            Thread.sleep(5000);
            clickElement(menuUser);            
            clickElement(createAccount);
        }

        public void iEnterDataUser(String username,String email,String password, String confirmpass){
            write(userName,username);
            write(userEmail,email);
            write(userPassword,password);
            write(confirmPass,confirmpass);
        }
        
        public void clickOnTheConditionsCheck(){
            moveScroll();
            clickElement(checkConditions);
        }
        
        public void clickOnTheRegisterButton(){
            clickElement(buttonRegister);
        }       
       
        public String firstResult(){
            return textFromElement(firstResult);
        } 
       
        
}
