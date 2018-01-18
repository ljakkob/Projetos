package PrimeirosTestes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;


public class LoginTest {

@Test
public void AdicionarInfoUsuario() {
	
	//abrindo navegador
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
    WebDriver navegador = new ChromeDriver(); 
	navegador.get("http://www.juliodelima.com.br/taskit/");
	
	//clicar no link que possui o texto sign in
	navegador.findElement(By.linkText("Sign in")).click();
	
	//Identificando o campo de login
	WebElement FormularioSignInBox = navegador.findElement(By.id("signinbox"));
	//digitar o texto julio0001
	FormularioSignInBox.findElement(By.name("login")).sendKeys("julio0001");
	
	//digitar no campo password a senha 123456
	FormularioSignInBox.findElement(By.name("password")).sendKeys("123456");
	
	//clicar no link com o texto sign in
	navegador.findElement(By.linkText("SIGN IN")).click();
	
	//validar dentro co elemento class me o texto hi julio
	WebElement me = navegador.findElement(By.className("me"));
	String textoNoElementoMe = me.getText();
	assertEquals("Hi Julio", textoNoElementoMe);
	
	
	//fechar o navegador
}



	
	
}
