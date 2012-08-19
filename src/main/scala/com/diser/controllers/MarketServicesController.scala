package com.diser.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{ModelAttribute, RequestMapping}
import org.springframework.ui.Model
import org.springframework.beans.factory.annotation.Autowired
import com.diser.dao.JdbcDao
import com.diser.entities.MarketService

/**
 * Project: Diser
 * Date: 8/19/12
 */

@Controller
@RequestMapping(Array("/marketServices"))
class MarketServicesController {

	@Autowired
	var dao:JdbcDao = null

	@RequestMapping(Array("/viewMarketServices"))
	def viewMarketServices(model:Model):String = {
		model.addAttribute("services", dao.getAllMarketServices)
		"marketServicesList"
	}

	@RequestMapping(Array("/create"))
	def newMarketServices(@ModelAttribute("service") service: MarketService):String = {
		dao.newMarketService(service)
		"redirect:/marketServices/viewMarketServices"
	}

	@RequestMapping(Array("/creationView"))
	def creationView(@ModelAttribute("service") service: MarketService):String = {
		"marketServicesNew"
	}

}
