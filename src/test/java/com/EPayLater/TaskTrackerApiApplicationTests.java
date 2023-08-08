package com.EPayLater;

import com.EPayLater.controller.TaskController;

import com.EPayLater.service.TaskService;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.Arrays;
import java.util.Date;

import static org.assertj.core.api.BDDAssumptions.given;
//import  static org.mockito.Mockito.*;


@RunWith(SpringRunner.class)
@WebFluxTest(TaskController.class)
class TaskTrackerApiApplicationTests {
	@Autowired
	private WebTestClient webTestClient;
	@MockBean
	private TaskService taskService;





}
