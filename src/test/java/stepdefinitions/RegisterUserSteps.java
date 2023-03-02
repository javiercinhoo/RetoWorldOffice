package stepdefinitions;

import org.junit.Assert;

import cucumber.api.java.en.*;
import pages.RegisterUserPage;

public class RegisterUserSteps {

    RegisterUserPage register= new RegisterUserPage();


@Given("^I am on the advantageonlineshopping login page$")
public void iAmOnTheAdvantageonlineshoppingLoginPage() {
    register.iAmOnTheAdvantageonlineshoppingLoginPage();
}

@And("^click on the create new account button$")
public void clickOnTheCreateNewAccountButton()throws InterruptedException {
   register.clickOnTheCreateNewAccountButton();
}
@When("^I enter a (.+),(.+),(.+) and (.+)$")
public void iEnterDataUser(String username,String email,String password, String confirmpass){
    register.iEnterDataUser(username, email, password, confirmpass);
}

@And("^click on the conditions check$")
public void clickOnTheConditionsCheck() {
   register.clickOnTheConditionsCheck();
}

@And("^click on the register button$")
public void clickOnTheRegisterButton(){
  register.clickOnTheRegisterButton();
}

@Then("^the result match the (.+)$")
public void theResultMatchTheJavier(String username){
    Assert.assertEquals(username, register.firstResult());
}
}