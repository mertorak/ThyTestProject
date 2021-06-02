package com.testinium.page;

import com.testinium.base.BasePage;
import org.openqa.selenium.By;

public class PricePage extends BasePage {
    public static By pageControl = By.id("id= com.turkishairlines.mobile:id/frFlightSearch_rlPageContent");
    public static By flightSelect = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]");
    public static By ecoFly = By.xpath("= /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup");
    public static By continueBtn = By.id("com.turkishairlines.mobile:id/frFlightSearch_btnContinue");


    public boolean checkIfOpenPage(){
        getText(pageControl);
        return false ;
    }

    public void clickFlight(){
        clickElement(flightSelect);
    }
    public void clickEcoFly(){
        clickElement(ecoFly);
    }
    public void clickContBtn(){
        clickElement(continueBtn);
    }

}
