package com.example.sirenko.tourguide;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Place {

    public final @NotNull String name;
    public final @Nullable String description;
    public final @NotNull String workingHours;
    public final int averageBillVND;
    public final int imageResourceId;
    public final @NotNull String address;
    public final @NotNull String website;
    public final @NotNull String phone;
    public final @Nullable String emergencyPhone;

    public static Place restaurant(
            @NotNull String name,
            @NotNull String description,
            @NotNull String workingHours,
            int averageBillVND,
            @NotNull String address,
            @NotNull String website,
            @NotNull String phone) {
        return new Place(name, description, workingHours, averageBillVND, -1, address, website, phone, null);
    }

    public static Place museum(
            @NotNull String name,
            @NotNull String workingHours,
            @NotNull String address,
            @NotNull String website,
            @NotNull String phone) {
        return new Place(name, null, workingHours, -1, -1, address, website, phone, null);
    }

    public static Place cinema(
            @NotNull String name,
            @NotNull String workingHours,
            @NotNull String address,
            @NotNull String website,
            @NotNull String phone) {
        return new Place(name, null, workingHours, -1, -1, address, website, phone, null);
    }

    public static Place hospital(
            @NotNull String name,
            @NotNull String description,
            @NotNull String workingHours,
            @NotNull String address,
            @NotNull String website,
            @NotNull String phone,
            @NotNull String emergencyPhone,
            int imageResourceId) {
        return new Place(name, description, workingHours, -1, imageResourceId, address, website, phone, emergencyPhone);
    }

    private Place(
            @NotNull String name,
            @Nullable String description,
            @NotNull String workingHours,
            int averageBillVND,
            int imageResourceId,
            @NotNull String address,
            @NotNull String website,
            @NotNull String phone,
            @Nullable String emergencyPhone) {
        this.name = name;
        this.description = description;
        this.workingHours = workingHours;
        this.averageBillVND = averageBillVND;
        this.imageResourceId = imageResourceId;
        this.address = address;
        this.website = website;
        this.phone = phone;
        this.emergencyPhone = emergencyPhone;
    }
}
