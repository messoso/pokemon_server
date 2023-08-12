package jp.co.messoso.pokemon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jp.co.messoso.pokemon.bean.response.Pokemon;
import jp.co.messoso.pokemon.service.GetAllPokemonService;

@Controller
public class PokemonController {

    @Autowired
    GetAllPokemonService getAllPokemonService;

    @GetMapping("/searchAll")
    public List<Pokemon> searchAll(){
        return getAllPokemonService.getAll();
    }
    
}
