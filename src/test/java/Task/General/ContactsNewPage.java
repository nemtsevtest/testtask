package Task.General;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ContactsNewPage {

    private By firstNameField = new By.ByXPath("//*[@name=\"fname\"]");
    private By lastNameField = new By.ByXPath("//*[@name=\"lname\"]");
    private By middleNameField = new By.ByXPath("//*[@name=\"tokens.middlename\"]");
    private By emailField = new By.ByXPath("//*[@name=\"email\"]");
    private By email2Field = new By.ByXPath("//*[@name=\"email2\"]");
    private By phoneNumberField = new By.ByXPath("//*[@name=\"phone_number\"]");
    private By companyField = new By.ByXPath("//*[@name=\"tokens.company\"]");
    private By jobTitleField = new By.ByXPath("//*[@name=\"tokens.title\"]");
    private By jobRoleField = new By.ByXPath("//*[@name=\"tokens.role\"]");
    private By nicknameField = new By.ByXPath("//*[@name=\"nickname\"]");
    private By commentsField = new By.ByXPath("//*[@name=\"tokens.note\"]");
    private By addMoredetailsField = new By.ByXPath("//*[@class=\"ir812m3 fa fa-plus\"]");
    //    private By workPhone = new By.ByXPath("//div[@class='sio5kv9']");
    private By homePhoneNumberField = new By.ByXPath("//input[@name='contacts[0].value']");
    private By openDetailsField = new By.ByXPath("//div[@class='select__indicator select__dropdown-indicator css-tlfecz-indicatorContainer']");
    private By listDetails = new By.ByXPath
            ("//div[@class='daxtuv1 s1yok40w i25pk77']");
    private By jobRoleTechnicalField = new By.ByXPath("//div[@class='o1f4lk4c']/child::label[2]");
    private By createButton = new By.ByXPath("  //*[@title=\"Create\"]");
    private WebDriver driver;

    public ContactsNewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField)).sendKeys(text);
    }

    public void enterLastName(String text) {
        driver.findElement(lastNameField).sendKeys(text);
    }

    public void enterMiddleName(String text) {
        driver.findElement(middleNameField).sendKeys(text);
    }

    public void enterEmail(String text) {
        driver.findElement(emailField).sendKeys(text);
    }

    public void enterEmail2(String text) {
        driver.findElement(email2Field).sendKeys(text);
    }

    public void enterPhoneNumber(String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberField)).sendKeys(text);
    }

    public void SelectJobRoleTechnical() {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait2.until(ExpectedConditions.elementToBeClickable(jobRoleTechnicalField)).click();
    }

    public void enterCompany(String text) {
        driver.findElement(companyField).sendKeys(text);
    }

    public void enterJobTitle(String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(jobTitleField)).sendKeys(text);

    }

    public void enterJobRole(String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(jobRoleField)).sendKeys(text);
    }

    public void enterNickname(String text) {
        driver.findElement(nicknameField).sendKeys(text);
    }

    public void enterComments(String text) {
        driver.findElement(commentsField).sendKeys(text);
    }

    public void clickButtonCreate() {
        driver.findElement(createButton).click();
    }

    public void enterContactDetails(String text) {

        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait3.until(ExpectedConditions.elementToBeClickable(addMoredetailsField)).click();

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait2.until(ExpectedConditions.elementToBeClickable(openDetailsField)).click();

        List<WebElement> webElements = driver.findElements(listDetails);

        for (WebElement webElement : webElements) {
            System.out.println(webElement.getText());
            if ("Home phone".equals(webElement.getText()))
                webElement.click();

            driver.findElement(homePhoneNumberField).sendKeys(text);

        }
    }

    public void createNewContactAllfields(String firstName, String lastName,
                                          String middleName, String email, String email2,
                                          String phoneNumber,
                                          String company, String jobTitle, String jobRole,
                                          String nickname, String comments, String contactDetails) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField)).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(middleNameField).sendKeys(middleName);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(email2Field).sendKeys(email2);
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberField)).sendKeys(phoneNumber);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait3.until(ExpectedConditions.elementToBeClickable(jobRoleTechnicalField)).click();
        driver.findElement(companyField).sendKeys(company);
        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait4.until(ExpectedConditions.visibilityOfElementLocated(jobTitleField)).sendKeys(jobTitle);
        WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait5.until(ExpectedConditions.visibilityOfElementLocated(jobRoleField)).sendKeys(jobRole);
        driver.findElement(nicknameField).sendKeys(nickname);
        driver.findElement(commentsField).sendKeys(comments);

        WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait6.until(ExpectedConditions.elementToBeClickable(addMoredetailsField)).click();

        WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait7.until(ExpectedConditions.elementToBeClickable(openDetailsField)).click();

        List<WebElement> webElements = driver.findElements(listDetails);

        for (WebElement webElement : webElements) {
            System.out.println(webElement.getText());
            if ("Home phone".equals(webElement.getText()))
                webElement.click();

            driver.findElement(homePhoneNumberField).sendKeys(contactDetails);

        }

        driver.findElement(createButton).click();
    }


}
