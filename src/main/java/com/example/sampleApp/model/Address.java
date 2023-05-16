package com.example.sampleApp.model;

public class Address {
    private int addressId;
    private String id;
    private String city;
    private String street_name;
    private String street_address;
    private String zip_code;
    private String state;
    private String country;

    public Address(Address address) {
        this.id = address.id;
        this.city = address.city;
        this.street_name = address.street_name;
        this.street_address = address.street_address;
        this.zip_code = address.zip_code;
        this.state = address.state;
        this.country = address.country;
    }

    public Address() {
    }

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }

    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return city;
    }

    public void setStreetName(String street_name){
        this.street_name = street_name;
    }
    public String getStreetName() {
        return street_name;
    }

    public void setStreetAddress(String street_address){
        this.street_address = street_address;
    }
    public String getStreetAddress(){
        return street_address;
    }

    public void setZipCode(String zip_code){
        this.zip_code = zip_code;
    }
    public String getZipCode(){
        return zip_code;
    }

    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }

    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return country;
    }

}