package Stepdefinition;

import java.io.IOException;

import com.Maven_Project.Baseclass;
import com.Page_Object_Manager.Page_Object_Manager_Class;
import com.Property_File.Input_Instance;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_definition extends Baseclass{

private static Page_Object_Manager_Class pom = new Page_Object_Manager_Class(driver);	
	
	@Before
	public void beforeHooks(Scenario s) {
			String name = s.getName();
			System.out.println("Scenario Name: "+name);

	}

	@After
	public void afterHooks(Scenario s) throws IOException {
		Status status = s.getStatus();
		System.out.println("Scenario Status:" +status);
		if (s.isFailed()) {
			takescreenshot("C:\\Users\\USER\\eclipse-workspace\\Maven_Project\\Screenshot\\FailedScenario.png");
		}

	}
	@Given("^user Should Launch The Url$")
	public void user_Should_Launch_The_Url() throws Throwable {
		urllaunch(Input_Instance.getInstanceInput().geturl());
		implicitwait(10);
	}
	
	@When("user Should Enter {string} In Username Field")
	public void user_should_enter_in_username_field(String username) {
		passinput(pom.getLp().getUsername(),username);
	}

	@When("user Should Enter {string} In Password Field")
	public void user_should_enter_in_password_field(String password) {
		passinput(pom.getLp().getPassword(),password);	
	}	

	@Then("user Should Click LoginButton To Navigate To Search Hotel Page")
	public void user_should_click_login_button_to_navigate_to_search_hotel_page() {
		clickonelement(pom.getLp().getLoginbtn());
	}		

	@When("user Should Select Location From Location Dropdown")
	public void user_should_select_location_from_location_dropdown() throws IOException {
		selectbyvalue(pom.getSh().getLctn(),Input_Instance.getInstanceInput().getLctn());
	}

	@When("user Will Select Hotel From Hotel Dropdown")
	public void user_will_select_hotel_from_hotel_dropdown() throws IOException {
		selectbyvalue(pom.getSh().getHtl(),Input_Instance.getInstanceInput().getHtl());	
	}

	@When("user Will Select Room Type From Room Type Dropdown")
	public void user_will_select_room_type_from_room_type_dropdown() throws IOException {
		selectbyvalue(pom.getSh().getRmtype(),Input_Instance.getInstanceInput().getRmtype());
	}

	@When("user Should Select Number Of Rooms From Number Of Rooms Dropdown")
	public void user_should_select_number_of_rooms_from_number_of_rooms_dropdown() throws IOException {
		selectbyvalue(pom.getSh().getRmno(),Input_Instance.getInstanceInput().getRmno());	
	}

	@When("user Should Enter The Check In Date In Check In Date Field")
	public void user_should_enter_the_check_in_date_in_check_in_date_field() throws IOException {
		clear(pom.getSh().getChckindate());		
		passinput(pom.getSh().getChckindate(),Input_Instance.getInstanceInput().getChckindate());
	}

	@When("user Should Enter The Check Out Date In Check Out Date Field")
	public void user_should_enter_the_check_out_date_in_check_out_date_field() throws IOException {
		clear(pom.getSh().getChckoutdate());		
		passinput(pom.getSh().getChckoutdate(),Input_Instance.getInstanceInput().getChckoutdate());	
	}

	@When("user Should Select Adults Per Room In Adults Per Room Dropdown")
	public void user_should_select_adults_per_room_in_adults_per_room_dropdown() throws IOException {
		selectbyvalue(pom.getSh().getAdltrm(),Input_Instance.getInstanceInput().getAdltrm());
	}

	@When("user will Select Children Per Room In Children Per Room Dropdown")
	public void user_will_select_children_per_room_in_children_per_room_dropdown() throws IOException {
		selectbyvalue(pom.getSh().getChldrm(),Input_Instance.getInstanceInput().getChldrm());		
	}	
	
	@Then("user Should Click SearchButton To Navigate To Select Hotel Page")
	public void user_should_click_search_button_to_navigate_to_select_hotel_page() {
		clickonelement(pom.getSh().getSbmtbtn());
	}	
	
	@When("user Must Select The Hotel Using RadioButton")
	public void user_must_select_the_hotel_using_radio_button() {
		clickonelement(pom.getHtl().getRdbtn());
	}
	
	@Then("user Must Click ContinueButton To Navigate To Book Hotel page")
	public void user_must_click_continue_button_to_navigate_to_book_hotel_page() {
		clickonelement(pom.getHtl().getCntnbtn());
	}
	
	@When("user Must Enter First Name In First Name Field")
	public void user_must_enter_first_name_in_first_name_field() throws IOException {
		passinput(pom.getBh().getFrstname(),Input_Instance.getInstanceInput().getFrstname());	
	}

	@When("user Must Enter Last Name In Last Name Field")
	public void user_must_enter_last_name_in_last_name_field() throws IOException {
		passinput(pom.getBh().getLstname(),Input_Instance.getInstanceInput().getLstname());
	}

	@When("user Must Enter Address In Billing Address Field")
	public void user_must_enter_address_in_billing_address_field() throws IOException {
		passinput(pom.getBh().getAddrs(),Input_Instance.getInstanceInput().getAddrs());	
	}

	@When("user Must Enter Credit Card Number In Credit Card Number Field")
	public void user_must_enter_credit_card_number_in_credit_card_number_field() throws IOException {
		passinput(pom.getBh().getCcnum(),Input_Instance.getInstanceInput().getCcnum());	
	}

	@When("user Must Select Credit Card Type In Credit Card Type Dropdown")
	public void user_must_select_credit_card_type_in_credit_card_type_dropdown() throws IOException {
		selectbyvalue(pom.getBh().getCctype(),Input_Instance.getInstanceInput().getCctype());
	}

	@When("user Must Select Expiry Month In Expiry Date Field Using Expiry Month Dropdown")
	public void user_must_select_expiry_month_in_expiry_date_field_using_expiry_month_dropdown() throws IOException {
		selectbyvalue(pom.getBh().getExpmnth(),Input_Instance.getInstanceInput().getExpmnth());	
	}

	@When("user Must Select Expiry Year In Expiry Date Field Using Expiry Year Dropdown")
	public void user_must_select_expiry_year_in_expiry_date_field_using_expiry_year_dropdown() throws IOException {
		selectbyvalue(pom.getBh().getExpyr(),Input_Instance.getInstanceInput().getExpyr());	
	}

	@When("user Must Enter Cvv Number In Cvv Number Field")
	public void user_must_enter_cvv_number_in_cvv_number_field() throws IOException {
		passinput(pom.getBh().getCvv(),Input_Instance.getInstanceInput().getCvv());
	}

	@Then("user Must Click BookNowButton To Navigate To Booking Confirmation Page")
	public void user_must_click_book_now_button_to_navigate_to_booking_confirmation_page() {
		clickonelement(pom.getBh().getBknwbtn());
	}

	@When("screenshot Will Be Taken")
	public void screenshot_will_be_taken() throws IOException {
		takescreenshot("C:\\Users\\USER\\eclipse-workspace\\Maven_Project\\Screenshot\\Booking Confirmation.png");
	}

	@Then("user Should Click My ItineraryButton To Navigate To Booked Itinerary Page")
	public void user_should_click_my_itinerary_button_to_navigate_to_booked_itinerary_page() {
		clickonelement(pom.getBc().getMyitnrybtn());
	}
	
	@When("screenshot Will Be Taken In Booked Itinerary Page")
	public void screenshot_will_be_taken_in_booked_itinerary_page() throws IOException {
		takescreenshot("C:\\Users\\USER\\eclipse-workspace\\Maven_Project\\Screenshot\\MyItenary.png");
	}
}
