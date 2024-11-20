package com.github.stephanedroz.duration_calculator;

public class DurationCalculator {

    public DurationCalculator() {
    }

    public String convertTime(String time) {
        if (time.contains(":") || time.contains("h")) {
            return convertTimeToHours(time);
        } else if (time.contains(".")) {
            return convertHoursToTime(time);
        }
        return "format not supported";
    }

    private String convertHoursToTime(String time) {
        var parts = time.split("\\.");
        var hours = Long.parseLong(parts[0]);
        var decimal = Long.parseLong(parts[1].length() < 2 ? parts[1] + "0" : parts[1]);
        var minutes = Math.round(decimal / 100f * 60);
        return "%02d:%02d".formatted(hours, minutes);
    }

    private String convertTimeToHours(String time) {
        var parts = time.split("[:h]");
        var hours = Long.parseLong(parts[0]);
        var minutes = Long.parseLong(parts[1]);
        var decimalMinutes = minutes / 60f + hours;
        var converted = keep2DecimalOnly(decimalMinutes);
        return String.valueOf(converted);
    }

    private float keep2DecimalOnly(float value) {
        return ((float) ((int) (value * 100))) / 100;
    }
}
