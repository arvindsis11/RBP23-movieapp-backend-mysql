package com.cognizant.moviebookingapp.model;

import java.util.Set;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "tickets")
public class Ticket {

	@Id
	@Schema(hidden = true)
	private String transactionId;// fix--this is mandatory-reference to movie:

	@NotNull
	private int numberOfTickets;// can be improved--seatNums will be same as numOfTicks--fix-later/priority-low

	@NotNull
	private Set<String> seatNumbers;// v2.0

	@NotBlank
	@Schema(hidden = true)
	private String movieName;

	@NotBlank
	@Schema(hidden = true)
	private String theaterName;

	@NotBlank
	@Schema(hidden = true)
	private String userId;// --fixed--given username when user is logged in--getting from auth

	public Ticket() {
	}

	public Ticket(String transactionId, @NotNull @Min(1) int numberOfTickets, @NotNull Set<String> seatNumbers,
			@NotBlank String movieName, @NotBlank String theaterName, @NotBlank String userId) {
		this.transactionId = transactionId;
		this.numberOfTickets = numberOfTickets;
		this.seatNumbers = seatNumbers;
		this.movieName = movieName;
		this.theaterName = theaterName;
		this.userId = userId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

	public Set<String> getSeatNumbers() {
		return seatNumbers;
	}

	public void setSeatNumbers(Set<String> seatNumbers) {
		this.seatNumbers = seatNumbers;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
