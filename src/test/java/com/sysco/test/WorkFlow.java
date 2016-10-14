
package com.sysco.test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.sysco.pages.*;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import com.sysco.jsn_framework.*;
import com.sysco.locators.DataPoolCoordinates;
import com.sysco.pages.*;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
public class WorkFlow extends JSN_Framework{

	LoginPage loginPage=new LoginPage();
	HomePage homePage=new HomePage();
	AccountsPage accountsPage=new AccountsPage();
	InventoryToolPage inventoryToolPage=new InventoryToolPage();
	SetupInventoryPage setupInventoryPage=new SetupInventoryPage();
	LocationsPage locationsPage=new LocationsPage();
	CategoryPage categoryPage=new CategoryPage();
	VendorPage vendorPage=new VendorPage();
	PurchasesPage purchasespage=new PurchasesPage();
    FoodCostPage foodCostpage=new FoodCostPage();
    ListPage listPage=new ListPage();
    static int user;
	DataPoolCoordinates datapool=new DataPoolCoordinates();
	/*
	 * Validating user is able to setup inventory by adding items from OrderGuide and then assign those items to Default location and Default category. 
	 * Validating location displayed for first item section on default locations and verifying count of items displayed on each default location.
	 * Prerequisite:Normal/MA User with OG items.
	 */

	@SuppressWarnings("rawtypes")
   @BeforeMethod
	public  void setUp() throws Exception{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		/*capabilities.setCapability("platformName", "android");

		capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("deviceName", "Galaxy S6");
		//capabilities.setCapability("autoWebview", "true");
		//capabilities.setCapability("autoWebview", "true");
		capabilities.setCapability("app", "/Users/MrDon/Desktop/UOM_iOS/UOMQA_SQ-debug__1_.apk");
		//System.out.println("Check1");
*/		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		//System.out.println("Check2");
	//	driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
		switchToWebContext();	
	}
	
	/*@AfterMethod
	public  void tearDown() throws Exception{
		driver.close();
		//driver.closeApp();
		driver.quit();
	}
	*/
	/*@BeforeMethod
	public  void setUp() throws Exception{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "9.0");
		capabilities.setCapability("deviceName", "Jasobanta’s iPad");
		capabilities.setCapability("app", "/Users/naveen_raj04/Desktop/UOM_Files/Builds/july 27/UOMQASQ-13.ipa");
		driver = new IOSDriver(new URL("http://10.155.162.74:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  
		switchToWebContext();	
	}*/
	
	//int user;
	
	
	@AfterMethod
	public  void clear() throws Exception{
		
		HttpClient client = new DefaultHttpClient();
		String accountNumber = datapool.readFromExcelUserInfo().accountDataPool[user];
		if(!accountNumber.equalsIgnoreCase("accountNumber"))
		{
			HttpPost post = new HttpPost("http://uom-qa.na.sysco.net:8081/tasks/cleanupDataForAccount?opCo=056&customerId="+datapool.readFromExcelUserInfo().accountDataPool[user]);
			//HttpPost post = new HttpPost("http://uom-qa.na.sysco.net:8081/tasks/cleanupDataForAccount?opCo=056&customerId=012203");
			HttpResponse response = client.execute(post);
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
	
			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
			    result.append(line);
			}
			System.out.println(result);
			Reporter.log(result.toString());
		}
		
		driver.quit();
	
		
	}
	@Test(groups={"SI - WF 1"},priority=0, description = "SI - WF 1-OG + Dafault Loc + Default Category")
	public void SI_WF1_OG_DefaultLocation_DefaultCategory() throws Exception {



		user=1;

		loginPage.verifyLoginPage("SI - WF 1-LoginPage");
		loginPage.saveUsernameCheckBoxclickElement("SI - WF 1-save username");	
		loginPage.signIn(datapool.readFromExcelUserInfo().userNameDataPool[user],datapool.readFromExcelUserInfo().passwordDataPool[user],"SI - WF 1-Login");	
		homePage.ClickAccount(datapool.readFromExcelUserInfo().userNameDataPool[user],"Clicked account");
		accountsPage.First_AccountSelection(datapool.readFromExcelUserInfo().userNameDataPool[user],"SI - WF 1-FirstAccountSelect");
		inventoryToolPage.InvTools_SetUpInventory("SI - WF 1-SetupInventoryTap");
		setupInventoryPage.TapOnSkip("SI - WF 1-Skip1 Tapped");
		setupInventoryPage.VerifyOptionsOnImportItems("SI - WF 1-Verified import items page");
		setupInventoryPage.TapOrderGuide("SI - WF 1-OG Selected");
		setupInventoryPage.tapContinue("SI - WF 1-Tapped Continue");
		locationsPage.VerifyOptionsOnSetupLocations("SI - WF 1-Location page verified");
		locationsPage.DefaultLocation("SI - WF 1-Tapped Custom location");
		locationsPage.tapContinue("SI - WF 1-Tapped Continue");
		categoryPage.VerifyOptionsOnSetUpFoodCost("SI - WF 1-Category page verified");
		categoryPage.defaultCategories("SI - WF 1-Tapped Default category");
		categoryPage.tapComplete("SI - WF 1-Tapped Complete");
		setupInventoryPage.TapTakeHome("SI - WF 1-Tapped take me home")  ; 
		inventoryToolPage.InvTools_TrackInventory("SI - WF 1-Selected track inventory");
		locationsPage.SelectLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[6], "SI - WF 1-Selected cooler");

		locationsPage.VerifyItemsOnDefaultLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[6], "SI - WF 1-Verified cooler");
		locationsPage.TapOnBack("SI - WF 1-Tapped on Back");
		//	.VerifyCountOfItemsInLocation(locDataCooler.LocationName, "")
		locationsPage.SelectLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[7], "SI - WF 1-Selected freezer");
		locationsPage.VerifyItemsOnDefaultLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[7], "SI - WF 1-Verified freezer");
		locationsPage.TapOnBack("SI - WF 1-Tapped on Back");
		//.VerifyCountOfItemsInLocation(locDataFreezer.LocationName, "")
		locationsPage.SelectLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[8], "SI - WF 1-Selected dry");
		locationsPage.VerifyItemsOnDefaultLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[8], "SI - WF 1-Verified dry");
		locationsPage.TapOnBack("SI - WF 1-Tapped on Back");
		//.VerifyCountOfItemsInLocation(locDataDry.LocationName, "");
	}
	@Test(groups={"SI - WF 1"},priority=0, description = "SI - WF 1-OG + Dafault Loc + Default Category")
	public void SI_WF1_1_OG_DefaultLocation_DefaultCategory() throws Exception {



		user=2;

		loginPage.verifyLoginPage("SI - WF 1-LoginPage");
		loginPage.saveUsernameCheckBoxclickElement("SI - WF 1-save username");	
		loginPage.signIn(datapool.readFromExcelUserInfo().userNameDataPool[user],datapool.readFromExcelUserInfo().passwordDataPool[user],"SI - WF 1-Login");	
		/*homePage.ClickAccount(datapool.readFromExcelUserInfo().userNameDataPool[user],"Clicked account");
		accountsPage.First_AccountSelection(datapool.readFromExcelUserInfo().userNameDataPool[user],"SI - WF 1-FirstAccountSelect");
		inventoryToolPage.InvTools_SetUpInventory("SI - WF 1-SetupInventoryTap");
		setupInventoryPage.TapOnSkip("SI - WF 1-Skip1 Tapped");
		setupInventoryPage.VerifyOptionsOnImportItems("SI - WF 1-Verified import items page");
		setupInventoryPage.TapOrderGuide("SI - WF 1-OG Selected");
		setupInventoryPage.tapContinue("SI - WF 1-Tapped Continue");
		locationsPage.VerifyOptionsOnSetupLocations("SI - WF 1-Location page verified");
		locationsPage.DefaultLocation("SI - WF 1-Tapped Custom location");
		locationsPage.tapContinue("SI - WF 1-Tapped Continue");
		categoryPage.VerifyOptionsOnSetUpFoodCost("SI - WF 1-Category page verified");
		categoryPage.defaultCategories("SI - WF 1-Tapped Default category");
		categoryPage.tapComplete("SI - WF 1-Tapped Complete");
		setupInventoryPage.TapTakeHome("SI - WF 1-Tapped take me home")  ; 
		inventoryToolPage.InvTools_TrackInventory("SI - WF 1-Selected track inventory");
		locationsPage.SelectLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[6], "SI - WF 1-Selected cooler");

		locationsPage.VerifyItemsOnDefaultLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[6], "SI - WF 1-Verified cooler");
		locationsPage.TapOnBack("SI - WF 1-Tapped on Back");
		//	.VerifyCountOfItemsInLocation(locDataCooler.LocationName, "")
		locationsPage.SelectLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[7], "SI - WF 1-Selected freezer");
		locationsPage.VerifyItemsOnDefaultLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[7], "SI - WF 1-Verified freezer");
		locationsPage.TapOnBack("SI - WF 1-Tapped on Back");
		//.VerifyCountOfItemsInLocation(locDataFreezer.LocationName, "")
		locationsPage.SelectLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[8], "SI - WF 1-Selected dry");
		locationsPage.VerifyItemsOnDefaultLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[8], "SI - WF 1-Verified dry");
		locationsPage.TapOnBack("SI - WF 1-Tapped on Back");
		//.VerifyCountOfItemsInLocation(locDataDry.LocationName, "");
*/	}
	
	@Test(groups={"SI - WF 1"},priority=0, description = "SI - WF 1-OG + Dafault Loc + Default Category")
	public void SI_WF1_2_OG_DefaultLocation_DefaultCategory() throws Exception {



		user=3;

		loginPage.verifyLoginPage("SI - WF 1-LoginPage");
		loginPage.saveUsernameCheckBoxclickElement("SI - WF 1-save username");	
		loginPage.signIn(datapool.readFromExcelUserInfo().userNameDataPool[user],datapool.readFromExcelUserInfo().passwordDataPool[user],"SI - WF 1-Login");	
		/*homePage.ClickAccount(datapool.readFromExcelUserInfo().userNameDataPool[user],"Clicked account");
		accountsPage.First_AccountSelection(datapool.readFromExcelUserInfo().userNameDataPool[user],"SI - WF 1-FirstAccountSelect");
		inventoryToolPage.InvTools_SetUpInventory("SI - WF 1-SetupInventoryTap");
		setupInventoryPage.TapOnSkip("SI - WF 1-Skip1 Tapped");
		setupInventoryPage.VerifyOptionsOnImportItems("SI - WF 1-Verified import items page");
		setupInventoryPage.TapOrderGuide("SI - WF 1-OG Selected");
		setupInventoryPage.tapContinue("SI - WF 1-Tapped Continue");
		locationsPage.VerifyOptionsOnSetupLocations("SI - WF 1-Location page verified");
		locationsPage.DefaultLocation("SI - WF 1-Tapped Custom location");
		locationsPage.tapContinue("SI - WF 1-Tapped Continue");
		categoryPage.VerifyOptionsOnSetUpFoodCost("SI - WF 1-Category page verified");
		categoryPage.defaultCategories("SI - WF 1-Tapped Default category");
		categoryPage.tapComplete("SI - WF 1-Tapped Complete");
		setupInventoryPage.TapTakeHome("SI - WF 1-Tapped take me home")  ; 
		inventoryToolPage.InvTools_TrackInventory("SI - WF 1-Selected track inventory");
		locationsPage.SelectLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[6], "SI - WF 1-Selected cooler");

		locationsPage.VerifyItemsOnDefaultLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[6], "SI - WF 1-Verified cooler");
		locationsPage.TapOnBack("SI - WF 1-Tapped on Back");
		//	.VerifyCountOfItemsInLocation(locDataCooler.LocationName, "")
		locationsPage.SelectLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[7], "SI - WF 1-Selected freezer");
		locationsPage.VerifyItemsOnDefaultLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[7], "SI - WF 1-Verified freezer");
		locationsPage.TapOnBack("SI - WF 1-Tapped on Back");
		//.VerifyCountOfItemsInLocation(locDataFreezer.LocationName, "")
		locationsPage.SelectLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[8], "SI - WF 1-Selected dry");
		locationsPage.VerifyItemsOnDefaultLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[8], "SI - WF 1-Verified dry");
		locationsPage.TapOnBack("SI - WF 1-Tapped on Back");
		//.VerifyCountOfItemsInLocation(locDataDry.LocationName, "");
*/	}
	
	@Test(groups={"SI - WF 1"},priority=0, description = "SI - WF 1-OG + Dafault Loc + Default Category")
	public void SI_WF1_3_OG_DefaultLocation_DefaultCategory() throws Exception {



		user=4;

		loginPage.verifyLoginPage("SI - WF 1-LoginPage");
		loginPage.saveUsernameCheckBoxclickElement("SI - WF 1-save username");	
		loginPage.signIn(datapool.readFromExcelUserInfo().userNameDataPool[user],datapool.readFromExcelUserInfo().passwordDataPool[user],"SI - WF 1-Login");	
		/*homePage.ClickAccount(datapool.readFromExcelUserInfo().userNameDataPool[user],"Clicked account");
		accountsPage.First_AccountSelection(datapool.readFromExcelUserInfo().userNameDataPool[user],"SI - WF 1-FirstAccountSelect");
		inventoryToolPage.InvTools_SetUpInventory("SI - WF 1-SetupInventoryTap");
		setupInventoryPage.TapOnSkip("SI - WF 1-Skip1 Tapped");
		setupInventoryPage.VerifyOptionsOnImportItems("SI - WF 1-Verified import items page");
		setupInventoryPage.TapOrderGuide("SI - WF 1-OG Selected");
		setupInventoryPage.tapContinue("SI - WF 1-Tapped Continue");
		locationsPage.VerifyOptionsOnSetupLocations("SI - WF 1-Location page verified");
		locationsPage.DefaultLocation("SI - WF 1-Tapped Custom location");
		locationsPage.tapContinue("SI - WF 1-Tapped Continue");
		categoryPage.VerifyOptionsOnSetUpFoodCost("SI - WF 1-Category page verified");
		categoryPage.defaultCategories("SI - WF 1-Tapped Default category");
		categoryPage.tapComplete("SI - WF 1-Tapped Complete");
		setupInventoryPage.TapTakeHome("SI - WF 1-Tapped take me home")  ; 
		inventoryToolPage.InvTools_TrackInventory("SI - WF 1-Selected track inventory");
		locationsPage.SelectLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[6], "SI - WF 1-Selected cooler");

		locationsPage.VerifyItemsOnDefaultLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[6], "SI - WF 1-Verified cooler");
		locationsPage.TapOnBack("SI - WF 1-Tapped on Back");
		//	.VerifyCountOfItemsInLocation(locDataCooler.LocationName, "")
		locationsPage.SelectLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[7], "SI - WF 1-Selected freezer");
		locationsPage.VerifyItemsOnDefaultLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[7], "SI - WF 1-Verified freezer");
		locationsPage.TapOnBack("SI - WF 1-Tapped on Back");
		//.VerifyCountOfItemsInLocation(locDataFreezer.LocationName, "")
		locationsPage.SelectLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[8], "SI - WF 1-Selected dry");
		locationsPage.VerifyItemsOnDefaultLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[8], "SI - WF 1-Verified dry");
		locationsPage.TapOnBack("SI - WF 1-Tapped on Back");
		//.VerifyCountOfItemsInLocation(locDataDry.LocationName, "");
	*/}
	
	@Test(groups={"SI - WF 1"},priority=0, description = "SI - WF 1-OG + Dafault Loc + Default Category")
	public void SI_WF1_4_OG_DefaultLocation_DefaultCategory() throws Exception {



		user=5;

		loginPage.verifyLoginPage("SI - WF 1-LoginPage");
		loginPage.saveUsernameCheckBoxclickElement("SI - WF 1-save username");	
		loginPage.signIn(datapool.readFromExcelUserInfo().userNameDataPool[user],datapool.readFromExcelUserInfo().passwordDataPool[user],"SI - WF 1-Login");	
		/*homePage.ClickAccount(datapool.readFromExcelUserInfo().userNameDataPool[user],"Clicked account");
		accountsPage.First_AccountSelection(datapool.readFromExcelUserInfo().userNameDataPool[user],"SI - WF 1-FirstAccountSelect");
		inventoryToolPage.InvTools_SetUpInventory("SI - WF 1-SetupInventoryTap");
		setupInventoryPage.TapOnSkip("SI - WF 1-Skip1 Tapped");
		setupInventoryPage.VerifyOptionsOnImportItems("SI - WF 1-Verified import items page");
		setupInventoryPage.TapOrderGuide("SI - WF 1-OG Selected");
		setupInventoryPage.tapContinue("SI - WF 1-Tapped Continue");
		locationsPage.VerifyOptionsOnSetupLocations("SI - WF 1-Location page verified");
		locationsPage.DefaultLocation("SI - WF 1-Tapped Custom location");
		locationsPage.tapContinue("SI - WF 1-Tapped Continue");
		categoryPage.VerifyOptionsOnSetUpFoodCost("SI - WF 1-Category page verified");
		categoryPage.defaultCategories("SI - WF 1-Tapped Default category");
		categoryPage.tapComplete("SI - WF 1-Tapped Complete");
		setupInventoryPage.TapTakeHome("SI - WF 1-Tapped take me home")  ; 
		inventoryToolPage.InvTools_TrackInventory("SI - WF 1-Selected track inventory");
		locationsPage.SelectLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[6], "SI - WF 1-Selected cooler");

		locationsPage.VerifyItemsOnDefaultLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[6], "SI - WF 1-Verified cooler");
		locationsPage.TapOnBack("SI - WF 1-Tapped on Back");
		//	.VerifyCountOfItemsInLocation(locDataCooler.LocationName, "")
		locationsPage.SelectLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[7], "SI - WF 1-Selected freezer");
		locationsPage.VerifyItemsOnDefaultLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[7], "SI - WF 1-Verified freezer");
		locationsPage.TapOnBack("SI - WF 1-Tapped on Back");
		//.VerifyCountOfItemsInLocation(locDataFreezer.LocationName, "")
		locationsPage.SelectLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[8], "SI - WF 1-Selected dry");
		locationsPage.VerifyItemsOnDefaultLocation(datapool.readFromExcelLocationInfo().locationNameDataPool[8], "SI - WF 1-Verified dry");
		locationsPage.TapOnBack("SI - WF 1-Tapped on Back");
		//.VerifyCountOfItemsInLocation(locDataDry.LocationName, "");
*/	}
	



}