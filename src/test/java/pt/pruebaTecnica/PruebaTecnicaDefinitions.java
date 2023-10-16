package pt.pruebaTecnica;

import java.util.Map;

import io.cucumber.java.en.And;
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
	
	@Given("^Ingresar al portal y realizar autenticacion$")
	public void ingresarAlPortalYRealizarAutenticacion(Map <String,String> data){
		String FilaDataExcel= data.get("keyFilaDataExcel");
		data=dataExcel.leerFilaDataExcel("pruebaTecnica",Integer.valueOf(FilaDataExcel));
		pruebaTecnicaSteps.ingresarAlPortalYRealizarAutenticacion(data);
	}

	@When("^agregar libro Programming JavaScript a coleccion$") 
	public void agregarLibroProgrammingJavaScriptAColeccion (Map <String,String> data){
		String FilaDataExcel= data.get("keyFilaDataExcel");
		data=dataExcel.leerFilaDataExcel("pruebaTecnica",Integer.valueOf(FilaDataExcel));
		pruebaTecnicaSteps.agregarLibroProgrammingJavaScriptAColeccion(data);
		}

	@And("^agregar libro Understanding ECMAScript a coleccion$")
	public void agregarLibroUnderstandingECMAScriptAColeccion(Map <String,String> data){
		String FilaDataExcel= data.get("keyFilaDataExcel");
		data=dataExcel.leerFilaDataExcel("pruebaTecnica",Integer.valueOf(FilaDataExcel));
		pruebaTecnicaSteps.agregarLibroUnderstandingECMAScriptAColeccion(data);
		}

	@Then("^eliminar libro Programming JavaScript de coleccion$") 
	public void eliminarLibroProgrammingJavaScriptDeColeccion() throws Throwable{
		pruebaTecnicaSteps.eliminarLibroProgrammingJavaScriptDeColeccion();
		}

	@And("^eliminar cuenta y validar$") 
	public void eliminarCuentaYValidar(Map <String,String> data){
		String FilaDataExcel= data.get("keyFilaDataExcel");
		data=dataExcel.leerFilaDataExcel("pruebaTecnica",Integer.valueOf(FilaDataExcel));
		pruebaTecnicaSteps.eliminarCuentaYValidar(data);
		}

	@When("^extraer texto de nested frames$") 
	public void extraerTextoDeNestedFrames(){
		pruebaTecnicaSteps.extraerTextoDeNestedFrames();
		}

	@Then("^llenar formulario modulo practice form$")
	public void llenarFormularioModuloPracticeForm(Map <String,String> data){
		String FilaDataExcel= data.get("keyFilaDataExcel");
		data=dataExcel.leerFilaDataExcel("pruebaTecnica",Integer.valueOf(FilaDataExcel));
		pruebaTecnicaSteps.llenarFormularioModuloPracticeForm(data);
		}


	
}
