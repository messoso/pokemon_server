package jp.co.messoso.pokemon.service;

import jp.co.messoso.pokemon.bean.response.Pokemon;

public interface GetPokemonDetailService {
    public Pokemon get(Integer id, Integer branch);
    
}
