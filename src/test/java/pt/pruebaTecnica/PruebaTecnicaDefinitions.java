package pt.pruebaTecnica;

import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pt.utils.AccionesObjetos;
import pt.utils.ManejoDataExcel;


public class PruebaTecnicaDefinitions {
	
	AccionesObjetos accionesObjetos;
	ManejoDataExcel dataExcel= new ManejoDataExcel();

	@Steps
	PruebaTecnicaSteps pruebaTecnicaSteps;
	
	@Given("^Me encuentro en la pagina$")
	public void meEncuentroEnLaPagina() {
		pruebaTecnicaSteps.meEncuentroEnLaPagina();
	}

	@When("^selecciono la opcion transacciones en linea$")
	public void seleccionoLaOpcionLogin() throws Throwable {
		pruebaTecnicaSteps.seleccionoLaOpcionLogin();
	}



	@Then("^lleno el formulario de credenciales$") 
	public void llenoElFormularioDeCredenciales(Map <String,String> data){
		String FilaDataExcel= data.get("keyFilaDataExcel");
		String feature= data.get("keyFeature");
		data=dataExcel.leerFilaDataExcel(feature,Integer.valueOf(FilaDataExcel));
		pruebaTecnicaSteps.llenoElFormularioDeCredenciales(data);
		}


	
}
