package com.in28minutes.unittesting.unittesting.data;

import com.in28minutes.unittesting.unittesting.model.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ItemRepositoryTest {

    @Autowired
    private ItemRepository repository;

    @Test
    public void testFindAll(){
        List<Item> items=repository.findAll();
        assertEquals(3,items.size());
    }

}