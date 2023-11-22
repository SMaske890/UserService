package com.user.service.UserService.external.services;

import com.user.service.UserService.entities.Hotel;
import com.user.service.UserService.entities.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "RATING-SERVICE")
public interface RatingService {

    //get
    @GetMapping("/ratings/users/{userId}")
    public List<Rating> getUserByRating(@PathVariable String userId);

    //post
    @PostMapping("/ratings")
    public Rating createRating(Rating values);

    //put
    @PutMapping("/ratings/{ratingId}")
    public Rating updateRating(@PathVariable("ratingId") String ratingId, Rating rating);

    //delete
    @DeleteMapping("ratings/{ratingId}")
    public void deleteRating(@PathVariable("ratingId") String ratingId);


}
