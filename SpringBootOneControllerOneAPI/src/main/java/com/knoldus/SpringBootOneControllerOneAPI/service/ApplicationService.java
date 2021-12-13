package com.knoldus.SpringBootOneControllerOneAPI.service;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ApplicationService {
    public static final long currentTimeMillis= System.currentTimeMillis();
    public String getTime()
    {
        // Convert the milliseconds into a
        // java.util.Date object.
        Date instant = new Date( currentTimeMillis );

        // Set up a simple date format, to give the view
        // of the date object that we want.
        SimpleDateFormat sdf = new SimpleDateFormat( "HH:mm aa" );

        // Define the String, time, to be our formatted
        String time = sdf.format( instant );
        return "Running "+time;
    }
}
