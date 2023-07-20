package com.bridgelabz.H2.Database.and.Validation.Repository;

import com.bridgelabz.H2.Database.and.Validation.Model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepo  extends JpaRepository<Message,Integer> {
}
