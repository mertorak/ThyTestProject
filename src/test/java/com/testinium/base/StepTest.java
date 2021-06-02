package com.testinium.base;

import com.testinium.page.HomePage;
import com.testinium.page.PricePage;
import com.testinium.page.SearchPage;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;


public class StepTest extends BaseTest {

    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();
    PricePage pricePage = new PricePage();

    @Step("Bilet al butonuna basilir")
    public void chekIfOpenPage(){
        Assert.assertTrue(homePage.clickBtnBooking());
    }

    @Step("Tek yon ucus bileti secilir")
    public void checkOneWay(){
        searchPage.clickOneWay();
    }

    @Step("Yon bilgisi olarak 'saw' to 'esb' seçilir")
    public void adress(){
      searchPage.clickFromBtn();
      searchPage.setFrom("saw");
      searchPage.clickToBtn();
      searchPage.setTo("esb");
      searchPage.clickToSelect();
    }

    @Step("Tarih bilgisi 2 gun sonraya secilir ve tamam butonuna basılır")
    public void travelDate(){
        searchPage.dateClick();
        searchPage.clickDateSelect();
        searchPage.clickOkBtn();
    }

    @Step("Yetiskin bilgisi olarak secilir ve ucus ara butonuna basilir")
    public void passanger(){
        searchPage.clickPassangerBtn();
        searchPage.clickPassNumber();
        searchPage.clickSearchBtn();
    }

    @Step("Ucuslar listesi kontrol edilir")
    public void checkIfOpenTicketList(){
        Assert.assertTrue(pricePage.checkIfOpenPage());
    }

    @Step("Ekonomik ucus secilir ve devam et butonuna basilir")
    public void clickEcoFly(){
        pricePage.clickFlight();
        pricePage.clickEcoFly();
        pricePage.clickContBtn();
    }

}
