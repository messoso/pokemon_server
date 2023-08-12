package jp.co.messoso.pokemon.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import jp.co.messoso.pokemon.entity.PokemonEntity;

@ConfigAutowireable
@Dao
public interface SearchPokemonDao {
    @Select
    public List<PokemonEntity> searchAll();
    
}
