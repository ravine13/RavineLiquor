package liqour.ravine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import liqour.ravine.entities.Booking;
import liqour.ravine.entities.Customer;
import liqour.ravine.service.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService){
        this.bookingService = bookingService;
    }

    @PostMapping(value="/register", produces = MediaType.APPLICATION_JSON_VALUE)
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.saveBooking(booking);
    }

    
    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Booking> getAllBookings() {
        return bookingService.getAllBooking();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Booking getBookingById(@PathVariable Integer id) {
        return bookingService.getBookingById(id);
    }

    @PutMapping(value="/{id}" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> updateBooking(@PathVariable Integer id, @RequestBody Booking booking) {
        Booking updatedBooking = bookingService.updateBooking(booking);
        return ResponseEntity.ok(updatedBooking);
    }

    @DeleteMapping(value="path/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteBooking(@PathVariable Integer id) {
        bookingService.deleteBooking(id);
        return ResponseEntity.noContent().build();
    }

}
