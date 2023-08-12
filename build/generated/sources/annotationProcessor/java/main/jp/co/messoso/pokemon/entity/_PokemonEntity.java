package jp.co.messoso.pokemon.entity;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "2.53.3" }, date = "2023-07-13T19:21:46.868+0900")
@org.seasar.doma.EntityTypeImplementation
public final class _PokemonEntity extends org.seasar.doma.jdbc.entity.AbstractEntityType<jp.co.messoso.pokemon.entity.PokemonEntity> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.53.3");
    }

    private static final _PokemonEntity __singleton = new _PokemonEntity();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<jp.co.messoso.pokemon.entity.PokemonEntity>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, ?>> __entityPropertyTypeMap;

    @SuppressWarnings("unused")
    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, ?>> __embeddedPropertyTypeMap;

    private _PokemonEntity() {
        __listenerSupplier = org.seasar.doma.internal.jdbc.entity.NullEntityListenerSuppliers.of();
        __immutable = false;
        __name = "PokemonEntity";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, ?>> __list = new java.util.ArrayList<>(11);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, ?>> __map = new java.util.LinkedHashMap<>(11);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, ?>> __embeddedMap = new java.util.LinkedHashMap<>(11);
        initializeMaps(__map, __embeddedMap);
        initializeIdList(__map, __idList);
        initializeList(__map, __list);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
        __embeddedPropertyTypeMap = java.util.Collections.unmodifiableMap(__embeddedMap);
    }

    private void initializeMaps(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, ?>> __map, java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, ?>> __embeddedMap) {
        __map.put("id", new org.seasar.doma.jdbc.entity.DefaultPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, java.lang.Integer, java.lang.Integer>(jp.co.messoso.pokemon.entity.PokemonEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofInteger(), "id", "", __namingType, true, true, false));
        __map.put("branch", new org.seasar.doma.jdbc.entity.DefaultPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, java.lang.Integer, java.lang.Integer>(jp.co.messoso.pokemon.entity.PokemonEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofInteger(), "branch", "", __namingType, true, true, false));
        __map.put("name", new org.seasar.doma.jdbc.entity.DefaultPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, java.lang.String, java.lang.String>(jp.co.messoso.pokemon.entity.PokemonEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "name", "", __namingType, true, true, false));
        __map.put("h", new org.seasar.doma.jdbc.entity.DefaultPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, java.lang.Integer, java.lang.Integer>(jp.co.messoso.pokemon.entity.PokemonEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofInteger(), "h", "", __namingType, true, true, false));
        __map.put("a", new org.seasar.doma.jdbc.entity.DefaultPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, java.lang.Integer, java.lang.Integer>(jp.co.messoso.pokemon.entity.PokemonEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofInteger(), "a", "", __namingType, true, true, false));
        __map.put("b", new org.seasar.doma.jdbc.entity.DefaultPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, java.lang.Integer, java.lang.Integer>(jp.co.messoso.pokemon.entity.PokemonEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofInteger(), "b", "", __namingType, true, true, false));
        __map.put("c", new org.seasar.doma.jdbc.entity.DefaultPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, java.lang.Integer, java.lang.Integer>(jp.co.messoso.pokemon.entity.PokemonEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofInteger(), "c", "", __namingType, true, true, false));
        __map.put("d", new org.seasar.doma.jdbc.entity.DefaultPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, java.lang.Integer, java.lang.Integer>(jp.co.messoso.pokemon.entity.PokemonEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofInteger(), "d", "", __namingType, true, true, false));
        __map.put("s", new org.seasar.doma.jdbc.entity.DefaultPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, java.lang.Integer, java.lang.Integer>(jp.co.messoso.pokemon.entity.PokemonEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofInteger(), "s", "", __namingType, true, true, false));
        __map.put("type_1", new org.seasar.doma.jdbc.entity.DefaultPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, java.lang.String, java.lang.String>(jp.co.messoso.pokemon.entity.PokemonEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "type_1", "", __namingType, true, true, false));
        __map.put("type_2", new org.seasar.doma.jdbc.entity.DefaultPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, java.lang.String, java.lang.String>(jp.co.messoso.pokemon.entity.PokemonEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "type_2", "", __namingType, true, true, false));
    }

    private void initializeIdList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, ?>> __idList) {
    }

    private void initializeList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, ?>> __list) {
        __list.addAll(__map.values());
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    @Deprecated
    public String getTableName() {
        return getTableName(org.seasar.doma.internal.jdbc.entity.TableNames.namingFunction);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(jp.co.messoso.pokemon.entity.PokemonEntity entity, org.seasar.doma.jdbc.entity.PreInsertContext<jp.co.messoso.pokemon.entity.PokemonEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(jp.co.messoso.pokemon.entity.PokemonEntity entity, org.seasar.doma.jdbc.entity.PreUpdateContext<jp.co.messoso.pokemon.entity.PokemonEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(jp.co.messoso.pokemon.entity.PokemonEntity entity, org.seasar.doma.jdbc.entity.PreDeleteContext<jp.co.messoso.pokemon.entity.PokemonEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(jp.co.messoso.pokemon.entity.PokemonEntity entity, org.seasar.doma.jdbc.entity.PostInsertContext<jp.co.messoso.pokemon.entity.PokemonEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(jp.co.messoso.pokemon.entity.PokemonEntity entity, org.seasar.doma.jdbc.entity.PostUpdateContext<jp.co.messoso.pokemon.entity.PokemonEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(jp.co.messoso.pokemon.entity.PokemonEntity entity, org.seasar.doma.jdbc.entity.PostDeleteContext<jp.co.messoso.pokemon.entity.PokemonEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, ?, ?> getGeneratedIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, ?, ?> getVersionPropertyType() {
        return (org.seasar.doma.jdbc.entity.VersionPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, ?, ?> getTenantIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.TenantIdPropertyType<jp.co.messoso.pokemon.entity.PokemonEntity, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public jp.co.messoso.pokemon.entity.PokemonEntity newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<jp.co.messoso.pokemon.entity.PokemonEntity, ?>> __args) {
        jp.co.messoso.pokemon.entity.PokemonEntity entity = new jp.co.messoso.pokemon.entity.PokemonEntity();
        if (__args.get("id") != null) __args.get("id").save(entity);
        if (__args.get("branch") != null) __args.get("branch").save(entity);
        if (__args.get("name") != null) __args.get("name").save(entity);
        if (__args.get("h") != null) __args.get("h").save(entity);
        if (__args.get("a") != null) __args.get("a").save(entity);
        if (__args.get("b") != null) __args.get("b").save(entity);
        if (__args.get("c") != null) __args.get("c").save(entity);
        if (__args.get("d") != null) __args.get("d").save(entity);
        if (__args.get("s") != null) __args.get("s").save(entity);
        if (__args.get("type_1") != null) __args.get("type_1").save(entity);
        if (__args.get("type_2") != null) __args.get("type_2").save(entity);
        return entity;
    }

    @Override
    public Class<jp.co.messoso.pokemon.entity.PokemonEntity> getEntityClass() {
        return jp.co.messoso.pokemon.entity.PokemonEntity.class;
    }

    @Override
    public jp.co.messoso.pokemon.entity.PokemonEntity getOriginalStates(jp.co.messoso.pokemon.entity.PokemonEntity __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(jp.co.messoso.pokemon.entity.PokemonEntity __entity) {
    }

    /**
     * @return the singleton
     */
    public static _PokemonEntity getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _PokemonEntity newInstance() {
        return new _PokemonEntity();
    }

}
