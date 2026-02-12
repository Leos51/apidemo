package training.afpa.cda24060.apidemo;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Disabled
@SpringBootTest
class ApiDemoApplicationTests {

    @Test
    @Description("Test de chargement du contexte Spring Boot")
    @Severity(SeverityLevel.BLOCKER)
    void contextLoads() {
    }

}