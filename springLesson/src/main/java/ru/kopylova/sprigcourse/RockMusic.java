package ru.kopylova.sprigcourse;

import org.springframework.stereotype.Component;

@Component("someRockMusic")

public class RockMusic implements Music{

    @Override
    public String getSong() {
        return "Durak i molniya";
    }
}
