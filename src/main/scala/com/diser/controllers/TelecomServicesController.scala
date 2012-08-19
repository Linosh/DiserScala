package com.diser.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{PathVariable, ModelAttribute, RequestMapping}
import org.springframework.beans.factory.annotation.Autowired
import com.diser.dao.JdbcDao
import org.springframework.ui.Model
import com.diser.entities.TelecomService

/**
 * Project: Diser
 * Date: 8/19/12
 */

@Controller
@RequestMapping(Array("/telecomServices"))
class TelecomServicesController {

	@Autowired
	var dao:JdbcDao = null

	@RequestMapping(Array("/viewTelecomServices"))
	def viewTelecomServices(model:Model):String = {
		model.addAttribute("services", dao.getAllTelecomServices)
		"telecomServicesList"
	}

	@RequestMapping(Array("/create"))
	def newTelecomServices(@ModelAttribute("service") service: TelecomService):String = {
		dao.newTelecomService(service)
		"redirect:/telecomServices/viewTelecomServices"
	}

	@RequestMapping(Array("/rm/{id}"))
	def rmTelecomServices(@PathVariable("id") id:String):String = {
		dao.deleteTelecomService(id)
		"redirect:/telecomServices/viewTelecomServices"
	}

	@RequestMapping(Array("/edit/{id}"))
	def gotoEditTelecomServices(model:Model, @PathVariable("id") id:String):String = {
		model.addAttribute("item", dao.getTelecomServiceById(id).get(0))
		"editTelecomServices"
	}

	@RequestMapping(Array("/save"))
	def saveTelecomServices(@ModelAttribute("service") service: TelecomService):String = {
		dao.editTelecomService(service)
		"redirect:/telecomServices/viewTelecomServices"
	}


	@RequestMapping(Array("/creationView"))
	def creationView = "telecomServicesNew"

}
