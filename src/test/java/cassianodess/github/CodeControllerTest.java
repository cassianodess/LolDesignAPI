package cassianodess.github;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class CodeControllerTest {

	@Autowired
	private MockMvc mock;

	@Test
	public void findAllCodesTest() {
		try {
			URI uri = new URI("/api/codes");
			mock.perform(MockMvcRequestBuilders.get(uri))
			.andDo(print())
			.andExpect(MockMvcResultMatchers.status().is(200));
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Test
	public void checkIfHasParams() {
		try {
			URI uri = new URI("/api/codes/retrieve");
			mock.perform(MockMvcRequestBuilders.get(uri))
			.andDo(print())
			.andExpect(MockMvcResultMatchers.status().is(400));
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
