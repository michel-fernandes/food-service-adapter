package com.food.ordering.system.order.service.domain.valueobjects;

import java.util.Objects;
import java.util.UUID;

public class StreetAddress {
    private final UUID id;
    private final String street;
    private final int number;
    private final String complement;
    private final String neighborhood;
    private final String postalCode;
    private final String city;

    public StreetAddress(UUID id, String street, int number, String complement, String neighborhood,
                         String postalCode, String city) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.postalCode = postalCode;
        this.city = city;
    }

    public UUID getId() {
        return id;
    }
    public String getStreet() {
        return street;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StreetAddress that = (StreetAddress) o;

        if (number != that.number) return false;
        if (!getStreet().equals(that.getStreet())) return false;
        if (!complement.equals(that.complement)) return false;
        if (!neighborhood.equals(that.neighborhood)) return false;
        if (!getPostalCode().equals(that.getPostalCode())) return false;
        return getCity().equals(that.getCity());
    }

    @Override
    public int hashCode() {
        int result = getStreet().hashCode();
        result = 31 * result + number;
        result = 31 * result + complement.hashCode();
        result = 31 * result + neighborhood.hashCode();
        result = 31 * result + getPostalCode().hashCode();
        result = 31 * result + getCity().hashCode();
        return result;
    }
}
