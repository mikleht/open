package fi.mhtl.open.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class OpenController {

	@GetMapping
	public String hello() {
		return "hello";
	}
}
