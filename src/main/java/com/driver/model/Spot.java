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
    @Enumerated(EnumType.STRING)
   private SpotType spotType;
  private    int pricePerHour;
  private boolean occupied;

    public Spot() {
    }
    public Spot(int id){
        this.id=id;
    }

    public Spot( int priceForHour, boolean occupied) {
        this.spotType = spotType;
        this.pricePerHour = priceForHour;
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



    public int getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(int pricePerHour) {
        this.pricePerHour = pricePerHour;
    }


    public boolean getOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
