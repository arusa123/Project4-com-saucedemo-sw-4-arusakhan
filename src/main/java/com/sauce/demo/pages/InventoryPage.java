package com.sauce.demo.pages;

import com.sauce.demo.utility.Utility;
import org.openqa.selenium.By;

public class InventoryPage extends Utility {

    By titleOfPage = (By.xpath("//span[@class='title']"));

    By listOfProducts = (By.xpath("//div[@class='inventory_item']"));


    public int sizeOfTheList() {
        return driver.findElements(listOfProducts).size();
    }

    public String getTitleOfThePage() {

        return getTextFromElement(titleOfPage);
    }

}
