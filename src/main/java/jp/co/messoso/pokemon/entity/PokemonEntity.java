package jp.co.messoso.pokemon.entity;

import org.seasar.doma.Entity;

import lombok.Data;

@Data
@Entity
public class PokemonEntity {
    private Integer id;
    private Integer branch;
    private String name;
    private Integer h;
    private Integer a;
    private Integer b;
    private Integer c;
    private Integer d;
    private Integer s;
    private String type_1;
    private String type_2;
    
}
