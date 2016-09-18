package com.example.sirenko.tourguide;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ResourceUtils {

    @NotNull
    static String read(@NotNull InputStream is) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new BufferedInputStream(is)))) {
            String content = "";
            String line;
            try {
                while ((line = br.readLine()) != null) {
                    content += line;
                }
            } catch (EOFException ignored) {
            }
            return content;
        }
    }
}