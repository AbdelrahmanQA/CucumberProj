package org.example.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.StepDifs.Hooks.driver;

public class registerPage {
   public registerPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "gender-male")
    public  WebElement male;
    @FindBy(id = "FirstName")
    public  WebElement FirstName;
    @FindBy(id = "LastName")
    public  WebElement LastName;
    @FindBy(className = "valid")
    public  WebElement Newsletter;
    @FindBy(id = "Password")
    public  WebElement Password;
    @FindBy(id = "ConfirmPassword")
    public  WebElement ConfirmPassword;
    @FindBy(id = "Email")
    public  WebElement Email;
    @FindBy(id = "register-button")
    public  WebElement RegisterButton;
    @FindBy(id = "dateOfBirth")
    public  WebElement dateOfBirth;
    @FindBy(id = "dateOfMonth")
    public  WebElement dateOfMonth;
    @FindBy(id = "YearOfBirth")
    public  WebElement YearOfBirth;
    @FindBy(xpath = "/html/body//div[1]/div/div[1]/div/label/input")
    public  WebElement HAHAHA;

}
