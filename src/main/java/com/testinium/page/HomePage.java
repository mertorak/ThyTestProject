package com.testinium.page;

import com.testinium.base.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public static By buyButon = By.id("com.turkishairlines.mobile:id/acMain_btnBooking");

    public boolean clickBtnBooking(){
        clickElement(buyButon);
        return false;
    }

}
