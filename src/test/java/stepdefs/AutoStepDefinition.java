package stepdefs;

import java.util.List;
import java.util.Map;

import com.geico.base.BaseClass;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoStepDefinition extends BaseClass {

	@When("click on login button it will open another popup login button")
	public void click_on_login_button_it_will_open_another_popup_login_button() {
		homePage.clickLoginBtn();
	}

	@When("click on the login button")
	public void click_on_the_login_button() {
		homePage.clickSecondLoginBtn();
	}

	@When("click on {string}")
	public void click_on(String string) {
		homePage.clickSingInBtn();
	}

	@When("input your policy number {string}")
	public void input_your_policy_number(String string) {
		homePage.inputPolicy("1012457854");
	}

	@When("input your date of birth {string}")
	public void input_your_date_of_birth(String string) {
		homePage.clickInsertDobBtn("01/01/1985");
	}

	@When("input the zipcode {string}")
	public void input_the_zipcode(String string) {
		homePage.mailInZipCode("11432");
	}

	@When("clear zipcode")
	public void clear_zipcode() {
		homePage.clearZipCode();
	}

	@When("input zipcode inside mailing zipcode box'{int}'")
	public void inputZipcodeInsideMailingZipcodeBox(Integer int1) {
		homePage.mailInZipCode("11432");
	}
	
	@When("verify the length of the zip code'{int}'")
	public void verifyTheLengthOfTheZipCode(Integer int1) {
		homePage.verifyLength("5");
	}


@When("input zipcode inside mailing zipcode box {string}")
public void inputZipcodeInsideMailingZipcodeBox(String string) {
	homePage.mailInZipCode("11432");
}

@When("verify the length of the zip code {string}")
public void verifyTheLengthOfTheZipCode(String string) {
	homePage.verifyLength(string);
}


	

	@When("input zipcode inside mailing zipcode box <zipCode>")
	public void input_zipcode_inside_mailing_zipcode_box(DataTable table) {
		List<String> zipCodes = table.asList();
		for (String zipCode : zipCodes) {
			homePage.mailInZipCode(zipCode);
		}

	}

	@When("verify the length of the zip code <length>")
	public void verify_the_length_of_the_zip_code(DataTable table) {
		Map<String, String> map = table.asMap();
		for (String key : map.keySet()) {
			homePage.verifyLength(map.get(key));

		}
	}

@Then("verify zipcode length is {string}")
public void verifyZipcodeLengthIs(String string) {
	homePage.verifyLength(string);
}
	

	@When("click on the continue button")
	public void click_on_the_continue_button() {
		homePage.clickContinueBtn();
	}

	@Then("verify the error message {string}")
	public void verify_the_error_message(String string) {
		homePage.eorrorMsgVerify("The information you entered does not match our system. Please try again.");

	}

}
