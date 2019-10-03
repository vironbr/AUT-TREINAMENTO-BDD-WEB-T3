# language: pt

Funcionalidade: Login

	@LoginComSucesso
	Cenário: Realizar login com sucesso
		Dado que eu esteja na tela de login
		Quando faço login com o usuário "admin@phptravels.com" e senha "demoadmin"
		Então sou autenticado com sucesso 
		
	@LoginInvalido
	Cenário: Tentativa de Login com email inválido
		E que eu esteja na tela de login
		Mas faço login com o usuário "teste" e senha "demoadmin"
		Então é apresentado a mensagem "The Email field must contain a valid email address."