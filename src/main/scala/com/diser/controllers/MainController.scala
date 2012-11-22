package com.diser.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Project: Diser
 * Date: 8/19/12
 */
@Controller
class MainController {

	@RequestMapping(Array("/main"))
	def goToMainPage = "basePage"

}
