package com.diser.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView
import com.diser.dao.JdbcDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ui.Model

/**
 * Project: Diser
 * Date: 8/16/12
 */

@Controller
@RequestMapping(Array("/main"))
class MainController {

	@Autowired
	var dao:JdbcDao = null

//	def setDao

	@RequestMapping(Array("/viewMarketServices"))
	def getAllMarketServices(model:Model):String = {
		model.addAttribute("services", dao.getAllMarketServices)

		"marketServicesList"
	}
}
