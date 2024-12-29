package in.abhishek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.abhishek.entity.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long>{

}
