package org.experimentalplayers.demosimp.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.UUID;

@Entity
public class Vote {

	@Id
	private UUID id;

	@ManyToOne
	private User user;

	@ManyToOne
	private SimpAction action;

	@Basic
	private Date time;

}
