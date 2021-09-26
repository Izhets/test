package ru.redcollar.test.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.redcollar.test.model.entities.TicketEntity;

public interface TicketRepository extends JpaRepository <TicketEntity, Long> {
}
