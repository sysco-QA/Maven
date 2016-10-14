		
		/**
		 ********************************************************************************************************************************************
		 ********************************************************************************************************************************************
		 *																																		   	*
		 * 2016-2017 Infosys Limited, Banglore, India. All Rights Reserved																			*
		 *																																			*
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

import org.testng.Assert;
import org.testng.Reporter;

import com.sysco.jsn_framework.JSN_Framework;
import com.sysco.locators.Screenshot;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
		
		public class CategoryPage extends JSN_Framework{
			
			private static final Logger LOGGER= Logger.getLogger(CategoryPage.class.getCanonicalName());
			
			public static final String Continue ="//*[@class='btn btn-default' and contains(text(),'Continue')]";
			public static final String Header="//*[@id='mount']/div/div/div[2]/nav/div/div/span/h3";
			public static final String Category_FirstItemSelect= "//*[@class='checkbox']//*[@class='mm-o-icon']//*[@class='item-input'and @data-index='0']";
			public static final String Category_FirstItemHeader= "//*[@id='mount']/div/div/div[2]/div/div[2]/div[1]/div/div/div[1]/div/div[2]/div[2]/h4";
			public static final String InvToolsPg = "//*[@class='navbar-brand']//*[contains(text(),'Inventory Tools')]";
			public static final String SecondCategory_FirstItemSelect= "//*[@class='checkbox']//*[@class='mm-o-icon']//*[@class='item-input'and @data-index='1']";
			public static final String FoodAndNonFood = "//*[contains(text(),'Food & Non-Food')]";
			//public static final String FoodAndNonFood="//*[@id='content-container']/div[1]/div[2]/div[1]/button";
			//public static final String FoodAndNonFood="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.widget.Button[2]";
			public static final String Select_SuggCat_Meat1 = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.CheckedTextView[3]";
			//public static final String Select_SuggCat_Meat1 = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.CheckedTextView[3]";
			public static final String  SuggestedCategories = "//*[contains(text(),'Suggested Categories')]";
			public static final String  CustomCategories = "//*[contains(text(),'Create Expense Cat.')]";
		
			public String CategoryName;
			public String ItemNameSelected;
			public String ItemNameAdded;
			public static final String Complete = "//*[@class='btn btn-default' and contains(text(),'Complete')]";
			public static final String SetupInventoryCustomCategoryAllItemsTab ="//*[@id='mount']//*[@class='mm-c-productList--pill-left']/a";
			public static final String SetupInventoryCustomCategoryUncategorizedTab = "//*[@id='mount']//*[@class='mm-c-productList--pill-right']/a";
			public static String ItemAdded;
			public static final String Category_Header= "//*[@id='mount']/div/div/div[2]/nav/div/div/span/h3";
			//public static final String ExpenseCategory_Food= "(//*[@class='mm-c-customexpense__details-category']//*[@class='radio'])[1]/label";
			public static final String ExpenseCategory_Food= "(//*[@class='radio'])[1]/label";
			public static final String ExpenseCategory_Page="//*[contains(text(),'Create Custom Expense Categories')]";
			//public static final String ExpenseCategory_Page="//*[@class='mm-c-customexpense__setup-text']//*[contains(text(),'Create Custom Expense Categories')]";
			public static final String ExpenseCategory_Name="//*[@class='mm-c-customexpense__details-category-name form-control form-control' and @name='formFields[0].name']";
			public static final String ExpenseCategory_NonFood= "(//*[@class='mm-c-customexpense__details-category']//*[@class='radio'])[2]/label";
			public static final String Next="//UIAStaticText[@label='Next']";
			public static final String NextWeb ="//*[@id='next-nav']/a";
			//public static final String ExpenseCategory_NameTxt= "//*[@class='mm-c-customexpense__details-category-name form-control form-control' and @name='dynamicFields[0].name']";
			public static final String ExpenseCategory_NameTxt= "//*[@name='dynamicFields[0].name']";
			//public static final String ExpenseCategory_AnotherCategory="//*[@class='mm-c-customexpense__setup-cta']//*[contains(text(),'Add Another Category')]";
			public static final String ExpenseCategory_AnotherCategory="//*[contains(text(),'Add Another Category')]";
			//public static final String ExpenseCategory_Name1= "//*[@class='mm-c-customexpense__details-category-name form-control form-control' and @name='dynamicFields[1].name']";
			public static final String ExpenseCategory_Name1= "//*[@name='dynamicFields[1].name']";
			//public static final String ExpenseCategory_Food1= "(//*[@class='mm-c-customexpense__details-category']//*[@class='radio'])[3]/label";
			public static final String ExpenseCategory_Food1= "(//*[@class='radio'])[3]/label";

			public static final String Category_1stItemSelect= "(//*[@class='mm-c-product-minlist mm-c-product__sysco']//*[@class='mm-o-icon'])[1]";
			public static final String Category_2ndItemSelect= "(//*[@class='mm-c-product-minlist mm-c-product__sysco']//*[@class='mm-o-icon'])[2]";
			public static final String Category_3rdItemSelect= "(//*[@class='mm-c-product-minlist mm-c-product__sysco']//*[@class='mm-o-icon'])[3]";
			public static final String Category_1stItemHeading="(//*[@class='mm-c-product-minlist__item']/h4)[1]";
			public static final String Category_2ndItemHeading="(//*[@class='mm-c-product-minlist__item']/h4)[2]";
			public static final String Category_3rdItemHeading= "(//*[@class='mm-c-product-minlist__item']/h4)[3]";
		
			public static	String CategoryItemName1_1;
			public static	String CategoryItemName1_2;
			public static	String CategoryItemName1_3;
		
			public static	String CategoryItemName2_1;
			public static	String CategoryItemName2_2;
			public static	String CategoryItemName2_3;
		
			public static	int CategoryNoOfElements1;
			public static	int CategorysNoOfElements2;
			public static final String ADD_CategoryName= "//*[@id='name']";
			//public static final String AddCategory_FoodWeb= "(//*[@class='mm-c-expense__details-radio']//*[@class='radio'])[1]";
			public static final String AddCategory_FoodWeb= "(//label[@for='foodType'])[1]";
			//(//input[@type='radio'])[1]
			public static final String AddCategory_Food="//android.widget.RadioButton[@content-desc='FOOD']";
			
			public static final String AddCategory_NonFood="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAElement[2]";
		    
		
			public static final String Done="//UIAStaticText[@label='Done']";
			public static final String DoneWeb="//android.view.View[@content-desc='Done']";
		
			public static final String Back ="//android.widget.ListView[@index='0']/android.view.View[@index='0']";
			public static final String Back1 ="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[3]/android.widget.ListView[1]/android.view.View[1]";
			public static final String AddWeb= "//android.widget.ListView[@index='3']/android.view.View";
			//public static final String EditWeb = "//*[@id='edit-nav']/a/i";
			public static final String EditWeb = "//a[contains(text(),'Edit')]";
			
			public static final String Delete ="//*[@id='delete-button' and contains(text(),'Delete Expense Category')]";
			public static final String YesDelete ="//*[@id='yes-button' and contains(text(),'Yes, Delete')]";
		
			public static final String Category_NonSyscoItem1Select="(//*[@class='mm-c-product-minlist mm-c-product__custom']//*[@class='mm-o-icon'])[1]";
			public static final String Category_NonSyscoItem2Select="(//*[@class='mm-c-product-minlist mm-c-product__custom']//*[@class='mm-o-icon'])[2]";
			public static final String Category_4thItemHeading= "(//*[@class='mm-c-product-minlist__item']/h4)[4]";
			public static	String CategoryItemName1_4;
			public static final String SetUp_Pg3Header ="//*[@class='navbar-brand']//*[contains(text(),'Setup Inventory')]";
			//public static final String CreateExpenseCategoryHeader ="//*[@class='mm-c-customexpense__setup-text']//*[contains(text(),'Create Custom Expense Categories')]";
			public static final String CreateExpenseCategoryHeader ="//*[contains(text(),'Create Custom Expense Categories')]";
					
			//public static final String CreateExpenseCategoryDesc1 ="//*[@class='mm-c-customexpense__setup-text']//*[contains(text(),'Create one or more custom expense categories ')]";
			public static final String CreateExpenseCategoryDesc1 ="//*[contains(text(),'Create one or more custom expense categories ')]";
			//public static final String CreateExpenseCategoryDesc2 ="//*[@class='mm-c-customexpense__setup-text']//*[contains(text(),'and then select items that belong to each.')]";
			public static final String CreateExpenseCategoryDesc2 ="//*[contains(text(),'and then select items that belong to each.')]";
					 
			public static String SyscocategoryKeyword1;
			public static String[] SyscoCategory1;
			public static String Selected_SuggCat1;
			public static final String Select_SuggCat_Dairy = "//*[@id='list-item']//*[contains(text(),'Dairy')]";
			public static final String Select_SuggCat_Meat = "//*[@id='list-item']//*[contains(text(),'Meat')]";
			//public static final String Select_SuggCat_Meat1 = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.CheckedTextView[3]";
			public static final String SuggestedCategory_Dairy= "//*[@id='list-item']//span[contains(text(),'Dairy')]";
			public static final String Select_SuggCat_Dairy1= "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.CheckedTextView[2]";
			//public static final String Select_SuggCat_Dairy1= "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.CheckedTextView[2]";
			public static final String SuggestedCategory_Meat= "//*[@id='list-item']//span[contains(text(),'Meat')]";
			public static final String SuggestedCategory_Poultry= "//*[@id='list-item']//span[contains(text(),'Poultry')]";
			public static final String SuggestedCategory_Seafood= "//*[@id='list-item']//span[contains(text(),'Seafood')]";
			public static final String SuggestedCategory_Produce= "//*[@id='list-item']//span[contains(text(),'Produce')]";
			public static final String SuggestedCategory_Groceries= "//*[@id='list-item']//span[contains(text(),'Groceries')]";
			public static final String SuggestedCategory_Beverage= "//*[@id='list-item']//span[contains(text(),'Beverage')]";
			public static final String SuggestedCategory_Miscellaneous= "//*[@id='list-item']//span[contains(text(),'Miscellaneous')]";
			public static final String DefaultCategory_Food= "//*[@id='list-item']//span[contains(text(),'Food')]";
			public static final String DefaultCategory_NonFood="//*[@id='list-item']//span[contains(text(),'Non-Food')]";
		
			//public static final String SetUp_Pg3Title = "//*[contains(text(),'Set up Food Cost')]";
			public static final String SetUp_Pg3Title = "//*[@id='content-container']/div[1]/div[2]/h2";
			public static final String textUnderFoodAndNOnFood = "//*[contains(text(),'Use these as expense categories')]";
			public static final String textUnderSuggestedCat = "//*[contains(text(),'Meat, Poultry, Seafood, Dairy, Produce, Groceries, Beverages, & Miscellaneous')]";
			public static final String textUnderCreateExpCat = "//*[contains(text(),'Create your own')]";
		
			public static final String FoodAndNonFoodDesc = "//*[contains(text(),'Use these as expense categories')]";
			public static final String SuggestedCategoriesDesc ="//*[contains(text(),'Meat, Poultry, Seafood, Dairy, Produce, Groceries, Beverages, and Miscellaneous')]";
			public static final String CustomCategoriesDesc = "//*[contains(text(),'Create your own')]";
		
		
		
			/* Functions on the Page are defined below */
			
			@SuppressWarnings("rawtypes")
			public CategoryPage CustomCategories(String string) throws InterruptedException, IOException
			{
				  String string2="Issue"; 
		          String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
		          try{
		        	 	waitForElementToBeClickable(FoodAndNonFood);
		        	 	waitForElementToBeClickable(SetUp_Pg3Header);
						waitForElementToBeClickable(CustomCategories);
						
						if(isElementPresent(CustomCategories))
						{
							clickElement(CustomCategories);
							  
							Reporter.log("Custom Category selected from Food cost page :Pass");	
						}
		          }
				catch(Exception e){
					Reporter.log("Custom category selected from food cost page :Fail");
					switchToNativeContext();
					takeScreenshot(finalPath1); 
					Assert.assertTrue(false);
				}
				return this;
				
			}
			@SuppressWarnings("rawtypes")
			 public CategoryPage tapContinue(String string) throws InterruptedException, IOException{
				  String string2="Issue";
			       String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
			     	try{
			     	waitForElementToBeClickable(Continue);
					clickElement(Continue);
					Reporter.log("Tapped on Continue :Pass");
				}
				
				catch(Exception e)
				{
					Reporter.log("Tapped on Continue :Fail");
					switchToNativeContext();
					takeScreenshot(finalPath1);
					Assert.assertTrue(false);
				}
				return this;
			}
			
			@SuppressWarnings("rawtypes")
			 public CategoryPage CategoryDetails(String Name, String string) throws InterruptedException, IOException
			 {
			 	Reporter.log("Creating custom category");
			 	  String string2="Issue";
			       String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
			       String name=Name;
			       try{
			 		waitForElementToBeClickable(ExpenseCategory_Page);
			 		waitForElementToBeClickable(ExpenseCategory_Name);
			 		if(isElementPresent(ExpenseCategory_Name))
			 		{
			 			clickElement(ExpenseCategory_Name);
			 			sendText(ExpenseCategory_Name, name);
			 			waitForElementToBeClickable(ExpenseCategory_Food);
			 			clickElement(ExpenseCategory_Food);
			 				
			 		}
			 				Reporter.log("Custom category created  :Pass");	
			 	}
			 	catch(Exception e){
			 		Reporter.log("Custom category created  :Fail");
			 		switchToNativeContext();
			 		takeScreenshot(finalPath1);
			 		Assert.assertTrue(false);
			 	}
			 	return this;
			 	
			 }
			
			@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
			  public CategoryPage TapOnNext(String string) throws InterruptedException, IOException{
			       	  String string2="Issue";
			       String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
			       	try{
			       		
			       			waitForElementToBeClickable(NextWeb);
			       		if (isElementPresent(NextWeb))
			       		{
			       			clickElement(NextWeb);
			       			Reporter.log("Tapped on Next : Pass");
			       		}
			       		
			       	}
			       	catch(Exception e)
			       	{ 	
			       		Reporter.log("Tapped on Next :Fail");
			       		switchToNativeContext();
			       		takeScreenshot(finalPath1);
			       		Assert.assertTrue(false);
			       	}
			       	return this;
			       }
			/*@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
			  public CategoryPage SelectItemFromCategory(String name,String string) throws InterruptedException, IOException { 
			    	Reporter.log("Selecting item to custom category created"); ;
			    	String string2="Issue";
			    	String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
			    	try{ 
			    	waitFor(5);
			    	waitForElementToBeClickable(Header);
			    	CategoryName= getElementText(Header);
			    	waitFor(5);
			    	if(isElementPresent(Category_FirstItemSelect)) {
			    		waitFor(5);
			    		clickElement(Category_FirstItemSelect); 
			    		ItemNameSelected=getElementText(Category_FirstItemHeader); 
			    		System.out.println("Item heading:"+ItemNameSelected); 			    		
			    		Reporter.log("First item selected :Pass"); 
			    		} 
			    	switchToNativeContext(); 
			    	 if(isElementPresent(Done)) { 
			    		clickElement(Done); 
			    		switchToWebContext();
			    		waitForElementToBeClickable(InvToolsPg);
			    		Reporter.log("First item added to category created :Passed"); 
			    		
			    		}
			    	else { 
			    			if(isElementPresent(Next)) { 
			    			clickElement(Next);
			    			Reporter.log("Second Category Page available :Pass");
			    	    	 switchToWebContext();
			    	    	waitForElementToBeClickable(Header).getElementText(Header).equalsIgnoreCase(name);
			    			clickElement(SecondCategory_FirstItemSelect); 
			    			Reporter.log("First item selected in second category:Pass"); 		    			
			    			switchToNativeContext(); 
			    				clickElement(Done); 
			    				  switchToWebContext();
			    				waitForElementToBeClickable(InvToolsPg);
			    			 Reporter.log("Item added to Second Category :Pass");	
			    			} 
			    		}
			    	} 
			    	catch(Exception e){ 
			    		Reporter.log(" Item added to category created :Fail"); 
			    		switchToNativeContext();
			    		takeScreenshot(finalPath1); 
			    		Assert.assertTrue(false); 
			    		} 
			    	return this; 
			    	
			    }*/
			@SuppressWarnings("rawtypes")
			  public CategoryPage defaultCategories(String string) throws InterruptedException, IOException
				{
					Reporter.log("Selecting default category from Food cost page");
					  String string2="Issue";
			          String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
					
			          try{
			        	  //switchToNativeContext();
			        	    waitForElementToBeClickable(FoodAndNonFood);
			        	    waitForElementToBeClickable(SetUp_Pg3Header);
							if(isElementPresent(FoodAndNonFood))
							{
								clickElement(FoodAndNonFood);
								//switchToWebContext();
								
								Reporter.log("default Category selected :Pass");
								
							}
							
			          }
			          catch(Exception e){
			        	  Reporter.log("default category selected from food cost page :Fail");
						switchToNativeContext();
						takeScreenshot(finalPath1);
						Assert.assertTrue(false);
					}
					return this;
					
				}
			  @SuppressWarnings("rawtypes")
			public CategoryPage tapComplete(String string) throws InterruptedException, IOException{
				  String string2="Issue";
			       String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
			     	try{
			     		waitForElementToBeClickable(Complete);
					clickElement(Complete);
					
					
					Reporter.log("Tapped on Complete :Pass");
				}
				catch(Exception e)
				{
					Reporter.log("Tapped on Complete :Fail");
					switchToNativeContext();
					takeScreenshot(finalPath1);
					Assert.assertTrue(false);
		
				}
				
				return this;
				
			}       
			  @SuppressWarnings("rawtypes")
			public CategoryPage CreateTwoExpenseCategory(String Name1,String Name2,String string) throws InterruptedException, IOException {
			       	Reporter.log("Creating multiple custom category"); 
			       	String finalPath1=Screenshot.drivePath+string+Screenshot.string2+Screenshot.pathExtension;
			       	 
			       	try{ 
			       		 
			        		waitForElementToBeClickable(ExpenseCategory_Page);
		
			       	waitForElementToBeClickable(ExpenseCategory_NameTxt);
			       	if(isElementPresent(ExpenseCategory_NameTxt))
			       	{ 
			       		
			       		clickElement(ExpenseCategory_NameTxt);
			       		sendText(ExpenseCategory_NameTxt, Name1); 
			  
			       		waitForElementToBeClickable(ExpenseCategory_Food);
			       		clickElement(ExpenseCategory_Food); 

			       		if(isElementPresent(ExpenseCategory_AnotherCategory)) { 
			       			
			       			clickElement(ExpenseCategory_AnotherCategory);
			                    }

			       		if(isElementPresent(ExpenseCategory_Name1)) {
			       			clickElement(ExpenseCategory_Name1);
			       			sendText(ExpenseCategory_Name1, Name2); 
			       			
			       			waitForElementToBeClickable(ExpenseCategory_Food1);
		
			       			clickElement(ExpenseCategory_Food1);
		
			       			}
			       			
			       		waitFor(5);
			       				
			       		
		    		Reporter.log("Custom Categories created:Pass"); 
			       		} 
			       
			   }
			       catch(Exception e){
			    	   Reporter.log("Custom Categories created:Fail");
			    	switchToNativeContext();
			    	takeScreenshot(finalPath1);
			       	Assert.assertTrue(false); 
			       	} 
			       return this;
			       	}  
		
			  @SuppressWarnings("rawtypes")
			public CategoryPage CustomCategory_ItemSelectAndCheck(String string) throws InterruptedException, IOException
			   	{
			   		Reporter.log("Verifying added item is in  custom category - Uncategorised and All Items");

			   		  String string2="Issue";
			   		  String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
			            
			   			
			             try{
			   			
			           	  
			           	  waitForElementToBeClickable(Category_Header);
			            	 
			             	CategoryName= getElementText(Category_Header);

			             	
			             		    	waitFor(5);
			             	if(isElementPresent(Category_FirstItemSelect)) {
			             		waitFor(5);
			             		clickElement(Category_FirstItemSelect); 
			             		ItemAdded=getElementText(Category_FirstItemHeader); 
			             		Reporter.log("First item selected"); 
			             		} 
			             	
			   		       waitFor(5);	
			   		       waitForElementToBeClickable(SetupInventoryCustomCategoryAllItemsTab);
			   		       clickElement(SetupInventoryCustomCategoryAllItemsTab);
			   		       waitFor(3);
			   		       final String  FirstItemSelectedFromUncatgorisedVerify="//*[@id='mount']//*[contains(text(),'"+ItemAdded+"')]";
			   		       if (isElementPresent(FirstItemSelectedFromUncatgorisedVerify)) {
			   				Reporter.log(" Added item  is present in All Items Tab  :Pass");
			   				
			   			}
			   		       waitFor(5);	
			   		       waitForElementToBeClickable(SetupInventoryCustomCategoryUncategorizedTab);
			   		       clickElement(SetupInventoryCustomCategoryUncategorizedTab);
			   		     
			   		      		       
			   		       if (isElementPresent(FirstItemSelectedFromUncatgorisedVerify)) {
			   					Reporter.log(" Added item  is present in category Tab(Expected-Item should not be present) :Fail");
			   					throw new Exception();
			   				}
			   		       else if (!(isElementPresent(FirstItemSelectedFromUncatgorisedVerify))) {
			   					Reporter.log(" Added item  is not present in uncategorized Tab :Pass");
			   			}
			   		       
			   		       waitFor(5);	
			   		       
			   		   	}
			   		
			   	
			   		catch(Exception e){
			   			Reporter.log("Added item  is present in category created :Fail");
			   			switchToNativeContext();
			   			takeScreenshot(finalPath1);
			   			Assert.assertTrue(false);
			   		}
			   		return this;
			   		
			   	}	
			  @SuppressWarnings("rawtypes")
			public CategoryPage selectMultipleItemsFromCategory1(String string) throws InterruptedException, IOException {
			   	   	  String string2="Issue";
			   	     String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
			   	      try{
			   	    	Thread.sleep(5000);
			 	      	waitForElementToBeClickable(Category_1stItemSelect);
			 	    	waitForElementToBeClickable(Category_2ndItemSelect);
			 	    	waitForElementToBeClickable(Category_3rdItemSelect);
				 	     
			   	   		if(isElementPresent(Category_1stItemSelect))
			   	   		{
			   	   		CategoryNoOfElements1++;
			   	   	CategoryItemName1_1=getElementText(Category_1stItemHeading);
			   	   			clickElement(Category_1stItemSelect);
			   	   			
			   	   		}
			   	   		if(isElementPresent(Category_2ndItemSelect)){
			   	   			
			   	   		CategoryNoOfElements1++;
			   	   	CategoryItemName1_2=getElementText(Category_2ndItemHeading);
			   	   			clickElement(Category_2ndItemSelect);
			   	   		}
			   	   			
			   	   		if(isElementPresent(Category_3rdItemSelect)){	
			   	   		CategoryNoOfElements1++;
			   	   	CategoryItemName1_3=getElementText(Category_3rdItemHeading);
			   	   			clickElement(Category_3rdItemSelect);
			   	   		}
			   	   			Reporter.log("Multiple items selected :Pass"); 			
			   	   		}
			   	   	
			   	   	catch(Exception e){
			   	   	Reporter.log("Multiple items selected :Fail");
			   	   	switchToNativeContext();takeScreenshot(finalPath1);
			   	   		Assert.assertTrue(false);
			   	   	}
			   	      return this;
			   	   }
			        @SuppressWarnings("rawtypes")
					public CategoryPage selectMultipleItemsFromCategory2(String string) throws InterruptedException, IOException {
			      	   	  String string2="Issue";
			      	     String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
			      	      try{
		
			    	      	waitForElementToBeClickable(Category_1stItemSelect);
			    	      	waitForElementToBeClickable(Category_2ndItemSelect);
			    	      	waitForElementToBeClickable(Category_3rdItemSelect);
			    	      	
			      	   		if(isElementPresent(Category_1stItemSelect))
			      	   		{
			      	   		CategoryNoOfElements1++;
			      	   	CategoryItemName2_1=getElementText(Category_1stItemHeading);
			      	   			clickElement(Category_1stItemSelect);
			      	   			
			      	   		}
			      	   		if(isElementPresent(Category_2ndItemSelect)){
			      	   			
			      	   		CategoryNoOfElements1++;
			      	   	CategoryItemName2_2=getElementText(Category_2ndItemHeading);
			      	   			clickElement(Category_2ndItemSelect);
			      	   		}
			      	   			
			      	   		if(isElementPresent(Category_3rdItemSelect)){	
			      	   		CategoryNoOfElements1++;
			      	   	CategoryItemName2_3=getElementText(Category_3rdItemHeading);
			      	   			clickElement(Category_3rdItemSelect);
			      	   		}
			      	   			Reporter.log("Multiple items selected :Pass"); 			
			      	   		}
			      	   	
			      	   	catch(Exception e){
			      	   	Reporter.log("Multiple items selected :Fail");
			      	   	switchToNativeContext();takeScreenshot(finalPath1);
	                Assert.assertTrue(false);
			      	   	}
			      	      return this;
			      	   }

		@SuppressWarnings("rawtypes")
		public CategoryPage AddCategoryName(String categoryName,String string) throws InterruptedException, IOException
		   	{
		   		String string2="Issue";   
		   		String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;	
		   		
		   		try{
		   			waitForElementToBeClickable(ADD_CategoryName);
		   			clearElement(ADD_CategoryName);
		   			clickElement(ADD_CategoryName);
		   			sendText(ADD_CategoryName,categoryName);
		   		 		Reporter.log("added category name :Pass");
		   			}
		   			
		   	
		   		
		   		catch(Exception e)
		   		{
		   			Reporter.log("added category name :Fail");
		   			switchToNativeContext();takeScreenshot(finalPath1);
		   			Assert.assertTrue(false);
		   		}
		   		
		   		return this;
		   		
		   	}
		   @SuppressWarnings({ "rawtypes", "unchecked", "unused" })
		public CategoryPage AddLocationCooler(String string) throws InterruptedException, IOException
		   	{
		   		String string2="Issue";   
		   		String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;	
		   		
		   		try{
		  		
		   			waitForElementToBeClickable(AddCategory_FoodWeb);
		   		    clickElement(AddCategory_FoodWeb);
		   		
		   			 		Reporter.log("Selected food :Pass");
		   			}
		   			
		   	
		   		
		   		catch(Exception e)
		   		{
		   			Reporter.log("Selected food :Fail");
		   			switchToNativeContext();takeScreenshot(finalPath1);
		   			Assert.assertTrue(false);
		   		}
		   		
		   		return this;
		   		
		   	}
		
		
		@SuppressWarnings({ "unchecked", "unused", "rawtypes" })
		public CategoryPage TapOnDone(String string) throws InterruptedException, IOException{
		    	String string1="Success";
		    	  String string2="Issue";
		
		    String finalPath=Screenshot.drivePath+string+string1+Screenshot.pathExtension;
		    String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
		
		    	try{
		    		
		    		
		    		switchToNativeContext();
		    			waitForElementToBeClickable(DoneWeb);
		    		if (isElementPresent(DoneWeb))
		    		{
		    			
		    			clickElement(DoneWeb);
		    			waitForElement(8);
		    			Reporter.log("Tapped on done:Pass");
		    			switchToWebContext();
		    			
		    			
		    		}
		    		
		    	}
		    	catch(Exception e)
		    	{
		    		Reporter.log("Tapped on done :Fail");
		    		switchToNativeContext(); 
		    		takeScreenshot(finalPath1);
		    		Assert.assertTrue(false);
		    	}
		    	
		    	return this;
		    }
		
		
		
		@SuppressWarnings("rawtypes")
		public CategoryPage SelectCategory(String name,String string) throws InterruptedException, IOException
		{
		    String finalPath1=Screenshot.drivePath+string+Screenshot.string2+Screenshot.pathExtension;
		    
			Reporter.log("Selecting Category");
		try{
			
		 waitForElement(2);
		 //DONT CHANGE THE BELOW OBJECT  -  It should have the parameter name which we are passing in teh script
		 switchToNativeContext();
			final String Locname= "//android.widget.CheckedTextView[contains(@text,'"+name+"')]";
			//final String Locname="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.widget.Button[2]";

			waitForElementToBeClickable(Locname);
			  clickElement(Locname); 
		      
			 	Reporter.log("Category is selected for item :Pass");	
			 	switchToWebContext();
			}
			
			
			
			catch(Exception e){
				Reporter.log("Category is selected for item   :Fail");
				switchToNativeContext(); 
				 takeScreenshot(finalPath1); 
				
				Assert.assertTrue(false);
			}
			return this;
			
		}
		   @SuppressWarnings({ "rawtypes", "unchecked", "unused" })
			public CategoryPage AddCategoryFood(String string) throws InterruptedException, IOException
			   	{
			   		String string2="Issue";   
			   		String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;	
			   		
			   		try{
			  			switchToNativeContext();
			  			waitForElementToBeClickable(AddCategory_Food);
			   		    clickElement(AddCategory_Food);
			   		 switchToWebContext();
			   			 		Reporter.log("Selected food :Pass");
			   			}
			   			
			   	
			   		
			   		catch(Exception e)
			   		{
			   			Reporter.log("Selected food :Fail");
			   			switchToNativeContext();takeScreenshot(finalPath1);
			   			Assert.assertTrue(false);
			   		}
			   		
			   		return this;
			   		
			   	}
		@SuppressWarnings("rawtypes")
		public CategoryPage TapOnBack(String string) throws InterruptedException, IOException{
			String finalPath1=Screenshot.drivePath+string+Screenshot.string2+Screenshot.pathExtension;
		
				try{
					switchToNativeContext();
					waitFor(10);
					waitForElementToBeClickable(Back);
					if (isElementPresent(Back))
					{
						
						clickElement(Back);
						switchToWebContext();
						Reporter.log("tap on back :Pass");
						
					}
					
				}
				catch(Exception e)
				{
					Reporter.log("tap on back :Fail");
					switchToNativeContext(); 
					
					takeScreenshot(finalPath1);
					Assert.assertTrue(false);
				}
				
				return this;
			}
		
		@SuppressWarnings("rawtypes")
		public CategoryPage TapOnBack1(String string) throws InterruptedException, IOException{
			String finalPath1=Screenshot.drivePath+string+Screenshot.string2+Screenshot.pathExtension;
		
				try{
					switchToNativeContext();
					waitFor(10);
					waitForElementToBeClickable(Back1);
					if (isElementPresent(Back1))
					{
						
						clickElement(Back1);
						switchToWebContext();
						Reporter.log("tap on back :Pass");
						
					}
					
				}
				catch(Exception e)
				{
					Reporter.log("tap on back :Fail");
					switchToNativeContext(); 
					
					takeScreenshot(finalPath1);
					Assert.assertTrue(false);
				}
				
				return this;
			}
		
		
		@SuppressWarnings("rawtypes")
		public CategoryPage VerifyCategory(String name,String string) throws InterruptedException, IOException
		{
			String string2="Issue";
		    String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
		    
			Reporter.log("Selected Category is there");
		try{
			
			
		 waitForElement(4);
			final String  Locname= "//*[@class='mm-c-product-list__details']//*[contains(text(),'"+name+"')]";    
			waitForElementToBeClickable(Locname);
				Reporter.log("Category is verified for item :Pass");						
			}
			
				catch(Exception e){
					Reporter.log("Category is verified for item   :Fail");
				switchToNativeContext(); 
				 takeScreenshot(finalPath1); 
				
				Assert.assertTrue(false);
			}
			return this;
			
		}

		@SuppressWarnings("rawtypes")
		public CategoryPage TapAdd(String string) throws InterruptedException, IOException
		{
		String string2="Issue";   
		String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;	
		switchToNativeContext();
		try{
		waitForElementToBeClickable(AddWeb);
		if(isElementPresent(AddWeb))
		{
			clickElement(AddWeb);
			Reporter.log("Navigating to Add categories page :Pass");	
		
		}
		switchToWebContext();
		}
		catch(Exception e)
		{
			Reporter.log("Navigating to Add categories page :Fail");
			switchToNativeContext(); 
		takeScreenshot(finalPath1);
		
		Assert.assertTrue(false);
		}
		
		return this;
		
		}
		
		@SuppressWarnings("rawtypes")
		public  CategoryPage VerifyCategoryList(String categoryAdded,String string) throws InterruptedException, IOException{
		String string2="Issue";
		String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
		Reporter.log("Checking addeded Location in location list");
		try{	
		
		final String  CatAdded="//*[@id='list-item']//span[contains(text(),'"+categoryAdded+"')]";  
		
		waitForElement(3);
		waitForElementToBeClickable(CatAdded);
		if (isElementPresent(CatAdded)) {
			Reporter.log("Added Category is listed :Pass");
		}else{
			 throw new Exception();
		}
		
		}
		catch(Exception e)
		{
			Reporter.log("Added Category is listed   :Fail");	
			switchToNativeContext(); 
		takeScreenshot(finalPath1);
		
		Assert.assertTrue(false);
		}
		
		return this;
		
		
		}
		
		
		public  CategoryPage selectCategoryFromExpenseList(String categoryAdded,String string) throws InterruptedException, IOException{
			String string2="Issue";
			String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
			Reporter.log("click on category from expense list");
			try{	
			
			final String  CatAdded="//*[@id='list-item']//span[contains(text(),'"+categoryAdded+"')]";  
			
			waitForElement(3);
			waitForElementToBeClickable(CatAdded);
			if (isElementPresent(CatAdded)) {
				clickElement(CatAdded);
			}else{
				 throw new Exception("Element is not present to click");
			}
			
			}
			catch(Exception e)
			{
				Reporter.log("Added Category is listed   :Fail");	
				switchToNativeContext(); 
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);
			}
			
			return this;
			
			
			}
		
		@SuppressWarnings("rawtypes")
		public CategoryPage TapOnEdit(String string) throws InterruptedException, IOException{
		String string2="Issue";
		String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
		
		try{
		
			waitForElementToBeClickable(EditWeb);
			if (isElementPresent(EditWeb))
			{
				
				clickElement(EditWeb);
				Reporter.log("tap on edit :Pass");
			}
			
		}
		catch(Exception e)
		{
			Reporter.log("tap on edit :Fail");
			switchToNativeContext(); 
			takeScreenshot(finalPath1);
			Assert.assertTrue(false);
		}
		
		return this;
		}
		
		@SuppressWarnings("rawtypes")
		public CategoryPage TapOnDeleteCategory(String string) throws InterruptedException, IOException{
		String string2="Issue";

		String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
		
		try{
			
			
			waitForElement(2);
			waitForElementToBeClickable(Delete);
			if (isElementPresent(Delete))
			{
				
				clickElement(Delete);
				Reporter.log("tap on Delete :Pass");
			}
			
		}
		catch(Exception e)
		{Reporter.log("tap on delete:Fail");
			switchToNativeContext(); 
			
			takeScreenshot(finalPath1);
			Assert.assertTrue(false);
		}
		
		return this;
		}
		
		@SuppressWarnings("rawtypes")
		public CategoryPage TapOnYesDelete(String string) throws InterruptedException, IOException{
			  String string2="Issue";
		String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
		Reporter.log("Deleted");
			try{
				
				waitFor(5);
				waitForElementToBeClickable(YesDelete);
				if (isElementPresent(YesDelete))
				{
					
					clickElement(YesDelete);
					waitForElement(6);
					Reporter.log("tap on yes delete :Pass");
				}
				
			}
			catch(Exception e)
			{Reporter.log("tap on yes delete :Fail");
				switchToNativeContext(); 
				
				takeScreenshot(finalPath1);
				Assert.assertTrue(false);
			}
			
			return this;
		}
		@SuppressWarnings("rawtypes")
		public  CategoryPage VerifyDeletedCategoryList(String categoryAdded,String string) throws InterruptedException, IOException{
		String string2="Issue";
		String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
		
		try{	
		
			waitForElement(3);
		final String  CatAdded="//*[@id='list-item']//span[contains(text(),'"+categoryAdded+"')]";   
		
		if (isElementPresent(CatAdded)) {
			Reporter.log("Deleted category is there :Fail");
			Assert.assertTrue(false);
		}
		Reporter.log("Deleted category is not listed   :Pass");
		}
		catch(Exception e)
		{	Reporter.log("Deleted category is  listed   :Fail");	
			switchToNativeContext(); 
		takeScreenshot(finalPath1);
		
		Assert.assertTrue(false);
		}
		
		return this;
		
		
		}  	
		
		
		@SuppressWarnings("rawtypes")
		public CategoryPage AssignMultipleItemsToCategory(String string) throws InterruptedException, IOException {
		 String string2="Issue";
		String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
		try{
		
			waitFor(5);
		waitForElementToBeClickable(Category_1stItemSelect);
		waitForElementToBeClickable(Category_2ndItemSelect);
		waitForElementToBeClickable(Category_NonSyscoItem1Select);
		waitForElementToBeClickable(Category_NonSyscoItem2Select);
		
			if(isElementPresent(Category_1stItemSelect))
			{
			CategoryNoOfElements1++;
			CategoryItemName1_1=getElementText(Category_1stItemHeading);
				clickElement(Category_1stItemSelect);
				
			}
			if(isElementPresent(Category_2ndItemSelect)){
				
			CategoryNoOfElements1++;
		CategoryItemName1_2=getElementText(Category_2ndItemHeading);
				clickElement(Category_2ndItemSelect);
			}
				
			if(isElementPresent(Category_NonSyscoItem1Select)){	
			CategoryNoOfElements1++;
		CategoryItemName1_3=getElementText(Category_3rdItemHeading);
				clickElement(Category_NonSyscoItem1Select);
			}
				
			if(isElementPresent(Category_NonSyscoItem2Select)){	
				CategoryNoOfElements1++;
			CategoryItemName1_4=getElementText(Category_4thItemHeading);
					clickElement(Category_NonSyscoItem2Select);
				}	
				Reporter.log("Multiple items selected :Pass"); 			
			}
		
		catch(Exception e){
			Reporter.log("Multiple items selected :Fail");
			switchToNativeContext(); 
		takeScreenshot(finalPath1); 
			
			Assert.assertTrue(false);
		}
		return this;
		}

		@SuppressWarnings("rawtypes")
		public CategoryPage SuggestedCategories(String string) throws InterruptedException, IOException
		{
			Reporter.log("Selecting suggested category from Food cost page");

			  String string2="Issue";
		      String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
			
		      try{
		    	 
		    		 waitForElementToBeClickable(FoodAndNonFood);
		    		 waitForElementToBeClickable(SetUp_Pg3Header);
					waitForElementToBeClickable(SuggestedCategories);
					
					if(isElementPresent(SuggestedCategories))
					{
						clickElement(SuggestedCategories);
						 
						Reporter.log("Suggested Category selected :Pass");
						
					}
					
		      }
			
		
			catch(Exception e){
				Reporter.log("Suggested category selected from food cost page :Fail");
				switchToNativeContext(); 
				takeScreenshot(finalPath1); 
				
				Assert.assertTrue(false);
			}
			return this;
			
		}
		
		
		@SuppressWarnings("rawtypes")
		public CategoryPage VerifyMultipleListSyscoSuggestedCategory(String string) throws InterruptedException, IOException
		{
			
			 Boolean flag1=false;
			 Boolean flag2=false;
			  String string2="Issue";
		    String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
		    
			
		try{
			
			
		 waitFor(2);
		 if((LocationsPage.Category1[0].equalsIgnoreCase("Meat"))||(LocationsPage.Category1[0].equalsIgnoreCase("Groceries"))||(LocationsPage.Category1[0].equalsIgnoreCase("Dairy"))||(LocationsPage.Category1[0].equalsIgnoreCase("Poultry"))||(LocationsPage.Category1[0].equalsIgnoreCase("Seafood"))||(LocationsPage.Category1[0].equalsIgnoreCase("Produce"))||(LocationsPage.Category1[0].equalsIgnoreCase("Beverage"))||(LocationsPage.Category1[0].equalsIgnoreCase("Miscellaneous"))){
			  flag1=true;
			  
		 }
		 if((LocationsPage.Category2[0].equalsIgnoreCase("Meat"))||(LocationsPage.Category2[0].equalsIgnoreCase("Groceries"))||(LocationsPage.Category2[0].equalsIgnoreCase("Dairy"))||(LocationsPage.Category2[0].equalsIgnoreCase("Poultry"))||(LocationsPage.Category2[0].equalsIgnoreCase("Seafood"))||(LocationsPage.Category2[0].equalsIgnoreCase("Produce"))||(LocationsPage.Category2[0].equalsIgnoreCase("Beverage"))||(LocationsPage.Category2[0].equalsIgnoreCase("Miscellaneous"))){
			  flag2=true;
			  
		}
		 if(!(flag2&&flag1)){ 
			   throw new Exception();
		 } 
		   
			  
				Reporter.log("Category is verified for item :Pass");						
			}
			
			
			
			catch(Exception e){
				Reporter.log("Category is verified for item   :Fail");
				switchToNativeContext(); 
				 takeScreenshot(finalPath1); 
				
				Assert.assertTrue(false);
			}
			return this;
			
		}
		
	
		@SuppressWarnings("rawtypes")
		public CategoryPage VerifyPrepCustomCategory(String customcategory,String string) throws InterruptedException, IOException
		{
			
			 Boolean flag4=false;
			  String string2="Issue";
		    String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
		    
			Reporter.log("Category verification for nonsysco");
		try{
			
			
		 waitFor(2);
		 if((LocationsPage.Prep_Category1[0].equalsIgnoreCase(customcategory))){
			  flag4=true;
			  
		 }
		 if(!(flag4)){ 
			   throw new Exception();
		 } 
		   
			
				Reporter.log("Category is verified for prep item :Pass");						
			}
			
			
			
			catch(Exception e){
				Reporter.log("Category is verified for prep item   :Fail");
				switchToNativeContext(); 
				 takeScreenshot(finalPath1); 
				
				Assert.assertTrue(false);
			}
			return this;
			
		}
		@SuppressWarnings("rawtypes")
		public CategoryPage VerifyOGSyscoItemsSuggestedCategoryLocation1(String string) throws InterruptedException, IOException
		{
			Boolean flag3=false;
			 Boolean flag1=false;
			 Boolean flag2=false;
			  String string2="Issue";
		    String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;	
		try{
		 waitFor(2);
			
		 if((LocationsPage.Category3[0].equalsIgnoreCase("Meat"))||(LocationsPage.Category3[0].equalsIgnoreCase("Groceries"))||(LocationsPage.Category3[0].equalsIgnoreCase("Dairy"))||(LocationsPage.Category3[0].equalsIgnoreCase("Poultry"))||(LocationsPage.Category3[0].equalsIgnoreCase("Seafood"))||(LocationsPage.Category3[0].equalsIgnoreCase("Produce"))||(LocationsPage.Category3[0].equalsIgnoreCase("Beverage"))||(LocationsPage.Category3[0].equalsIgnoreCase("Miscellaneous"))){
			  flag1=true;
			  
		 }
		 if((LocationsPage.Category4[0].equalsIgnoreCase("Meat"))||(LocationsPage.Category4[0].equalsIgnoreCase("Groceries"))||(LocationsPage.Category4[0].equalsIgnoreCase("Dairy"))||(LocationsPage.Category4[0].equalsIgnoreCase("Poultry"))||(LocationsPage.Category4[0].equalsIgnoreCase("Seafood"))||(LocationsPage.Category4[0].equalsIgnoreCase("Produce"))||(LocationsPage.Category4[0].equalsIgnoreCase("Beverage"))||(LocationsPage.Category4[0].equalsIgnoreCase("Miscellaneous"))){
			  flag2=true;
			  
		}
		 if((LocationsPage.Category5[0].equalsIgnoreCase("Meat"))||(LocationsPage.Category5[0].equalsIgnoreCase("Groceries"))||(LocationsPage.Category5[0].equalsIgnoreCase("Dairy"))||(LocationsPage.Category5[0].equalsIgnoreCase("Poultry"))||(LocationsPage.Category5[0].equalsIgnoreCase("Seafood"))||(LocationsPage.Category5[0].equalsIgnoreCase("Produce"))||(LocationsPage.Category4[0].equalsIgnoreCase("Beverage"))||(LocationsPage.Category5[0].equalsIgnoreCase("Miscellaneous"))){
			  flag3=true;
			  
		}

		 if(!(flag2&&flag1&&flag3)){ 
			   throw new Exception();
		 } 
				Reporter.log("Category is verified for item :Pass");						
			}

			catch(Exception e){
				Reporter.log("Category is verified for item   :Fail");
				switchToNativeContext();
				 takeScreenshot(finalPath1); 
				
				Assert.assertTrue(false);
			}
			return this;
			
		}

		@SuppressWarnings("rawtypes")
		public CategoryPage VerifyOGSyscoItemsSuggestedCategoryLocation2(String string) throws InterruptedException, IOException
		{
			Boolean flag3=false;
			 Boolean flag1=false;
			 Boolean flag2=false;
			  String string2="Issue";
		    String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
		    
			Reporter.log("Ctegory verification");
		try{
			
			
		 waitFor(2);
		 if((LocationsPage.Category6[0].equalsIgnoreCase("Meat"))||(LocationsPage.Category6[0].equalsIgnoreCase("Groceries"))||(LocationsPage.Category6[0].equalsIgnoreCase("Dairy"))||(LocationsPage.Category6[0].equalsIgnoreCase("Poultry"))||(LocationsPage.Category6[0].equalsIgnoreCase("Seafood"))||(LocationsPage.Category6[0].equalsIgnoreCase("Produce"))||(LocationsPage.Category6[0].equalsIgnoreCase("Beverage"))||(LocationsPage.Category6[0].equalsIgnoreCase("Miscellaneous"))){
			  flag1=true;
			  
		 }
		 if((LocationsPage.Category7[0].equalsIgnoreCase("Meat"))||(LocationsPage.Category7[0].equalsIgnoreCase("Groceries"))||(LocationsPage.Category7[0].equalsIgnoreCase("Dairy"))||(LocationsPage.Category7[0].equalsIgnoreCase("Poultry"))||(LocationsPage.Category7[0].equalsIgnoreCase("Seafood"))||(LocationsPage.Category7[0].equalsIgnoreCase("Produce"))||(LocationsPage.Category7[0].equalsIgnoreCase("Beverage"))||(LocationsPage.Category7[0].equalsIgnoreCase("Miscellaneous"))){
			  flag2=true;
			  
		}
		 if((LocationsPage.Category8[0].equalsIgnoreCase("Meat"))||(LocationsPage.Category8[0].equalsIgnoreCase("Groceries"))||(LocationsPage.Category8[0].equalsIgnoreCase("Dairy"))||(LocationsPage.Category8[0].equalsIgnoreCase("Poultry"))||(LocationsPage.Category8[0].equalsIgnoreCase("Seafood"))||(LocationsPage.Category8[0].equalsIgnoreCase("Produce"))||(LocationsPage.Category8[0].equalsIgnoreCase("Beverage"))||(LocationsPage.Category8[0].equalsIgnoreCase("Miscellaneous"))){
			  flag3=true;
			  
		}
		 if(!(flag2&&flag1&&flag3)){ 
			   throw new Exception();
		 } 
		   
		 
		
				Reporter.log("Category is verified for item :Pass");						
			}
			
			
			
			catch(Exception e){
				Reporter.log("Category is verified for item   :Fail");
				switchToNativeContext();
				 takeScreenshot(finalPath1); 
				
				Assert.assertTrue(false);
			}
			return this;
			
		}
		@SuppressWarnings("rawtypes")
		public CategoryPage VerifyNonSycoCustomCategory(String customcategory,String string) throws InterruptedException, IOException
		{
			
			 Boolean flag3=false;
			  String string2="Issue";
		  String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
		  
			Reporter.log("Category verification for nonsysco");
		try{
			
		
		waitFor(2);
		if((LocationsPage.NonSysco_Category1[0].equalsIgnoreCase(customcategory))){
			  flag3=true;
			  
		}
		if(!(flag3)){ 
			   throw new Exception();
		} 
		 
			
				Reporter.log("Category is verified for nonsysco item :Pass");						
			}
			
			catch(Exception e){
				Reporter.log("Category is verified for nonsyco item   :Fail");
				switchToNativeContext();
				 takeScreenshot(finalPath1); 
				
				Assert.assertTrue(false);
			}
			return this;
			
		}
		
		
		@SuppressWarnings("rawtypes")
		public CategoryPage VerifySuggestedCategory(String string) throws InterruptedException, IOException
		{
			  String string2="Issue";
		    String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
		    
			
		try{
			
		  final String Sysco_Product_Select= "(//*[@class='mm-c-product-list']//*[@class='mm-c-product-list__item mm-c-product__sysco ']//*[@class='mm-c-product-list__image'])[1]";
				if(isElementPresent(Sysco_Product_Select)){
					final String CategoryLine1= "(//*[@class='mm-c-product-list']//*[@class='mm-c-product-list__all-prods']//*[@class='mm-c-product-list__details-wrapper']//*[@class='mm-c-product-list__location'])[1]"; 
					String SyscocategoryKeyword1 = getElementText(CategoryLine1);
						SyscoCategory1=SyscocategoryKeyword1.split("\\s+");

		
					
				}
			   
				Reporter.log("Suggested Category is verified for item :Pass");						
			}
			
			
			
			catch(Exception e){
				Reporter.log("Suggested Category is verified for item   :Fail");
				switchToNativeContext(); 
				 takeScreenshot(finalPath1); 
				
				Assert.assertTrue(false);
			}
			return this;
			
		}
		@SuppressWarnings("rawtypes")
		public CategoryPage TapAnySuggestedCategory(String SyscoCategory1,String SyscoCategory2,String string) throws InterruptedException, IOException
		{
			  String string2="Issue";
		    String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
		    System.out.println(SyscoCategory1);
		    System.out.println(SyscoCategory2);
		
		try{
switchToNativeContext();
			if(SyscoCategory1.equalsIgnoreCase("Dairy"))
				{waitForElementToBeClickable(Select_SuggCat_Meat1).clickElement(Select_SuggCat_Meat1);
				Selected_SuggCat1="Meat";
				
				}
			else
				{waitForElementToBeClickable(Select_SuggCat_Dairy1).clickElement(Select_SuggCat_Dairy1);
				Selected_SuggCat1="Dairy";
				}
			switchToWebContext();
				Reporter.log("Suggested Category is selected for item :Pass");						
			}
		    
			catch(Exception e){
				Reporter.log("Suggested Category is selected for item   :Fail");
				switchToNativeContext(); 
				 takeScreenshot(finalPath1); 
				
				Assert.assertTrue(false);
			}
			return this;
			
		}
		@SuppressWarnings("rawtypes")
		public CategoryPage VerifySelectedSuggestedCategory(String SyscoCategory2,String string) throws InterruptedException, IOException
		{
			  String string2="Issue";
		    String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
		    try{
			if(SyscoCategory2.equalsIgnoreCase(Selected_SuggCat1))
				throw new Exception();
			else
				
				Reporter.log("Suggested Category is changed for item :Pass");	
			 
				
			}
			
			
			
			catch(Exception e){
				Reporter.log("Suggested Category is verified for item   :Fail");
				switchToNativeContext(); 
				 takeScreenshot(finalPath1); 
				
				Assert.assertTrue(false);
			}
			return this;
			
		}
		@SuppressWarnings("rawtypes")
		public CategoryPage VerifySuggestedCategoryList(String string) throws InterruptedException, IOException
		{
			  String string2="Issue";
		  String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
		  
			
		try{
			boolean flag2_1 = isElementPresentAfterWait(SuggestedCategory_Dairy, 3);
			boolean flag2_2 = isElementPresentAfterWait(SuggestedCategory_Meat, 3);
			boolean flag2_3 = isElementPresentAfterWait(SuggestedCategory_Poultry, 3);
			boolean flag2_4 = isElementPresentAfterWait(SuggestedCategory_Seafood, 3);
			boolean flag2_5 = isElementPresentAfterWait(SuggestedCategory_Produce, 3);
			boolean flag2_6 = isElementPresentAfterWait(SuggestedCategory_Groceries, 3);
			boolean flag2_7 = isElementPresentAfterWait(SuggestedCategory_Beverage, 3);
			boolean flag2_8 = isElementPresentAfterWait(SuggestedCategory_Miscellaneous, 3);
			if((flag2_1 && flag2_2 && flag2_3 && flag2_4 && flag2_5 && flag2_6 && flag2_7 && flag2_8)){ 
				Reporter.log("Suggested category list verification done :Pass");
			}    			     
			
			else {
				throw new Exception();
				}
				}
			
			catch(Exception e){
				Reporter.log("Suggested categories are listed  :Fail");
				switchToNativeContext();
				takeScreenshot(finalPath1);
		     	
				Assert.assertTrue(false);
			}
			return this;
			
		}
		
		@SuppressWarnings("rawtypes")
		public CategoryPage VerifyCustomListItemsDefaultCategoryLocation1(String string) throws InterruptedException, IOException
		{
			Boolean flag3=false;
			 Boolean flag1=false;
			 Boolean flag2=false;
			  String string2="Issue";
		    String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
		    
		
		try{
			
		 waitFor(2);
			
		 if((LocationsPage.Category3[0].equalsIgnoreCase("Food"))||(LocationsPage.Category3[0].equalsIgnoreCase("Non-Food"))){
			  flag1=true;
			  
		 }
		 if((LocationsPage.Category4[0].equalsIgnoreCase("Food"))||(LocationsPage.Category4[0].equalsIgnoreCase("Non-Food"))){
			  flag2=true;
			  
		}
		 if((LocationsPage.Category5[0].equalsIgnoreCase("Food"))||(LocationsPage.Category5[0].equalsIgnoreCase("Non-Food"))){
			  flag3=true;
			  
		}

		 if(!(flag2&&flag1&&flag3)){ 
			   throw new Exception();
		 } 
		   
		 
		 
				Reporter.log("Default Category is verified for items :Pass");						
			}
			catch(Exception e){
				Reporter.log("Category is verified for item   :Fail");
				switchToNativeContext();
				takeScreenshot(finalPath1);
				
				Assert.assertTrue(false);
			}
			return this;
			
		}
		
		@SuppressWarnings("rawtypes")
		public CategoryPage VerifyCustomListItemsDefaultCategoryLocation2(String string) throws InterruptedException, IOException
		{
			Boolean flag3=false;
			 Boolean flag1=false;
			 Boolean flag2=false;
			  String string2="Issue";
		    String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
		    
			Reporter.log("Default Category verification");
		try{
			
		 waitFor(2);

		 if((LocationsPage.Category6[0].equalsIgnoreCase("Food"))||(LocationsPage.Category6[0].equalsIgnoreCase("Non-Food"))){
			  flag1=true;
			  
		 }
		 if((LocationsPage.Category7[0].equalsIgnoreCase("Food"))||(LocationsPage.Category7[0].equalsIgnoreCase("Non-Food"))){
			  flag2=true;
			  
		}
		 if((LocationsPage.Category8[0].equalsIgnoreCase("Food"))||(LocationsPage.Category8[0].equalsIgnoreCase("Non-Food"))){
			  flag3=true;
			  
		}
		 if(!(flag2&&flag1&&flag3)){ 
			   throw new Exception();
		 } 
		   
		 
				Reporter.log("Default Category is verified for items :Pass");						
			}
			
			
			
			catch(Exception e){
				Reporter.log("Category is verified for item   :Fail");
				switchToNativeContext();
				takeScreenshot(finalPath1);
				
				Assert.assertTrue(false);
			}
			return this;
			
		}
		
		@SuppressWarnings("rawtypes")
		public CategoryPage VerifyDefaultCategoryList(String string) throws InterruptedException, IOException
		{
			  String string2="Issue";
		  String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
		  
		
		try{
			
			
		
			boolean flag2_1 = isElementPresentAfterWait(DefaultCategory_Food, 3);
			boolean flag2_2 = isElementPresentAfterWait(DefaultCategory_NonFood, 3);
			if((flag2_1 && flag2_2)){ 
				Reporter.log("Default category list verification done :Pass");
			}    			     
			
			else {
				throw new Exception();
				}
			
				}
			
			catch(Exception e){
				Reporter.log("Default categories are listed  :Fail");
				switchToNativeContext();
				takeScreenshot(finalPath1);
		     	
				Assert.assertTrue(false);
			}
			return this;
			
		}
		
		
		@SuppressWarnings("rawtypes")
		public CategoryPage VerifyItemPresentUncategorizedAndAllItems(String string) throws InterruptedException, IOException
		{
		  String string2="Issue";
		String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
		
			
		try{
		waitFor(5);	
		waitForElementToBeClickable(SetupInventoryCustomCategoryAllItemsTab);
		clickElement(SetupInventoryCustomCategoryAllItemsTab);
		waitFor(3);
		final String  ItemSelectedFromUncatgorisedVerify= "//*[@id='mount']//*[contains(text(),'"+CategoryItemName1_1+"')]";
		final String  ItemSelectedFromUncatgorisedVerify1= "//*[@id='mount']//*[contains(text(),'"+CategoryItemName1_2+"')]";
		final String  ItemSelectedFromUncatgorisedVerify2= "//*[@id='mount']//*[contains(text(),'"+CategoryItemName1_3+"')]";
		final String  ItemSelectedFromUncatgorisedVerify3="//*[@id='mount']//*[contains(text(),'"+CategoryItemName1_4+"')]";
		
		if (isElementPresent(ItemSelectedFromUncatgorisedVerify)) {
			waitForElementToBeClickable(ItemSelectedFromUncatgorisedVerify1);
			waitForElementToBeClickable(ItemSelectedFromUncatgorisedVerify2);
			waitForElementToBeClickable(ItemSelectedFromUncatgorisedVerify3);
		Reporter.log(" Added item  is present in All Items Tab  :Pass");
		
		}
		waitFor(5);	
		waitForElementToBeClickable(SetupInventoryCustomCategoryUncategorizedTab);
		clickElement(SetupInventoryCustomCategoryUncategorizedTab);
		
				       
		if (isElementPresent(ItemSelectedFromUncatgorisedVerify)) {
			waitForElementToBeClickable(ItemSelectedFromUncatgorisedVerify1);
			waitForElementToBeClickable(ItemSelectedFromUncatgorisedVerify2);
			waitForElementToBeClickable(ItemSelectedFromUncatgorisedVerify3);
			Reporter.log(" Added item  is present in category Tab(Expected-Item should not be present) :Fail");
			throw new Exception();
		}
		else if ( !(  (isElementPresent(ItemSelectedFromUncatgorisedVerify))&& (isElementPresent(ItemSelectedFromUncatgorisedVerify1))&&
				( isElementPresent(ItemSelectedFromUncatgorisedVerify2))&&(isElementPresent(ItemSelectedFromUncatgorisedVerify3) )))  {
			Reporter.log(" Added item  is not present in uncategorized Tab :Pass");
		}
		
		waitFor(5);	
		
		
		
		Reporter.log("Category is verified for nonsysco item :Pass");						
		
		}

		catch(Exception e){
		Reporter.log("Added item  is present in category Tab(Expected-Item should not be present)    :Fail");
		switchToNativeContext();
		 takeScreenshot(finalPath1); 
		
		Assert.assertTrue(false);
		}
		return this;
		
		}

		@SuppressWarnings("rawtypes")
		public CategoryPage VerifyOptionsOnSetUpFoodCost(String string) throws InterruptedException, IOException{
		String string2="Issue";	
		String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
		try{
		waitForElementToBeClickable(SetUp_Pg3Title);
			if(isElementPresent(FoodAndNonFood) && isElementPresent(FoodAndNonFoodDesc) && isElementPresent(SuggestedCategories) && isElementPresent(SuggestedCategoriesDesc) && isElementPresent(CustomCategories) && isElementPresent(CustomCategoriesDesc))
			{
				Reporter.log("VerifyOptionsOnSetUpFoodCost:Pass");
			}
			else
			{
				Reporter.log("VerifyOptionsOnSetUpFoodCost:Fail");
				throw new Exception();
			}
			
		
		Reporter.log("Category page verification done :Pass");
		}
		catch(Exception e){
			Reporter.log("Category page verification done  :Fail");
		switchToNativeContext(); 
		takeScreenshot(finalPath1);
		
		Assert.assertTrue(false);
		}
		
		return this;
		
		}
		@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
		public CategoryPage AddCategoryNonFood(String string) throws InterruptedException, IOException
			{
				String string2="Issue";   
				String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;	
				
				try{
					
						switchToNativeContext();
		
							waitForElementToBeClickable(AddCategory_NonFood);
				    clickElement(AddCategory_NonFood);
				    switchToWebContext();
					 		Reporter.log("Selected Non Food :Pass");
					}
				catch(Exception e)
				{
					Reporter.log("Selected Non Food :Fail");
					switchToNativeContext(); 
					takeScreenshot(finalPath1);
					
					Assert.assertTrue(false);
				}
				return this;
			}
		
		@SuppressWarnings("rawtypes")
		public CategoryPage VerifyCustomListItemsCustomCategoryLocation1(String category, String string) throws InterruptedException, IOException {
			Boolean flag3 = false;
			Boolean flag1 = false;
			Boolean flag2 = false;
			String string2 = "Issue";
			String finalPath1 = Screenshot.drivePath + string + string2 + Screenshot.pathExtension;
		
			Reporter.log("Custom Category verification on location1");
			try {
		
				waitFor(2);
				if ((LocationsPage.Category3[0].equalsIgnoreCase(category))) {
					flag1 = true;
		
				}
				if ((LocationsPage.Category4[0].equalsIgnoreCase(category))) {
					flag2 = true;
		
				}
				if ((LocationsPage.Category5[0].equalsIgnoreCase(category))) {
					flag3 = true;
		
				}
		
				if (!(flag2 && flag1 && flag3)) {
					throw new Exception();
				}
		
				Reporter.log("Custom Category is verified for items in location1 :Pass");
			}
		
			catch (Exception e) {
				Reporter.log("Custom Category is verified for item in location1  :Fail");
				switchToNativeContext();
				takeScreenshot(finalPath1);
		
				
				Assert.assertTrue(false);
			}
			return this;
		
		}
		
		@SuppressWarnings("rawtypes")
		public CategoryPage VerifyCustomListItemsCustomCategoryLocation2(String category, String string) throws InterruptedException, IOException {
			Boolean flag3 = false;
			Boolean flag1 = false;
			Boolean flag2 = false;
			String string2 = "Issue";
			String finalPath1 = Screenshot.drivePath + string + string2 + Screenshot.pathExtension;
		
			Reporter.log("Custom Category verification on location2");
			try {
		
				waitFor(2);
		
				if ((LocationsPage.Category6[0].equalsIgnoreCase(category))) {
					flag1 = true;
		
				}
				if ((LocationsPage.Category7[0].equalsIgnoreCase(category))) {
					flag2 = true;
		
				}
				if ((LocationsPage.Category8[0].equalsIgnoreCase(category))) {
					flag3 = true;
		
				}
				if (!(flag2 && flag1 && flag3)) {
					throw new Exception();
				}
		
				Reporter.log("Custom Category is verified for items in location2 :Pass");
			}
		
			catch (Exception e) {
				Reporter.log("Custom Category is verified for item in location2  :Fail");
				switchToNativeContext();
				takeScreenshot(finalPath1);
		
			
				Assert.assertTrue(false);
			}
			return this;
		
		}
		
		@SuppressWarnings("rawtypes")
		public CategoryPage VerifyOptionsOnCreateExpenseCategory(String string) throws InterruptedException, IOException {

			String string2 = "Issue";
			String finalPath1 = Screenshot.drivePath + string + string2 + Screenshot.pathExtension;

			Reporter.log("Category page verify ");
			try {

				waitForElementToBeClickable(CreateExpenseCategoryHeader);
				if (isElementPresent(CreateExpenseCategoryHeader) && isElementPresent(SetUp_Pg3Header)
						&& isElementPresent(CreateExpenseCategoryDesc1)
						&& isElementPresent(CreateExpenseCategoryDesc2)) {
					
					Reporter.log("Verify Options On Create custom category page:Pass");

				} else {

					Reporter.log("Verify Options On Create custom category page:Fail");
					throw new Exception();
				}
				Reporter.log("Create custom Category page verification done :Pass");
			} catch (Exception e) {
				Reporter.log("Create custom Category page verification done  :Fail");
				switchToNativeContext();
				takeScreenshot(finalPath1);
				Assert.assertTrue(false);
			}

			return this;

		}


		}
