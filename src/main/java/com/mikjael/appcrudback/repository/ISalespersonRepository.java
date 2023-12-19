package com.mikjael.appcrudback.repository;

import com.mikjael.appcrudback.model.Salesperson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISalespersonRepository extends JpaRepository<Salesperson, String> {
    @Query("from Salesperson s where s.salesperson_name like %:salesperson_name%")
    List<Salesperson> findByName(@Param("salesperson_name") String salesperson_name);

    @Query("from Salesperson s where s.estate_agent_name like %:estate_agent_name%")
    List<Salesperson> findByAgentName(@Param("estate_agent_name") String estate_agent_name);

}
