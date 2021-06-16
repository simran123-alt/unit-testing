package com.in28minutes.unittesting.unittesting.business;

import com.in28minutes.unittesting.unittesting.data.SomeDataService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import  static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//@RunWith(MockitoJUnitRunner.class)    ->this is for JUnit4
@ExtendWith(MockitoExtension.class)
public class SomeBusinessMockTest {

    @InjectMocks
    SomeBusinessImpl business;
    @Mock
    SomeDataService dataServiceMock;
    /*
    SomeBusinessImpl business=new SomeBusinessImpl();
    SomeDataService dataServiceMock = mock(SomeDataService.class);

    @BeforeEach
    public void before(){
        business.setSomeDataService(dataServiceMock);
    }
     */


    @Test
    public void calculateSum_basic() {
//        SomeBusinessImpl business=new SomeBusinessImpl();
//        SomeDataService dataServiceMock = mock(SomeDataService.class);
        //dataServiceMock retrieveAllData() new int[]{1,2,3}
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1,2,3});
        business.setSomeDataService(dataServiceMock);
//        int actualResult=business.calculateSumUsingDataService();
//        int expectedResult=6;
//        assertEquals(expectedResult,actualResult);
        assertEquals(6,business.calculateSumUsingDataService());
    }

    @Test
    public void calculateSumUsingDataService_empty() {
//        SomeBusinessImpl business=new SomeBusinessImpl();
//        SomeDataService dataServiceMock = mock(SomeDataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        business.setSomeDataService(dataServiceMock);
//        int actualResult=business.calculateSumUsingDataService();
//        int expectedResult=0;
//        assertEquals(expectedResult,actualResult);
        assertEquals(0,business.calculateSumUsingDataService());
    }

    @Test
    public void calculateSumUsingDataService_oneValue() {
//        SomeBusinessImpl business=new SomeBusinessImpl();
//        SomeDataService dataServiceMock = mock(SomeDataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{5});
        business.setSomeDataService(dataServiceMock);
//        int actualResult=business.calculateSumUsingDataService();
//        int expectedResult=5;
//        assertEquals(expectedResult,actualResult);
        assertEquals(5,business.calculateSumUsingDataService());
    }
}
