/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.unaeropuertoclient.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Roberth :)
 */
public class DateConverter {

    public static String toSpringDate(LocalDate fecha) {
        Date date = Date.from(fecha.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        sdf.applyPattern("yyyy-MM-dd");
        String newDateString = sdf.format(date);
        return newDateString;
    }

    public static String toSpringDateTime(LocalDateTime fecha) {
        Date date = Date.from(fecha.atZone(ZoneId.systemDefault()).toInstant());
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
        String newDateString = sdf.format(date);
        return newDateString;
    }

    public static LocalDateTime toLocalDateTime(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(fecha, formatter);
        return dateTime;
    }

    public static LocalDate toLocalDate(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(fecha, formatter);
        return date;
    }
}
