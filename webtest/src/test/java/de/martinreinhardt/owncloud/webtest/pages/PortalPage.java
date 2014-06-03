/**
 * File: LoginPage.java 27.05.2014, 12:33:23, author: mreinhardt
 * 
 * Project: OwnCloud
 *
 * https://www.martinreinhardt-online.de/apps
 */
package de.martinreinhardt.owncloud.webtest.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import de.martinreinhardt.owncloud.webtest.OwnCloud;
import de.martinreinhardt.owncloud.webtest.util.AbstractPage;
import de.martinreinhardt.owncloud.webtest.util.UITestConstants;

@Story(OwnCloud.Apps.class)
@WithTag("Apps")
@DefaultUrl(UITestConstants.DEFAULT_URL)
public class PortalPage extends AbstractPage {

	@FindBy(xpath = "//ul[@id='apps']/div/li[@data-id='roundcube_index']/a/img")
	private WebElement roundcubeButton;

	@FindBy(xpath = "//ul[@id='apps']/div/li[@data-id='storage_charts']/a/img")
	private WebElement storageChartsButton;

	/**
	 * @param pWebDriver
	 */
	public PortalPage(WebDriver pWebDriver) {
		super(pWebDriver);
	}

	public void go_to_roundcube_app() {
		click(roundcubeButton);
	}

	public void go_to_storage_charts_app() {
		click(storageChartsButton);
	}

}