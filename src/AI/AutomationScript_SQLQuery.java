package AI;

public class AutomationScript_SQLQuery {
    //Create an Automation script with Java-Selenium and TestNG scripts
    //to automate the following tasks:
    //1. Open a web browser
    //2. Navigate to a given URL
    //3. Verify that all the search results include the searched product name
    //4. Close the browser
/*
    @Test
    public void verifySearchFunctionality() {
        //Open the browser
        WebDriver driver = new ChromeDriver();

        //Navigate to the given URL
        driver.get("https://www.example.com");

        //Enter the product name in the search bar
        driver.findElement(By.id("searchInput")).sendKeys("Product Name");

        //Click on the search button
        driver.findElement(By.id("searchButton")).click();

        //Verify that all the search results include the searched product name
        List<WebElement> searchResults = driver.findElements(By.cssSelector(".search-result-item"));
        for (WebElement searchResult : searchResults) {
            Assert.assertTrue(searchResult.getText().contains("Product Name"));
        }

        //Close the browser
        driver.quit();


        //write a SQL query to get the maximum salary value from the employee table
        String sqlQuery = "SELECT MAX(salary) FROM employee";
        }

        // Create an automation script using Java, Selenium and JUnit and
        // that can double click on an element on the page
        // and verify that the double click action opens a new window
        // with the desired URL

        @Test
        public void doubleClickAndVerifyWindow() {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.example.com");

            WebElement elementToDoubleClick = driver.findElement(By.id("elementToDoubleClick"));
            Actions actions = new Actions(driver);
            actions.doubleClick(elementToDoubleClick).perform();

            // Verify that the new window opens with the desired URL
            Set<String> windowHandles = driver.getWindowHandles();
            String newWindowHandle = windowHandles.iterator().next();
            driver.switchTo().window(newWindowHandle);
            Assert.assertEquals("Desired URL", driver.getCurrentUrl());

            driver.quit();
        }
    }

*/

}
