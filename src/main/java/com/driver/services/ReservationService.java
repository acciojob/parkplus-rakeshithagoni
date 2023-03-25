package com.driver.services;

import com.driver.model.Reservation;

public interface ReservationService {
 public   Reservation reserveSpot(Integer userId, Integer parkingLotId, Integer timeInHours, Integer numberOfWheels) throws Exception;
}
