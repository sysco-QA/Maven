		
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

import org.testng.Assert;
import org.testng.Reporter;

import com.sysco.jsn_framework.JSN_Framework;
import com.sysco.locators.Screenshot;
public class LoginPage extends JSN_Framework {
	private static final Logger LOGGER= Logger.getLogger(LoginPage.class.getCanonicalName());
	/* Defining the locators on the Page */

	public static final String InvToolsPage = "//*[@class='navbar-brand']//*[contains(text(),'Inventory Tools')]";

	public static final String HomUserName = "//*[@id='username-input']";
	
	public static final String HomPwd = "//*[@id='password-input']";
	public static final String HomLogin = "//*[@id='login-button']";

	//public static final String SaveUserName = "//*[@id='save-username-input']";
	public static final String SaveUserName = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[2]/android.view.View[3]/android.view.View[1]/android.widget.CheckBox[1]";
	//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[2]/android.view.View[3]/android.view.View[1]/android.widget.CheckBox[1]
	/* Functions on the Page are defined below */

	@SuppressWarnings({ "unchecked", "unused", "rawtypes" })
	public LoginPage verifyLoginPage(String string) throws InterruptedException, IOException {

		String finalPath1 = Screenshot.drivePath + string + Screenshot.string2 + Screenshot.pathExtension;
		try {
			//switchToWebContext();
			waitFor(30);
			waitForElementToBeClickable(HomUserName);
			waitForElementToBeClickable(HomPwd);
			waitForElementToBeClickable(HomLogin);

			Reporter.log("Login page verification :Pass");
		} catch (Exception e) {
			Reporter.log("Login page verification :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			Assert.assertTrue(false);
		}
		return this;
	}

	@SuppressWarnings("rawtypes")
	public LoginPage signIn(String UserName, String Password, String string) throws Exception {
		Reporter.log("Sign In");

		String string1 = "Details";
		String string3 = "issue";
		String finalPath = Screenshot.drivePath + string + string1 + Screenshot.pathExtension;
		String finalPath2 = Screenshot.drivePath + string + string3 + Screenshot.pathExtension;

		try {

			waitForElementToBeClickable(HomUserName);

			clickElement(HomUserName);
			clearElement(HomUserName);
			sendText(HomUserName, UserName);
			Reporter.log(UserName);
			waitForElement(1);
			waitForElementToBeClickable(HomPwd);
			clickElement(HomPwd);
			sendText(HomPwd, Password);

				if (isElementPresent(HomLogin)) {
				clickElement(HomLogin);
			}

			waitFor(20);
			waitForElementToBeClickable(InvToolsPage);

			if (isElementPresent(InvToolsPage)) {
				Reporter.log("Sign in :Pass");

			}

		} catch (Exception e) {
			Reporter.log("Sign in :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath2);
			
			Assert.assertTrue(false);
		}
		return this;
	}

	@SuppressWarnings("rawtypes")
	public LoginPage saveUsernameCheckBoxclickElement(String string) throws InterruptedException, IOException {
		String string2 = "issue";
		String finalPath1 = Screenshot.drivePath + string + string2 + Screenshot.pathExtension;
		try {
			waitForElementPresent(HomLogin);
			//waitForElementToBeClickable(SaveUserName);
			switchToNativeContext();
			clickElement(SaveUserName);
switchToWebContext();
			Reporter.log("Save username verification :Pass");
		} catch (Exception e) {
			Reporter.log("Save username verification :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);
			
			Assert.assertTrue(false);
		}
		return this;
	}

}
