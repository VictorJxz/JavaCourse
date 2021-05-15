package org.svrlab.repository_poo.repository;

public interface IndexRepository<T> extends SortableRepository<T>, PageableRepository<T>,CrudRepository<T>, CountableRepository {

}
