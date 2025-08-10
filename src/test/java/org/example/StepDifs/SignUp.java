package org.example.StepDifs;

import com.github.javafaker.Faker;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.homePage;
import org.example.pages.registerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.example.StepDifs.Hooks.driver;
import static org.example.pages.homePage.rigester;
import static org.example.pages.homePage.Rigester;



public class SignUp {

    registerPage register=new registerPage();


    @Given("user click at register button")
    public void userClickAtRegisterButton() {
     // Hooks hooks=new Hooks();
     // hooks.driver.findElement(By.className("ico-register")).click();
     //1
        //homePage home=new homePage();
     // home.rigester().click();
   //  rigester().click();
     //2
      //homePage home=new homePage();
    // home.Rigester.click();
       // Rigester.click();
     }

    @And("user select gender")
    public void userSelectGender() {
       registerPage register=new registerPage();
       register.male.click();
    }


    @And("user enter first{string} and last name{string}")
    public void userEnterFirstAndLastName(String arg0, String arg1) {
        register.FirstName.sendKeys(arg0);
        register.LastName.sendKeys(arg1);
    }



    @And("user click the chick box Newsletter and enter information")
    public void userClickTheChickBoxNewsletterAndEnterInformation() {
        if(!register.Newsletter.isSelected()){
            register.Newsletter.click();
        }
        //if(register.Newsletter.isSelected()==!true){
          //  register.Newsletter.click();
      //  }
        }

    @And("user enter password and confirmed password")
    public void userEnterPasswordAndConfirmedPassword() {
        Faker faker=new Faker();
        String Password= faker.internet().password();
        register.Password.sendKeys(Password);
       register.ConfirmPassword.sendKeys(Password);
    }

    @And("user click on the Register button")
    public void userClickOnTheRegisterButton() {
        register.RegisterButton.click();
        if (driver.getCurrentUrl()=="https://demo.nopcommerce.com/register?returnurl=%2F"){
            driver.navigate().to("https://demo.nopcommerce.com/registerresult/1?returnUrl=/");
     }}

    @Then("new account created successfully")
    public void newAccountCreatedSuccessfully() {
    }

    @And("user enter email")
    public void userEnterEmail() {
    Faker faker=new Faker();
    String email=faker.internet().emailAddress();
    register.Email.sendKeys(email);
    }

    @And("user enter DOB")
    public void userEnterDOB() {
   //     Select select1=new Select(register.dateOfBirth);
     //    select1.selectByValue("30");
       //  Select select2=new Select(register.dateOfMonth);
         //select2.selectByValue("7");
       //  Select select3= new Select(register.YearOfBirth);
        // select3.selectByValue("1996");

    }


    @And("user enter first and last name")
    public void userEnterFirstAndLastName() {
        register.FirstName.sendKeys("ramy");
        register.LastName.sendKeys("saly");
    }


}
