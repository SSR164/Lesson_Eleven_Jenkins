import org.junit.jupiter.api.Tag;
import page.RegisterPage;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;


public class RegisterWindowsTests extends TestsBase {
    RegisterPage registerPage = new RegisterPage();
    TestData testData =new TestData();


    @Test
    @Tag("demoqa")
    void FullDataTests() {
        step("Open form",()->{
            registerPage.openPage();
            registerPage.cleanBanner();});
        step("Fill form",()->{
            registerPage.setFirstName(testData.firstName);
            registerPage.setLastName(testData.lastName);
            registerPage.setUserEmail(testData.userEmail);
            registerPage.setGenderWrapper(testData.randomGender);
            registerPage.setUserNumber(testData.userPhoneNumberCorrect);
            registerPage.chooseCalendar(testData.randomDay, testData.randomMonth, testData.randomYear);
            registerPage.setSubjects(testData.randomSubjects);
            registerPage.setHobbiesWrapper(testData.randomHobbies);
            registerPage.setCurrentAddress(testData.streetAddress);
            registerPage.setUploadPicture(testData.randomPage);
            registerPage.setState(testData.randomState);
            registerPage.setCity(testData.randomCity);
            registerPage.clickSubmit();});

        step("Verify form",()->{
            registerPage.checkTableResponsive("Student Name", testData.fullName);
            registerPage.checkTableResponsive("Student Email", testData.userEmail);
            registerPage.checkTableResponsive("Gender", testData.randomGender);
            registerPage.checkTableResponsive("Mobile", testData.userPhoneNumberCorrect);
            registerPage.checkTableResponsive("Date of Birth", testData.fullDate);
            registerPage.checkTableResponsive("Subjects", testData.randomSubjects);
            registerPage.checkTableResponsive("Hobbies", testData.randomHobbies);
            registerPage.checkTableResponsive("Picture", testData.randomPage);
            registerPage.checkTableResponsive("Address", testData.streetAddress);
            registerPage.checkTableResponsive("State and City", testData.stateAndCity);});

    }

    @Test
    @Tag("demoqa")
    void NegativeMobileLMinTests() {
        step("Open form",()->{
            registerPage.openPage();
            registerPage.cleanBanner();});
        step("Fill form",()->{
            registerPage.setFirstName(testData.firstName);
            registerPage.setLastName(testData.lastName);
            registerPage.setUserEmail(testData.userEmail);
            registerPage.setGenderWrapper(testData.randomGender);
            registerPage.setUserNumber(testData.userPhoneNumberMin);
            registerPage.chooseCalendar(testData.randomDay, testData.randomMonth, testData.randomYear);
            registerPage.clickSubmit();});
        step("Verify form",()->{
            registerPage.checkTableNotVisible();});
    }
    @Test
    @Tag("demoqa")
    void NegativeMobileLettersTests() {
        step("Open form",()->{
            registerPage.openPage();
            registerPage.cleanBanner();});
        step("Fill form",()->{
            registerPage.setFirstName(testData.firstName);
            registerPage.setLastName(testData.lastName);
            registerPage.setUserEmail(testData.userEmail);
            registerPage.setGenderWrapper(testData.randomGender);
            registerPage.setUserNumber(testData.userPhoneNumberNotCorrect);
            registerPage.chooseCalendar(testData.randomDay, testData.randomMonth, testData.randomYear);
            registerPage.clickSubmit();});
        step("Verify form",()->{
            registerPage.checkTableNotVisible();});
    }


    @Test
    @Tag("demoqa")
    void MinDataTests() {
        step("Open form",()->{
            registerPage.openPage();
            registerPage.cleanBanner();});
        step("Fill form",()->{
            registerPage.setFirstName(testData.firstName);
            registerPage.setLastName(testData.lastName);
            registerPage.setUserEmail(testData.userEmail);
            registerPage.setGenderWrapper(testData.randomGender);
            registerPage.setUserNumber(testData.userPhoneNumberCorrect);
            registerPage.chooseCalendar(testData.randomDay, testData.randomMonth, testData.randomYear);
            registerPage.clickSubmit();});
        step("Verify form",()->{
            registerPage.checkTableResponsive("Student Name", testData.fullName);
            registerPage.checkTableResponsive("Student Email", testData.userEmail);
            registerPage.checkTableResponsive("Gender", testData.randomGender);
            registerPage.checkTableResponsive("Mobile", testData.userPhoneNumberCorrect);
            registerPage.checkTableResponsive("Date of Birth", testData.fullDate);});

    }

}

