package org.petclinic.acceptance.test.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends TemplatePage {

	@FindBy(id = "findOwnerLink")
	private WebElement findOwnerLink;

	@FindBy(xpath = "//input[@value='No Cash Card - Deposit Only']")
	private WebElement noCashCardButton;

	@FindBy(xpath = "//input[@type='submit']")
	private List<WebElement> allButtons;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@Override
	public boolean hasPageLoaded() {
		waitFor("//legend[text()='Please choose']");
		return true;
	}
	
	public void clickFindOwnerLink(){
		findOwnerLink.click();
	}


	public String getNoCashCardButtonText() {
		return element(noCashCardButton).getValue();
	}

	public List<String> getAllButtonsText() {
		List<String> allButtonsText = new ArrayList<String>(allButtons.size());

		for (WebElement webElement : allButtons) {
			allButtonsText.add(element(webElement).getValue());
		}
		return allButtonsText;
	}


	public void openHomePage() {
		open();
	}


}
