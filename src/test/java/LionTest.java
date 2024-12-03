import com.example.Feline;
import com.example.Lion;

import org.junit.Assert;
import java.util.List;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline felineMock;

    @Test
    public void exceptionTest() {
        try {
            Lion lion = new Lion("Гермафродит", felineMock);
        } catch (Exception exception) {
            String textException = "Используйте допустимые значения пола животного - самец или самка";
            Assert.assertEquals(textException, exception.getMessage());
        }
    }

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самка", felineMock);
        Mockito.when(felineMock.getKittens()).thenReturn(1);
        int actualKittensCount = lion.getKittens();
        int expectedKittensCount = 1;
        assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion("Самка", felineMock);
        boolean expectedHaveMane = false;
        boolean actualHaveMane = lion.doesHaveMane();
        assertEquals(actualHaveMane, expectedHaveMane);
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самка", felineMock);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(felineMock.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood);
    }
}