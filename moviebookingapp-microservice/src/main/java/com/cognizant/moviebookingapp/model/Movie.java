package com.cognizant.moviebookingapp.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "movies")
public class Movie {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Schema(hidden = true)
	private Long movieId;

	@NotBlank
	private String movieName;

	@NotBlank
	private String theaterName;

	@NotNull
	private int totalTickets;

	@NotBlank
	private String ticketStatus;

	@Schema(hidden = true)
	private Set<String> bookedSeats = new HashSet<>();// v2.0

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id")
	@Schema(hidden = true)
	private List<Ticket> tickets = new ArrayList<Ticket>();

	public Movie() {
	}

	public Movie(Long movieId, @NotBlank String movieName, @NotBlank String theaterName, @NotNull int totalTickets,
			@NotBlank String ticketStatus, Set<String> bookedSeats, List<Ticket> tickets) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.theaterName = theaterName;
		this.totalTickets = totalTickets;
		this.ticketStatus = ticketStatus;
		this.bookedSeats = bookedSeats;
		this.tickets = tickets;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
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

	public int getTotalTickets() {
		return totalTickets;
	}

	public void setTotalTickets(int totalTickets) {
		this.totalTickets = totalTickets;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public Set<String> getBookedSeats() {
		return bookedSeats;
	}

	public void setBookedSeats(Set<String> bookedSeats) {
		this.bookedSeats = bookedSeats;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

}
