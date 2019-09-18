package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class StringConverterTest {

    private StringConverter stringConverter;

    @Before
    public void setUp(){

    stringConverter=new StringConverter();
        System.out.println("Inside Before");

        //Arrange
        StringConverter stringConverter = new StringConverter();

    }

    @After
    public void tearDown(){

        stringConverter=null;
        System.out.println("Inside After");
    }


    @BeforeClass
    public static void beforeClassSetup(){

        System.out.println("Inside before class setup");

    }


    @AfterClass
    public static void afterClassTearDown(){

        System.out.println("Inside after class teardown");

    }


    @org.junit.Test
    public void concatAndToUpperCase() {

        // Act
        String result=stringConverter.concatAndToUpperCase("hello" , "world") ;

        // Assert
            assertEquals("HELLOWORLD",result);


    }

    @Test
    public void givenANullValueShouldReturnErrorMessage(){

        // Act
        String result=stringConverter.concatAndToUpperCase("hello" , null) ;

        // Assert
        assertEquals("Please enter non null value",result);





    }




}