package com.driver.services;

import com.driver.model.ParkingLot;
import com.driver.model.Spot;
import com.driver.repository.ParkingLotRepository;

public interface ParkingLotService  {
    
   public void deleteSpot(int spotId);

     public Spot updateSpot(int parkingLotId, int spotId, int pricePerHour);

   public void deleteParkingLot(int parkingLotId);

   public ParkingLot addParkingLot(String name, String address);

   public Spot addSpot(int parkingLotId, Integer numberOfWheels, Integer pricePerHour);
}
