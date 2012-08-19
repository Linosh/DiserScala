package com.diser.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.ui.Model
import org.springframework.beans.factory.annotation.Autowired
import com.diser.dao.JdbcDao

/**
 * Project: Diser
 * Date: 8/20/12
 */

@Controller
@RequestMapping(Array("/mapping"))
class MappingController {

	@Autowired
	var dao:JdbcDao = null

	@RequestMapping(Array("/telecomServ2Operator"))
	def gotoTelecomServ2OperatorView(model: Model) = {
		model.addAttribute("tServices", dao.getAllTelecomServices)
		model.addAttribute("operators", dao.getAllMobileOperators)
		model.addAttribute("map", dao.getTelecomServices2Operators)
		"telecomServ2Operator"
	}

	@RequestMapping(Array("/market2TelecomServs"))
	def gotoMarket2TelecomServsView(model: Model) = {
		model.addAttribute("tServices", dao.getAllTelecomServices)
		model.addAttribute("mServices", dao.getAllMarketServices)
		model.addAttribute("map", dao.getTServices2MServices())
		"market2TelecomServs"
	}

}
