/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.java.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pos.java.festa.model.Convidado;

/**
 *
 * @author DesenvolvedorJava
 */
public interface Convidados  extends JpaRepository<Convidado, Long>{
    
}
