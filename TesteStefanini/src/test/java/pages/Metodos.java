package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Metodos {
	
WebDriver driver;
	
	public void  abrirNavegador(String urlApp, String navegador){
		if(navegador == "CHROME") {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(urlApp);
		driver.manage().window().maximize();
		
		} else if (navegador =="FIREFOX") {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(urlApp);
			driver.manage().window().maximize();
		}
		else {
			System.out.println("Opçâo Invalida, escolha CHROME ou FIREFOX em navegador");
		}
		
	}
	
	public void escrever(By elemneto, String texto) {
		driver.findElement(elemneto).sendKeys(texto);
		
	}
	public void pegarSomenteTexto(By elemento) {
		driver.findElement(elemento).getText();
	}
	
	public void clicar (By elemento) {
		driver.findElement(elemento).click();
			
	}
	public void enter(By elemento) {
		driver.findElement(elemento).sendKeys(Keys.ENTER);
		
	}
	public void pageDown(By elemento) {
		driver.findElement(elemento).sendKeys(Keys.PAGE_DOWN);
	}
	
	
	public void esperar(int tempo) throws InterruptedException {
		
		Thread.sleep(tempo);
	}
	public void fecharNavegador() {
		driver.quit();
	}
	
	public void validarTexto(By elemento, String textoEsperado) {
		String texto = driver.findElement(elemento).getText();
		System.out.println("Texto apresentado na tela: "+ texto);
		assertEquals(textoEsperado, texto);
		
	}
	public void ScreenShot(String nome) throws IOException {
		TakesScreenshot srcShot = ((TakesScreenshot)driver);
		
		File SrcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/"+nome+".png");
		FileUtils.copyFile(SrcFile, destFile);

}
	

}
