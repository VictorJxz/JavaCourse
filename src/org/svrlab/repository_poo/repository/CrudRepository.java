package org.svrlab.repository_poo.repository;


import org.svrlab.repository_poo.repository.exeception.AccessDataException;

import java.util.List;

public interface CrudRepository<T> {

    List<T> toList();
    T elementById(Integer id) throws AccessDataException;
    void create( T element ) throws AccessDataException;
    void  edit( T element) throws AccessDataException;
    void delete( Integer id) throws AccessDataException;
}
