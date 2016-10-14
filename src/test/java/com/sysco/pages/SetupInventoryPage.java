/**
 ********************************************************************************************************************************************
 ********************************************************************************************************************************************
 *																																		   	*
 * 2016-2017 Infosys Limited, Banglore, India. All Rights Reserved																			*

 * Version: 1.0																																*
 * 																																			*
 * Except for any free or open source software components embedded in this Infosys proprietary software program ("Program"),				*
 * this Program is protected by copyright laws, international treaties and other pending or existing intellectual property rights in India, *
 * the United States and other countries. Except as expressly permitted, any unautorized reproduction, storage, transmission 				*
 * in any form or by any means (including without limitation electronic, mechanical, printing, photocopying, recording or otherwise), 		*
 * or any distribution of this Program, or any portion of it, may result in severe civil and criminal penalties, 							*
 * and will be prosecuted to the maximum extent possible under the law 																		*
 *																																			*
 ********************************************************************************************************************************************
 ********************************************************************************************************************************************
 **/
package com.sysco.pages;

import java.io.IOException;
import java.util.Set;
import java.util.logging.Logger;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.sysco.pages.VendorPage;
import com.sysco.jsn_framework.JSN_Framework;
import com.sysco.locators.Screenshot;


public class SetupInventoryPage extends JSN_Framework {
	private static final Logger LOGGER= Logger.getLogger(SetupInventoryPage.class.getCanonicalName());
	public static final String SetUp_Pg1Title = 
			"//*[@class='mm-c-inventory-setup']//*[contains(text(),'Import Items')]";
			
		public static final String StartFromScratch = "//*[@class='btn btn-sm btn-primary' and contains(text(),'Start From Scratch')]";
			
		public static final String OrderGuide = 
				"//*[@type='button' and contains(text(),'Order Guide')]";
			

		public static final String Continue = "//*[@class='btn btn-default' and contains(text(),'Continue')]";
			
		public static final String AddItems_Scratch = "//*[@class='btn-default btn btn-default' and contains(text(),'Add Items')]";
			
		public static final String AddItemFromPage_Scratch = "//*[@class='navbar-brand']//*[contains(text(),'Add Item From')]";
			
		public static final String OrderGuidePage = "//*[@class='navbar-brand']//*[contains(text(),'Order Guide')]";
			
		public static final String OrderGuide_FirstItemSelect = "(//*[@id='mount']//*[@class='mm-o-icon'])[1]";
		public static final String OrderGuide_1stItemHeading ="(//*[@class='mm-c-product-list']//*[@class='mm-c-product-minlist__item'])[1]/h4";
		//public static final String Done =  "//*[@id='done-nav']/a";
		//public static final String Done ="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[2]/android.widget.ListView[2]/android.view.View[1]";
		public static final String Done ="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[3]/android.widget.ListView[2]/android.view.View[1]";
       //public static final String Done ="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[3]/android.widget.ListView[2]";
       public static final String Cancel ="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[3]/android.widget.ListView[1]";
     

//		public static final String Done = "//UIAStaticText[@label='Done']";
//		public static final String Return = "//UIAStaticText[@label='Return']";
		public static final String TakeMeHome = "//*[@class='btn btn-default' and contains(text(),'Take me Home')]";
		public static final String Category_Header = "//*[@id='mount']//*[@class='navbar-brand']/h3";

		public static final String AddItem_OrderGuide = "//*[@id='list-item']//*[contains(text(),'Browse Order Guide')]";
			

		public static final String AddItem_NonSyscoItem ="//*[@id='list-item']//*[contains(text(),'Create Non-Sysco Item')]";
			
		public static final String SetUp_Pg2Title = "//*[@class='mm-c-inventory-setup']//*[contains(text(),'SETUP LOCATIONS')]";
			

		public static final String AddItem_PrepItem = "//*[@id='list-item']//*[contains(text(),'Create Prep Item')]";
			
		public static final String AddProduct_Page = "//*[@class='navbar-brand']//*[contains(text(),'Add Product')]";
			
		public static final String AddProductPage_AddSupplier ="//select[@name='supplier']";
		
		public static final String Supplier_Select = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.CheckedTextView[2]";
		public static final String Add_Catogory = "//*[@id='expense-add']/div/select";
		public static final String Category_Select="//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.CheckedTextView[2]";
		public static final String Category_Selection="//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.CheckedTextView[2]";

			

	public static final String AddProductPage_ProductName = "//*[@id='name']";
		//public static final String AddProductPage_ProductName = "//android.widget.EditText[@resource-id=‘name’]";
		public static final String AddProductPage_UPC =  "//*[@id='materialId']";
		public static final String AddProductPage_Pack = "//*[@id='pack']";
		public static final String AddProductPage_Size = "//*[@id='size']";
		public static final String AddProductPage_Weight = "//*[@id='averageWeightPerCase']";
			
		public static final String AddProductPage_Price =  "//*[@id='price']";
		public static final String AddProductPage_ProductBrand =  "//*[@id='brand']";

		public static final String OrderGuide_FirstItemHeader = "//*[@id='mount']/div/div[2]/div[1]/div/div/div[1]/div/div[2]/h4";
			
		public static String ItemName;
		public static String SearchItemName;

		public static final String SetUp_Pg3Title = "//UIAStaticText[@label='SET UP FOOD COST']";
		public static final String SkipStep_TrackFoodCostPg = "//UIAStaticText[@label='Skip This Step']";
		public static final String FoodAndNonFood = "//UIAButton[@label='Food & Non-Food']";
		public static final String SuggestedCategories = 
				"//UIAButton[@label='Suggested Categories']";
		public static final String CustomCategories = 
				 "//UIAButton[@label='Custom Categories']";
			
		public static final String InvToolsPg = 
				"//UIAStaticText[@label='Inventory Tools']";

		public static String CategoryName;
		public static String ItemNameSelected;
		public static String ItemNameAdded;
		public static String verificationFoodOrNonFood;

		public static final String setupInventryFirstProduct = 	"//*[@id='content-container']/div/div/div[1]/div/div/div/div/div[3]/h4";
			

		public static final String OrderGuide_1stItemSelect = "(//*[@class='mm-c-product-list']//*[@class='mm-o-icon'])[1]";
			
		public static final String OrderGuide_2ndItemSelect = "(//*[@class='mm-c-product-list']//*[@class='mm-o-icon'])[2]";
			
		public static final String OrderGuide_3rdItemSelect = "(//*[@class='mm-c-product-list']//*[@class='mm-o-icon'])[3]";
			

		public static final String OrderGuide_2ndItemHeading ="(//*[@class='mm-c-product-list']//*[@class='mm-c-product-minlist__item'])[2]/h4";
			
		public static final String OrderGuide_3rdItemHeading = "(//*[@class='mm-c-product-list']//*[@class='mm-c-product-minlist__item'])[3]/h4";
			

		public static final String SetUpInventory_ItemsAddedViaOrderGuide = "//*[@class='mm-c-product-list']//*[@class='Grid__innerScrollContainer']//*[@class='Grid__cell']";
			

		public static int noOfElements = 0;
		public static String ItemName1;
		public static String ItemName2;
		public static String ItemName3;
		public static String ItemAdded = null;
		public static final String FirstItemSelectedFromUncatgorised = "(//*[@id='content-container']//*[@class='mm-o-icon'])[2]";
			
		public static final String FirstItemSelectedFromUncatgorisedHeading = "(//*[@id='content-container']//*[@class='mm-c-product-list__details-wrapper'])[2]/h4";
			

		public static final String FirstItemSelectedFromUncatgorisedAllItemsString = "//*[@id='content-container']//*[@class='mm-c-product-list__details-wrapper']/h4";
			
		public static final String AddProductPage_ModalWindowForAddSupplierYes = "//*[@class='modal-content']//*[@id='yes-button']";

		public static final String AddItemsLink = "//*[@class='mm-c-product-list__sticky-row mm-u-navbar-padding']//span[contains(text(),'Add More Items')]";
			
		public static final String AddItemFromPage_PrepItemWeb = "//*[@id='list-item' and contains(text(),'Prep Item')]";
			
		public static final String Skip = "//*[@id='skip']/a";
			
		public static final String Search = "//*[@placeholder='Search']";

		public static final String AddProductPage_AddLocations = "//select[@name='locations[0].groupId']";   
			
		public static final String AddProductPage_AddCategory = "//select[@name='expense']";
			
		public static final String DoThisLater ="//*[contains(text(),'Do This Later')]";

		public static final String ReadyToTrack ="//*[@class='btn btn-default']//*[contains(text(),'Ready to track your inventory?')]";
			
		public static final String ReadyToStart = "//*[@class='btn btn-default']//*[contains(text(),'ready to get started')]";
			
		public static final String Next = "//*[@id='next']";
			
		public static final String CustomList ="//*[@type='button' and contains(text(),'Custom List')]";
			
		public static String keyword;
		public static String[] searchKeyword;

		public static String AddedItemId;
		public static String[] AddedItemId1;
		public static String[] AddedItemId1_1;
		public static String[] AddedItemId1_2;
		public static String[] AddedItemId1_3;
		public static final String SuccessMsg1 = "//*[contains(text(),'Congratulations!')]";
		public static final String SuccessMsg2 = "//*[contains(text(),'You have completed setting up your inventory.')]";
			
		public static final String SuccessMsg3 = "//*[contains(text(),'Your inventory can be accessed at any time from the inventory tools homepage. You can add items, track your inventory, enter purchases, and view food costs and trends.')]";
			

		public static final String OrderGuideDesc = "//*[@class='mm-c-inventory-setup']//*[contains(text(),'Import from purchase history')]";
			
		public static final String CustomListsDesc ="//*[@class='mm-c-inventory-setup']//*[contains(text(),'Use my custom lists to import items and locations')]";
			
		public static final String StartFromScratchDesc = "//*[@class='mm-c-inventory-setup']//*[contains(text(),'Add items manually')]";
		public static String[] ItemName2_2;	
		
		
	/* Functions on the Page are defined below */

		VendorPage vp = new VendorPage();

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage StartFromScratch(String string) throws InterruptedException, IOException {
		String string2 = "Issue";
		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;
		try {

			waitForElementToBeClickable(SetUp_Pg1Title);
			waitForElementToBeClickable(StartFromScratch);
			clickElement(StartFromScratch);

			Reporter.log("Tapped on Start from Scratch :Pass");
		}

		catch (Exception e) {
			Reporter.log("Tapped on Start from Scratch :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);

		}

		return this;

	}

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage tapContinue(String string) throws InterruptedException, IOException {
		String string2 = "Issue";
		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;
		try {

			waitForElementToBeClickable(Continue);
			clickElement(Continue);

			Reporter.log("Tapped on Continue :Pass");
		}

		catch (Exception e) {
			Reporter.log("Tapped on Continue :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);

		}

		return this;

	}

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage Setup_AddItemsLink(String string) throws InterruptedException, IOException {
		String string2 = "Issue";
		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;
		try {

			waitForElementToBeClickable(AddItemsLink);
			clickElement(AddItemsLink);

			Reporter.log("Tapped on add items link :Pass");
		}

		catch (Exception e) {
			Reporter.log("Tapped on add items link :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);

		}

		return this;

	}
	/*@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public SetupInventoryPage ViewItemDetails(String name, String upc,
			String pack, String size, String weight, String price,String brand,String category,String location,
			String string) throws InterruptedException, IOException {
		String string1 = "Success";
		String string2 = "Issue";

		String finalPath = Screenshot.drivePath + string + string1
				+ Screenshot.pathExtension;
		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;
		try {

			switchToNativeContext();
			waitForElementPresent(AddProductPage_ProductName_Native);
			

			if (isElementPresent(AddProductPage_ProductName_Native)) {

			String	Name = getElementText(AddProductPage_ProductName_Native);
			
				if (Name.equals(name)) {
					Reporter.log("view item name detail :Pass");
				}
			}

			if (isElementPresent(AddProductPage_UPC_Native)) {

				String UPC = getElementText(AddProductPage_UPC_Native);
				
				if (UPC.equals(upc)) {
					Reporter.log("view item upc detail  :Pass");
				}
			}

			if (isElementPresent(AddProductPage_Pack_Native)) {

				String Pack = getElementText(AddProductPage_Pack_Native);
				
				if (Pack.equals(pack)) {
					Reporter.log("view item pack detail   :Pass");
							
				}
			}

			if (isElementPresent(AddProductPage_Size_Native)) {

				String Size = getElementText(AddProductPage_Size_Native);
				
				if (Size.equals(size)) {
					Reporter.log("view itm size detail   :Pass");
							
				}
			}

			if (isElementPresent(AddProductPage_Weight_Native)) {

				String Weight = getElementText(AddProductPage_Weight_Native);
				
				if (Weight.equals(weight)) {
					Reporter.log("view item weight detail   :Pass");
				}
			}

			if (isElementPresent(AddProductPage_Price_Native)) {

				String Price = getElementText(AddProductPage_Price_Native);
				
				if (Price.equals(price)) {
					Reporter.log("view item price detail  :Pass");
				}
			}
			if (isElementPresent(AddProductPage_ProductBrand_Native)) {

				String Brand = getElementText(AddProductPage_ProductBrand_Native);
			
				if (Brand.equals(brand)) {
					Reporter.log("view item brand detail  :Pass");
				}
			}
			if (isElementPresent(EditcategoryOption_PdtCard)) {

				String Category = getElementText(EditcategoryOption_PdtCard);
				
				if (Category.equals(category)) {
					Reporter.log("view item category detail  :Pass");
				}
			}
			if (isElementPresent(EditLocationOption_PdtCard)) {
				
				String Location = getElementText(EditLocationOption_PdtCard);
				
				if (Location.equals(location)) {
					Reporter.log("view item location detail  :Pass");
				}
			}
		
			Reporter.log("view item detail   :Pass");
			switchToWebContext();
		} catch (Exception e) {
			switchToNativeContext();
			takeScreenshot(finalPath1);
			Reporter.log("view item detail  :Fail");
			Assert.assertTrue(false);
		}

		return this;
	}*/

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage Scratch_AddItems(String string) throws InterruptedException, IOException {

		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;
		try {

			waitForElementToBeClickable(AddItems_Scratch);
			clickElement(AddItems_Scratch);
			waitForElementToBeClickable(AddItemFromPage_Scratch);

			Reporter.log("Tapping on add items button from setup inventory page :Pass");
					
		}

		catch (Exception e) {
			Reporter.log("Tapping on add items button from setup inventory page :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
				
			Assert.assertTrue(false);
		}
		return this;

	}

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage AddItemFrom_NonSysco(String string) throws InterruptedException, IOException {

		String string2 = "Issue";
		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;

		try {
			waitForElementToBeClickable(AddItemFromPage_Scratch);

			if (isElementPresent(AddItem_NonSyscoItem)) {

				clickElement(AddItem_NonSyscoItem);

				waitForElementToBeClickable(AddProduct_Page);
				Reporter.log("Nonsysco item selected from add item from page :Pass");
					

			}

		} catch (Exception e) {
			Reporter.log("Nonsysco item selected from add item from page  :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);

			
				
			Assert.assertTrue(false);
		}
		return this;

	}

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage AddItemFrom_PrepItem(String string) throws InterruptedException, IOException {

		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;

		try {

			waitForElementToBeClickable(AddItemFromPage_Scratch);

			if (isElementPresent(AddItem_PrepItem)) {

				clickElement(AddItem_PrepItem);

				waitForElementToBeClickable(AddProduct_Page);
				Reporter.log("Prep item selected from add item from page :Pass");
					
			}

		} catch (Exception e) {
			Reporter.log("Prep item selected from add item from page  :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);

			
					
			Assert.assertTrue(false);
		}
		return this;

	}

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage AddItemFrom_OrderGuide(String string) throws InterruptedException, IOException {
		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;

		try {

			waitForElementToBeClickable(AddItem_OrderGuide);

			if (isElementPresent(AddItem_OrderGuide)) {

				clickElement(AddItem_OrderGuide);

				waitForElementToBeClickable(Category_Header);

				Reporter.log("Order Guide clickElement : Pass");

			}

		} catch (Exception e) {
			Reporter.log("Order Guide clickElement : Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);
		}
		return this;
	}

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage SelectItemFrom_OrderGuide(String string) throws InterruptedException, IOException {
		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;

		try {

			waitForElementToBeClickable(Category_Header);

			if (isElementPresent(OrderGuide_FirstItemSelect)) {
				clickElement(OrderGuide_FirstItemSelect);

				ItemName1 = getElementText(OrderGuide_1stItemHeading);
				final String keyword1 = 
						"//*[@class='mm-c-product-minlist__item']//*[contains(text(),'"
								+ ItemName1
								+ "')]/following-sibling::div[@class='mm-c-product-minlist__details']";
						
				AddedItemId = getElementText(keyword1);
				AddedItemId1_1 = AddedItemId.split("/");

				Reporter.log("First item selected Order Guide  :Pass");
						
/*
			} else
				Reporter.log("Order Guide Items not available",
						LogType.VERIFICATION_STEP);
*/
		}
		}

		catch (Exception e) {
			Reporter.log("First item selected Order Guide :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);
		}
		return this;
	}

	@SuppressWarnings("rawtypes")
	//updated by periya - Added additional param to send expected value, without that it was not working as we are modifying the name in some workflow
	public SetupInventoryPage verifyOGItemsOnSetupInv(String strExpected, String string) throws InterruptedException, IOException {
		String string2 = "Issue";
		
		String SetUpInventory_1stItemHeading ="";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;
		try {
			waitForElement(3);
			if(strExpected.isEmpty()){
			SetUpInventory_1stItemHeading = 
					"//*[@class='mm-c-product-list']//*[@class='Grid__innerScrollContainer']//*[@class='mm-c-product-list__details-wrapper']//*[contains(text(),'"
							+ SetupInventoryPage.AddedItemId1_1[0] + "')]";  }
			
			else{
				 SetUpInventory_1stItemHeading = 
							"//*[@class='mm-c-product-list']//*[@class='Grid__innerScrollContainer']//*[@class='mm-c-product-list__details-wrapper']//*[contains(text(),'"
									+ strExpected + "')]";
			}
					
			waitFor(10);
			Boolean boolean1 = isElementPresent(
					SetUpInventory_1stItemHeading);

			if (boolean1)
				Reporter.log("Item Found in Setup Inventory:Pass");
					
			else {
				Assert.assertTrue(false);
			}

		}

		catch (Exception e) {
			Reporter.log("Item Found in Setup Inventory:Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			takeScreenshot(finalPath1);
			Assert.assertTrue(false);
		}

		return this;

	}

	//updated by periya - Added additional param to send expected value, without that it was not working as we are modifying the name in some workflow
	@SuppressWarnings({ "unused", "rawtypes" })
	public SetupInventoryPage verifySearchItemsOnSetupInv(String str,String string) throws InterruptedException, IOException {
		String string1 = "Success";
		String string2 = "Issue";
		waitForElement(3);

		String finalPath = Screenshot.drivePath + string + string1
				+ Screenshot.pathExtension;
		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;
		String SetUpInventory_1stItemHeading = "";
		try {

			
			if (isElementPresentAfterWait(Category_Header,40)) {
				
				if(str.isEmpty()){
					 SetUpInventory_1stItemHeading = 
						"//*[@class='mm-c-product-list']//*[@class='Grid__innerScrollContainer']//*[@class='mm-c-product-list__details-wrapper']//*[contains(text(),'"
								+ SearchItemName + "')]";
				}else{
					 SetUpInventory_1stItemHeading = 
								"//*[@class='mm-c-product-list']//*[@class='Grid__innerScrollContainer']//*[@class='mm-c-product-list__details-wrapper']//*[contains(text(),'"
										+ str + "')]";
				}

				waitFor(10);
				Boolean boolean1 = isElementPresent(
						SetUpInventory_1stItemHeading);

				if (boolean1)
					Reporter.log("Item Found in Setup Inventory:Pass");
					
				else {
					Reporter.log("Item Found in Setup Inventory:Fail");
				
					Assert.assertTrue(false);
				}

			}
		}

		catch (Exception e) {
			switchToNativeContext();
			Reporter.log("Item Found in Setup Inventory:Fail");
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);
		}

		return this;

	}

	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public SetupInventoryPage TapOnDone(String string) throws InterruptedException, IOException {
		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;

		try {
			switchToNativeContext();
			waitForElementToBeClickable(Done);
			if (isElementPresent(Done)) {

				clickElement(Done);
				waitForElement(10);
				
				switchToWebContext();
				Reporter.log("Tapped on done:Pass");

				
			}

		} catch (Exception e) {
			Reporter.log("Tapped on done :Fail");
			switchToNativeContext();
			
			takeScreenshot(finalPath1);
			Assert.assertTrue(false);
		}

		return this;
	}
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public SetupInventoryPage TapOnCancel(String string) throws InterruptedException, IOException {
		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;

		try {
			switchToNativeContext();
			waitForElementToBeClickable(Cancel);
			if (isElementPresent(Cancel)) {

				clickElement(Cancel);
				
				switchToWebContext();
				Reporter.log("Tapped on Cancel:Pass");

				
			}

		} catch (Exception e) {
			Reporter.log("Tapped on done :Fail");
			switchToNativeContext();
			
			takeScreenshot(finalPath1);
			Assert.assertTrue(false);
		}

		return this;
	}
	@SuppressWarnings("rawtypes")
	public SetupInventoryPage EnterItemDetails(String name, String upc,
			String pack, String size, String weight, String price,
			String brand, String string) throws InterruptedException, IOException {
		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;
		Reporter.log("Entering details of  item");
		try {
			waitForElementToBeClickable(AddProductPage_ProductName);
			if (isElementPresent(AddProductPage_ProductName)) {

			
				clearElement(AddProductPage_ProductName);
				clickElement(AddProductPage_ProductName);

				sendText(AddProductPage_ProductName, name);
			
					Reporter.log("Entering Product name");
			}
			
			if (isElementPresent(AddProductPage_ProductBrand)) {
				Reporter.log("Entering Product brand");
				clearElement(AddProductPage_ProductBrand);
				clickElement(AddProductPage_ProductBrand);
				waitFor(30);
				sendText(AddProductPage_ProductBrand, brand);
			}

			waitForElementToBeClickable(AddProductPage_UPC);
			if (isElementPresent(AddProductPage_UPC)) {
				Reporter.log("Entering Product id");
				clearElement(AddProductPage_UPC);
				clickElement(AddProductPage_UPC);

				sendText(AddProductPage_UPC, upc);
			}
			if (isElementPresent(AddProductPage_Pack)) {
				Reporter.log("Entering Pack");
				clearElement(AddProductPage_Pack);
				clickElement(AddProductPage_Pack);
				sendText(AddProductPage_Pack, pack);
			}
			if (isElementPresent(AddProductPage_Size)) {
				Reporter.log("Entering size");
				clearElement(AddProductPage_Size);
				clickElement(AddProductPage_Size);
				sendText(AddProductPage_Size, size);
			}
			if (isElementPresent(AddProductPage_Weight)) {
				Reporter.log("Entering weight");
				clearElement(AddProductPage_Weight);
				clickElement(AddProductPage_Weight);

				sendText(AddProductPage_Weight, weight);
			}

			if (isElementPresent(AddProductPage_Price)) {
				Reporter.log("Entering Price");
				clearElement(AddProductPage_Price);
				clickElement(AddProductPage_Price);
				sendText(AddProductPage_Price, price);
			}
			
			/*MobileElement abc=(MobileElement)driver.findElement(By.className("mm-c-product-details mm-u-navbar-padding"));
			abc.swipe(SwipeElementDirection.UP, 6000);
			*/
			
			
			waitFor(2);
			Reporter.log("Item details are entered :Pass");

		} catch (Exception e) {
			Reporter.log("Item details are entered  :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);
		}
		return this;

	}

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage AddSupplier_AddProductDetailsPage(String string) throws InterruptedException, IOException {

		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;
		try {

			waitForElementToBeClickable(AddProductPage_AddSupplier);
			if (isElementPresent(AddProductPage_AddSupplier)) {
				clickElement(AddProductPage_AddSupplier);
			}
			Reporter.log("Selected supplier : Pass");
		} catch (Exception e) {
			Reporter.log("Selected supplier :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);
		}
		return this;
	}

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage TapOrderGuide(String string) throws InterruptedException, IOException {
		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;

		try {
			
			waitForElementToBeClickable(OrderGuide);
			Thread.sleep(3000);
			//waitForElementToBeClickable(SetUp_Pg1Title);
			clickElement(OrderGuide);

			Reporter.log("Selected  orderguide  from SetupInventoryImportItems:Pass");
			
		} catch (Exception e) {
			Reporter.log("Selected  orderguide  from SetupInventoryImportItems :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
				
			Assert.assertTrue(false);
		}

		return this;

	}

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage verifyNonSyscoPrepItemSetupInv(String product,
			String string) throws InterruptedException, IOException {
		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;
		try {

			final String SetUpInventory_1stItemHeading = 
					"//*[@class='mm-c-product-list']//*[@class='Grid__innerScrollContainer']//*[@class='mm-c-product-list__details-wrapper']//*[contains(text(),'"
							+ product + "')]";

			waitForElement(4);
			Boolean boolean1 = isElementPresent(
					SetUpInventory_1stItemHeading);
			
			if (boolean1) {
				Reporter.log("Item Found in Setup Inventory:Pass");
					
			} else {
				Reporter.log("Item is not Found in Setup Inventory:Fail");
				throw new Exception();
			}

		}

		catch (Exception e) {
			Reporter.log("Item Found in Setup Inventory:Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			

			Assert.assertTrue(false);
		}

		return this;

	}
	@SuppressWarnings("rawtypes")
	public SetupInventoryPage ClickProduct(String product,
			String string) throws InterruptedException, IOException {
		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;
		try {

			final String SetUpInventory_1stItemHeading = 
					"//*[@class='mm-c-product-list']//*[@class='Grid__innerScrollContainer']//*[@class='mm-c-product-list__details-wrapper']//*[contains(text(),'"
							+ product + "')]";
            
			waitForElementToBeClickable(SetUpInventory_1stItemHeading);
			clickElement(SetUpInventory_1stItemHeading);
			
				Reporter.log("Item Click in Setup Inventory:Pass");
				
					
			

		}

		catch (Exception e) {
			Reporter.log("Item Found in Setup Inventory:Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			

			Assert.assertTrue(false);
		}

		return this;

	}
	/*@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public SetupInventoryPage ViewItemDetails(String name, String upc,
			String pack, String size, String weight, String price,String brand,String category,String location,
			String string) throws InterruptedException, IOException {
		String string1 = "Success";
		String string2 = "Issue";

		String finalPath = Screenshot.drivePath + string + string1
				+ Screenshot.pathExtension;
		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;
		try {

			switchToNativeContext();
			public static final String AddProductPage_ProductName_Native ="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[4]/android.widget.EditText[1]";
			waitForElementPresent(AddProductPage_ProductName_Native);
			

			if (isElementPresent(AddProductPage_ProductName_Native)) {

			String	Name = getElementText(AddProductPage_ProductName_Native);
			
				if (Name.equals(name)) {
					Reporter.log("view item name detail :Pass");
				}
			}
			public static final String AddProductPage_UPC_Native="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[4]/android.widget.EditText[2]";


			if (isElementPresent(AddProductPage_UPC_Native)) {

				String UPC = getElementText(AddProductPage_UPC_Native);
				
				if (UPC.equals(upc)) {
					Reporter.log("view item upc detail  :Pass");
				}
			}
			public static final String AddProductPage_Pack_Native="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[4]/android.widget.EditText[3]";

			if (isElementPresent(AddProductPage_Pack_Native)) {

				String Pack = getElementText(AddProductPage_Pack_Native);
				
				if (Pack.equals(pack)) {
					Reporter.log("view item pack detail   :Pass");
							
				}
			}
			public static final String AddProductPage_Size_Native="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[4]/android.widget.EditText[4]";

			if (isElementPresent(AddProductPage_Size_Native)) {

				String Size = getElementText(AddProductPage_Size_Native);
				
				if (Size.equals(size)) {
					Reporter.log("view itm size detail   :Pass");
							
				}
			}
			public static final String AddProductPage_Weight_Native="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[4]/android.widget.EditText[5]";

			if (isElementPresent(AddProductPage_Weight_Native)) {

				String Weight = getElementText(AddProductPage_Weight_Native);
				
				if (Weight.equals(weight)) {
					Reporter.log("view item weight detail   :Pass");
				}
			}
			
			public static final String EditcategoryOption_PdtCard="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[5]";
			if (isElementPresent(EditcategoryOption_PdtCard)) {

				String Category = getElementText(EditcategoryOption_PdtCard);
				
				if (Category.equals(category)) {
					Reporter.log("view item category detail  :Pass");
				}
			}
			public static final String EditLocationOption_PdtCard=
			if (isElementPresent(EditLocationOption_PdtCard)) {
				
				String Location = getElementText(EditLocationOption_PdtCard);
				
				if (Location.equals(location)) {
					Reporter.log("view item location detail  :Pass");
				}
			}
		
			Reporter.log("view item detail   :Pass");
			switchToWebContext();
		} catch (Exception e) {
			switchToNativeContext();
			takeScreenshot(finalPath1);
			Reporter.log("view item detail  :Fail");
			Assert.assertTrue(false);
		}

		return this;
	}*/

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage Prep_Prompt(String string) throws InterruptedException, IOException {
		String string2 = "Issue";
		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;
		try {
			waitForElementToBeClickable(AddProduct_Page);
			if (isElementPresent(AddProductPage_ProductName)) {
				waitForElementToBeClickable(AddProductPage_ProductName);
				waitForElementToBeClickable(AddProductPage_UPC);
				waitForElementToBeClickable(AddProductPage_Pack);

				waitForElementToBeClickable(AddProductPage_Size);

				waitForElementToBeClickable(AddProductPage_Pack);

				waitForElementToBeClickable(AddProductPage_Weight);
				waitForElementToBeClickable(AddProductPage_AddLocations);
				// waitForElementToBeClickable(AddProductPage_Price);

			//	waitForElementToBeClickable(AddProductPage_ProductBrand);

				// waitForElementToBeClickable(AddProductPage_Option);

			//	waitForElementToBeClickable(AddProductPage_AddSupplier);

				Reporter.log("Prep item details are present in page :Pass");
						System.out.println("Prep item details are present in page :Pass");
			}

		} catch (Exception e) {
			Reporter.log("Prep item details are present in page :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
				
			Assert.assertTrue(false);
		}
		return this;

	}

	
	public SetupInventoryPage NonSysco_Prompt(String str1,String string) throws InterruptedException, IOException {
		String string2 = "Issue";
		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;
		try {
			waitForElementToBeClickable(AddProduct_Page);
			if (isElementPresent(AddProductPage_ProductName)) {
				waitForElementToBeClickable(AddProductPage_ProductName);
				waitForElementToBeClickable(AddProductPage_UPC);
				waitForElementToBeClickable(AddProductPage_Pack);

				waitForElementToBeClickable(AddProductPage_Size);

				waitForElementToBeClickable(AddProductPage_Pack);

				waitForElementToBeClickable(AddProductPage_Weight);
				
				if ((str1.equalsIgnoreCase("uomsa001")) || (str1.equalsIgnoreCase("uomsa002"))) {
					
					if (isElementPresent(AddProductPage_Price)) {
					
					throw new Exception();	
					}
					
				}
				else{
					 waitForElementToBeClickable(AddProductPage_Price);
						Reporter.log("Price field is displayed for normal user:Pass");
				}

				// waitForElementToBeClickable(AddProductPage_Price);

				waitForElementToBeClickable(AddProductPage_ProductBrand);

				// waitForElementToBeClickable(AddProductPage_Option);
				waitForElementToBeClickable(AddProductPage_AddLocations);
				waitForElementToBeClickable(AddProductPage_AddSupplier);

				Reporter.log("Nonsysco item details are present in page :Pass");
					
			}

		} catch (Exception e) {
			Reporter.log("Nonsysco item details are present in page :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
				
			Assert.assertTrue(false);
		}
		return this;

	}
	
	@SuppressWarnings("rawtypes")
	public SetupInventoryPage skipfoodcost(String string) throws InterruptedException, IOException {
		Reporter.log("Skipping foodcost");
		String string2 = "Issue";
		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;

		try {

			waitForElementToBeClickable(SetUp_Pg3Title);
			waitForElementToBeClickable(SkipStep_TrackFoodCostPg);
			clickElement(SkipStep_TrackFoodCostPg);

			waitForElementToBeClickable(InvToolsPg);

			Reporter.log("Skipping foodcost :Pass");
		}

		catch (Exception e) {
			Reporter.log("Skipping foodcost:Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);
		}

		return this;

	}

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage NonSyscoItem_AddSupplierSelectAlertYes(
			String string) throws InterruptedException, IOException {
		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;
		Reporter.log("Updating non sysco item details");
		try {

			waitForElementToBeClickable(
					AddProductPage_ModalWindowForAddSupplierYes);
			clickElement(AddProductPage_ModalWindowForAddSupplierYes);
			Reporter.log("Non sysco item details-Add supplier Modal window-Yes :Pass");
			System.out.println("Non sysco item details-Add supplier Modal window-Yes :Pass");

		}

		catch (Exception e) {
			Reporter.log("Non sysco item details-Add supplier Modal window-Yes :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
				
			Assert.assertTrue(false);
		}
		return this;

	}

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage verifyNonSysco_AddedPdtSupplier(String name,
			String string) throws InterruptedException, IOException {

		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;

		try {

			String vendorName = name;

			final String VD_Vendorname = 
					"//*[@id='mount']//*[@class='mm-c-product-details__supplier' and contains(text(),'"
							+ vendorName + "')]";

			if (isElementPresent(VD_Vendorname)) {

				Reporter.log("Vendor is selected on Non sysco Add product page:Pass");
				

			} else {
				Reporter.log("Vendor is selected on Non sysco Add product page   :Fail");
					
				Assert.assertTrue(false);
			}

		}

		catch (Exception e) {
			Reporter.log("Vendor is selected on Non sysco Add product page   :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
				
			Assert.assertTrue(false);
		}
		return this;

	}

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage skipOrderGuide(String string) throws InterruptedException, IOException {

		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;

		try {

			waitForElementToBeClickable(SetUp_Pg3Title);
			waitForElementToBeClickable(SkipStep_TrackFoodCostPg);
			clickElement(SkipStep_TrackFoodCostPg);

			waitForElementToBeClickable(InvToolsPg);

			Reporter.log("Skip order guide :Pass");
		}

		catch (Exception e) {
			Reporter.log("Skip order guide :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);
		}

		return this;

	}

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage TapOnSkip(String string) throws InterruptedException, IOException {

		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;

		try {

			waitFor(2);
			waitForElementToBeClickable(Skip);
			clickElement(Skip);
			Reporter.log("Tapped on skip :Pass");
		}

		catch (Exception e) {
			Reporter.log("Tapped on skip :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);
		}

		return this;

	}

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage SearchItem(String keyword, String string) throws InterruptedException, IOException {
		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;

		try {

			waitForElementToBeClickable(Search);
			clickElement(Search);
			sendText(Search, keyword);
			
			((AndroidDriver) driver).findElement(By.xpath("//*[@placeholder='Search']")).sendKeys(Keys.ENTER);
			waitForElement(5);
			
			

			CategoryName = getElementText(Category_Header);

			Reporter.log("Search item :Pass");
		}

		catch (Exception e) {
			Reporter.log("Search item :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);
		}

		return this;

	}

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage TapOnDOThisLater(String string) throws InterruptedException, IOException {

		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;

		try {
			waitForElementToBeClickable(DoThisLater);
			clickElement(DoThisLater);
			Reporter.log("Tapped on DoThisLater :Pass");
		} catch (Exception e) {
			Reporter.log("Tapped on DoThisLater :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);
		}
		return this;
	}

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage ReadytoStart(String string) throws InterruptedException, IOException {

		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;

		try {
			waitForElementToBeClickable(Next);
			clickElement(Next);
			Reporter.log("Tapped on Ready to track :Pass");
		} catch (Exception e) {
			Reporter.log("Tapped on Ready to track :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);
		}
		return this;
	}

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage TapTakeHome(String string) throws InterruptedException, IOException {
		String string2 = "Issue";
		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;
		try {
			waitFor(5);
			waitForElementToBeClickable(SuccessMsg1);
			System.out.println(getElementText(SuccessMsg1));

			waitForElementToBeClickable(SuccessMsg2);
			System.out.println(getElementText(SuccessMsg2));
			waitForElementToBeClickable(SuccessMsg3);
			System.out.println(getElementText(SuccessMsg3));

			waitForElementToBeClickable(TakeMeHome);
			clickElement(TakeMeHome);
			Reporter.log("Tapped on TakeHome :Pass");

		}

		catch (Exception e) {
			Reporter.log("Tapped on TakeHome :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);

		}

		return this;

	}

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage SelectMultipleItemsFrom_OrderGuide(String string) throws InterruptedException, IOException {
		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;
		try {

			Reporter.log(" Adding Item from Order Guide");

			waitForElementToBeClickable(Category_Header);
			waitFor(2);
			CategoryName = getElementText(Category_Header);
			noOfElements = 0;

			if (isElementPresent(OrderGuide_1stItemSelect)) {
				noOfElements++;
				clickElement(OrderGuide_1stItemSelect);
				ItemName1 = getElementText(OrderGuide_1stItemHeading);
				final String keyword1 = 
						"//*[@class='mm-c-product-minlist__item']//*[contains(text(),'"
								+ ItemName1
								+ "')]/following-sibling::div[@class='mm-c-product-minlist__details']";
						
				AddedItemId = getElementText(keyword1);
				AddedItemId1_1 = AddedItemId.split("/");

			}
			if (isElementPresent(OrderGuide_2ndItemSelect)) {

				noOfElements++;
				clickElement(OrderGuide_2ndItemSelect);
				ItemName2 = getElementText(OrderGuide_2ndItemHeading);
				ItemName2_2 = ItemName2.split("\\s+");
				////
				
				final String keyword1 = 
			
						"//*[@class='mm-c-product-minlist__item']//*[contains(text(),'"
								+ ItemName2
								+ "')]/following-sibling::div[@class='mm-c-product-minlist__details']",
						
				AddedItemId = getElementText(keyword1);
				AddedItemId1_2 = AddedItemId.split("/");

			}

			if (isElementPresent(OrderGuide_3rdItemSelect)) {
				noOfElements++;
				clickElement(OrderGuide_3rdItemSelect);
				ItemName3 = getElementText(OrderGuide_3rdItemHeading);
				final String keyword1 = 
					
						"//*[@class='mm-c-product-minlist__item']//*[contains(text(),'"
								+ ItemName3
								+ "')]/following-sibling::div[@class='mm-c-product-minlist__details']";
						
				AddedItemId = getElementText(keyword1);
				AddedItemId1_3 = AddedItemId.split("/");
			}

			Reporter.log("Multiple items selected :Pass");

		}

		catch (Exception e) {
			Reporter.log("Multiple items selected :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);
		}
		return this;
	}

	@SuppressWarnings({ "unused", "rawtypes" })
	public SetupInventoryPage verifyMultipleItemsfromOGonSetUpInv(String string) throws InterruptedException, IOException {
		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;
		try {

			System.out.println(AddedItemId1_1[0]);
			System.out.println(AddedItemId1_2[0]);
			System.out.println(AddedItemId1_3[0]);

			final String SetUpInventory_1stItemHeading = 
					
					"//*[@class='mm-c-product-list']//*[@class='Grid__innerScrollContainer']//*[@class='mm-c-product-list__details-wrapper']//*[contains(text(),'"
							+ AddedItemId1_3[0] + "')]";
			final String SetUpInventory_2ndItemHeading = 
					
					"//*[@class='mm-c-product-list']//*[@class='Grid__innerScrollContainer']//*[@class='mm-c-product-list__details-wrapper']//*[contains(text(),'"
							+ AddedItemId1_2[0] + "')]";
			final String SetUpInventory_3rdItemHeading = 
				
					"//*[@class='mm-c-product-list']//*[@class='Grid__innerScrollContainer']//*[@class='mm-c-product-list__details-wrapper']//*[contains(text(),'"
							+ AddedItemId1_1[0] + "')]";
/*
			waitFor(10);
			Boolean boolean1 = isElementPresent(
					SetUpInventory_1stItemHeading);
			Boolean boolean2 = isElementPresent(
					SetUpInventory_2ndItemHeading);
			Boolean boolean3 = isElementPresent(
					SetUpInventory_3rdItemHeading);
			LocationsPage.count = 0;

			int count = 0;
			if (boolean1) {
				LocationsPage.count++;
				

			}
			if (boolean2) {
				LocationsPage.count++;
			
			}
			if (boolean3) {
				LocationsPage.count++;
			
			}

			if (noOfElements == LocationsPage.count) {

				Reporter.log("All Three Items Found in Setup Inventory :Pass");
						
			} else {
				throw new Exception();
			}

			Reporter.log("Multiple Items Found in Setup Inventory :Pass");
					*/
			int count = 0;
			waitForElementToBeClickable(SetUpInventory_1stItemHeading);
			boolean flag1_1 = isElementPresentAfterWait(SetUpInventory_1stItemHeading, 3);
			boolean flag1_2 = isElementPresentAfterWait(SetUpInventory_2ndItemHeading, 3);
			boolean flag1_3 = isElementPresentAfterWait(SetUpInventory_3rdItemHeading, 3);

		
			System.out.println(flag1_1);
			
			if (!(flag1_1 && flag1_2 && flag1_3)) {
				throw new Exception();
			}
			Reporter.log("Multiple Items Found in Setup Inventory :Pass");
			count=3;
		}

		catch (Exception e) {
			Reporter.log("Multiple Items Found in Setup Inventory :Fail");
			switchToNativeContext();
			
				
			takeScreenshot(finalPath1);
			Assert.assertTrue(false);
		}

		return this;

	}

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage SearchKeyword(String string) throws InterruptedException, IOException {

		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;

		try {

			waitForElementToBeClickable(Search);
			clearElement(Search);
			clickElement(Search);
			sendText(Search, AddedItemId1_2[0]);

			
			((AndroidDriver) driver).findElement(
					By.xpath("//*[@placeholder='Search']"))
					.sendKeys(Keys.ENTER);

			Reporter.log("Searching using keyword :Pass");
		
		} catch (Exception e) {
			Reporter.log("Searching using keyword :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);
		}
		return this;
	}

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage verifyKeywordSearchItems(String string) throws InterruptedException, IOException {
		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;
		try {

			final String SearchCheck = 
					"((//*[@class='mm-c-product-list__item mm-c-product__sysco mm-c-product-list__tracked-change']//*[@class='mm-c-product-list__row-wrapper']//*[@class='mm-c-product-list__description'])[1])//*[contains(text(),'"
							+ AddedItemId1_2[0] + "')]";

			Boolean boolean1 = isElementPresent(SearchCheck);

			if (boolean1) {
				Reporter.log("Item Found in location:Pass");
			} else {
				Reporter.log("Item Found in location:Fail");
				Assert.assertTrue(false);
			}

		}

		catch (Exception e) {
			Reporter.log("Item Found in in location:Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);
		}

		return this;

	}

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage VerifyOptionsOnImportItems(String string) throws InterruptedException, IOException {

		String string2 = "Issue";
		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;

		try {

			if (isElementPresent(OrderGuide)
					&& isElementPresent(OrderGuideDesc)
					&& isElementPresent(CustomList)
					&& isElementPresent(CustomListsDesc)
					/*&& isElementPresent(StartFromScratch)
					&& isElementPresent(StartFromScratchDesc)*/) {
			} else {
				throw new Exception();
			}

			Reporter.log("Import item page verification done :Pass");
				
		} catch (Exception e) {
			Reporter.log("Import item page verification done  :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
				
			Assert.assertTrue(false);
		}

		return this;

	}

	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public SetupInventoryPage SelectItemFrom_Catalog(String string) throws InterruptedException, IOException {
		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;

		try {

			waitForElement(1);
			waitForElementToBeClickable(Category_Header);

			if (isElementPresent(OrderGuide_FirstItemSelect)) {
				clickElement(OrderGuide_FirstItemSelect);

				SearchItemName = getElementText(OrderGuide_1stItemHeading);

				final String keyword1 = 
						
						"//*[contains(text(),'"
								+ SearchItemName
								+ "')]/following-sibling::div[@class='mm-c-product-minlist__details']";
						
				AddedItemId = getElementText(keyword1);
				AddedItemId1 = AddedItemId.split("/");

				Reporter.log("First item selected from pdt catalog  :Pass");
						

			}

			else {
				Reporter.log("Catalog Item Found in Setup Inventory:Fail");
				Reporter.log("Catalog Items not available");
				switchToNativeContext();
				takeScreenshot(finalPath1);
				
						
				Set<String> contextNames1 = ((AndroidDriver) driver)
						.getContextHandles();
				for (String contextName : contextNames1) {
				}
				((AndroidDriver) driver)
						.context((String) contextNames1.toArray()[1]);

				vp.TapOnBack("Pressback1");
				vp.TapOnBack("pressback2");
				
			}

		}

		catch (Exception e) {
			switchToNativeContext();
			takeScreenshot(finalPath1);
			Reporter.log("First item selected from pdt catalog :Fail");
				
			Assert.assertTrue(false);
		}
		return this;
	}

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage verifyItemDescriptionSearch(String keyword,
			String string) throws InterruptedException, IOException {
		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;
		try {

			final String SearchCheck = 
					"//*[@id='content-container']//*[@class='navbar-header']//*[contains(text(),'"
							+ keyword + "')]";

			Boolean boolean1 = isElementPresent(SearchCheck);

			if (boolean1) {
				Reporter.log("verifyItemDescriptionSearch:Pass");
						
			} else {
				Reporter.log("verifyItemDescriptionSearch:Fail");
					
				throw new Exception();
			}

		}

		catch (Exception e) {
			Reporter.log("verifyItemDescriptionSearch:Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);
		}

		return this;

	}

	@SuppressWarnings("rawtypes")
	public SetupInventoryPage VerifyProductID_Location(String string) throws InterruptedException, IOException {
		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;

		try {

			final String keyword1 = 
					
					"(//*[@class='mm-c-product-list__details']//*[@class='mm-c-product-list__description'])[1]";
					
			AddedItemId = getElementText(keyword1);
			AddedItemId1 = AddedItemId.split("/");

			Reporter.log("Product ID verified  :Pass");

		}

		catch (Exception e) {
			Reporter.log("Product ID verified  :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);
		}
		return this;
	}
	@SuppressWarnings("rawtypes")
	public SetupInventoryPage SearchWord(String string) throws InterruptedException, IOException {

		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;

		try {

			waitForElementToBeClickable(Search);
			clearElement(Search);
			clickElement(Search);
			
			System.out.println("1111" +ItemName2_2[1]);
			
			sendText(Search, ItemName2_2[1]);

			
			((AndroidDriver) driver).findElement(
					By.xpath("//*[@placeholder='Search']"))
					.sendKeys(Keys.ENTER);

			Reporter.log("Searching using keyword :Pass");
		
		} catch (Exception e) {
			Reporter.log("Searching using keyword :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);
		}
		return this;
	}
	@SuppressWarnings("rawtypes")
	public SetupInventoryPage verifyWordSearchItems(String string) throws InterruptedException, IOException {
		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;
		try {
		final String SearchCheck = 
					
					"((//*[@class='mm-c-product-list__item mm-c-product__sysco mm-c-product-list__tracked-change']//*[@class='mm-c-product-list__row-wrapper']//*[@class='mm-c-product-list__details'])//h4)[1]";
			
		String ItemWordSearch = getElementText(SearchCheck);
		
	if (ItemWordSearch.contains(ItemName2_2[1]))
		 {
				Reporter.log("Item Found in location:Pass");
			} else {
				Reporter.log("Item Found in location:Fail");
				throw new Exception();
			}

		}

		catch (Exception e) {
			Reporter.log("Item Found in in location:Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);
		}

		return this;

	}
	@SuppressWarnings("rawtypes")
	public SetupInventoryPage verifyEditLocationPage(String string) throws InterruptedException, IOException {
		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2
				+ Screenshot.pathExtension;
		try {
		
			
			boolean flag = isElementPresent(Search);
			
			if (flag) {
				throw new Exception();
			}
			
			Reporter.log("Search not displayed when edit tapped :Pass");
		}

		catch (Exception e) {
			Reporter.log("Search not displayed when edit tapped :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);
		}

		return this;

	}
	@SuppressWarnings("rawtypes")
	public SetupInventoryPage SelectSupplier_PdtCard(String keyword,String string) throws InterruptedException, IOException {
		String string2 = "Issue";
		String finalPath1 = Screenshot.drivePath + string + string2 + Screenshot.pathExtension;
		
		try {
			
			final String AddSupplier ="//*[@id='supplier-add']/div/select";
			driver.findElementByXPath(AddSupplier);
			waitForElementToBeClickable(AddSupplier);
			clickElement(AddSupplier);
				
			switchToNativeContext();
			//Supplier_Select

			//final String Supplier_Select ="//*[contains(text(),'" + keyword+ "')]";
			//final String Supplier_Select ="android:id/text1";
			//driver.findElementById(Supplier_Select);
			
			//driver.findElementByXPath("//android.widget.ListView[1]/android.widget.CheckedTextView[text()='ABC Vendor2']").click();
		
			waitForElementPresent(Supplier_Select);
			
		    clickElement(Supplier_Select);
			switchToWebContext();
			
			Reporter.log("Selecting supplier from Pdt card :Pass");
			
			
		} catch (Exception e) {
			Reporter.log("Selecting supplier from Pdt card :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);
		}

		return this;

	}
	@SuppressWarnings("rawtypes")
	public SetupInventoryPage SelectCategory_PdtCard(String keyword,String string) throws InterruptedException, IOException {
		String string2 = "Issue";
		String finalPath1 = Screenshot.drivePath + string + string2 + Screenshot.pathExtension;
		
		try {
			
			
			
			waitForElementToBeClickable(Add_Catogory );
			clickElement(Add_Catogory );
				
			switchToNativeContext();

			//final String Category_Select ="//*[contains(text(),'" + keyword+ "')]";
					

			waitForElementPresent(Category_Select);
			
			clickElement(Category_Select);
			
			Reporter.log("Selecting category from Pdt card :Pass");
			
		} catch (Exception e) {
			Reporter.log("Selecting category from Pdt card :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);
		}

		return this;

	}
	@SuppressWarnings("rawtypes")
	public SetupInventoryPage SelectCategory_ProductCard(String keyword,String string) throws InterruptedException, IOException {
		String string2 = "Issue";
		String finalPath1 = Screenshot.drivePath + string + string2 + Screenshot.pathExtension;
		
		try {
			
			
			
			waitForElementToBeClickable(Add_Catogory );
			clickElement(Add_Catogory );
				
			switchToNativeContext();

			//final String Category_Select ="//*[contains(text(),'" + keyword+ "')]";
					

			waitForElementPresent(Category_Selection);
			
			clickElement(Category_Selection);
			
			Reporter.log("Selecting category from Pdt card :Pass");
			
		} catch (Exception e) {
			Reporter.log("Selecting category from Pdt card :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);
		}

		return this;

	}
	
		@SuppressWarnings("rawtypes")
		public SetupInventoryPage verifySearchedItems(String keyword,String string) throws InterruptedException, IOException {
			String string2 = "Issue";

			String finalPath1 = Screenshot.drivePath + string + string2
					+ Screenshot.pathExtension;
			try {
				if ((LocationsPage.LocationsItemName1_1.contains(keyword))&&
						(LocationsPage.LocationsItemName1_2.contains(keyword))&&
						(LocationsPage.LocationsItemName1_3.contains(keyword)))
				 {
					Reporter.log("Searched items displayed :Pass");
					
				 } else {
						
						throw new Exception();
					}

			}

			catch (Exception e) {
				Reporter.log("Searched items displayed :Fail");
				switchToNativeContext();
				takeScreenshot(finalPath1);
				
				Assert.assertTrue(false);
			}

			return this;
			
	

		}
		
		
		public SetupInventoryPage verifyNonSyscoPrepItemNotInSetupInv(String product,
				String string) throws InterruptedException, IOException {
			String string2 = "Issue";

			String finalPath1 = Screenshot.drivePath + string + string2
					+ Screenshot.pathExtension;
			try {

				final String SetUpInventory_1stItemHeading = 
						"//*[@class='mm-c-product-list']//*[@class='Grid__innerScrollContainer']//*[@class='mm-c-product-list__details-wrapper']//*[contains(text(),'"
								+ product + "')]";

				waitForElement(3);
				Boolean boolean1 = isElementPresent(
						SetUpInventory_1stItemHeading);
				
				if (boolean1) {					
					Reporter.log("Item Found in Setup Inventory after deleting location :Fail");
					throw new Exception();
						
				} else {
					Reporter.log("Item not Found in Setup Inventory after deleting location :Pass");
				}

			}

			catch (Exception e) {
				Reporter.log("Item Found in Setup Inventory:Fail");
				switchToNativeContext();
				takeScreenshot(finalPath1);
				

				Assert.assertTrue(false);
			}

			return this;

		}
}