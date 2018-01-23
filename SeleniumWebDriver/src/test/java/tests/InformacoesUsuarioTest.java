package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class InformacoesUsuarioTest {
    @Test
    public void AdicionarInfoUsuarioTest() {

        //abrindo navegador
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
       assertEquals("Hi, Julio",textoNoElementoMe);

        //fechar o navegador
        navegador.quit();
    }
}