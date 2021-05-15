package org.svrlab.repository_poo.repository;

import org.svrlab.repository_poo.model.BaseEntity;
import org.svrlab.repository_poo.repository.exeception.DuplicateRecordAccessDataException;
import org.svrlab.repository_poo.repository.exeception.ReadAccessDataException;
import org.svrlab.repository_poo.repository.exeception.WritingAccessDataException;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractListRepository<T extends BaseEntity> implements IndexRepository<T> {

    protected List<T> dataSource;

    public AbstractListRepository() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> toList() {
        return dataSource;
    }

    @Override
    public T elementById(Integer id) throws ReadAccessDataException {
        if (id == null || id <= 0){
            throw new ReadAccessDataException("The ID is invalid :( ");
        }
        T result = null;
        for (T client: dataSource){
            if (client.getId() != null && client.getId().equals( id )){
                result = client;
                break;
            }
        }
        if (result == null ){
            throw new ReadAccessDataException("There is no result with ID -> "+ id );
        }
        return result;
    }

    @Override
    public void create(T t) throws WritingAccessDataException {
        if ( t == null){
            throw new WritingAccessDataException("Error inserting null object ");
        }
        if ( this.dataSource.contains(t)){
            throw new DuplicateRecordAccessDataException("Error the object with the ID -> "+t.getId()+" exists in the repository ");
        }
        this.dataSource.add( t );
    }

    @Override
    public void delete(Integer id) throws ReadAccessDataException {
        this.dataSource.remove( this.elementById( id ) );
    }

    @Override
    public List<T> toList(int since, int until) {
        return dataSource.subList( since, until);
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}
