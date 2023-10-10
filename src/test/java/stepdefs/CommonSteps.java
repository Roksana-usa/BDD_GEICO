package stepdefs;

import java.util.Map;

import com.geico.base.BaseClass;
import com.geico.loggers.Loggers;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonSteps extends BaseClass {
	@Given("homepage title is {string}")
	public void homepage_title_is(String string) {
		homePage.titleText("The Insurance Savings You Expect");
	}

	@Given("verify subtitle {string}")
	public void verify_subtitle(String string) {
		homePage.subTitleTest("See how much you could save! Let's get started by entering your ZIP Code:");
	}

	@When("type in search field {string}")
	public void type_in_search_field(String string) {
		homePage.typeInSearchField("auto");
	}

	@Given("print <msg>")
	public void printMsg(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.

		Map<String, String> map = dataTable.asMap();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			Loggers.log(entry.getKey());
		}
	}
}