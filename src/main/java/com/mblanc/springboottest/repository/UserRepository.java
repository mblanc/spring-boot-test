package com.mblanc.springboottest.repository;

import com.mblanc.springboottest.model.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.QueryHint;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value="select u from User u")
    //@Cacheable("test")
    List<User> findAllWithCache();

}
