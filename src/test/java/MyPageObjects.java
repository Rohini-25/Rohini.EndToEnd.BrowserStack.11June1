import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyPageObjects {
    WebDriver driver;


    @FindBy(linkText = "Log in")
    public WebElement loginLink;

    @FindBy(id = "Email")
    public WebElement emailTextBox;

    @FindBy(id = "Password")
    public WebElement passwordTextBox;

    @FindBy(css = "input.login-button")
    public WebElement loginButton;

    @FindBy(linkText = "Home & Kitchen")
    public WebElement homeKitchenlink;

    @FindBy(linkText ="Cooking & Dining")
    public WebElement cookingDininglink;

    @FindBy(css ="input.product-box-add-to-cart-button")
    public WebElement addProductToCart;

    @FindBy(xpath = "//a[text()='Shopping cart']")
    public WebElement clickShoppingCart;

    @FindBy(id = "termsofservice")
    public WebElement termsConditions;

    @FindBy(id = "checkout")
    public WebElement checkOutButton;

    @FindBy(id = "billing-buttons-container")
    public WebElement continueButton;

    @FindBy(css = "input.shipping-method-next-step-button")
    public WebElement continue2Button;

    @FindBy(css = "input.payment-method-next-step-button")
    public WebElement continue3Button;

    @FindBy(css = "input.payment-info-next-step-button")
    public WebElement continue4Button;

    @FindBy(css = "input.confirm-order-next-step-button")
    public WebElement confirmButton;
    public void gotoHomePage(){
        driver.get("http://twentyconsulting-001-site1.dtempurl.com/");
    }

    public void setLoginLink() {
        loginLink.click();
    }

    public void enterEmail(String email) {
        emailTextBox.sendKeys(email);
    }

    public void enterPassword(String pw) {
        passwordTextBox.sendKeys(pw);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public void setHomeKitchenlink() {
        homeKitchenlink.click();
    }

    public void setCookingDininglink() {
        cookingDininglink.click();
    }

    public void setAddProductToCart() {
        addProductToCart.click();
    }

    public void setClickShoppingCart() {
        clickShoppingCart.click();
    }

    public void setTermsConditions() {
        termsConditions.click();
    }

    public void setCheckOutButton() {
        checkOutButton.click();
    }

    public void setContinueButton() {
        continueButton.click();
    }

    public void setContinue2Button() {
        continue2Button.click();
    }

    public void setContinue3Button() {
        continue3Button.click();
    }

    public void setContinue4Button() {
        continue4Button.click();
    }

    public void setConfirmButton() {
        confirmButton.click();
    }

    public MyPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void login(String email,String pw)
    {
        emailTextBox.sendKeys(email);
        passwordTextBox.sendKeys(pw);

    }
}
