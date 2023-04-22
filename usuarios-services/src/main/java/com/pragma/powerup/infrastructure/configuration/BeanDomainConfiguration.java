package com.pragma.powerup.infrastructure.configuration;

import com.pragma.powerup.domain.api.IPropietarioPort;
import com.pragma.powerup.domain.spi.IUsuarioPersistencePort;
import com.pragma.powerup.domain.usecase.PropietarioUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanDomainConfiguration {

    private final IUsuarioPersistencePort usuarioPersistencePort;
    @Bean
    public IPropietarioPort instancePropietarioUsaCase(){
        return new PropietarioUseCase(usuarioPersistencePort);
    }

}
