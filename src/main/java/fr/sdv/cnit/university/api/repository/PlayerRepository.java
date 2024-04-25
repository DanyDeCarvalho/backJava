package fr.sdv.cnit.university.api.repository;

import fr.sdv.cnit.university.api.entity.Player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {


}
