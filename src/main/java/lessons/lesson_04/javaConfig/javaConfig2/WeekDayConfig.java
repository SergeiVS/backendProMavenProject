package org.javaConfig.javaConfig2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Configuration
public class WeekDayConfig {

    @Bean
    public WeekDay getDay(){

        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();

        return switch (dayOfWeek) {
            case MONDAY -> new Monday();
            case TUESDAY -> new Tuesday();
            case WEDNESDAY -> new Wednesday();
            case THURSDAY -> new Thursday();
            case FRIDAY -> new Friday();
            case SATURDAY -> new Saturday();
            default -> new Sunday();
        };
    }
}
