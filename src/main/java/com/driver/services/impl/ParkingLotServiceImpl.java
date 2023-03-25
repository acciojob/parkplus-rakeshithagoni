package com.driver.services.impl;

import com.driver.model.ParkingLot;
import com.driver.model.Spot;
import com.driver.model.SpotType;
import com.driver.repository.ParkingLotRepository;
import com.driver.repository.SpotRepository;
import com.driver.services.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingLotServiceImpl implements ParkingLotService {
    @Autowired
    ParkingLotRepository parkingLotRepository1;
    @Autowired
    SpotRepository spotRepository1;
    @Autowired
    ParkingLotService parkingLotService;
    @Override
    public ParkingLot addParkingLot(String name, String address) {
            return parkingLotService.addParkingLot(name,address);
    }

    @Override
    public Spot addSpot(int parkingLotId, Integer numberOfWheels, Integer pricePerHour) {
            return parkingLotService.addSpot(parkingLotId,numberOfWheels,pricePerHour);
    }

    @Override
    public void deleteSpot(int spotId) {
   parkingLotService.deleteSpot(spotId);
    }

    @Override
    public Spot updateSpot(int parkingLotId, int spotId, int pricePerHour) {
return parkingLotService.updateSpot(parkingLotId,spotId,pricePerHour);
    }

    @Override
    public void deleteParkingLot(int parkingLotId) {
   parkingLotService.deleteParkingLot(parkingLotId);
    }
}
