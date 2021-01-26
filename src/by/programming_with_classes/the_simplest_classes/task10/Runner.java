package by.programming_with_classes.the_simplest_classes.task10;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Runner {

    public static void main(String[] args) throws ParseException {
        FlightSchedule flightSchedule = new FlightSchedule("Minsk (MSQ)", new ArrayList<Airline>());
        flightSchedule.addAirline("Paris (SXF)", "B2 891", "Boeing 210 RJ-175",
                Airline.ft.parse("12:15"), new DayOfWeek[]{DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY,
                        DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SUNDAY});
        flightSchedule.addAirline("Kiev (ZIA)", "B2 971", "Boeing 737-500",
                Airline.ft.parse("8:15"), new DayOfWeek[]{DayOfWeek.EVERYDAY});
        flightSchedule.addAirline("Kiev (ZIA)", "B2 973", "Boeing 737-300",
                Airline.ft.parse("18:05"), new DayOfWeek[]{DayOfWeek.EVERYDAY});
        flightSchedule.addAirline("Kiev (DME)", "B2 993", "Boeing 737-500",
                Airline.ft.parse("19:45"), new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.TUESDAY,
                        DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY});
        flightSchedule.addAirline("Kiev (SVO)", "SU 1833", "Sukhoi Superjet 100-95",
                Airline.ft.parse("20:30"), new DayOfWeek[]{DayOfWeek.EVERYDAY});
        flightSchedule.addAirline("Kiev (VKO)", "UT 776", "Boeing 737-500",
                Airline.ft.parse("17:55"), new DayOfWeek[]{DayOfWeek.EVERYDAY});
        flightSchedule.addAirline("Riga (CRL)", "B2 817", "Boeing 210 175",
                Airline.ft.parse("8:40"), new DayOfWeek[]{DayOfWeek.WEDNESDAY});
        flightSchedule.addAirline("Riga (CRL)", "B2 817", "Boeing 210 175",
                Airline.ft.parse("9:35"), new DayOfWeek[]{DayOfWeek.THURSDAY, DayOfWeek.SATURDAY});
        flightSchedule.addAirline("Riga (CRL)", "B2 817", "Boeing 210 175",
                Airline.ft.parse("13:00"), new DayOfWeek[]{DayOfWeek.MONDAY});
        flightSchedule.addAirline("Paris (CDG)", "B2 863", "Boeing 210 195",
                Airline.ft.parse("14:50"), new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY,
                        DayOfWeek.FRIDAY, DayOfWeek.SUNDAY});

        System.out.println("The List of flights with destination Riga (CRL):");
        ArrayList<Airline> airlinesToRiga = flightSchedule.airlinesToDestination("Riga (CRL)");
        for (Airline airline : airlinesToRiga) {
            System.out.println(airline);
        }

        System.out.println("\nThe list of flights departing on Sunday:");
        ArrayList<Airline> airlinesOnSunday = flightSchedule.flightDays(DayOfWeek.SUNDAY);
        for (Airline airline : airlinesOnSunday) {
            System.out.println(airline);
        }

        System.out.println("\nThe List of flights departing after 13:00 Tuesday:");
        Date time = Airline.ft.parse("13:00");
        ArrayList<Airline> airlinesOnTuesday = flightSchedule.flightDays(DayOfWeek.MONDAY, time);
        for (Airline airline : airlinesOnTuesday) {
            System.out.println(airline);
        }
    }
}