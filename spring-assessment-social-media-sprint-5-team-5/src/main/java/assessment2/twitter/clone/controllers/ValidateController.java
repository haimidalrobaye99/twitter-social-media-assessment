package assessment2.twitter.clone.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


import assessment2.twitter.clone.entities.*;
import assessment2.twitter.clone.services.*;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/validate")
@RequiredArgsConstructor
public class ValidateController {
	
	private final ValidateService ValidateService;

	
	
	
}
