package org.svr.app.repository;

import java.util.List;

public interface Repository<T> {

    List<T> toList();
    T byId(Long id);
    void  save(T t);
    void delete(Long id);

}
