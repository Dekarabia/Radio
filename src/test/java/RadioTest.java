import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {

    Radio radio = new Radio();

    @Test
    public void setInstallingARadioStation() {
        radio.setInstallingARadioStation(0);

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
    }

    @Test
    public void setInstallingARadioStation1() {
        radio.setInstallingARadioStation(10);

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
    }

    @Test
    public void setInstallingARadioStation2() {
        radio.setInstallingARadioStation(-1);

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
    }


    @Test
    public void next() {
        radio.setInstallingARadioStation(1);
        radio.next();

        Assertions.assertEquals(1, radio.getCurrentRadioStation());
        Assertions.assertEquals(2, radio.getMaxStation());
        Assertions.assertEquals(1, radio.getMinStation());
    }

    @Test
    public void next1() {
        radio.setInstallingARadioStation(10);
        radio.next();

        Assertions.assertEquals(0, radio.getMaxStation());
        Assertions.assertEquals(1, radio.getMinStation());
    }

    @Test
    public void prev() {

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void Volume() {

        Assertions.assertEquals(0, radio.getVolume());
        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
    }


    @Test
    public void increaseVolume() {

        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void decreaseVolume() {

        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(0, radio.getMinVolume());
    }

}

