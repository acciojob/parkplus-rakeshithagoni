package com.driver.model;


import net.bytebuddy.asm.Advice;
import org.springframework.boot.test.autoconfigure.data.cassandra.DataCassandraTest;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlInlineBinaryData;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Spot {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private SpotType spotType;
  private    int priceForHour;
  private boolean occupied;

    public Spot() {
    }
    public Spot(int id){
        this.id=id;
    }

    public Spot(int id, SpotType spotType, int priceForHour, boolean occupied) {
        this.id = id;
        this.spotType = spotType;
        this.priceForHour = priceForHour;
        this.occupied = occupied;
    }

    @ManyToOne
    @JoinColumn
    private ParkingLot parkingLot;
//parent class
    @OneToMany(mappedBy = "spot",cascade = CascadeType.ALL)

   private List<Reservation> reservationList=new ArrayList<>();

    public ParkingLot   getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public void setSpotType(SpotType spotType) {
        this.spotType = spotType;
    }

    public int getPriceForHour() {
        return priceForHour;
    }

    public void setPriceForHour(int priceForHour) {
        this.priceForHour = priceForHour;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
