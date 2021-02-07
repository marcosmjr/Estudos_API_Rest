package br.com.zup.api.repository;

import br.com.zup.api.model.DadosUsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface DadosRepository extends JpaRepository<DadosUsuarioModel, Integer> {

    List<DadosUsuarioModel> findByEmail(String email);

   DadosUsuarioModel findByNumeroLoteria(String numeroLoteria);


}
