package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	public By textoFormulario = By.cssSelector("#root > div > div > div.register-form > h2");
	
	// abaixo campos nome, email, sobrenome e botao cadastrar
	public By Camponome = By.id("name");
	public By Campoemail = By.id("email");
	public By CampoSenha = By.id("password");
	public By btnCadastrar = By.id("register");
	
	//abaixo sao retornos da tela de cadastro
	public By textoCampoNomeObrigatorio = By.cssSelector("#root > div > div > div.register-form > form > div:nth-child(1) > p");
	public By textoCampoEmailObrigatorio = By.cssSelector("#root > div > div > div.register-form > form > div:nth-child(2) > p");
	public By textoCampoSenhaObrigatorio = By.cssSelector("#root > div > div > div.register-form > form > div:nth-child(3) > p");
	public By textoFavorInserirNomeCompleto = By.cssSelector("#root > div > div > div.register-form > form > div:nth-child(1) > p");
	public By textoEmailInvalido = By.cssSelector("#root > div > div > div.register-form > form > div:nth-child(2) > p");
	public By textoSenhaDeveTerMaisOitoCaracteres = By.cssSelector("#root > div > div > div.register-form > form > div:nth-child(3) > p");
	//abaixo sao retornos da tela apos usuario cadastrado
	public By textoUsuarioCadastrado = By.cssSelector("#root > div > div > div.register-form.expanded > h2.table-title");
	public By TextoIdRetorno = By.cssSelector("#root > div > div > div.register-form.expanded > table > th:nth-child(1)");
	public By TextoNomeRetorno = By.cssSelector("#root > div > div > div.register-form.expanded > table > th:nth-child(2)");
	public By TextoEmailRetorno = By.cssSelector("#root > div > div > div.register-form.expanded > table > th:nth-child(3)");
	public By TextoAcoesRetorno = By.cssSelector("#root > div > div > div.register-form.expanded > table > th:nth-child(4)");
	public By btnExcluir = By.id("removeUser1");
}
