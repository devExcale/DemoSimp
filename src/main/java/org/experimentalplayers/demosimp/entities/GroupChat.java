package org.experimentalplayers.demosimp.entities;

import javax.persistence.*;

@Entity
public class GroupChat {

	@Id
	private Long chatId;

	@Basic
	private String name;

	@Basic
	private Float simpFactor;

}
