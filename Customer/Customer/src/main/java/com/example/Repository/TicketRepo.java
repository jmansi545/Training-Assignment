package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Entity.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Long> {
	
	
	@Query(value = "SELECT * FROM ticketdb WHERE u_id = :id", nativeQuery = true)
	List<Ticket> findByUser(Long id);
	
/*	 @Query(value = "INSERT INTO TABLE customerDB VALUES (?,?,?,?,?,?)")
	    List<Ticket> save(ticket,userid);

*/
	/*Ticket save(Ticket ticket, Long userid);	}
	
*/
	
}

