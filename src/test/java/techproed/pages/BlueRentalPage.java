package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRentalPage {
    public BlueRentalPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@href='/login']")
    public WebElement login;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='dropdown-basic-button']")
    public WebElement loginVerify;

    @FindBy (xpath = "//*[text()='User with email fake@bluerentalcars.com not found']")
    public WebElement mesajVerify;

    @FindBy(xpath = "//*[.='Logout']")
    public WebElement logOut;

    @FindBy(xpath = "//*[.='OK']")
    public WebElement ok;
}
