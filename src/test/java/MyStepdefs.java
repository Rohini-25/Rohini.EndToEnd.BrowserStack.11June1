import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyStepdefs extends TestRunner{

    MyPageObjects myPageObjects;
    @Before
    public void start(){
        //WebDriverManager.chromedriver().setup();
       // driver = new ChromeDriver();
        //driver.navigate().to("http://twentyconsulting-001-site1.dtempurl.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        myPageObjects= new MyPageObjects(driver);
    }
    @After
    public void stop(Scenario scenario) {
        byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshotBytes, "image/png");
    }
    @Given("^User is at homepage$")
    public void userIsAtHomepage() {
        myPageObjects.gotoHomePage();
    }

    @When("^I click on login link from nav bar$")
    public void iClickOnLoginLinkFromNavBar() {
        myPageObjects.setLoginLink();
    }

    @Then("^I should be navigated to login page$")
    public void iShouldBeNavigatedToLoginPage() {
    }

    @When("^I enter user name$")
    public void iEnterUserName() {
        myPageObjects.login("testing@testing.com","testing");
    }

    @And("^I enter password$")
    public void iEnterPassword() {
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {myPageObjects.clickLogin();
    }

    @When("^I select homeandkitchen$")
    public void iSelectHomeandkitchen() {
        myPageObjects.setHomeKitchenlink();
    }

    @And("^I select cooking and dining$")
    public void iSelectCookingAndDining() {
            myPageObjects.setCookingDininglink();
        }


    @Then("^I should get result for corresponding product$")
    public void iShouldGetResultForCorrespondingProduct() {
    }

    @When("^I click on add to cart button for third product on home page$")
    public void iClickOnAddToCartButtonForThirdProductOnHomePage() throws InterruptedException {
        Thread.sleep(3000);
        myPageObjects.addProductToCart.click();

    }

    @Then("^the product should appear in the shopping cart$")
    public void theProductShouldAppearInTheShoppingCart() {
            myPageObjects.setClickShoppingCart();
    }

    @When("^I click on checkout button$")
    public void iClickOnCheckoutButton() {
        myPageObjects.setTermsConditions();
        myPageObjects.setCheckOutButton();
    }

    @Then("^I am directed to shipping address page$")
    public void iAmDirectedToShippingAddressPage() {
        myPageObjects.setContinueButton();
    }

    @When("^I click on continue(\\d+) button$")
    public void iClickOnContinueButton(int arg0) {
        myPageObjects.setContinue2Button();
    }

    @Then("^I am direct to shipping method page$")
    public void iAmDirectToShippingMethodPage() {
        myPageObjects.setContinue3Button();
    }

    @And("^I am directed to payment method tab$")
    public void iAmDirectedToPaymentMethodTab() {
    }

    @And("^I am directed to payment information page$")
    public void iAmDirectedToPaymentInformationPage() {
    }

    @When("^I click on continue button$")
    public void iClickOnContinueButton() {
        myPageObjects.setContinue4Button();
    }

    @Then("^I am directed to confirm order page$")
    public void iAmDirectedToConfirmOrderPage() {
    }

    @When("^I click on confirm$")
    public void iClickOnConfirm() {
        myPageObjects.setConfirmButton();
    }

    @Then("^I get confirmation message$")
    public void iGetConfirmationMessage() {
    }
}
