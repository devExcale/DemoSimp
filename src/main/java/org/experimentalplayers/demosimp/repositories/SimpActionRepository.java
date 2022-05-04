package org.experimentalplayers.demosimp.repositories;

import org.experimentalplayers.demosimp.entities.SimpAction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SimpActionRepository extends CrudRepository<SimpAction, UUID> {

	Iterable<SimpAction> findAllByGroupChatId(long chatId);

	Iterable<SimpAction> findAllByClosedFalse();

	Iterable<SimpAction> findAllByClosedFalseAndGroupChatId(long chatId);

}
