select
    mp.id
    , mp.branch
    , mp.name
    , mp.h
    , mp.a
    , mp.b
    , mp.c
    , mp.d
    , mp.s
    , mt1.type_name as type_1
    , mt2.type_name as type_2
from m_pokemon mp
inner join c_pokemon_type cpt
    on cpt.name = mp.name
inner join m_type mt1
    on mt1.type_id = cpt.type_1
left outer join m_type mt2
    on mt2.type_id = cpt.type_2
;