package pt.utils;


import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class AccionesObjetos extends PageObject {


	
	private static final Logger LOGGER = Logger.getLogger(AccionesObjetos.class.getName());
	
//	public ChromeOptions opt=new ChromeOptions().addArguments("--remote-allow-origins=*");
	

	
	public void escribirLog(String texto) {
		LOGGER.info("Escribirlog: "+texto);
	}
	
	public String obtenerTituloPagina() {
		return getDriver().getTitle();
	}
	

	public static String getSerenityProperties(String variable) {
		EnvironmentVariables environmentVariables=null;
		String serenityValue= "";
		try {
			environmentVariables= SystemEnvironmentVariables.createEnvironmentVariables();
			serenityValue=environmentVariables.getProperty(variable);
			LOGGER.info("valor: "+serenityValue);
		}catch(Exception e) {
			LOGGER.info("getSerenityProperties");
		}
		return serenityValue;
	}
	
	public void abrirUrl() {
		
		
		getDriver().get(getSerenityProperties("webdriver.base.url"));
		String expectedTitle= getSerenityProperties("webdriver.title.page");
		getDriver().manage().window().maximize();  // maximizar pantalla
		waitFor(5).seconds();
	
	}
	
	
	public void cerrarDriver() {
		
		getDriver().quit();
	}
	
	public WebElement obtenerElementos(String[] dato) {
		String identificador=dato[0];
		String valor= dato[1];
		WebElement elemento=null;
		WebDriverWait wait= new WebDriverWait(getDriver(), getImplicitWaitTimeout());
		
		switch(identificador.toLowerCase()) {
				case "id":
					elemento= wait.until(ExpectedConditions.presenceOfElementLocated(By.id(valor)));
					break;
				case "xpath":
					elemento= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(valor)));
					break;
				case "cssselector":
					elemento= wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(valor)));
					break;
				default:
					LOGGER.info("Obtener elementos: No se encuentra el identificador");
				
		}
		return elemento;
				
	}
	
	public void clickElementoWeb(String[] valores) {
		WebElement elemento= obtenerElementos(valores);
		elemento.click();
	}
	
	public void escribirTextoWeb(String[] valores, String texto) {
		WebElement elemento= obtenerElementos(valores);
		elemento.sendKeys(texto);
	}
	
	public void moverAElemento(String[] Valores) {
		WebElement elemento= obtenerElementos(Valores);
		Actions actions = new Actions(getDriver());
        actions.moveToElement(elemento, 0, 0);


	
	}
	
	public void cambiarFrame(String frame) {
		getDriver().switchTo().frame(frame);
	}
	
	public void tiempoEsperaImplicito(int tiempo) {
		waitFor(tiempo).seconds();
	}
	
	public void tiempoEsperaElemento(String[] valores) {
		WebElement elemento= obtenerElementos(valores);
		WebDriverWait wait= new WebDriverWait(getDriver(), getImplicitWaitTimeout());
		wait.until(ExpectedConditions.visibilityOf(elemento));
		
	}
	
	public void hacerScroll(String x, String y) {
		getDriver().switchTo().defaultContent();
		((JavascriptExecutor) getDriver()).executeScript("window.scroll("+x+","+y+")");
	}
}