package br.com.meiguins.desafiotodolist;

import br.com.meiguins.desafiotodolist.entity.Todo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DesafioTodolistApplicationTests {
	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testCreateTodoFailure() {
		webTestClient
				.post()
				.uri("/todos")
				.bodyValue(
						new Todo("","", false, 1))
				.exchange()
				.expectStatus().isBadRequest();
	}

}
