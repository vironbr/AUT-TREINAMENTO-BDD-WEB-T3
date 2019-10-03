package curso.treinamento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import curso.treinamento.utils.Helper;

public class HomePage {
	
	public HomePage(WebDriver driver) { 
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy (xpath = "//strong[contains(text(),'Logout')]")
	private  WebElement linkLogout;
	
	@FindBy (xpath = "//a[@href='#Cars']")
	private WebElement btnCars;
	
	@FindBy (xpath = "(//a[contains(@href,'/admin/cars')])[1]")
	private WebElement btnCarsCars;
	
	@FindBy (xpath = "//a[contains(@href,'/cars/extras')]")
	private WebElement btnCarsExtras;
	
	@FindBy (xpath = "//a[contains(@href,'/cars/settings')]")
	private WebElement btnCarsSettings;

	
	public  boolean validar_pagina() { 
		return Helper.elemento_existe(linkLogout, 10);
	}
	
	
	public void clicar_btn_cars() {
		
		Helper.elemento_existe(btnCars, 10);
		btnCars.click();
		
	}
	
	
	public boolean validar_cars_cars() {
		
		Helper.aguardar_elemento(btnCarsSettings, 10);
		return Helper.elemento_existe(btnCarsSettings, 5);
		
	}
	
	
	
	public boolean validar_cars_extras() {
		
		return Helper.elemento_existe(btnCarsExtras, 5);
		
	}
	
	public boolean validar_cars_settings() {
		
		return Helper.elemento_existe(btnCarsSettings, 5);
		
	}
	
}