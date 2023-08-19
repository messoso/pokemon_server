package jp.co.messoso.pokemon.service;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import jp.co.messoso.pokemon.bean.response.Pokemon;
import jp.co.messoso.pokemon.dao.SearchPokemonDao;
import jp.co.messoso.pokemon.entity.PokemonEntity;
import jp.co.messoso.pokemon.util.PokemonUtil;

class GetAllPokemonServiceImplTest {

	@Mock
	SearchPokemonDao dao;
	
	@InjectMocks
	GetAllPokemonServiceImpl getAllPokemonService;
	
	private AutoCloseable closeable;
	
	private List<PokemonEntity> list = new ArrayList<>();
	private List<Pokemon> expect = new ArrayList<>();
	PokemonEntity entity = new PokemonEntity();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		closeable = MockitoAnnotations.openMocks(this);
		
		entity.setId(887);
		entity.setBranch(1);
		entity.setName("ドラパルト");
		entity.setH(88);
		entity.setA(120);
		entity.setB(75);
		entity.setC(100);
		entity.setD(75);
		entity.setS(142);
		entity.setType_1("ドラゴン");
		entity.setType_2("ゴースト");	
		list.add(entity);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		closeable.close();
		list.clear();
		expect.clear();
	}

	@Test
	void testGetAll_normal_pattern() {
		
		Pokemon pokemon = new Pokemon(entity.getId(), entity.getBranch(), entity.getName(), createMap(entity), entity.getType_1(), entity.getType_2());
		expect.add(pokemon);
		
		try(MockedStatic<PokemonUtil> mock = Mockito.mockStatic(PokemonUtil.class)){
			when(dao.searchAll()).thenReturn(list);
			mock.when(() -> PokemonUtil.convertEntity(list)).thenReturn(expect);
			List<Pokemon> result = getAllPokemonService.getAll();
			assertThat(result).containsExactly(pokemon);
		}		
	}
	
	@Test
	void testGetAll_normal_multiple() {
		PokemonEntity entity2 = new PokemonEntity();
		entity2.setId(706);
		entity2.setBranch(1);
		entity2.setName("ヌメルゴン");
		entity2.setH(90);
		entity2.setA(100);
		entity2.setB(70);
		entity2.setC(110);
		entity2.setD(150);
		entity2.setS(90);
		entity2.setType_1("ドラゴン");
		entity2.setType_2("なし");	
		list.add(entity2);

		Pokemon pokemon = new Pokemon(entity.getId(), entity.getBranch(), entity.getName(), createMap(entity), entity.getType_1(), entity.getType_2());
		Pokemon pokemon2 = new Pokemon(entity2.getId(), entity2.getBranch(), entity2.getName(), createMap(entity2), entity2.getType_1(), entity2.getType_2());
		expect.add(pokemon);
		expect.add(pokemon2);
		
		try(MockedStatic<PokemonUtil> mock = Mockito.mockStatic(PokemonUtil.class)){
			when(dao.searchAll()).thenReturn(list);
			mock.when(() -> PokemonUtil.convertEntity(list)).thenReturn(expect);
			List<Pokemon> result = getAllPokemonService.getAll();
			assertThat(result).containsExactly(pokemon, pokemon2);
		}		
	}
	
	private Map<String, Integer> createMap(PokemonEntity entity){
		Map<String, Integer> map = new HashMap<>();
		map.put("h", entity.getH());
		map.put("a", entity.getA());
		map.put("b", entity.getB());
		map.put("c", entity.getC());
		map.put("d", entity.getD());
		map.put("s", entity.getS());		
		return map;
	}}
