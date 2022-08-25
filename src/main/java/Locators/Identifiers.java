package Locators;

import org.openqa.selenium.By;

public class Identifiers {

    By Account = By.id("nav-link-accountList");
    By email = By.name("email");
    By password = By.name("password");
    By notNow = By.id("ap-account-fixup-phone-skip-link");
    By SearchTextbox = By.id("twotabsearchtextbox");
    By firstResult = By.xpath("//*[@id='search']/div[1]/div/div/span[3]/div[2]/div[4]");
    By firstPrice = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div[2]/div[4]/div/a/span");
    By secondPrice = By.xpath("//*[@id=\"centerCol\"]/div[9]/div[2]/div/table/tbody/tr/td[2]/span[1]/span[2]");
    By addCartBtn = By.id("add-to-cart-button");
    By NotThanks = By.xpath("//*[@id=\"attachSiNoCoverage\"]/span/input");
    By thirdPrice= By.xpath("//*[@data-name=\"Active Items\"]/div[3]/div[4]/div//p/span");
    By goCart = By.cssSelector("#sw-gtc > span");
    By textCart = By.xpath("//*[@id=\"sc-subtotal-label-activecart\"]");
    By textEmptyCart = By.xpath("//*[@id=\"sc-subtotal-label-activecart\"]");
    By spfirstResult = By.xpath("//*[@id='search']/div[1]/div/div/span[3]/div[2]/div[2]/div/div/div/div/div[1]");


    public By getAccount() {
        return Account;
    }

    public By getEmail() {
        return email;
    }

    public By getPassword() {
        return password;
    }

    public By getNotNow() {
        return notNow;
    }

    public By getSearchTextbox(){
        return SearchTextbox;
    }

    public By getFirstResult() {
        return firstResult;
    }

    public By getFirstPrice() {
        return firstPrice;
    }

    public By getSecondPrice() {
        return secondPrice;
    }

    public By getAddCartBtn() {
        return addCartBtn;
    }

    public By getNotThanks() {
        return NotThanks;
    }

    public By getThirdPrice() {
        return thirdPrice;
    }

    public By getGoCart() {
        return goCart;
    }

    public By getTextCart() {
        return textCart;
    }

    public By getTextEmptyCart() {
        return textEmptyCart;
    }
    public By getSpfirstResult() {
        return spfirstResult;
    }

}
