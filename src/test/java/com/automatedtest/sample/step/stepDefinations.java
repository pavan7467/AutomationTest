    package com.automatedtest.sample.step;

    import com.automatedtest.sample.pageObjects.CreateAccountFormPage;
    import com.automatedtest.sample.pageObjects.CreateAccountPage;
    import com.automatedtest.sample.pageObjects.HomePage;
    import io.cucumber.java.en.*;
    import org.apache.poi.hssf.usermodel.HSSFWorkbook;
    import org.apache.poi.ss.usermodel.*;
    import org.apache.poi.xssf.usermodel.XSSFSheet;
    import org.apache.poi.xssf.usermodel.XSSFWorkbook;
    import org.junit.AfterClass;
    import org.junit.Assert;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;

    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.io.IOException;
    import java.util.Iterator;

    public class stepDefinations {

        public WebDriver driver;
        public HomePage hPage;
        public CreateAccountFormPage formPage;
        public CreateAccountPage createAcc;

        @Given("user launches chrome browser")
        public void user_launches_chrome_browser() {

            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//Chromedriver.exe");
            driver = new ChromeDriver();
            hPage = new HomePage(driver);
        }

        @When("user opens a url {string}")
        public void user_opens_a_url(String string) {
            driver.get(string);
            driver.manage().window().maximize();
        }

        @Then("user sees {string} should be displayed")
        public void user_sees_should_be_displayed(String text) {

            text = hPage.getSignin().getText();

            Assert.assertEquals("Sign in", text);

        }

        @When("user clicks {string}")
        public void user_clicks(String signin) {

            hPage.clickSignin();
        }

        @Then("user gets {string} page")
        public void user_gets_page(String input) {

            Assert.assertTrue(input+" was not displayed",createAcc.getEmailInput().isDisplayed());

        }

        @Then("user enters below details from {string}")
        public void user_enters_below_details_from(String string) throws IOException {

            FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//TestData//file.xlsx");
            Workbook wb = new XSSFWorkbook(fs);

            Sheet sheet = wb.getSheetAt(0);

            Iterator<Row> rowIterator = sheet.rowIterator();

            while (rowIterator.hasNext()){
                Row row = rowIterator.next();

                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext()){
                   Cell cell = cellIterator.next();

                    if(cell.getCellType() == CellType.STRING){
                        String value = cell.getStringCellValue();
                    }else{
                            double value = cell.getNumericCellValue();
                        }
                }
            }
        }

        @AfterClass
        public void tearDown(){
            driver.quit();
        }
    }
