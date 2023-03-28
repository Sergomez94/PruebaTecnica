package pt.pruebaTecnica;



import java.util.Map;


import net.thucydides.core.annotations.Step;



public class PruebaTecnicaSteps {
	PruebaTecnicaPageObject pruebaTecnicaPageObject;
	
	
	
	@Step("^Me encuentro en la pagina$")
	public void meEncuentroEnLaPagina() {
		pruebaTecnicaPageObject.meEncuentroEnLaPagina();
	}
	
	@Step("^selecciono la opcion transacciones en linea$")
	public void seleccionoLaOpcionLogin() throws Throwable {
		pruebaTecnicaPageObject.seleccionoLaOpcionLogin();
	}
	

	
	@Step("^lleno el formulario de credenciales$") 
	public void llenoElFormularioDeCredenciales(Map <String,String> data){
		pruebaTecnicaPageObject.llenoElFormularioDeCredenciales(data);
		}
}
