package com.code.develop.controller;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.develop.property.PropertieWriter;

@RestController
@RequestMapping("/api")
public class DisplayPropertyController {
	
	@Autowired
	PropertieWriter propWriter;
	
	@GetMapping("/getAllproperties")
	public Properties getProperties () {
		return propWriter.getPropertyInformation();
	}

}
