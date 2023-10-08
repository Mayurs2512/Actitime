package com.Actitime.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.Actitime.GenericLibrary.Baseclass;
import com.Actitime.GenericLibrary.FileLibrary;
import com.Actitime.Pom.HomePage;
import com.Actitime.Pom.TaskPage;

public class CreateCustomer extends Baseclass{
	
	@Test
	public void create() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.getTasktab().click();
		TaskPage tp=new TaskPage(driver);
		tp.getAddnew().click();
		tp.getNewcustomer().click();
		FileLibrary f=new FileLibrary();
		String custname = f.readDataFromExcel("WantedList", 2, 1);
		tp.getCustname().sendKeys(custname);
		String custdesp = f.readDataFromExcel("WantedList", 2, 2);
		tp.getCustdesp().sendKeys(custdesp);
		tp.getCreatebtn().click();
		
		
	}

}
