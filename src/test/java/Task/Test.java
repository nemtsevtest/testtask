package Task;

import Task.General.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    private WebDriver driver;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private ContactsPage contacts;
    private ContactsNewPage contactsNew;
    private ContactsUserPage contactsUser;
    private ContactEditPage contactEdit;
    private CloudServersPage cloudServers;
    private CreateCloudServerPage createCloudServer;

    @Before
    public void before() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        contacts = new ContactsPage(driver);
        contactsNew = new ContactsNewPage(driver);
        contactsUser = new ContactsUserPage(driver);
        contactEdit = new ContactEditPage(driver);
        cloudServers = new CloudServersPage(driver);
        createCloudServer = new CreateCloudServerPage(driver);

    }

    @After
    public void after() {
        if (driver != null)
            driver.quit();
    }

    @org.junit.Test
    public void addingEditingDeleting() {

        loginPage.login("nemtsev.test@yandex.ru", "a13!B39!14SpA");

        dashboardPage.selectProfile();
        dashboardPage.selectcontacts();
        contacts.clickCreateButton();

        contactsNew.createNewContactAllfields("Tom", "Creater", "CreaterMiddle",
                "test@test.ru", "secondtest@test.ru", "1234567890", "Test",
                "Test", "Test", "tester", "test", "785659898898");

        contactsUser.clickButtonEdit();
        contactEdit.editPhoneNumber("4674657647657");
        contactEdit.clickButtonSave();
        contactsUser.selectContacts();
        contacts.clickDeleteButton();
        contacts.clickPopupDeleteButton();
        contacts.logout();
    }

    @org.junit.Test
    public void loginLogout() {
        loginPage.login("nemtsev.test@yandex.ru", "a13!B39!14SpA");
        contacts.logout();
    }

    @org.junit.Test
    public void cloudServerOrder() {
        loginPage.login("nemtsev.test@yandex.ru", "a13!B39!14SpA");
        dashboardPage.selectCloudService();
        dashboardPage.selectCreateManage();
        cloudServers.clickCreateServerButton();
        createCloudServer.clickAmsterdamAz3();
        createCloudServer.clickAlmalinux8();
        createCloudServer.clickSSD30();
        createCloudServer.clickGenerateKey();
        createCloudServer.inputName("Tim");
        createCloudServer.clickbuttonCreateServer();
        contacts.logout();
    }
}


//        loginPage.open();
//        loginPage.enterLogin("nemtsev.test@yandex.ru");
//        loginPage.enterPassword("a13!B39!14SpA");
//        contactsNew.enterFirstName("Tom");
//        contactsNew.enterLastName("Creater");
//        contactsNew.enterMiddleName("CreaterMiddle");
//        contactsNew.enterEmail("test@test.ru");
//        contactsNew.enterEmail2("secondtest@test.ru");
//        contactsNew.enterPhoneNumber("1234567890");
//        contactsNew.SelectJobRoleTechnical();
//        contactsNew.enterCompany("Test");
//        contactsNew.enterJobTitle("Test");
//        contactsNew.enterJobRole("Test");
//        contactsNew.enterNickname("tester");
//        contactsNew.enterComments("test2@test.ru");
//        contactsNew.enterContactDetails("785658");
//        contactsNew.clickButtonCreate();
