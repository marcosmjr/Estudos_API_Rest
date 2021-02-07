package br.com.zup.api.controller;

import br.com.zup.api.GeradorLoteria;
import br.com.zup.api.model.DadosUsuarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.zup.api.service.DadosService;

import java.util.List;


@RestController
public class ApiController {

    @Autowired
    private DadosService dadosService;


    @PostMapping("/adicionaEmail")
    public DadosUsuarioModel adicionaEmail(@RequestBody DadosUsuarioModel dadosUsuarioModel){
        GeradorLoteria geradorLoteria = new GeradorLoteria();
        geradorLoteria.gerador();
        dadosUsuarioModel.setNumeroLoteria(geradorLoteria.getNumeroLoteria());
        return dadosService.saveEmail(dadosUsuarioModel);
    }


    @GetMapping("/procuraId/{id}")
    public DadosUsuarioModel procuraId(@PathVariable int id){
        return dadosService.getId(id);}

    @GetMapping("procuraEmail/{email}")
    public DadosUsuarioModel procuraEmail(@PathVariable String email){
        return dadosService.getEmail(email);
    }

    @GetMapping("/buscaTodos")
    public List<DadosUsuarioModel> buscaTodos(){
        return dadosService.getEmails();
    }

    @GetMapping("/buscaGanhadorNumero/{numeroLoteria}")
    public DadosUsuarioModel buscaGanhador(@PathVariable String numeroLoteria){
        return dadosService.getNumeroLotaria(numeroLoteria);
    }

    @DeleteMapping("/delete/{id}")
    public String apagaBD(@PathVariable int id){return dadosService.deleteUsuarioById(id);}
}

