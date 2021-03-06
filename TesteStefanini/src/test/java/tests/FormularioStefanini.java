package tests;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.Metodos;

public class FormularioStefanini {
	Metodos metodos = new Metodos();
	Elementos elemento = new Elementos();
	
	@Dado("que eu esteja no  {string}")
	public void que_eu_esteja_no(String url) throws InterruptedException {
		
		metodos.abrirNavegador(url, "CHROME");
		 metodos.esperar(2500);
	    
	}

	
	@Quando("eu Digitar no campo nome {string}")
	public void eu_digitar_no_campo_nome(String nome) {
		metodos.escrever(elemento.Camponome, nome);
	  
	}
	
	@Quando("eu digitar no campo email {string}")
	public void eu_digitar_no_campo_email(String e_mail) {
		metodos.escrever(elemento.Campoemail, e_mail);
	}

	@Quando("eu digitar no campo senha {string}")
	public void eu_digitar_no_campo_senha(String senha) {
		metodos.escrever(elemento.CampoSenha, senha);
	    
	}
	@Quando("clicar em Cadastrar")
	public void clicar_em_cadastrar() throws InterruptedException {
	    metodos.clicar(elemento.btnCadastrar);
	    metodos.esperar(1500);
	}
	


	//fazendo uma validação usuario sem sucesso ao tentar cadastrar
	@Entao("eu valido {string}")
	public void eu_valido(String retorno) throws IOException {
		
		switch (retorno) {
		case "Formulário":
			metodos.validarTexto(elemento.textoFormulario, retorno);
			metodos.ScreenShot(retorno);
		    metodos.fecharNavegador();
			break;
		case "O campo Nome é obrigatório.":
			metodos.validarTexto(elemento.textoCampoNomeObrigatorio, retorno);
			metodos.ScreenShot(retorno);
		    metodos.fecharNavegador();
			break;
		case"O campo E-mail é obrigatório.":
			metodos.validarTexto(elemento.textoCampoEmailObrigatorio, retorno);
			metodos.ScreenShot(retorno);
		    metodos.fecharNavegador();
		    break;
		case"O campo Senha é obrigatório.":
			metodos.validarTexto(elemento.textoCampoSenhaObrigatorio, retorno);
			metodos.ScreenShot(retorno);
		    metodos.fecharNavegador();
			break;
		case"Por favor, insira um nome completo.":
			metodos.validarTexto(elemento.textoFavorInserirNomeCompleto, retorno);
			metodos.ScreenShot(retorno);
		    metodos.fecharNavegador();
			break;
		case"Por favor, insira um e-mail válido.":
			metodos.validarTexto(elemento.textoEmailInvalido, retorno);
			metodos.ScreenShot(retorno);
		    metodos.fecharNavegador();
			break;
		case"A senha deve conter ao menos 8 caracteres.":
			metodos.validarTexto(elemento.textoSenhaDeveTerMaisOitoCaracteres, retorno);
			metodos.ScreenShot(retorno);
		    metodos.fecharNavegador();
			break;

		}
		
	}
	 // validando usuario sem sucesso ao cadastrar sem preeencher todos campos obrigatorios
	@Entao("eu valido mais de um {string} {string} {string}")
	public void eu_valido_mais_de_um(String retorno1, String retorno2, String retorno3) throws IOException, InterruptedException {
		
		metodos.validarTexto(elemento.textoCampoNomeObrigatorio, retorno1);
		metodos.validarTexto(elemento.textoCampoEmailObrigatorio, retorno2);
		metodos.validarTexto(elemento.textoCampoSenhaObrigatorio, retorno3);
		 metodos.esperar(1500);
		metodos.ScreenShot(retorno1 + retorno2 + retorno3);
	    metodos.fecharNavegador();
		
	    
	}
	// validando usuario cadastrado com sucesso
	@Entao("eu valido o usuario cadastrado {string}")
	public void eu_valido_o_usuario_cadastrado(String retornoUsuario) throws IOException {
		metodos.pageDown(elemento.btnCadastrar);
		metodos.validarTexto(elemento.textoUsuarioCadastrado, retornoUsuario);
		 metodos.ScreenShot(retornoUsuario );
		    metodos.fecharNavegador();
	    
	}

	
	// validando usuario cadastrado com sucesso
	@Entao("eu valido {string} {string} {string} {string} {string}")
	public void eu_valido(String retornoUsuario, String retornoId, String retornoNome, String retornoEmail, String retornoAcoes) throws IOException {
		
		metodos.pageDown(elemento.btnCadastrar);
		metodos.validarTexto(elemento.textoUsuarioCadastrado, retornoUsuario);
	    metodos.validarTexto(elemento.TextoIdRetorno, retornoId);
	    metodos.validarTexto(elemento.TextoNomeRetorno, retornoNome);
	    metodos.validarTexto(elemento.TextoEmailRetorno, retornoEmail);
	    metodos.validarTexto(elemento.TextoAcoesRetorno, retornoAcoes);
	    metodos.ScreenShot(retornoUsuario + retornoId + retornoNome + retornoEmail + retornoAcoes);
	    metodos.fecharNavegador();
	    
	}
	
	@Quando("clicar em excluir")
	public void clicar_em_excluir() throws InterruptedException {
	    metodos.clicar(elemento.btnExcluir);
	    metodos.esperar(1500);
	}
	
	// validando o retorno do botao excluir
	@Entao("eu valido {string} {string}")
	public void eu_valido(String retornoUsuario, String retornoExcluir) throws IOException {
		metodos.pageDown(elemento.btnCadastrar);
		metodos.validarTexto(elemento.textoUsuarioCadastrado, retornoUsuario);
		metodos.ScreenShot(retornoUsuario + " Excluido");
		metodos.fecharNavegador();
		
		  
	}
	

	


}
