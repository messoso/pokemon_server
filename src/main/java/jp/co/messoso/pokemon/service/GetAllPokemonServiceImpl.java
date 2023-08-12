package jp.co.messoso.pokemon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.messoso.pokemon.bean.response.Pokemon;
import jp.co.messoso.pokemon.dao.SearchPokemonDao;
import jp.co.messoso.pokemon.entity.PokemonEntity;
import jp.co.messoso.pokemon.util.PokemonUtil;

@Service
public class GetAllPokemonServiceImpl implements GetAllPokemonService{
    @Autowired
    SearchPokemonDao searchPokemonDao;
    
    @Override
    public List<Pokemon> getAll(){
        List<PokemonEntity> list = searchPokemonDao.searchAll();
        return PokemonUtil.convertEntity(list);
    }
    
}
