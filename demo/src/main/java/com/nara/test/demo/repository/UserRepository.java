package com.nara.test.demo.repository;

import com.nara.test.demo.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

    User findByUserName(String userName);
}
