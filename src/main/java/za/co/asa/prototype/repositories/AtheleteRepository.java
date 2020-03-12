package za.co.asa.prototype.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.asa.prototype.entities.Athelete;
import za.co.asa.prototype.entities.Club;

public interface AtheleteRepository extends JpaRepository<Athelete, String> {
}
