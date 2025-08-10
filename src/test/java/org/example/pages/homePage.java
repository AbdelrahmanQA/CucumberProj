package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.StepDifs.Hooks.driver;

public class homePage {
    // easy way -- without page factory

    public static WebElement rigester(){

        return driver.findElement(By.className("ico-register"));
    }
     // using page factory
    // using constructor

    public homePage(){
        PageFactory.initElements(driver,this);

    }
    @FindBy (className="ico-register")
    public static WebElement Rigester;
}
