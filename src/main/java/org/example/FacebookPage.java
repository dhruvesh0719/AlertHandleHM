package org.example;

import org.openqa.selenium.By;

import org.testng.Assert;


public class FacebookPage extends Utils
{
    LoadProp loadProp = new LoadProp();

    private String _faceBookButton = "//div[@class='social']/ul/li[1]";
    private String _nopCommerceTitle = "//div[@class='x1e56ztr x1xmf6yo']";

    //Click on Face book button
    public void clickOnFaceBookButton()
    {
        //click on face book page
        clickOnElement(By.xpath(_faceBookButton));

        //Accept cookies
        cookies();

        //Click on accept cookies button
        clickOnElement(By.xpath("//div[@role='dialog']/div/div[2]/div/div[2]/div[1]/div/div/div"));

        //Close the popup window
        clickOnElement(By.xpath("//div[@role='dialog']/div[1]"));


        //Verify URL
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL,loadProp.getProperty("expectedURLatFacebookPage"),"URL you are getting is not correct");


        //Verify NopCommerce title
        String actualTitle=captureTextOfTheElement(By.xpath(_nopCommerceTitle));
        Assert.assertEquals(actualTitle,loadProp.getProperty("expectedTitleFaceBookPage"),"The Title is Wrong");


        //Navigate to parent window
        driver.navigate().back();
    }
}
