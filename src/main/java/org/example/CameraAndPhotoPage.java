package org.example;

import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CameraAndPhotoPage extends Utils
{
    //Necessary Locator of the page
    private String _addToCartButton = "//div[@class='products-wrapper']//div[3]/div[2]";

    //Check add to cart button
    public void checkAddToCartButton()
    {
        List < WebElement> addToCartButton = driver.findElements(By.xpath(_addToCartButton));

            for (WebElement element : addToCartButton)
            {
                String actual = element.getText();
                Verify.verify(actual.contains("ADD TO CART"), "Add to cart button is not there");
            }
    }
}
