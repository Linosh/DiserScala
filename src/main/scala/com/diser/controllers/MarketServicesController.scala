package com.diser.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{PathVariable, ModelAttribute, RequestMapping}
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

	@RequestMapping(Array("/rm/{id}"))
	def rmMarketServices(@PathVariable("id") id:String):String = {
		dao.deleteMarketService(id)
		"redirect:/marketServices/viewMarketServices"
	}

	@RequestMapping(Array("/edit/{id}"))
	def gotoEditMarketServices(model:Model, @PathVariable("id") id:String):String = {
		model.addAttribute("item", dao.getMarketServiceById(id).get(0))
		"editMarketServices"
	}

	@RequestMapping(Array("/save"))
	def saveMarketServices(@ModelAttribute("service") service: MarketService):String = {
		dao.editMarketService(service)
		"redirect:/marketServices/viewMarketServices"
	}


	@RequestMapping(Array("/creationView"))
	def creationView = "marketServicesNew"

}
