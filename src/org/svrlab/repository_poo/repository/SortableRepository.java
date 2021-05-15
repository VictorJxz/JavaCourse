package org.svrlab.repository_poo.repository;

import java.util.List;

public interface SortableRepository<T> {

    List<T> toList(String field, Direction dir);
}
