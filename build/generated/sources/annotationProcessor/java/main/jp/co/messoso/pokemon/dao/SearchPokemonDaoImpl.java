package jp.co.messoso.pokemon.dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.processing.Generated(value = { "Doma", "2.53.3" }, date = "2023-07-13T19:21:47.021+0900")
@org.seasar.doma.DaoImplementation
public class SearchPokemonDaoImpl implements jp.co.messoso.pokemon.dao.SearchPokemonDao, org.seasar.doma.jdbc.ConfigProvider {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.53.3");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(jp.co.messoso.pokemon.dao.SearchPokemonDao.class, "searchAll");

    private final org.seasar.doma.internal.jdbc.dao.DaoImplSupport __support;

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public SearchPokemonDaoImpl(org.seasar.doma.jdbc.Config config) {
        __support = new org.seasar.doma.internal.jdbc.dao.DaoImplSupport(config);
    }

    @Override
    public org.seasar.doma.jdbc.Config getConfig() {
        return __support.getConfig();
    }

    @Override
    public java.util.List<jp.co.messoso.pokemon.entity.PokemonEntity> searchAll() {
        __support.entering("jp.co.messoso.pokemon.dao.SearchPokemonDaoImpl", "searchAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = __support.getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("META-INF/jp/co/messoso/pokemon/dao/SearchPokemonDao/searchAll.sql");
            __query.setEntityType(jp.co.messoso.pokemon.entity._PokemonEntity.getSingletonInternal());
            __query.setCallerClassName("jp.co.messoso.pokemon.dao.SearchPokemonDaoImpl");
            __query.setCallerMethodName("searchAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<jp.co.messoso.pokemon.entity.PokemonEntity>> __command = __support.getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<jp.co.messoso.pokemon.entity.PokemonEntity>(jp.co.messoso.pokemon.entity._PokemonEntity.getSingletonInternal()));
            java.util.List<jp.co.messoso.pokemon.entity.PokemonEntity> __result = __command.execute();
            __query.complete();
            __support.exiting("jp.co.messoso.pokemon.dao.SearchPokemonDaoImpl", "searchAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("jp.co.messoso.pokemon.dao.SearchPokemonDaoImpl", "searchAll", __e);
            throw __e;
        }
    }

}
