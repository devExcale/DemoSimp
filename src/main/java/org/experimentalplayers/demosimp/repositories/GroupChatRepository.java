package org.experimentalplayers.demosimp.repositories;

import org.experimentalplayers.demosimp.entities.GroupChat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupChatRepository extends CrudRepository<GroupChat, Long> {

}
