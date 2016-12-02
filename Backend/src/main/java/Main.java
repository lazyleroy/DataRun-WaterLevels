import com.Config.Controller.JSONController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Felix on 02.12.2016.
 * Package: PACKAGE_NAME
 * Project: DataRun-WaterLevels
 */
@SpringBootApplication
@ComponentScan(basePackageClasses = JSONController.class)
public class Main {
    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }
}
