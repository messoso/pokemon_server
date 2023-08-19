package jp.co.messoso.pokemon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.messoso.pokemon.bean.response.Pokemon;
import jp.co.messoso.pokemon.service.GetAllPokemonService;
import jp.co.messoso.pokemon.service.GetPokemonDetailService;

@Controller
public class PokemonController {

    @Autowired
    GetAllPokemonService getAllPokemonService;

    @Autowired
    GetPokemonDetailService getPokemonDetailService;

    @GetMapping("/searchAll")
    public List<Pokemon> searchAll(){
        return getAllPokemonService.getAll();
    }
    
    @PostMapping("/search")
    public Pokemon search(@RequestParam(value="id") Integer id, @RequestParam(value="branch") Integer branch){
        return getPokemonDetailService.get(id, branch);
    }
    
}
