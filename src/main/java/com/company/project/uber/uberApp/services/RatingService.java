package com.company.project.uber.uberApp.services;

import com.company.project.uber.uberApp.dto.DriverDto;
import com.company.project.uber.uberApp.dto.RiderDto;
import com.company.project.uber.uberApp.entities.Driver;
import com.company.project.uber.uberApp.entities.Ride;
import com.company.project.uber.uberApp.entities.Rider;

public interface RatingService {

    DriverDto rateDriver(Ride ride, Integer rating);
    RiderDto rateRider(Ride ride, Integer rating);

    void createNewRating(Ride ride);
}
