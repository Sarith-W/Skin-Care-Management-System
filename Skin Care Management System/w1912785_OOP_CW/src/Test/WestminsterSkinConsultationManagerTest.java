package Test;

import Console.WestminsterSkinConsultationManager;

import static org.junit.jupiter.api.Assertions.*;

class WestminsterSkinConsultationManagerTest {
    WestminsterSkinConsultationManager obj = new WestminsterSkinConsultationManager();

    //--------------------------------Testing the validation of the first and last name of the doctor-------------------
    @org.junit.jupiter.api.Test
    void correctNameValidate() {
        assertEquals("sarith",obj.nameValidate("sarith"));
    }

    @org.junit.jupiter.api.Test
    void emptyNameValidate() {
        assertEquals("Invalid",obj.nameValidate(""));
    }

    @org.junit.jupiter.api.Test
    void nameWithNumbersValidate() {
        assertEquals("Invalid",obj.nameValidate("sarith123"));
    }

    @org.junit.jupiter.api.Test
    void nameWithSpecialCharacterValidate() {
        assertEquals("Invalid",obj.nameValidate("sarith@#$"));
    }

    @org.junit.jupiter.api.Test
    void backToMenuFromNameValidate() {
        assertEquals("Redirecting back to the menu...",obj.nameValidate("X"));
    }



    //--------------------------------Testing the validation of the DOB of the doctor-----------------------------------
    @org.junit.jupiter.api.Test
    void correctDateValidate() {
        assertEquals("2000-01-01",obj.dobValidate("2000-01-01"));
    }

    @org.junit.jupiter.api.Test
    void emptyDateValidate() {
        assertEquals("Invalid Format",obj.dobValidate(""));
    }

    @org.junit.jupiter.api.Test
    void dateWithNumbersAndSpecialCharactersValidate() {
        assertEquals("Invalid Format",obj.dobValidate("2000-:@#"));
    }

    @org.junit.jupiter.api.Test
    void dateWithLettersValidate() {
        assertEquals("Invalid Format",obj.dobValidate("letters"));
    }

    @org.junit.jupiter.api.Test
    void dateWithImproperFormatValidate() {
        assertEquals("Invalid Format",obj.dobValidate("01-01-2000"));
    }

    @org.junit.jupiter.api.Test
    void dateWithNonExistingDateValidate() {
        assertEquals("Invalid Format",obj.dobValidate("2000-02-30"));
    }

    @org.junit.jupiter.api.Test
    void ageIsLessThan21Validate() {
        assertEquals("Invalid Age",obj.dobValidate("2004-08-18"));
    }

    @org.junit.jupiter.api.Test
    void ageIsGreaterThan60Validate() {
        assertEquals("Invalid Age",obj.dobValidate("1950-08-18"));
    }

    @org.junit.jupiter.api.Test
    void backToMenuFromDobValidate() {
        assertEquals("Redirecting back to the menu...",obj.dobValidate("X"));
    }



    //--------------------------------Testing the validation of the mobile number of the doctor-------------------------
    @org.junit.jupiter.api.Test
    void correctMobileNoValidate() {
        assertEquals("0713848627",obj.mobileNoValidate("0713848627"));
    }

    @org.junit.jupiter.api.Test
    void emptyMobileNoValidate() {
        assertEquals("Invalid Length",obj.mobileNoValidate(""));
    }

    @org.junit.jupiter.api.Test
    void lengthIsLessThan10Validate() {
        assertEquals("Invalid Length",obj.mobileNoValidate("12345"));
    }

    @org.junit.jupiter.api.Test
    void lengthIsGreaterThan10Validate() {
        assertEquals("Invalid Length",obj.mobileNoValidate("12345678910"));
    }

    @org.junit.jupiter.api.Test
    void mobileNoWithLettersValidate() {
        assertEquals("Invalid Input",obj.mobileNoValidate("12345hja"));
    }

    @org.junit.jupiter.api.Test
    void mobileNoWithSpecialCharactersValidate() {
        assertEquals("Invalid Input",obj.mobileNoValidate("12345@#$"));
    }

    @org.junit.jupiter.api.Test
    void backToMenuFromMobileNoValidate() {
        assertEquals("Redirecting back to the menu...",obj.mobileNoValidate("X"));
    }



    //----------------------------Testing the validation of the medical license number of the doctor--------------------
    @org.junit.jupiter.api.Test
    void correctMedLiceNoValidate() {
        assertEquals("1234",obj.medLiceNoValidate("1234"));
    }

    @org.junit.jupiter.api.Test
    void emptyMedLiceNoValidate() {
        assertEquals("Invalid",obj.medLiceNoValidate(""));
    }

    @org.junit.jupiter.api.Test
    void medLiceNoWithLettersValidate() {
        assertEquals("Invalid",obj.medLiceNoValidate("123hjasd"));
    }

    @org.junit.jupiter.api.Test
    void medLiceNoWithSpecialCharactersValidate() {
        assertEquals("Invalid",obj.medLiceNoValidate("123@#$"));
    }

    @org.junit.jupiter.api.Test
    void backToMenuFromMedLiceNoValidate() {
        assertEquals("Redirecting back to the menu...",obj.medLiceNoValidate("X"));
    }



    //----------------------------Testing the validation of the specialization of the doctor----------------------------
    @org.junit.jupiter.api.Test
    void correctSpecializationValidate() {
        assertEquals("Skin-1",obj.specializationValidate("Skin-1"));
    }

    @org.junit.jupiter.api.Test
    void emptySpecializationValidate() {
        assertEquals("Invalid",obj.specializationValidate(""));
    }

    @org.junit.jupiter.api.Test
    void backToMenuFromSpecializationValidate() {
        assertEquals("Redirecting back to the menu...",obj.specializationValidate("X"));
    }
}