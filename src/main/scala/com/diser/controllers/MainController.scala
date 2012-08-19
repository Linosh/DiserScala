package com.diser.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{ModelAttribute, RequestMapping}
import org.springframework.web.servlet.ModelAndView
import com.diser.dao.JdbcDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import com.diser.entities.MarketService

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

	@RequestMapping(Array("/newMarketServices"))
	def newMarketServices(@ModelAttribute("service") service: MarketService, result: BindingResult):String = {
		print(service)
		"marketServicesList"
	}
}
