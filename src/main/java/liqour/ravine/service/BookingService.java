package liqour.ravine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import liqour.ravine.repositories.BookingRepository;
import liqour.ravine.entities.Booking;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;
    }
    //create
    public Booking saveBooking(Booking booking){
        return bookingRepository.save(booking);
    }
    //get
    public Iterable<Booking>getAllBooking(){
        return bookingRepository.findAll();
    }
    //getById
    public Booking getBookingById(Integer id){
        return bookingRepository.findById(id).orElse(null);

    }
    //update
    public Booking updateBooking(Booking booking){
        return bookingRepository.save(booking);
    }
    //delete
    public void deleteBooking(Integer id){
        bookingRepository.deleteById(id);
    }

}
