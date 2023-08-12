package jp.co.messoso.pokemon.bean.response;

import java.util.Map;

public record Pokemon(
    int id
    , int branch
    , String name
    , Map<String, Integer> status
    , String type1
    , String type2) {
    
}
