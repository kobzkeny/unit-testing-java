package pl.devfoundry.testing;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void testAssertArrayEquals(){
        //given
        int[] ints1 = {1,2,3};
        int[] ints2 = {1,2,3};

        //then
        assertArrayEquals(ints1,ints2);
    }

    @Test
    void mealListShouldBeEmptyAfterCreationOfOrder(){
        //given
        Order order = new Order();

        //then
        assertThat(order.getMeals(), empty());

    }
    @Test
    void addingMealToOrderShouldIncraseOrderSize(){
        //given
        Meal meal = new Meal(15,"Burger");
        Order order = new Order();
        //when
        order.addMealToOrder(meal);

        //then
        assertThat(order.getMeals(), hasSize(1));


    }



}