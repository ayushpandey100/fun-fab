package com.epam.stepDefinitions;

import com.epam.pages.ConfirmUser;
import com.epam.pages.CreateAccount;
import com.epam.pages.HomePage;
import com.epam.pages.SignInPage;
import com.epam.pojo.NewUser;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class MyStepdefs {

    WebDriver driver;
    HomePage homePage;
    SignInPage signInPage;
    CreateAccount createAccount;
    ConfirmUser confirmUser;

    @Given("User navigates to AmazonWeb UI")
    public void userNavigatesToAmazonWebUI() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ayush_Pandey\\Desktop\\SelfLearn\\utility\\driver\\chrome120\\chromedriver.exe");
        driver=new ChromeDriver(chromeOptions);
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @When("User performs click on Sign In link on Home Page")
    public void userPerformsClickOnSignInLinkOnHomePage() {
        homePage=new HomePage(driver);
        signInPage=homePage.navigateToSignIn();
    }

    @And("User clicks on Create Account Button on Sign In Page")
    public void userClicksOnCreateAccountButtonOnSignInPage() {
        createAccount=signInPage.createAccount();
    }

    @Then("User navigates to Create Account Page")
    public void userNavigatesToCreateAccountPage() {
        Assert.assertEquals(createAccount.getCreateAccountText(),"Create Account");
    }

    @When("User enters {string} as your Name")
    public void userEntersAsYourName(String name) {
        createAccount.enterYourName(name);
    }

    @And("User enters {string} as Mobile Number")
    public void userEntersAsMobileNumber(String mobileNo) {
        createAccount.enterMobile(mobileNo);
    }

    @And("User enters {string} as a password")
    public void userEntersAsAPassword(String password) {
        createAccount.enterPassword(password);
    }

    @And("User clicks on Continue button")
    public void userClicksOnContinueButton() {
        confirmUser=createAccount.performClickOnContiniue();
    }


    @When("User performs keyword search on Home Page with multiple parameters as below:")
    public void userPerformsKeywordSearchOnHomePageWithMultipleParametersAsBelow(DataTable dataTable) {
        homePage=new HomePage(driver);
        List<List<String>> searchKeywords=dataTable.asLists();
       for(List<String>column: searchKeywords){
           homePage.addSearchKey(column.get(0)).clearSearchData();
       }

    }

    @When("User enters correct account information as below")
    public void userEntersCorrectAccountInformationAsBelow(DataTable dataTable) {
        List<Map<String,String>>userData=dataTable.asMaps(String.class,String.class);
        for(Map<String,String>map:userData){
            createAccount.enterAccountDetails(map.get("Name"),map.get("Mobile"),map.get("Password"));
        }
    }

    @Then("User should see below title:")
    public void userShouldSeeBelowTitle(String title ) {
        homePage=new HomePage(driver);

        Assert.assertEquals(driver.getTitle(),title);
    }

    @DataTableType
    public NewUser userEntryConverter(Map<String,String>row){
        return new NewUser(row.get("Name"),row.get("Mobile"),row.get("Password"));
    }

//    @When("User enters correct account information as below")
//    public void userEntersCorrectAccountInformationAsBelow2(List<NewUser>users) {
//        for(NewUser user:users){
//            createAccount.enterAccountDetails(user.getName(), user.getMobile(), user.getPassword());
//        }
//        createAccount.performClickOnContiniue();
//    }
}
