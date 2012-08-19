package com.diser.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{PathVariable, ModelAttribute, RequestMapping}
import org.springframework.beans.factory.annotation.Autowired
import com.diser.dao.JdbcDao
import org.springframework.ui.Model
import com.diser.entities.MobileOperator

/**
 * Project: Diser
 * Date: 8/19/12
 */

@Controller
@RequestMapping(Array("/mobileOperators"))
class MobileOperatorsController {

	@Autowired
	var dao:JdbcDao = null

	@RequestMapping(Array("/viewMobileOperators"))
	def viewMobileOperators(model:Model):String = {
		model.addAttribute("services", dao.getAllMobileOperators)
		"mobileOperatorsList"
	}

	@RequestMapping(Array("/create"))
	def newMobileOperators(@ModelAttribute("service") service: MobileOperator):String = {
		dao.newMobileOperator(service)
		"redirect:/mobileOperators/viewMobileOperators"
	}

	@RequestMapping(Array("/rm/{id}"))
	def rmMobileOperators(@PathVariable("id") id:String):String = {
		dao.deleteMobileOperator(id)
		"redirect:/mobileOperators/viewMobileOperators"
	}

	@RequestMapping(Array("/edit/{id}"))
	def gotoEditMobileOperators(model:Model, @PathVariable("id") id:String):String = {
		model.addAttribute("item", dao.getMobileOperatorById(id).get(0))
		"editMobileOperators"
	}

	@RequestMapping(Array("/save"))
	def saveMobileOperators(@ModelAttribute("service") service: MobileOperator):String = {
		dao.editMobileOperator(service)
		"redirect:/mobileOperators/viewMobileOperators"
	}


	@RequestMapping(Array("/creationView"))
	def creationView = "mobileOperatorsNew"


}
