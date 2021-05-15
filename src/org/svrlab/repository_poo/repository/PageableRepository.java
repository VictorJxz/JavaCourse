package org.svrlab.repository_poo.repository;


import java.util.List;

public interface PageableRepository<T> {

    List<T> toList(int since, int until);
}
