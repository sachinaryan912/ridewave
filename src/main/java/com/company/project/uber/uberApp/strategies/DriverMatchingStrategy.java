package com.company.project.uber.uberApp.strategies;

import com.company.project.uber.uberApp.entities.Driver;
import com.company.project.uber.uberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
