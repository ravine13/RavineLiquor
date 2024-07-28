package liqour.ravine.service;


import liqour.ravine.repositories.ReviewRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import liqour.ravine.entities.Review;

@Service
public class ReviewService {
    private ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }
    //create
    public Review saveReview(Review review){
        return reviewRepository.save(review);
    }
    //get
    public Iterable<Review> getAllReview(){
        return reviewRepository.findAll();
    }
    //getby id
    public Review getReviewById(Integer id) {
        return reviewRepository.findById(id).orElse(null);
    }
    //update
    public Review updateReview(Review review){
        return reviewRepository.save(review);
    }
    //delete
    public void deleteReview(Integer id){
        reviewRepository.deleteById(id);
    }
}
