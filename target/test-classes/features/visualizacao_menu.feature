# language: pt

Funcionalidade: 

	Contexto:
		Dado que eu esteja na tela de login
		Quando faço login com o usuário "admin@phptravels.com" e senha "demoadmin"

	@Menu
	Cenário: Itens apresentados no menu Cars 
		Dado que eu esteja na tela Home
		Quando acesso o menu Cars
		Então são apresentados os itens "Cars", "Extras" e "Cars Settings" 