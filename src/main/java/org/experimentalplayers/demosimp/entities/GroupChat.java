package org.experimentalplayers.demosimp.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GroupChat {

	@Id
	private Long chatId;

	@Basic
	private String name;

	@Basic
	private Float simpFactor;

}
