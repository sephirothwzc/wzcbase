package com.sephiroth.wzcbase.utilsbase;

import java.util.List;

public interface BaseDao {

    /**
     * 分页查询
     * @param param
     * @param <S>
     * @param <T>
     * @return
     */
    <S,T extends PageQueryInVO> List<S> findAll(T param);

    <T> T findById(String id);

    <T> int putUpdate(T param);

    <T> int postInsert(T param);
}
