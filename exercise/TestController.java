package com.jth.exercise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jth.exercise.test.vo.TestBoardVO;

@Controller
@RequestMapping("/test")
public class TestController {

	private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

	@GetMapping("/list")
	public String testList() {
		LOGGER.info("TestController,testList.");

		return "test/testList";
	}

	@GetMapping("/detail")
	public String testDetail(Model model) {
		LOGGER.info("TestController,testDetail.");

		return "test/testDetail";
	}
	/**
	 * Post 전송
	 * @param testBoardVO
	 * @return
	 */
	@PostMapping("/detail/post")
	public ResponseEntity<String> testDetailPost(@RequestBody TestBoardVO testBoardVO) {
		LOGGER.info("TestController,testDetailPost.");
		
		if (testBoardVO != null) {
			LOGGER.info(testBoardVO.toString());
		}
		
		ResponseEntity<String> resultEntity = null;
		try {
			resultEntity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		} catch (Exception e) {
			resultEntity = new ResponseEntity<String>("FAIL", HttpStatus.BAD_REQUEST);
		}
		return resultEntity;
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String testInsert() {
		LOGGER.info("TestController,testInsert.");

		return "test/testInsert";
	}

	@PostMapping(value = "/update")
	public String testUpdate() {
		LOGGER.info("TestController,testUpdate.");

		return "test/testUpdate";
	}

	@PostMapping(value = "/delete")
	public String testDelete() {
		LOGGER.info("TestController,testDelete.");

		return "test/testDelete";

	}

}
