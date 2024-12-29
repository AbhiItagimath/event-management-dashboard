package in.abhishek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.abhishek.entity.Attendee;

@Repository
public interface AttendeeRepository extends JpaRepository<Attendee, Long> {}
