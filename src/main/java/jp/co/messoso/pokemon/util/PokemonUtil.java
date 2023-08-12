package jp.co.messoso.pokemon.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.messoso.pokemon.bean.response.Pokemon;
import jp.co.messoso.pokemon.entity.PokemonEntity;

public class PokemonUtil {
    public static List<Pokemon> convertEntity(List<PokemonEntity> list){

        List<Pokemon> pokemonList = new ArrayList<>();
        
        for(PokemonEntity entity: list){
            Map<String,Integer> map = new HashMap<>();
            map.put("h", entity.getH());
            map.put("a", entity.getA());
            map.put("b", entity.getB());
            map.put("c", entity.getC());
            map.put("d", entity.getD());
            map.put("s", entity.getS());

            Pokemon pokemon = new Pokemon(
                entity.getId()
                , entity.getBranch()
                , entity.getName()
                , map
                , entity.getType_1()
                , entity.getType_2()
            );

            pokemonList.add(pokemon);

        }
        
        return pokemonList;
    }
    
}
