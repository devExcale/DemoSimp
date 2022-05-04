package org.experimentalplayers.demosimp.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class User {

	@Id
	private Long id;

	@Basic
	private String username;

	@Basic
	private String firstName;

	@Basic
	private String lastName;

	@Basic
	private String nickname;

	@OneToMany
	private Set<GroupChat> groups;

	@OneToMany
	private Set<SimpAction> simpings;

}
