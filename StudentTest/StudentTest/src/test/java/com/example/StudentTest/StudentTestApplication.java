package com.example.StudentTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.assertj.core.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

import com.example.StudentTest.controller.StudentController;
import com.example.StudentTest.entities.Student;
import com.example.StudentTest.repositories.StudentRepositories;
import com.example.StudentTest.services.StudentServices;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class StudentTestApplication {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	ObjectMapper objectMapper;

	@Autowired
	private StudentRepositories studentRepository;

	@Autowired
	StudentController studentController;

	@Autowired
	StudentServices studentServices;

	@Test
	public void studentControllerLoad() {
		assertThat(studentController).isNotNull();
	}

	@SuppressWarnings("null")
	@Test
	public void testCreateStudent() throws Exception {

		Student student = new Student();
		student.setName("danilo");
		student.setSurName("scalisi");
		student.setWorking(true);

		this.mockMvc.perform(post("/student/addstudent")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(student)))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.id").isNotEmpty())
				.andExpect(jsonPath("$.name").value("danilo"))
				.andExpect(jsonPath("$.surName").value("scalisi"))
				.andExpect(jsonPath("$.working").value(true)).andDo(print());
	}

	@SuppressWarnings("null")
	@Test
	public void testGetAllStudents() throws Exception {

		Student student = new Student();
		student.setName("danilo");
		student.setSurName("scalisi");
		student.setWorking(true);
		studentRepository.saveAndFlush(student);

		mockMvc.perform(get("/students/allstudent"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$").isArray())
				.andExpect(jsonPath("$", hasSize(1)))
				.andExpect(jsonPath("$[0].name").value("danilo"))
				.andExpect(jsonPath("$[0].surName").value("scalisi"))
				.andExpect(jsonPath("$[0].isWorking").value(true))
				.andDo(print());
	}

	@Test
	public void testGetStudentById() throws Exception {

		Student student = new Student();
		student.setName("danilo");
		student.setSurName("scalisi");
		student.setWorking(false);
		student = studentRepository.saveAndFlush(student);

		mockMvc.perform(get("/students/getStudentbyid/{id}", student.getId()))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.name").value("danilo"))
				.andExpect(jsonPath("$.surName").value("scalisi"))
				.andExpect(jsonPath("$.isWorking").value(false))
				.andDo(print());
	}

	@SuppressWarnings("null")
	@Test
	public void testUpdateStudentById() throws Exception {

		Student student = new Student();
		student.setName("danilo");
		student.setSurName("scalisi");
		student.setWorking(true);
		student = studentRepository.saveAndFlush(student);

		Student updatedStudent = new Student();
		updatedStudent.setName("dario");
		updatedStudent.setSurName("neri");
		updatedStudent.setWorking(false);

		mockMvc.perform(put("/students/updatestudentbyid/{id}", student.getId())
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(updatedStudent)))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(student.getId()))
				.andExpect(jsonPath("$.name").value("dario"))
				.andExpect(jsonPath("$.surName").value("neri"))
				.andExpect(jsonPath("$.isWorking").value(false))
				.andDo(print());
	}

	@Test
	public void testUpdateIsWorking() throws Exception {

		Student student = new Student();
		student.setName("danilo");
		student.setSurName("scalisi");
		student.setWorking(true);
		studentRepository.saveAndFlush(student);

		mockMvc.perform(patch("/student/updatestatus/{id}", student.getId())
				.param("working", "false"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.working").value(false))
				.andDo(print());
	}

	@Test
	public void testDeleteStudentById() throws Exception {

		Student student = new Student();
		student.setName("danilo");
		student.setSurName("scalisi");
		student.setWorking(true);
		student = studentRepository.saveAndFlush(student);

		mockMvc.perform(delete("/students/deletestudent/{id}", student.getId()))
				.andExpect(status().isOk())
				.andDo(print());

		mockMvc.perform(get("/students/getStudentbyid/{id}", student.getId()))
				.andExpect(status().isNotFound())
				.andDo(print());
	}

}
