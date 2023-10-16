package pt.pruebaTecnica;



import java.util.Map;


import net.thucydides.core.annotations.Step;



public class PruebaTecnicaSteps {
	PruebaTecnicaPageObject pruebaTecnicaPageObject;
	
	
	@Step("^Ingresar al portal y realizar autenticacion$")
	public void ingresarAlPortalYRealizarAutenticacion(Map <String,String> data){
		pruebaTecnicaPageObject.ingresarAlPortalYRealizarAutenticacion(data);
	}
	
	@Step("^agregar libro Programming JavaScript a coleccion$") 
	public void agregarLibroProgrammingJavaScriptAColeccion(Map <String,String> data){
		pruebaTecnicaPageObject.agregarLibroProgrammingJavaScriptAColeccion(data);
		}
	@Step("^agregar libro Understanding ECMAScript a coleccion$")
	public void agregarLibroUnderstandingECMAScriptAColeccion(Map <String,String> data){
		pruebaTecnicaPageObject.agregarLibroUnderstandingECMAScriptAColeccion(data);
		}
	
	@Step("^eliminar libro Programming JavaScript de coleccion$") 
	public void eliminarLibroProgrammingJavaScriptDeColeccion() throws Throwable{
		pruebaTecnicaPageObject.eliminarLibroProgrammingJavaScriptDeColeccion();
		}
	
	@Step("^eliminar cuenta y validar$") 
	public void eliminarCuentaYValidar(Map <String,String> data){
		pruebaTecnicaPageObject.eliminarCuentaYValidar(data);
		}
	
	@Step("^extraer texto de nested frames$") 
	public void extraerTextoDeNestedFrames(){
		pruebaTecnicaPageObject.extraerTextoDeNestedFrames();
		}
	
	@Step("^llenar formulario modulo practice form$")
	public void llenarFormularioModuloPracticeForm(Map <String,String> data){
		pruebaTecnicaPageObject.llenarFormularioModuloPracticeForm(data);
		}
}
