package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	//start create Customer POM
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name'and@class]")
	private WebElement enterCusNametbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description'and@class='textarea']")
	private WebElement enterDesctbx;
	
	@FindBy(xpath="//div[text()='- Select Customer -'and @class='emptySelection']")
	private WebElement selectCusDD;

	@FindBy(xpath="//div[text()='Big Bang Company'and@class='itemRow cpItemRow ']")
	private WebElement selectedcusDD;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="//div[text()='Cancel'and@class='greyButton cancelBtn']")
	
	private WebElement cancelBtn;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']")
	private WebElement checkcreated;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getAddNewBtn() {
		return addNewBtn;
	}
	public WebElement getNewCustomerBtn() {
		return newCustomerBtn;
	}
	public WebElement getEnterCusNametbx() {
		return enterCusNametbx;
	}
	public WebElement getEnterDesctbx() {
		return enterDesctbx;
	}
	public WebElement getSelectCusDD() {
		return selectCusDD;
	}
	public WebElement getSelectedcusDD() {
		return selectedcusDD;
	}
	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}
	public WebElement getCancelBtn() {
		return cancelBtn;
	}
	public WebElement getCheckcreated() {
		return checkcreated;
	}
	//End CreateCustomer POM
	
	//CreateProject POM
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProject;
	
	@FindBy(xpath="//input[@placeholder='Enter Project Name'and@class]")
	private WebElement projectNametbx;
	
	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --'and@class='emptySelection']")
	private WebElement clickselectDD;
	
	@FindBy(xpath="//div[@class='sectionDetails']/child::div[2]/child::div[2]/div/div[1]/div[2]/div/div[1]/input")
	private WebElement passcusName;

	@FindBy(xpath="//div[@class='itemRow cpItemRow ']/span[@class='highlightToken'][1]")
	private WebElement selectcusinDD;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description'and@class='textarea']")
	private WebElement addDiscription;
	
	@FindBy(xpath="(//input[@placeholder='Enter task name'and@class='inputFieldWithPlaceholder'])[1]")
	private WebElement enterPTaskName;
	
	@FindBy(xpath="//div[text()='Create Project'and @class='components_button_label']")
	private WebElement createprojectbtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement createdprojectName;
	//End CreateProject POM
	
	@FindBy(xpath="//div[text()='+ New Tasks'and@class='item createNewTasks']")
	private WebElement newTask;
	
	@FindBy(xpath="//div[text()='- Select Customer -']")
	private WebElement sCusDDclick;
	
	@FindBy(xpath="//div[@class='searchInputPlaceholder'and@style='display: block;']//input")
	private WebElement passCusNameinTask;
	
	@FindBy(xpath="//div[@class='itemRow cpItemRow ']/span[@class='highlightToken'][1]")
	private WebElement selectCus;
	
	@FindBy(xpath="(//div[@class='comboboxButton']/child::div[@class='dropdownButton'])[2]")
	private WebElement sProjectDD;
	
	@FindBy(xpath="//div[@class='searchInputPlaceholder'and@style='display: block;']//div[@class='inputPlaceholder']/input")
	private WebElement passprojectname;
	
	@FindBy(xpath="(//div[@class='searchItemList']/div[@class='itemRow cpItemRow '])[1]/span[1]")
	private WebElement selectProject;
	
	
	@FindBy(xpath="(//td[@class='nameCell first']/input[@placeholder='Enter task name'and@class='inputFieldWithPlaceholder'])[4]")
	private WebElement enterTaskName;
	
	@FindBy(xpath="//div[text()='Create Tasks'and@class='components_button_label']")
	private WebElement createTask;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']")
	private WebElement taskcreated;

	public WebElement getNewProject() {
		return newProject;
	}

	public WebElement getProjectNametbx() {
		return projectNametbx;
	}

	public WebElement getClickselectDD() {
		return clickselectDD;
	}

	public WebElement getSelectcusinDD() {
		return selectcusinDD;
	}

	public WebElement getAddDiscription() {
		return addDiscription;
	}

	public WebElement getEnterPTaskName() {
		return enterPTaskName;
	}

	public WebElement getCreateprojectbtn() {
		return createprojectbtn;
	}

	public WebElement getCreatedprojectName() {
		return createdprojectName;
	}

	public WebElement getNewTask() {
		return newTask;
	}

	public WebElement getsCusDDclick() {
		return sCusDDclick;
	}

	public WebElement getSelectCus() {
		return selectCus;
	}

	public WebElement getsProjectDD() {
		return sProjectDD;
	}

	public WebElement getSelectProject() {
		return selectProject;
	}

	public WebElement getEnterTaskName() {
		return enterTaskName;
	}

	public WebElement getCreateTask() {
		return createTask;
	}

	public WebElement getTaskcreated() {
		return taskcreated;
	}
	public WebElement getPasscusName() {
		return passcusName;
	}


	public WebElement getPassCusNameinTask() {
		return passCusNameinTask;
	}

	public WebElement getPassprojectname() {
		return passprojectname;
	}

	
	
	
	
}
