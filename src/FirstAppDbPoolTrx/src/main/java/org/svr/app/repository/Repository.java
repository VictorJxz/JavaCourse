package org.svr.app.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface Repository<T> {

    void setConnection(Connection connection);
    List<T> toList() throws SQLException;
    T byId(Long id) throws SQLException;
    T  save(T t) throws SQLException;
    void delete(Long id) throws SQLException;

}
