package com.example.sirenko.tourguide;

import org.jetbrains.annotations.NotNull;

public class Place {

    private final @NotNull String name;
    private final @NotNull String description;
    private final @NotNull String workingHours;
    private final @NotNull String address;
    private final @NotNull String website;
    private final @NotNull String phone;

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
