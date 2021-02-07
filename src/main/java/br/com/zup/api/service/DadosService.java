package br.com.zup.api.service;

import br.com.zup.api.model.DadosUsuarioModel;
import br.com.zup.api.repository.DadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DadosService {

    @Autowired
    private DadosRepository dadosRepository;


    public DadosUsuarioModel getId(int id){return dadosRepository.findById(id).orElse(null);}
    public List<DadosUsuarioModel> getEmail(String email){return dadosRepository.findByEmail(email);}
    public List<DadosUsuarioModel> getEmails(){return dadosRepository.findAll();}
    public DadosUsuarioModel getNumeroLotaria(String numeroLoteria){return dadosRepository.findByNumeroLoteria(numeroLoteria);}
    public DadosUsuarioModel saveEmail(DadosUsuarioModel email){return dadosRepository.save(email);}


    public String deleteUsuarioById(int id){
        dadosRepository.deleteById(id);
        return "Usuario de ID "+ id + " Removido";
    }
}
