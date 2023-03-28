package pt.pruebaTecnica;

import java.util.Map;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.waits.Wait;
import pt.utils.AccionesObjetos;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import io.appium.java_client.functions.ExpectedCondition;
public class PruebaTecnicaPageObject extends PageObject{
	AccionesObjetos accionesObjetos;
	PruebaTecnicaUI pruebaTecnicaUI= new PruebaTecnicaUI();
	
	public void meEncuentroEnLaPagina() {
		accionesObjetos.abrirUrl();
		accionesObjetos.escribirLog(accionesObjetos.obtenerTituloPagina());

		
		
	}
	
	public void seleccionoLaOpcionLogin() throws Throwable {
		
		
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnTransaccionesEnLinea());
		Thread.sleep(5);
	}
	

	
	
	private void seleccionarTipoDocumento(Map <String,String> data) {
			String tipoDocumento=data.get("keyTipoDocumento");
			accionesObjetos.tiempoEsperaImplicito(3);
			accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getListaTipoDocumento());
			accionesObjetos.tiempoEsperaImplicito(3);
		switch(tipoDocumento) {
				case "CC": accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getCcListaTipoDocumento());
				break;
		}
	}
	
	public void llenoElFormularioDeCredenciales(Map <String,String> data){
		
		String numeroDocumento=data.get("keyDocumento");
		String clave= data.get("keyClave");
		accionesObjetos.tiempoEsperaImplicito(10);
		seleccionarTipoDocumento(data);
		accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBoxDocumento(), numeroDocumento);
		accionesObjetos.hacerScroll("0", "900");
		accionesObjetos.tiempoEsperaImplicito(2);
		accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBoxClave(), clave);
		accionesObjetos.obtenerElementos(pruebaTecnicaUI.getBtnIngresar()).sendKeys(Keys.PAGE_DOWN);
		Actions actions = new Actions(getDriver());
		accionesObjetos.hacerScroll("0", "900");
		actions.moveToElement(accionesObjetos.obtenerElementos(pruebaTecnicaUI.getBtnIngresar())).click();
		
		
		accionesObjetos.tiempoEsperaImplicito(10);
		
		
		}
	
}
