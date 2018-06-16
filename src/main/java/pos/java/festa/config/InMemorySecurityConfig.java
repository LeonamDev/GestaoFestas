/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.java.festa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

/**
 *
 * @author DesenvolvedorJava
 */
@Configuration
public class InMemorySecurityConfig {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder builder)
            throws Exception {
        builder
            .inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance())
            .withUser("joao").password("123").roles("USER")
            .and()
            .withUser("alexandre").password("123").roles("USER")
            .and()
            .withUser("thiago").password("123").roles("USER");
    }

}
