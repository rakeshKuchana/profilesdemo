package profilesdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Import({LocalConfig.class, ProdConfig.class, QaConfig.class})
@ComponentScan(basePackages = {"profilesdemo"})
public class ApplicationConfiguration {

}
