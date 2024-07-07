package com.epam.designPattern.builderDP;

public class Address {

    private final String addressName;
    private final String addressLine1;
    private final String addressLine2;
    private final String city;
    private final String state;
    private final String zipCode;
    private final String country;


    private Address(AddressBuilder addressBuilder){
        this.addressName=addressBuilder.addressName;
        this.addressLine1=addressBuilder.addressLine1;
        this.state=addressBuilder.state;
        this.city=addressBuilder.city;

        this.addressLine2=addressBuilder.city;
        this.zipCode=addressBuilder.city;
        this.country=addressBuilder.city;

    }
    public static class AddressBuilder{
        private final String addressName;
        private final String addressLine1;
        private final String state;
        private final String city;


        private  String getAddressLine2;
        private  String zipCode;
        private  String country;

        public AddressBuilder(String addressName, String addressLine1, String state, String city) {
            this.addressName = addressName;
            this.addressLine1 = addressLine1;
            this.state = state;
            this.city = city;

        }

        public AddressBuilder setZipCode(String zipCode) {
            this.zipCode=zipCode;
            return this;
        }

        public AddressBuilder setGetAddressLine2(String getAddressLine2) {
            this.getAddressLine2 = getAddressLine2;
            return this;

        }

        public AddressBuilder setCountry(String country) {
            this.country = country;
            return this;

        }
        public Address build(){
            Address address=new Address(this);
            return address;
        }
    }
}
