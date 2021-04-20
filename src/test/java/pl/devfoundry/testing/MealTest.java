package pl.devfoundry.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MealTest {

    @Test
    void shouldReturnDiscountedPrice() {
        //given
        Meal meal = new Meal(35);

        //when
        int discountedPrice = meal.getDiscountedPrice(7);

        //then
        assertEquals(28,discountedPrice);
    }
    @Test
    void referencesToTheSameObjectShouldBeEqual(){
        //given
        Meal meal1 = new Meal(10);
        Meal meal2 = meal1;

        //then
        assertSame(meal1,meal2);
    }

    @Test
    void referencesToDiffrentObjectShouldNotBeEqual(){
        //given
        Meal meal1 = new Meal(10);
        Meal meal2 = new Meal(15);

        //then
        assertNotSame(meal1,meal2);
    }

    @Test
    void twoMealsShouldBeEqualWhenPriceAndNameIsTheSame(){
        //given
        //when
        Meal meal1 = new Meal(35, "Burger");
        Meal meal2 = new Meal(35,"Burger");

        //then
        assertEquals(meal1,meal2);
    }
}