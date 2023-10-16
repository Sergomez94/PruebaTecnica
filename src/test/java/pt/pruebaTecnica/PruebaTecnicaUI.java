package pt.pruebaTecnica;

public class PruebaTecnicaUI {

	final String TIPO_XPATH="xpath";
	final String TIPO_ID="id";
	final String TIPO_CSS_SELECTOR="cssSelector";
	
	private final String[] btnNewUser = {TIPO_ID,"newUser"};
	private final String[] txtBoxUserName= {TIPO_ID,"userName"};
	private final String[] txtBoxPassword= {TIPO_ID,"password"};
	private final String[] btnLogin= {TIPO_ID,"login"};
	private final String[] btnGoToStore= {TIPO_ID,"gotoStore"};
	private final String[] txtBoxSearchBox= {TIPO_ID,"searchBox"};
	private final String[] btnSearch= {TIPO_ID,"basic-addon2"};
	private final String[] linkBook1= {TIPO_ID,"see-book-Programming JavaScript Applications"};
	private final String[] btnAddToColection= {TIPO_XPATH,"//div[@class='text-right fullButton']"};
	private final String[] btnBackToBookStore= {TIPO_XPATH,"//div[@class='text-left fullButton']"};
	private final String[] btnProfile= {TIPO_XPATH,"//span[normalize-space()='Profile']"};
	private final String[] linkBook2= {TIPO_ID,"see-book-Understanding ECMAScript 6"};
	private final String[] btnDeleteBook1= {TIPO_XPATH,"(//span[@id='delete-record-undefined'])[1]"};
	private final String[] msjDeleteBook= {TIPO_ID,"closeSmallModal-ok"};
	private final String[] btnDeleteAccount= {TIPO_XPATH,"//div[@class='text-center button']"};
	private final String[] msjErrorLogin= {TIPO_XPATH,"//p[@id='name']"};
	private final String[] btnModuleAlerts= {TIPO_XPATH,"(//div[contains(@class,'header-right')])[3]"};
	private final String[] btnNestedFrames= {TIPO_XPATH,"//span[normalize-space()='Nested Frames']"};
	private final String[] frameParent= {TIPO_XPATH,"/html[1]/body[1]"};
	private final String[] frameChild= {TIPO_XPATH,"//iframe[@srcdoc='<p>Child Iframe</p>']"};
	private final String[] btnModuleForms= {TIPO_XPATH,"(//div[contains(@class,'header-right')])[2]"};
	private final String[] btnPracticeForm= {TIPO_XPATH,"//span[normalize-space()='Practice Form']"};
	private final String[] txtBoxFirstName= {TIPO_ID,"firstName"};
	private final String[] txtBoxLastName= {TIPO_ID,"lastName"};
	private final String[] txtBoxEmail= {TIPO_ID,"userEmail"};
	private final String[] checkBoxFemale= {TIPO_XPATH,"(//div[@class='custom-control custom-radio custom-control-inline'])[2]"};
	private final String[] txtBoxMobile= {TIPO_ID,"userNumber"};
	private final String[] txtBoxBirthDate= {TIPO_ID,"dateOfBirthInput"};
	private final String[] txtBocSubjects= {TIPO_ID,"subjectsInput"};
	private final String[] txtBoxHobbies= {TIPO_XPATH,"//div[@id='hobbiesWrapper']//div[3]"};
	private final String[] uploadPicture= {TIPO_ID,"uploadPicture"};
	private final String[] txtBoxCurrentAddress= {TIPO_ID,"currentAddress"};
	private final String[] menuState= {TIPO_XPATH,"//div[contains(text(),'Select State')]"};
	private final String[] menuCity= {TIPO_XPATH,"//div[@id='stateCity-wrapper']//div[3]"};
	private final String[] btnSubmit= {TIPO_ID,"submit"};
	private final String[] btnMenuState= {TIPO_XPATH,"//div[@id='state']"};
	private final String[] btnMenuCity= {TIPO_XPATH,"//div[@id='city']"};
	private final String[] btnCerrarPublicidad= {TIPO_XPATH,"//div[@id='adplus-anchor']"};		
	private final String[] btnClick= {TIPO_XPATH,"//div[@id='subjectsWrapper']//label[@id='subjects-label']"};
	private final String[] btnClose= {TIPO_XPATH,"//button[@id='closeLargeModal']"};
	private final String[] btnModuleBookStore= {TIPO_XPATH,"//div[normalize-space()='Book Store Application']"};
	
	
	public String[] getBtnNewUser() {
		return btnNewUser;
	}


	public String[] getTxtBoxUserName() {
		return txtBoxUserName;
	}


	public String[] getTxtBoxPassword() {
		return txtBoxPassword;
	}


	public String[] getBtnLogin() {
		return btnLogin;
	}


	public String[] getBtnGoToStore() {
		return btnGoToStore;
	}


	public String[] getTxtBoxSearchBox() {
		return txtBoxSearchBox;
	}


	public String[] getBtnSearch() {
		return btnSearch;
	}


	public String[] getBtnAddToColection() {
		return btnAddToColection;
	}


	public String[] getBtnBackToBookStore() {
		return btnBackToBookStore;
	}


	public String[] getBtnProfile() {
		return btnProfile;
	}


	public String[] getLinkBook1() {
		return linkBook1;
	}


	public String[] getLinkBook2() {
		return linkBook2;
	}


	public String[] getBtnDeleteBook1() {
		return btnDeleteBook1;
	}


	public String[] getMsjDeleteBook() {
		return msjDeleteBook;
	}


	public String[] getBtnDeleteAccount() {
		return btnDeleteAccount;
	}


	public String[] getMsjErrorLogin() {
		return msjErrorLogin;
	}


	public String[] getBtnModuleAlerts() {
		return btnModuleAlerts;
	}


	public String[] getBtnNestedFrames() {
		return btnNestedFrames;
	}


	public String[] getFrameParent() {
		return frameParent;
	}


	public String[] getFrameChild() {
		return frameChild;
	}


	public String[] getTxtBoxFirstName() {
		return txtBoxFirstName;
	}


	public String[] getTxtBoxLastName() {
		return txtBoxLastName;
	}


	public String[] getTxtBoxEmail() {
		return txtBoxEmail;
	}


	public String[] getCheckBoxFemale() {
		return checkBoxFemale;
	}


	public String[] getTxtBoxMobile() {
		return txtBoxMobile;
	}


	public String[] getTxtBoxBirthDate() {
		return txtBoxBirthDate;
	}


	public String[] getTxtBocSubjects() {
		return txtBocSubjects;
	}


	public String[] getTxtBoxHobbies() {
		return txtBoxHobbies;
	}


	public String[] getUploadPicture() {
		return uploadPicture;
	}


	public String[] getTxtBoxCurrentAddress() {
		return txtBoxCurrentAddress;
	}


	public String[] getMenuState() {
		return menuState;
	}


	public String[] getMenuCity() {
		return menuCity;
	}


	public String[] getBtnSubmit() {
		return btnSubmit;
	}


	public String[] getBtnModuleForms() {
		return btnModuleForms;
	}


	public String[] getBtnPracticeForm() {
		return btnPracticeForm;
	}


	public String[] getBtnMenuState() {
		return btnMenuState;
	}


	public String[] getBtnMenuCity() {
		return btnMenuCity;
	}


	public String[] getBtnCerrarPublicidad() {
		return btnCerrarPublicidad;
	}


	public String[] getBtnClick() {
		return btnClick;
	}


	public String[] getBtnClose() {
		return btnClose;
	}


	public String[] getBtnModuleBookStore() {
		return btnModuleBookStore;
	}

	
	
	
	
	
	
	
}
