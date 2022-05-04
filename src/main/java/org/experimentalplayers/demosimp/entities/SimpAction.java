package org.experimentalplayers.demosimp.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class SimpAction {

	@Id
	private Long id;

	@Basic
	private String description;

	@Basic
	private Float finalVote;

	@Basic
	private boolean isClosed;

	@ManyToOne
	private User subject;

	@ManyToOne
	private GroupChat group;

	@OneToMany
	private Set<Vote> votes;

}
