package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//caminho das Features
		features = "src/test/resources/features/",
		
		//Pacote das Class testes
		glue ="tests" ,
		
		//Nome da tag no arquivo gherkins para executar os casos de testes correspondentes
		tags = "@executar",
		
		// formatar vizualizar do codigo no console | report html
		plugin = {"pretty","html:target/report.html"},
		
		// valida se existem features sem steps implemetados
		dryRun = false
		
		
			
		)

public class Executa {

}
