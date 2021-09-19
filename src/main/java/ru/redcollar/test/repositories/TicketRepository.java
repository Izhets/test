package ru.redcollar.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.redcollar.test.entities.TicketEntity;

public interface TicketRepository extends JpaRepository <TicketEntity, Long> {
}
