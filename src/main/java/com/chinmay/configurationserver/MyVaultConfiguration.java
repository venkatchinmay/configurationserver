package com.chinmay.configurationserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.vault.client.VaultEndpoint;
import org.springframework.vault.core.VaultTemplate;

@Configuration
public class MyVaultConfiguration {
    /*@Bean
    public VaultTemplate vaultTemplate(VaultEndpoint vaultEndpoint) {
        return new VaultTemplate(vaultEndpoint);
    }*/
}
