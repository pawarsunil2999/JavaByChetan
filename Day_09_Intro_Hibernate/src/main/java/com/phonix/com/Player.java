package com.phonix.com;

//import javax.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Entity Class - A class that represents Entity : PLAYER

@Entity						//Specifying class as entity class
@Table(name = "player")		//Map class with the table name as player
public class Player {
	
	@Id							//Map primary key for the table
	@Column(name="player_id")	//Map variable with column with the name player_id
//	@GeneratedValue(strategy = GenerationType.AUTO) //if value not given then auto generated
	Integer playerId;
	@Column(name="name")
	String name;
	
	@Column(name="jersey_number")
	Integer jerseyNo;
	
	@Column(name="role")
	String role;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public Player(Integer Player_id, String name, Integer jerseyNo, String role) {
		this.playerId=Player_id;
		this.name = name;
		this.jerseyNo = jerseyNo;
		this.role = role;
	}

	
	public Integer getPlayerId() {
		return playerId;
	}


	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getJerseyNo() {
		return jerseyNo;
	}

	public void setJerseyNo(Integer jerseyNo) {
		this.jerseyNo = jerseyNo;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String toString() {
		return "\nPlayer Id : " + this.playerId + "\nPlayer Name : " + this.getName();
	}
	
	
}