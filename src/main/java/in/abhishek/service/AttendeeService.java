package in.abhishek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.abhishek.entity.Attendee;
import in.abhishek.repository.AttendeeRepository;

@Service
public class AttendeeService {
    @Autowired
    private AttendeeRepository attendeeRepository;

    public List<Attendee> getAllAttendees() {
        return attendeeRepository.findAll();
    }

    public Attendee addAttendee(Attendee attendee) {
        return attendeeRepository.save(attendee);
    }

    public void deleteAttendee(Long id) {
        attendeeRepository.deleteById(id);
    }
    
}

