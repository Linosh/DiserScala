package com.diser.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{PathVariable, RequestMapping}
import org.springframework.ui.Model
import org.springframework.beans.factory.annotation.Autowired
import com.diser.dao.JdbcDao
import java.io.BufferedWriter
import collection.JavaConversions

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

	@RequestMapping(Array("/addtServ2Operator/{opId}/{list}"))
	def addtServ2Operator (@PathVariable("opId") operatorId: String, @PathVariable("list") services : java.util.List[String]) {
		 JavaConversions.asScalaBuffer(services).filter(e => e != null && e != "").foreach(el => dao.addNewTelecomServices2Operators(operatorId, el.asInstanceOf[String]))
		"redirect:/mapping/telecomServ2Operator"
//		"basePage"
	}

	@RequestMapping(Array("/telecomServ2Operator/rm/{srv}/{oper}"))
	def rmTelecomServ2OperatorView(@PathVariable("srv") srv:String, @PathVariable("oper") oper:String) = {
		dao.deleteTelecomServices2Operators(oper, srv)
		"redirect:/mapping/telecomServ2Operator"
	}

	@RequestMapping(Array("/market2TelecomServs/rm/{tsrv}/{msrv}"))
	def rmMarket2TelecomServsView(@PathVariable("tsrv") tsrv:String, @PathVariable("msrv") msrv:String) = {
		dao.deleteTServices2MServices(tsrv, msrv)
		"redirect:/mapping/market2TelecomServs"
	}


}
