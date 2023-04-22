package com.pragma.powerup.infrastructure.configuration;

import com.pragma.powerup.domain.api.IPropietarioPort;
import com.pragma.powerup.domain.usecase.PropietarioUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDomainConfiguration {
    @Bean
    public IPropietarioPort instancePropietarioUsaCase(){
        return new PropietarioUseCase();
    }

}
