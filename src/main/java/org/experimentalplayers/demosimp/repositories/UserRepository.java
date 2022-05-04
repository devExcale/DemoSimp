package org.experimentalplayers.demosimp.repositories;

import org.experimentalplayers.demosimp.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
