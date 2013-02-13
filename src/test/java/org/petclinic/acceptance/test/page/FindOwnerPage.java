package org.petclinic.acceptance.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

	
public class FindOwnerPage extends TemplatePage {

	@FindBy(id = "findOwnerButton")
	private WebElement findOwnerLink;
	
	@FindBy(id = "ownersTable")
	private WebElement ownersTable;
	
	@FindBy(id = "owner1")
	private WebElement ownerLink;
	
	@FindBy(id = "ownerTable")
	private WebElement ownerTable;
	
	public FindOwnerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean hasPageLoaded() {
		
		if(findOwnerLink == null){
			return false;
		}
		return true;
	}
	
	public void clickFindOwnerButton(){
		findOwnerLink.click();
	}

	public boolean allTheOwnersAreDisplayed() {
		if(ownersTable == null){
			return false;
		}
		return true;
		
	}

	public void clickOwner() {
		ownerLink.click();
		
		
	}

	public boolean ownerPageIsDisplayed() {
		if(ownerTable == null){
			return false;
		}
		return true;
		
	}
}
