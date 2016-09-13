package com.example.sirenko.tourguide;

import org.jetbrains.annotations.NotNull;

public class Place {

    public final @NotNull String name;
    public final @NotNull String description;
    public final @NotNull String workingHours;
    public final @NotNull String address;
    public final @NotNull String website;
    public final @NotNull String phone;

    public Place(
            @NotNull String name,
            @NotNull String description,
            @NotNull String workingHours,
            @NotNull String address,
            @NotNull String website,
            @NotNull String phone) {
        this.name = name;
        this.description = description;
        this.workingHours = workingHours;
        this.address = address;
        this.website = website;
        this.phone = phone;
    }
}
