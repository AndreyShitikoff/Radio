package ru.netology.Domain.constructor;

import org.junit.jupiter.api.Test;
import ru.netology.domain.constructor.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void shouldUpStation() {
        Radio radio = new Radio("name", 10, 0, 9,true, 100, 0,100);
        radio.changeNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldUpStationMiddle(){
        Radio radio = new Radio("name", 10, 0, 5, true, 100, 0, 100);
        radio.changeNextStation();
        assertEquals(6,radio.getCurrentStation());
    }

    @Test
    void shouldDownStation() {
        Radio radio = new Radio("name", 10, 0, 0, true, 100, 0, 100);
        radio.changePrevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldDownStationMiddle(){
        Radio radio = new Radio("name", 10, 0, 7, true, 100, 0, 100);
        radio.changePrevStation();
        assertEquals(6,radio.getCurrentStation());
    }

    @Test
    void shouldVolumeUp() {
        Radio radio = new Radio("name", 10, 0, 9,true, 100, 0,100);
        radio.volumeUp();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeUpMiddle(){
        Radio radio = new Radio("name", 10, 0, 9,true, 100, 0,55);
        radio.volumeUp();
        assertEquals(56,radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeDown() {
        Radio radio = new Radio("name", 10, 0, 9,true, 100, 0,0);
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeDownUpMiddle(){
        Radio radio = new Radio("name", 10, 0, 9,true, 100, 0,38);
        radio.volumeDown();
        assertEquals(37,radio.getCurrentVolume());
    }
}
