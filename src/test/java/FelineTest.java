import com.example.Feline;

import java.util.List;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FelineTest {
    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensConstCountTest() {
        Feline feline = new Feline();
        int expectedKittensConstCount = 1;
        int actualKittensConstCount = feline.getKittens();
        assertEquals(expectedKittensConstCount, actualKittensConstCount);
    }

    @Test
    public void getKittensChangeCountTest() {
        Feline feline = new Feline();
        int expectedKittensChangeCount = 11;
        int actualKittensChangeCount = feline.getKittens(11);
        assertEquals(expectedKittensChangeCount, actualKittensChangeCount);
    }
}