package test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Connexion {

	
	 public static void main(String[] args) {
	        // Spécifiez le chemin du pilote Chrome (téléchargez le pilote correspondant à votre version de Chrome)
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zrida Mohamed\\Desktop\\Jihene\\selenium\\chromedriver-win32\\chromedriver.exe");

	      // Créez une instance de WebDriver (dans ce cas, pour Chrome)
	  
	        WebDriver driver = new ChromeDriver();

	     // Ouvrez une page web
	        driver.get("https://dev.accorhotels.projets-en-cours.net/fr/user/login");
            driver.manage().window().maximize();
            driver.navigate().refresh();
            WebElement cookies = driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button"));
            cookies.click();
            
         // remplir le formulaire de connexion
            
            WebElement adresse = driver.findElement(By.id("edit-name"));

            adresse.sendKeys("imen.makni@symdrik.com");

            WebElement password = driver.findElement(By.id("edit-pass"));

            password.sendKeys("AdminSymdrik2020!");

            WebElement loginButton = driver.findElement(By.id("edit-submit"));

            // Cliquez sur le bouton de connexion
            loginButton.click();
            
            
	    }
	}

