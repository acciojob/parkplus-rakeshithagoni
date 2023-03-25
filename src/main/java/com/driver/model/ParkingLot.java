package com.driver.model;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ParkingLot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;

    private String name;

    private String address;

    //parent class

    @OneToMany(mappedBy = "parkinglot",cascade = CascadeType.ALL)
   private List<Spot> spots=new ArrayList<>();
    public ParkingLot() {
    }

    public ParkingLot(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public List<Spot> getSpots() {
        return spots;
    }

    public void setSpots(List<Spot> spots) {
        this.spots = spots;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
