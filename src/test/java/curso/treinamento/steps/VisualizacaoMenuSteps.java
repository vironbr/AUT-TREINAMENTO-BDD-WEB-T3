package curso.treinamento.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.HomePage;
import curso.treinamento.setup.Hooks;

public class VisualizacaoMenuSteps {
	HomePage   homePage = new HomePage(Hooks.get_driver());
	
	@Dado("que eu esteja na tela Home")
	public void que_eu_esteja_na_tela_Home() {
		System.out.println("teste");
	  
	}

	@Quando("acesso o menu Cars")
	public void acesso_o_menu_Cars() {
		
		homePage.clicar_btn_cars();
	 
	}

	@Então("são apresentados os itens {string}, {string} e {string}")
	public void são_apresentados_os_itens_e(String string, String string2, String string3) {
		
		homePage.validar_cars_cars();
		homePage.validar_cars_extras();
		homePage.validar_cars_settings();

	}


}
