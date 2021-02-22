package ru.netology.Domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void shouldUpStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.changeNextStation();
        assertEquals(0,radio.getCurrentStation());

        radio.setCurrentStation(5);
        radio.changeNextStation();
        assertEquals(6,radio.getCurrentStation());
    }

    @Test
    void shouldDownStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.changePrevStation();
        assertEquals(9,radio.getCurrentStation());

        radio.setCurrentStation(7);
        radio.changePrevStation();
        assertEquals(6,radio.getCurrentStation());
    }

    @Test
    void shouldVolumeUp(){
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.volumeUp();
        assertEquals(10,radio.getCurrentVolume());

        radio.setCurrentVolume(3);
        radio.volumeUp();
        assertEquals(4,radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeDown(){
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.volumeDown();
        assertEquals(0,radio.getCurrentVolume());

        radio.setCurrentVolume(7);
        radio.volumeDown();
        assertEquals(6,radio.getCurrentVolume());

    }






}
