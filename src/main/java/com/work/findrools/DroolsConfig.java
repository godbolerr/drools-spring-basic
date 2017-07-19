package com.work.findrools;

import java.io.IOException;

import org.kie.api.KieServices;
import org.kie.api.builder.Results;
import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.work.findrools.rules"})
public class DroolsConfig {

	@Bean
    public KieContainer kieContainer() throws IOException {
        KieContainer kContainer = KieServices.Factory.get().getKieClasspathContainer();
        Results verifyResults = kContainer.verify();
        return kContainer;
    }
}