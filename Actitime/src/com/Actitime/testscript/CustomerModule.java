package com.Actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actitime.generic.BaseClass;
import com.Actitime.generic.Filelib;
import com.Actitime.pom.EnterTimeTrackPage;
import com.Actitime.pom.TaskListPage;
@Listeners(com.Actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("CreateCustomer",true);
		Filelib f=new Filelib();
		String customername = f.getExcelData("CreateCustomer", 1,3);
		String description = f.getExcelData("CreateCustomer", 1, 4);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setTasks();
		TaskListPage task=new TaskListPage(driver);
		task.getAddNewBtn().click();
		task.getNewCustomerBtn().click();
		task.getEnterCusNametbx().sendKeys(customername);
		Thread.sleep(2000);
		task.getEnterDesctbx().sendKeys(description);
		task.getSelectCusDD().click();
		Thread.sleep(1000);
		
		task.getSelectedcusDD().click();
		task.getCreateCustomerBtn().click();
		Thread.sleep(3000);
		String actualtext = task.getCheckcreated().getText();
		Assert.assertEquals(actualtext, customername);
	}
	@Test
	public void testCreateProject() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("CreateProject");
		Filelib f=new Filelib();
		String customername = f.getExcelData("CreateCustomer", 1,3);
		String projectname = f.getExcelData("CreateProject", 1,3);
		String description = f.getExcelData("CreateProject", 1, 4);
		String taskname = f.getExcelData("CreateProject", 1, 1);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setTasks();
		TaskListPage task=new TaskListPage(driver);
		task.getAddNewBtn().click();
		task.getNewProject().click();
		task.getProjectNametbx().sendKeys(projectname);
		task.getClickselectDD().click();
		task.getPasscusName().sendKeys(customername);
		Thread.sleep(2000);
		task.getSelectcusinDD().click();
		task.getAddDiscription().sendKeys(description);
		task.getEnterPTaskName().sendKeys(taskname);
		task.getCreateprojectbtn().click();
		Thread.sleep(2000);
		String actualname = task.getCreatedprojectName().getText();
		System.out.println(actualname);
		Thread.sleep(1000);
		Assert.assertEquals(actualname, projectname);
	}
	
	
}
