package liqour.ravine.controller;


import liqour.ravine.entities.Customer;
import liqour.ravine.entities.Review;
import liqour.ravine.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/review")
public class ReviewController {
    private final ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService){
        this.reviewService = reviewService;
    }
    
    @PostMapping(value="/register", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> registerReview(@RequestBody Review review) {

        Review savedReview = reviewService.saveReview(review);
        return ResponseEntity.ok(savedReview);
    } 

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?>getAllReview() {
        return ResponseEntity.ok(reviewService.getAllReview());
    }
    
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?>getAllReview(@PathVariable Integer id) {
        return ResponseEntity.ok(reviewService.getReviewById(id));
    }
    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> updateReview(@PathVariable Integer id, @RequestBody Review review) {
        Review updatedReview = reviewService.updateReview(review);
        return ResponseEntity.ok(updatedReview);
    }
    @DeleteMapping(value = "path/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?>DeleteReview(@PathVariable Integer id){
        reviewService.deleteReview(id);
        return ResponseEntity.ok().build();
    }
}
