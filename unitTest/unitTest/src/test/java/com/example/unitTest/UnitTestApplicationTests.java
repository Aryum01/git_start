package com.example.unitTest;

import com.example.unitTest.entities.UserEntities;
import com.example.unitTest.repository.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class UnitTestApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@Autowired
	private UserRepository userRepository;

	@Test
	public void testCreateUser() throws Exception {
		UserEntities user = new UserEntities();
		user.setUsername("danilo ");
		user.setEmail("danilo@example.com");

		mockMvc.perform(post("/users/createuser")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(user)))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.id").exists())
				.andExpect(jsonPath("$.username").value("danilo"))
				.andExpect(jsonPath("$.email").value("danilo@example.com"));
	}

	@Test
	public void testGetUserById() throws Exception {
		UserEntities user = new UserEntities();
		user.setUsername("danilo");
		user.setEmail("danilo@example.com");
		user = userRepository.save(user);

		mockMvc.perform(get("/users/getuserbyid/{id}", user.getId()))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(user.getId()))
				.andExpect(jsonPath("$.username").value("danilo"))
				.andExpect(jsonPath("$.email").value("danilo@example.com"));
	}

	@Test
	public void testUpdateUser() throws Exception {
		UserEntities user = new UserEntities();
		user.setUsername("danilo");
		user.setEmail("danilo@example.com");
		user = userRepository.save(user);

		UserEntities updatedUser = new UserEntities();
		updatedUser.setUsername("piero");
		updatedUser.setEmail("piero@example.com");

		mockMvc.perform(put("/users/update/{id}", user.getId())
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(updatedUser)))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(user.getId()))
				.andExpect(jsonPath("$.username").value("piero"))
				.andExpect(jsonPath("$.email").value("piero@example.com"));
	}

	@Test
	public void testDeleteUser() throws Exception {
		UserEntities user = new UserEntities();
		user.setUsername("danilo");
		user.setEmail("danilo@example.com");
		user = userRepository.save(user);

		mockMvc.perform(delete("/users/delete/{id}", user.getId()))
				.andExpect(status().isOk());

		mockMvc.perform(get("/users/getuserbyid/{id}", user.getId()))
				.andExpect(status().isNotFound());
	}
}