package pt.pruebaTecnica;

public class PruebaTecnicaUI {

	final String TIPO_XPATH="xpath";
	final String TIPO_ID="id";
	final String TIPO_CSS_SELECTOS="cssSelector";
	
	private final String[] btnTransaccionesEnLinea= {TIPO_XPATH,"//a[@id='loginbutton']"};
	private final String[] listaTipoDocumento= {TIPO_XPATH,"//select[@id='tipodoc_p']"};
	private final String[] ccListaTipoDocumento= {TIPO_XPATH,"(//option[@value='cc'][normalize-space()='Cédula de ciudadanía'])[1]"};
	private final String[] txtBoxDocumento= {TIPO_ID,"docnum_p"	};
	private final String[] txtBoxClave= {TIPO_ID,"password_p"};
	private final String[] btnIngresar= {TIPO_XPATH,"//a[@id='btnEnterPersona']"};
	
	public String[] getBtnTransaccionesEnLinea() {
		return btnTransaccionesEnLinea;
	}

	public String[] getListaTipoDocumento() {
		return listaTipoDocumento;
	}

	public String[] getCcListaTipoDocumento() {
		return ccListaTipoDocumento;
	}

	public String[] getTxtBoxDocumento() {
		return txtBoxDocumento;
	}

	public String[] getTxtBoxClave() {
		return txtBoxClave;
	}

	public String[] getBtnIngresar() {
		return btnIngresar;
	}
	
	
}
