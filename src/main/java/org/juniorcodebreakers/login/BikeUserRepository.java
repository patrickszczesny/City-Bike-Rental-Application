package org.juniorcodebreakers.login;

import org.juniorcodebreakers.model.user.BikeUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BikeUserRepository extends CrudRepository<BikeUser, Long> {

    Optional<BikeUser> findByLogin(String login);
}
