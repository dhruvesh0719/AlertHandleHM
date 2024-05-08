package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils

{
    //Necessary Locator of Page
    private String _cameraAndPhoto = "//div[@class='item-grid']/div[1]";

    //Click on Camera & photo
    public void clickOnCameraAndPhoto()
    {
        clickOnElement(By.xpath(_cameraAndPhoto));
    }
}
