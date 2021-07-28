package org.svrlab.class_optional.repository;

import org.svrlab.class_optional.models.Computer;

import java.util.Optional;

public interface Repository<T> {

    Optional<Computer> filter(String name);
}
