package profilesdemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@Profile("local")
@PropertySources({
	@PropertySource("email-local.properties")
})
public class LocalConfig {

}
