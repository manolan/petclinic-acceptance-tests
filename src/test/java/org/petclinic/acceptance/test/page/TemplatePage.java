package org.petclinic.acceptance.test.page;

import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class TemplatePage extends PageObject {

	@FindBy(xpath = "//div[@class='shopLabel']/strong")
	private WebElement shopAndStaffLabel;

	public abstract boolean hasPageLoaded();

	public TemplatePage(WebDriver driver) {
		super(driver);
	}

	public String getShopAndStaffLabel() {
		return element(shopAndStaffLabel).getTextValue();
	}

	public boolean isAlertVisibleWithMessage(String message) {
		try {
			Alert alert = this.getAlert();
			return alert.getText().equals(message);
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	public void acceptAlert() {
		Alert alert = this.getAlert();
		alert.accept();
	}
}
