package com.kodilla.stream.forum.world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        //Given
        Country czechia = new Country("Czechia", new BigDecimal(10000000));//10
        Country spain = new Country("Spain", new BigDecimal(39000000)); // 39
        Country sweden = new Country("Sweden", new BigDecimal(10000000)); //10

        Continent europa = new Continent();
        europa.addCountry(czechia);
        europa.addCountry(spain);
        europa.addCountry(sweden);

        Country vietnam = new Country("Vietnam", new BigDecimal(100000000)); //100
        Country japan = new Country("japan", new BigDecimal(150000000)); // 150
        Country korea = new Country("South Korea", new BigDecimal(50000000)); // 50

        Continent asia = new Continent();
        asia.addCountry(vietnam);
        asia.addCountry(japan);
        asia.addCountry(korea);

        Country usa = new Country("USA", new BigDecimal(330000000)); //330
        Country mexico = new Country("Mexico", new BigDecimal(150000000)); //150
        Country brazil = new Country("Brazil", new BigDecimal(200000000)); // 200

        Continent america = new Continent();
        america.addCountry(usa);
        america.addCountry(mexico);
        america.addCountry(brazil);

        //When

        World world = new World();
        world.addContinent(europa);
        world.addContinent(asia);
        world.addContinent(america);

        BigDecimal expected = new BigDecimal(1039000000);
        BigDecimal result = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(expected,result);
    }
}
