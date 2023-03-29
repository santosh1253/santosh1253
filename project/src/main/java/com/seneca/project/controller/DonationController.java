package com.seneca.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DonationController {
	@GetMapping("/register")
	public String reg()
	{
		return "display";
	}
	
//	@Autowired
//	private DonationService donationService;
//	
//	@PostMapping("/donated")
//	public void saveDonationHistory(@RequestBody DonationHistory dh)
//	{
//		donationService.save(dh);
//	}
//	

}
