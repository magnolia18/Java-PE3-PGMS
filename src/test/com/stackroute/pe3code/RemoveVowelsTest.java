package com.stackroute.pe3code;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
        RemoveVowels obj;

        @Before
        public void setUp() {
            System.out.println("Before");
            obj = new RemoveVowels();
        }

        @After
        public void tearDown() {
            System.out.println("After");
            obj = null;
        }

        @Before
        public void setUpBeforeClass() {
            System.out.println("BeforeClass");

        }

        @After
        public void tearDownAfterClass() {
            System.out.println("AfterClass");

        }

        @Test
        public void givenAStringShouldRemoveVowelsExceptFirst(){
            //Act

            String[] str = {"England"};
            //Assert
            assertEquals("", "Englnd", obj.removeVowelFromStringsExceptFirst(str));

        }
        @Test
        public void givenAStringShouldRemovevowels() {
            //Act

            String[] str = {"Mexico,Westindies"};
            //Assert
            assertEquals("", "Mxc,Wstnds", obj.removeVowelFromStrings(str));

        }
    }
