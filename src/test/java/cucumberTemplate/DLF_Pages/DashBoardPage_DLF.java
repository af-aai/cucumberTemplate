package cucumberTemplate.DLF_Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DashBoardPage_DLF extends BasePage_DLF {

    @AndroidFindBy(xpath ="(//android.widget.ImageView[@content-desc=\"Öffne zusätzliche Funktionen\"])[1]" )
    public MobileElement threeDotButton;
    @AndroidFindBy(xpath ="//android.widget.TextView[@content-desc=\"Download starten\"]" )
    public MobileElement DownloadButton;
    @AndroidFindBy(xpath ="//*[@resource-id='de.deutschlandfunk.dlfaudiothek:id/text_txt']" )
    public MobileElement TextFromfirstArticle;
}
