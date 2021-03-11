package ru.netology.Domain.constructor;

import org.junit.jupiter.api.Test;
import ru.netology.domain.constructor.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void shouldUpStation() {
        Radio radio = new Radio(9,100);
        radio.changeNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldUpStationMiddle(){
        Radio radio = new Radio(5,100);
        radio.changeNextStation();
        assertEquals(6,radio.getCurrentStation());
    }

    @Test
    void shouldDownStation() {
        Radio radio = new Radio(0,100);
        radio.changePrevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldDownStationMiddle(){
        Radio radio = new Radio(7,100);
        radio.changePrevStation();
        assertEquals(6,radio.getCurrentStation());
    }

    @Test
    void shouldVolumeUp() {
        Radio radio = new Radio(0,100);
        radio.volumeUp();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeUpMiddle(){
        Radio radio = new Radio(0,3);
        radio.volumeUp();
        assertEquals(4,radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeDown() {
        Radio radio = new Radio(0,0);
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeDownUpMiddle(){
        Radio radio = new Radio(0,6);
        radio.volumeDown();
        assertEquals(5,radio.getCurrentVolume());
    }
}
