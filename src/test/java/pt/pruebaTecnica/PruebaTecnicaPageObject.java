package pt.pruebaTecnica;

import static org.junit.Assert.assertTrue;

import java.util.Map;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import pt.utils.AccionesObjetos;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;




public class PruebaTecnicaPageObject extends PageObject{
	
    public PruebaTecnicaPageObject(WebDriver driver) {
        super(driver);
    }
	AccionesObjetos accionesObjetos;
	PruebaTecnicaUI pruebaTecnicaUI= new PruebaTecnicaUI();

	
	public void ingresarAlPortalYRealizarAutenticacion(Map <String,String> data){
		
		//ingresar al portal
		accionesObjetos.abrirUrl();
		accionesObjetos.escribirLog(accionesObjetos.obtenerTituloPagina());
		getDriver().switchTo().frame(0);
		// ingresar con usuario y contraseña
		accionesObjetos.hacerScroll("0", "300");
		accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBoxUserName(), data.get("keyUserName"));
		accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBoxPassword(), data.get("keyPassword"));
		Serenity.takeScreenshot();
		accionesObjetos.tiempoEsperaImplicito(2);
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnLogin());
		accionesObjetos.tiempoEsperaImplicito(2);
		Serenity.takeScreenshot();
	}
	
	
	public void agregarLibroProgrammingJavaScriptAColeccion(Map <String,String> data){
		
		accionesObjetos.hacerScroll("0", "600");
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnGoToStore());
		accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBoxSearchBox(), data.get("keyBook1"));
		accionesObjetos.tiempoEsperaImplicito(1);
		Serenity.takeScreenshot();
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getLinkBook1());
		accionesObjetos.tiempoEsperaImplicito(2);
		Serenity.takeScreenshot();
		accionesObjetos.hacerScroll("0", "900");
		accionesObjetos.tiempoEsperaImplicito(2);
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnAddToColection());
		accionesObjetos.tiempoEsperaImplicito(6);
		getDriver().switchTo().alert().accept();
		accionesObjetos.tiempoEsperaImplicito(2);
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnProfile());
		accionesObjetos.tiempoEsperaImplicito(4);
		Serenity.takeScreenshot();
		
	}
	
	public void agregarLibroUnderstandingECMAScriptAColeccion(Map <String,String> data){
		accionesObjetos.hacerScroll("0", "600");
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnGoToStore());
		accionesObjetos.tiempoEsperaImplicito(1);
		accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBoxSearchBox(), data.get("keyBook2"));
		accionesObjetos.tiempoEsperaImplicito(1);
		Serenity.takeScreenshot();
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getLinkBook2());
		accionesObjetos.tiempoEsperaImplicito(2);
		Serenity.takeScreenshot();
		accionesObjetos.hacerScroll("0", "900");
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnAddToColection());
		accionesObjetos.tiempoEsperaImplicito(2);
		getDriver().switchTo().alert().accept();
		accionesObjetos.tiempoEsperaImplicito(2);
		//accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnBackToBookStore());
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnProfile());
		accionesObjetos.tiempoEsperaImplicito(2);
		Serenity.takeScreenshot();
	}
	
	public void eliminarLibroProgrammingJavaScriptDeColeccion() throws Throwable{
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnDeleteBook1());
		accionesObjetos.tiempoEsperaImplicito(2);
		Serenity.takeScreenshot();
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getMsjDeleteBook());
		accionesObjetos.tiempoEsperaImplicito(2);
		getDriver().switchTo().alert().accept();
		
	}
	
	public void eliminarCuentaYValidar(Map <String,String> data){
		accionesObjetos.hacerScroll("0", "900");
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnDeleteAccount());
		accionesObjetos.tiempoEsperaImplicito(2);
		Serenity.takeScreenshot();
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getMsjDeleteBook());
		accionesObjetos.tiempoEsperaImplicito(2);
		getDriver().switchTo().alert().accept();
		
		// ingresar con usuario y contraseña
		accionesObjetos.hacerScroll("0", "300");
		accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBoxUserName(), data.get("keyUserName"));
		accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBoxPassword(), data.get("keyPassword"));
		Serenity.takeScreenshot();
		accionesObjetos.tiempoEsperaImplicito(2);
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnLogin());
		accionesObjetos.tiempoEsperaImplicito(2);
		Serenity.takeScreenshot();
		assertTrue(accionesObjetos.obtenerElementos(pruebaTecnicaUI.getMsjErrorLogin()).isDisplayed());
	}

	public void extraerTextoDeNestedFrames(){
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnModuleAlerts());
		accionesObjetos.tiempoEsperaImplicito(1);
		accionesObjetos.hacerScroll("0", "600");
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnNestedFrames());
		accionesObjetos.tiempoEsperaImplicito(1);
		Serenity.takeScreenshot();
		accionesObjetos.hacerScroll("0", "300");
		getDriver().switchTo().frame("frame1");
		String mensajeFrameParent=accionesObjetos.obtenerElementos(pruebaTecnicaUI.getFrameParent()).getText();
		accionesObjetos.escribirLog(mensajeFrameParent);
		Serenity.recordReportData()
	    .withTitle("Mensaje Frame Parent")
	    .andContents(mensajeFrameParent);
		
		accionesObjetos.tiempoEsperaImplicito(1);
		getDriver().switchTo().frame(accionesObjetos.obtenerElementos(pruebaTecnicaUI.getFrameChild()));
		String mensajeFrameChild=accionesObjetos.obtenerElementos(pruebaTecnicaUI.getFrameParent()).getText();
		accionesObjetos.escribirLog(mensajeFrameChild);
		Serenity.recordReportData()
	    .withTitle("Mensaje Frame Child")
	    .andContents(mensajeFrameChild);
	}

	public void llenarFormularioModuloPracticeForm(Map <String,String> data){
		getDriver().switchTo().defaultContent();
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnModuleForms());
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnPracticeForm());
		accionesObjetos.tiempoEsperaImplicito(2);
		Serenity.takeScreenshot();
		accionesObjetos.hacerScroll("0", "300");
		
		accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBoxFirstName(), data.get("keyFirstName"));
		accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBoxLastName(), data.get("keyLastName"));
		accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBoxEmail(), data.get("keyEmail"));
		accionesObjetos.tiempoEsperaImplicito(2);
		Actions actions = new Actions(getDriver());
		
		if (data.get("keyGender").equals("Female")) {
			actions.moveToElement(accionesObjetos.obtenerElementos(pruebaTecnicaUI.getCheckBoxFemale())).click().perform();
		}
		accionesObjetos.tiempoEsperaImplicito(1);
		accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBoxMobile(),data.get("keyMobile"));
		accionesObjetos.hacerScroll("0", "600");
		(accionesObjetos.obtenerElementos(pruebaTecnicaUI.getTxtBoxBirthDate())).sendKeys(Keys.CONTROL + "a");
		accionesObjetos.tiempoEsperaImplicito(1);
		accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBoxBirthDate(), data.get("keyBirthDate"));

        actions.sendKeys(Keys.ENTER).build().perform();	
	
		accionesObjetos.hacerScroll("0", "900");
		accionesObjetos.tiempoEsperaImplicito(1);
		accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBocSubjects(),data.get("keySubjects"));
		actions.sendKeys(Keys.ENTER).build().perform();
		Serenity.takeScreenshot();
		accionesObjetos.tiempoEsperaImplicito(1);
		accionesObjetos.hacerScroll("0", "900");

		
		accionesObjetos.tiempoEsperaImplicito(1);
		accionesObjetos.obtenerElementos(pruebaTecnicaUI.getUploadPicture()).sendKeys("C:\\imagenFormulario.jpg");
		accionesObjetos.tiempoEsperaImplicito(1);
		accionesObjetos.hacerScroll("0", "900");
		accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBoxCurrentAddress(), data.get("keyCurrentAddress"));
		accionesObjetos.tiempoEsperaImplicito(2);
		if (data.get("keyHobbies").equals("Music")) {
			accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getTxtBoxHobbies());
		}
		accionesObjetos.tiempoEsperaImplicito(2);
		Dimension nuevaDimension = new Dimension(600, 900);
		Serenity.takeScreenshot();
		getDriver().manage().window().setSize(nuevaDimension);
		accionesObjetos.hacerScroll("0", "900");
		accionesObjetos.tiempoEsperaImplicito(5);
		actions.sendKeys(Keys.END).build().perform();	
		accionesObjetos.tiempoEsperaImplicito(3);
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnMenuState());
		actions.sendKeys(data.get("keyState")).build().perform();
		actions.sendKeys(Keys.ENTER).build().perform();	
		accionesObjetos.tiempoEsperaImplicito(2);
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnMenuCity());
		actions.sendKeys(data.get("keyCity")).build().perform();
		actions.sendKeys(Keys.ENTER).build().perform();	
		Serenity.takeScreenshot();
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnSubmit());
		getDriver().manage().window().maximize();
		accionesObjetos.tiempoEsperaImplicito(3);
		((JavascriptExecutor) getDriver()).executeScript("document.body.style.zoom='60%'");
		accionesObjetos.tiempoEsperaImplicito(1);
		Serenity.takeScreenshot();
		accionesObjetos.tiempoEsperaImplicito(1);
		actions.sendKeys(Keys.ESCAPE).build().perform();
		
		getDriver().get("https://demoqa.com/profile");
		accionesObjetos.tiempoEsperaImplicito(2);
		
		
	}
	
}
