package za.co.asa.prototype.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.asa.prototype.entities.Club;

public interface ClubRepository extends JpaRepository<Club, String> {
}
