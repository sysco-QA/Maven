
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
import java.text.DecimalFormat;
import java.util.Set;
import java.util.logging.Logger;

import io.appium.java_client.ios.IOSDriver;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;

import com.sysco.jsn_framework.JSN_Framework;
import com.sysco.locators.Screenshot;



public class FoodCostPage extends JSN_Framework {
	
	private static final Logger LOGGER= Logger.getLogger(FoodCostPage.class.getCanonicalName());

	public static final String FoodCostsPage = "//*[contains(text(),'Food Costs')]";
	public static final String BeginInventory = "(//*[@class='mm-c-food-cost__details container']//*[@class='row'])[1]//*[contains(text(),'$')]";
	public static final String TotalPurchases = "(//*[@class='mm-c-food-cost__details container']//*[@class='row'])[2]//*[contains(text(),'$')]";
	public static final String NetPurchases = "(//*[@class='mm-c-food-cost__details container']//*[@class='row'])[3]//*[contains(text(),'$')]";
	
	public static final String EndInventory = "(//*[@class='mm-c-food-cost__details container']//*[@class='row'])[4]//*[contains(text(),'$')]";
	//public static final String CostOfGoodSold = "(//*[@class='mm-c-food-cost__details container']//*[@class='row'])[5]//*[contains(text(),'$')]";
	public static final String CostOfGoodSold = "//div[contains(text(),'Cost of Goods Sold')]/ancestor::div[1]/*[contains(text(),'$')]";
	public static final String FoodCost = "//*[@class='navbar-brand']//h3[contains(text(),'Food Costs')]";
	
	public static String BeginInventoryValue;
	public static String TotalPurchasesValue;
	public static String NetPurchasesValue;
	public static String EndInventoryValue;
	public static String CostOfGoodSoldValue;
	
	public static String[] BeginInventoryValue1;
	public static String[] TotalPurchasesValue1;
	public static String[] NetPurchasesValue1;
	public static String[] EndInventoryValue1;
	public static String[] CostOfGoodSoldValue1;
	
	public static float	beginInv;
	public static float totPurchase;
	public static float netPurchase;
	public static float costGoods;
	public static float endInv;
	public static float foodSales;
	public static int foodSales1;
	public static String foodSales2;
	public static float revenue;
	public static String foodSalesPercent;
	public static String[] foodSalesPercent1;
	public static final String Revenue = "//*[@class='mm-c-food-cost__details container']//*[@placeholder='Revenue']";
	
	public static final String FoodSalesPercent = "//*[@class='mm-c-food-cost__details container']//*[@class='mm-c-food-cost__percentage_number row']/div";
	//*[@class='mm-c-food-cost__percentage_number row']/div
	public static float beginInvValue;

	public static float endInvValue;

	public String strActualPrice= "";
	
	
	public FoodCostPage VerifyTotalPurchase(String value, String string) throws InterruptedException, IOException {
		Reporter.log("Verify purchase value");
		
		String string2="Issue";

		String finalPath1=drivePath+string+string2+Screenshot.pathExtension;

		try{
			waitForElementToBeClickable(TotalPurchases); 
			//driver.switchTo().activeElement().

			
			TotalPurchasesValue =getElementText(TotalPurchases);
			TotalPurchasesValue1 = TotalPurchasesValue.split("\\s");
			// totPurchase=Integer.parseInt(TotalPurchasesValue1[1]);
			if(value.contains(".0"))
			{
				value=value.replace(".0","");
			}
			if(!(TotalPurchasesValue1[1].equals(value))){
				throw new Exception();
			}
			
			Reporter.log("Verify purchase value :Pass");						
System.out.println("tot purch passed"+value+TotalPurchasesValue1[1]);

		}
		catch(Exception e){
			Reporter.log("Verify purchase value :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);

		}

		return this;

	}
	public FoodCostPage VerifyNetPurchases(String string) throws InterruptedException, IOException {
		Reporter.log("Verify net purchase value");
		
		String string2="Issue";

		String finalPath1=drivePath+string+string2+Screenshot.pathExtension;

		try{
			waitForElementToBeClickable(NetPurchases); 

			BeginInventoryValue =getElementText(BeginInventory);
			BeginInventoryValue1 = BeginInventoryValue.split("\\$");
			
			TotalPurchasesValue =getElementText(TotalPurchases);
			TotalPurchasesValue1 = TotalPurchasesValue.split("\\$");
			
			NetPurchasesValue =getElementText(NetPurchases);
			NetPurchasesValue1 = NetPurchasesValue.split("\\$");
			
			 beginInv=Float.parseFloat(BeginInventoryValue1[1].replace(",", ""));
			 totPurchase=Float.parseFloat(TotalPurchasesValue1[1].replace(",", ""));
			 netPurchase=Float.parseFloat(NetPurchasesValue1[1].replace(",", ""));
			
			
			
			if((new DecimalFormat("#.00").format(netPurchase)).equals(new DecimalFormat("#.00").format(beginInv+totPurchase))){
				System.out.println("net pur passed"+beginInv+totPurchase+netPurchase);
				
			}else{
				throw new Exception();
			}
			
			Reporter.log("Verify net purchase value :Pass");						


		}
		catch(Exception e){
			Reporter.log("Verify purchase value :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);

		}

		return this;

	}
	
	public FoodCostPage VerifyCostOfGoodsSold(String string) throws InterruptedException, IOException {
		Reporter.log("Verify cost of goods sold value");
		
		String string2="Issue";

		String finalPath1=drivePath+string+string2+Screenshot.pathExtension;

		try{
			waitForElementToBeClickable(CostOfGoodSold); 

			EndInventoryValue =getElementText(EndInventory);
			EndInventoryValue1 = EndInventoryValue.split("\\$");
			
			CostOfGoodSoldValue =getElementText(CostOfGoodSold);
			CostOfGoodSoldValue1 = CostOfGoodSoldValue.split("\\$");
			
			costGoods=Float.parseFloat(CostOfGoodSoldValue1[1].replace(",", ""));
			endInv=Float.parseFloat(EndInventoryValue1[1].replace(",", ""));
			System.out.println(new DecimalFormat("#.00").format(costGoods));
			System.out.println(new DecimalFormat("#.00").format(netPurchase-endInv));
			if(new DecimalFormat("#.00").format(costGoods).equals(new DecimalFormat("#.00").format(netPurchase-endInv).replace("-", ""))){
				Reporter.log("Verify cost of goods sold value :Pass");		
			}else{
				throw new Exception();
			}

			/*if((new DecimalFormat("#.00").format(costGoods)).equals(new DecimalFormat("#.00").format(netPurchase-endInv))){
				System.out.println("cost "+costGoods);
				
			}else{

			
			}*/

			
			
							


		}
		catch(Exception e){
			Reporter.log("Verify cost of goods sold value :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);

		}

		return this;

	}
	public FoodCostPage EnterRevenue(String value,String string) throws InterruptedException, IOException {
		Reporter.log("Enter Revenue value");
		
		String string2="Issue";

		String finalPath1=drivePath+string+string2+Screenshot.pathExtension;

		try{
			
			revenue=Float.parseFloat(value);
			waitForElementToBeClickable(Revenue); 

			//waitForElementToBeClickable(Revenue);
			
			sendText(Revenue, value);
		
			waitForElementToBeClickable(CostOfGoodSold);
			
			clickElement(FoodCost);
			//clickElement(CostOfGoodSold);
			waitFor(5); 
			
			/*((IOSDriver) getCommand().driver).findElement(
					By.xpath("//*[@placeholder='Revenue']"))
					.sendKeys(Keys.ENTER);
			*/
			
			
			Reporter.log("Enter Revenue :Pass");						


		}
		catch(Exception e){
			Reporter.log("Enter Revenue  :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);

		}

		return this;

	}
	public FoodCostPage CalculateFoodCost(String string) throws InterruptedException, IOException {
		Reporter.log("Calculating Food cost");
		
		String string2="Issue";

		String finalPath1=drivePath+string+string2+Screenshot.pathExtension;

		try{
			
			System.out.println("costGoods"+ costGoods);
			System.out.println("revenue"+ revenue);
			foodSales=(costGoods/revenue)*100;
			System.out.println(foodSales);
			/*foodSales1=String.valueOf(foodSales);
			System.out.println(foodSales1);  //round
	*/
			foodSales1=(int)Math.round(foodSales);
			foodSales2 = String.valueOf(foodSales1);
			System.out.println("foodSales2 "+foodSales2);
			/*foodSales2 = foodSales1.split(".");  //delete
			System.out.println(foodSales2);
			*/

			waitForElementPresent(FoodSalesPercent);

			System.out.println(foodSales2);
					

			foodSalesPercent =getElementText(FoodSalesPercent);
			foodSalesPercent1 = foodSalesPercent.split("%");
			System.out.println(foodSalesPercent1[0]);
			
			/*if((new DecimalFormat("#.00").format(foodSales2)).equals(new DecimalFormat("#.00").format(foodSalesPercent1[0]))){
				Reporter.log("Food cost calculation :Pass");						
				System.out.println(foodSales2+foodSalesPercent1[0]);
			}else{
				throw new Exception();
			}*/
			
			if(!(foodSales2.equals(foodSalesPercent1[0].replace("-", "")))){
				throw new Exception();
			}

		}
		catch(Exception e){
			Reporter.log("Food cost calculation  :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);

		}

		return this;

	}
	@SuppressWarnings("rawtypes")

	public FoodCostPage VerifyBeginningInventory(String qty1,String string, String... strItemPrice) throws InterruptedException, IOException {

		

		Reporter.log("Verify purchase value");

		

		String string2="Issue";

		String finalPath1 = Screenshot.drivePath + string + string2 + Screenshot.pathExtension;

float iExpectedPrice = 0;


		try{
			
			
			for(String str: strItemPrice){				
				iExpectedPrice =iExpectedPrice+ (Float.parseFloat(str)*Float.parseFloat(qty1));				
			}

			waitForElementPresent(BeginInventory);		

			BeginInventoryValue =getElementText(BeginInventory);

			BeginInventoryValue1 = BeginInventoryValue.split("\\$");

		   beginInv=Float.parseFloat(BeginInventoryValue1[1].replace(",", ""));

			System.out.println(beginInv);

		//	beginInvValue= (Float.parseFloat(qty1))*(Float.parseFloat(foodprice));
			beginInvValue = iExpectedPrice;

			//beginInvValue= qty1*foodprice;

			System.out.println("Calaculated"+beginInvValue);
			System.out.println(new DecimalFormat("#.00").format(beginInv));
			System.out.println(new DecimalFormat("#.00").format(beginInvValue));

		if((new DecimalFormat("#.00").format(beginInv)).equals(new DecimalFormat("#.00").format(beginInvValue))){			
			Reporter.log("Verify beginning inventory value :Pass");
			}
		else{
			throw new Exception("Verify beginning inventory value :Fail");	
			}
		
	}

		catch(Exception e){		

			Reporter.log("Verify beginning inventory value :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);

			Assert.assertTrue(false);


		}
		return this;




	}
	
	public FoodCostPage VerifyEndingInventory(String qty1,String string, String ... strFoodPrice ) throws InterruptedException, IOException {

		

		Reporter.log("Verify purchase value");

		

		String string2="Issue";




		String finalPath1 = Screenshot.drivePath + string + string2 + Screenshot.pathExtension;


		float iExpectedPrice = 0;


		try{
			
			
			for(String str: strFoodPrice){				
				iExpectedPrice =iExpectedPrice+ (Float.parseFloat(str)*Float.parseFloat(qty1));				
			}
			System.out.println("Expected price: "+ iExpectedPrice);

			waitForElementPresent(EndInventory);

			EndInventoryValue =getElementText(EndInventory);

			EndInventoryValue1 = EndInventoryValue.split("\\$");
			System.out.println(EndInventoryValue1[0]);
			System.out.println(EndInventoryValue1[1]);

			strActualPrice = EndInventoryValue1[1].replace(",", "");
			
			endInv=Float.parseFloat(strActualPrice);
			//endInv=EndInventoryValue1[1];

			System.out.println(endInv);

			

			//endInvValue=  (Float.parseFloat(qty1))*(Float.parseFloat(foodprice));
			endInvValue = iExpectedPrice;

			System.out.println("Calaculated"+endInv);

			if((new DecimalFormat("#.00").format(endInv)).equals(new DecimalFormat("#.00").format(endInvValue))){
				Reporter.log("Verify ending inventory value :Pass");
				

			}else{
				throw new Exception("Verify ending inventory value :Fail");
			}


		}

		catch(Exception e){




			Reporter.log("Verify ending inventory value :Fail");

			switchToNativeContext();

			takeScreenshot(finalPath1);

			

			Assert.assertTrue(false);

		}




		return this;




	}

	@SuppressWarnings("rawtypes")

	public FoodCostPage VerifyCurrentAndLastclosedPrice(String string) throws InterruptedException, IOException {

		String string2="Issue";




		String finalPath1 = Screenshot.drivePath + string + string2 + Screenshot.pathExtension;

		try {

			waitForElementPresent(BeginInventory);

			BeginInventoryValue =getElementText(BeginInventory);

			BeginInventoryValue1 = BeginInventoryValue.split("\\$");

			 beginInv=Float.parseFloat(BeginInventoryValue1[1]);

			

			if(!(endInv==beginInv)){

				throw new Exception();

			}

			Reporter.log("Verify current price same as price when the inventory closed :Pass");

			System.out.println(endInv+""+beginInv);

			

		} catch (Exception e) {

			Reporter.log("Verify current price same as price when the inventory closed :Fail");

			switchToNativeContext();

			takeScreenshot(finalPath1);

			

			Assert.assertTrue(false);

			

		}




		return this;

	}
	


	




	}

	
