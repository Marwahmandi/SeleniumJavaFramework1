package PageFactory;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Frais {

	public static WebDriver driver;

	@FindBy(xpath = "/html//app-root/div[@class='min-width']/app-content-layout/app-header//div[@class='container-fluid']/div[@class='row']/div[1]/button")
	WebElement btn_menu;

	@FindBy(xpath = "//*[@id=\"is-active\"]/div/accordion/accordion-group[1]/div/div[1]/div/div/div")
	WebElement btn_mesFrais;

	@FindBy(xpath = "//div[@id='sidebar']/div[@class='wdgt-menu']/div[@id='is-active']//accordion[@role='tablist']/accordion-group[1]//div[@role='tabpanel']//ul[@class='list-byblos-menu list-unstyled']/li[2]/a[@class='byblos-menu-item']")
	WebElement btn_declarerFrais;

	@FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div/form/app-table-detail/div/div[2]/div[3]/div/p-table/div/div/table/thead/tr/th[7]/div/a/i")
	WebElement btn_Plus;

	@FindBy(xpath = "/html//div[@id='main']/div[@class='row']/div[2]/div[@class='table-responsive']/form[@action='']/app-table-detail//form[@action='']//div[@class='box-monthpicker']/dp-date-picker//input[@type='text']")
	static WebElement Periode_field;

	@FindBy(xpath = "/html/body/div/div/dp-month-calendar//div[@class='dp-calendar-wrapper']/div[2]/button[2]")
	static WebElement Month;

	@FindBy(xpath = "/html//div[@id='main']/div[@class='row']/div[2]/div/form[@action='']/app-table-detail//form[@action='']/div/div[2]/div[@class='row']/div[@class='col-md-7']/div/ng-selectize/div/div[1]")
	static WebElement Client;

	@FindBy(xpath = "/html//div[@id='main']/div[@class='row']/div[2]/div[@class='table-responsive']/form[@action='']/app-table-detail//form[@action='']/div/div[2]/div[@class='row']/div[@class='col-md-7']/div/ng-selectize//div[@class='selectize-dropdown-content']/div[.='CBBC']")
	static WebElement CBBC;

	@FindBy(xpath = "/html/body/modal-container[@role='dialog']/div[@role='document']//div[@class='modal-body']/div[@class='addRequestForm']//ng-selectize/div/div[1]")
	static WebElement Type_Frais;

	@FindBy(xpath = "/html/body/modal-container[@role='dialog']/div[@role='document']//div[@class='modal-body']/div[@class='addRequestForm']/div[@class='box-right']/div/div[1]/div[@class='col-md-5']/div/ng-selectize//div[@class='selectize-dropdown-content']/div[.='Hébergement']")
	static WebElement Hebergement;

	@FindBy(xpath = "/html/body/modal-container[@role='dialog']/div[@role='document']//div[@class='modal-body']/div[@class='addRequestForm']//dp-date-picker//input[@type='text']")
	static WebElement Date_Frais;

	@FindBy(xpath = "/html/body/modal-container[@role='dialog']/div[@role='document']//div[@class='modal-body']/div[@class='addRequestForm']//i[@class='ic-calendar inline']")
	static WebElement Calendrier;

	@FindBy(xpath = "/html/body/app-root/div[@class='min-width']/div[2]/div/dp-day-calendar//div[@class='dp-calendar-wrapper']/div[6]/button[3]")
	static WebElement Date_selectioned;

	@FindBy(xpath = "/html/body/modal-container[@role='dialog']/div[@role='document']//div[@class='addRequestForm']/div[@class='box-right']/div[@class='bg-light-blue']/div[3]/div[@class='col-md-6']/input[@type='text']")
	static WebElement Description;

	@FindBy(xpath = "/html/body/modal-container[@role='dialog']/div[@role='document']//div[@class='modal-body']/div[@class='addRequestForm']/div[@class='box-right']/div[@class='bg-light-blue']/div[4]/div[@class='col-md-5']/div/ng-selectize//div[@class='item']")
	static WebElement Devise;

	@FindBy(xpath = "/html/body/modal-container[@role='dialog']/div[@role='document']//div[@class='modal-body']/div[@class='addRequestForm']/div[@class='box-right']/div/div[4]/div[@class='col-md-5']/div/ng-selectize//div[@class='selectize-dropdown-content']/div[.='EUR']")
	static WebElement Euro;

	@FindBy(xpath = "/html/body/modal-container[@role='dialog']/div[@role='document']//div[@class='addRequestForm']/div[@class='box-right']/div[@class='bg-light-blue']/div[5]/div[@class='col-md-6']/input")
	static WebElement MontantHT;

	@FindBy(xpath = "/html/body/modal-container[@role='dialog']/div[@role='document']//div[@class='addRequestForm']/div[@class='box-right']/div[@class='bg-light-blue']/div[6]/div[@class='col-md-6']/input")
	static WebElement MontantTVA;

	@FindBy(xpath = "/html/body/modal-container[@role='dialog']/div[@role='document']//div[@class='modal-body']/div[@class='addRequestForm']//button[@class='btn btn-primary btn-submit']")
	static WebElement Enregistrer_btn;

	@FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div/form/app-table-detail/div/div[2]/div[4]/div/div[1]/button")
	static WebElement Soumettre_btn;

	@FindBy(xpath = "//div[@id='is-active']//accordion[@role='tablist']/accordion-group[2]//div[@role='tabpanel']//ul[@class='list-byblos-menu list-unstyled']/li[1]/a[@class='byblos-menu-item']")
	static WebElement Consulter_btn;

	@FindBy(xpath = "//div[@id='toast-container']/div")
	static WebElement Toast_Validation;
	
	@FindBy(id = "toast-container")
	static WebElement ToastID;

	@When("^I click on declarer mes frais and I click on the plus button$")
	public void i_click_on_declarer_mes_frais_and_I_click_on_the_button() throws Throwable {
		System.out.println("I will create a new frais");
		btn_menu.click();
		Thread.sleep(1000);
		btn_mesFrais.click();
		// Thread.sleep(3000);
		btn_declarerFrais.click();
		Thread.sleep(500);
		Periode_field.click();
		System.out.println("i'm in the period");
		// Thread.sleep(3000);
		Month.click();
		System.out.println("i'm filling the month");
		Thread.sleep(500);
		// Select sel = new Select(Client);
		System.out.println("I will select the client");
		// sel.selectByIndex(0);
		// Client.click();
		System.out.println("before selecting bbcc");
		// Thread.sleep(1000);
		// CBBC.click();
		// System.out.println("after selecting bbcc");
		Thread.sleep(500);
		btn_Plus.click();
		Thread.sleep(500);
		Type_Frais.click();
		Hebergement.click();
		Thread.sleep(500);
		Date_Frais.click();
		Date_selectioned.click();
		Description.sendKeys("MyFrais");
		Devise.click();
		Euro.click();
		MontantHT.sendKeys("1000");
		MontantTVA.sendKeys("20");
		Enregistrer_btn.click();
		Thread.sleep(2000);
		Soumettre_btn.click();

	}

	@When("^I consult mes frais$")
	public void i_consult_mes_frais() throws Throwable {
	//	btn_menu.click();
	//	btn_mesFrais.click();
	//	Consulter_btn.click();
		//Thread.sleep(1000);
		System.out.println(ToastID.getText());
		assertEquals("the assertion", ToastID.getText());

	}

	@Then("^the new frais is added$")
	public void the_new_frais_is_added() throws Throwable {

	}

	public Frais(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
