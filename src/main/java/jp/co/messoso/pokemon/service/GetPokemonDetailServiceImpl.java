package jp.co.messoso.pokemon.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.messoso.pokemon.bean.response.Pokemon;
import jp.co.messoso.pokemon.dao.SearchPokemonDao;
import jp.co.messoso.pokemon.entity.PokemonEntity;
import jp.co.messoso.pokemon.util.PokemonUtil;

@Service
public class GetPokemonDetailServiceImpl implements GetPokemonDetailService{
    @Autowired
    SearchPokemonDao searchPokemonDao;
    
    @Override
    public Pokemon get(Integer id, Integer branch){
        PokemonEntity pokemon = searchPokemonDao.search(id, branch);
        return PokemonUtil.convertEntity(Collections.singletonList(pokemon)).get(0);
    }
    
}
