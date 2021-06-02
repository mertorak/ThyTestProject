package com.testinium.page;

import com.testinium.base.BasePage;
import org.openqa.selenium.By;

public class SearchPage extends BasePage {
    public static By oneWay = By.id("com.turkishairlines.mobile:id/frDashboard_tvOneWay");
    public static By fromBtn = By.id("com.turkishairlines.mobile:id/frDashboard_llFrom");
    public static By sendAmountFrom = By.id("com.turkishairlines.mobile:id/frAirportSelection_etSearch");
    public static By toBtn = By.id("com.turkishairlines.mobile:id/frDashboard_llTo");
    public static By sendAmountTo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");
    public static By clickToSelect = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]");
    public static By date = By.id("com.turkishairlines.mobile:id/frDashboard_rlDeparture");
    public static By dateSelect = By.xpath("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[7]/android.widget.TextView");
    public static By okBtn = By.id("com.turkishairlines.mobile:id/frDashboard_btnDone");
    public static By passangerBtn = By.id("com.turkishairlines.mobile:id/frDashboard_tvPassengerTitle");
    public static By passNumber = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[7]/android.widget.TextView");
    public static By searchFlight = By.id("com.turkishairlines.mobile:id/frDashboard_btnSearch");


    public void clickOneWay(){
        clickElement(oneWay);
    }

    public void clickFromBtn(){
        clickElement(fromBtn);
    }

    public void setFrom(String name){
        sendKeys(sendAmountFrom,"saw");
    }

    public void clickToBtn(){
        clickElement(toBtn);
    }

    public void setTo(String name){
        sendKeys(sendAmountTo,"esb");
    }

    public void clickToSelect(){
        clickElement(clickToSelect);
    }

    public void dateClick(){
        clickElement(date);
    }

    public void clickDateSelect(){
        clickElement(dateSelect);
    }

    public void clickOkBtn(){
        clickElement(okBtn);
    }

    public void clickPassangerBtn(){
        clickElement(passangerBtn);
    }

    public void clickPassNumber(){
        clickElement(passNumber);
    }

    public void clickSearchBtn(){
        clickElement(searchFlight);
    }

}
