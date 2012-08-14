package com.diser.controllers

import org.springframework.stereotype.Controller
import org.springframework.beans.factory.annotation.Autowired
import com.diser.dao.JdbcDao
import org.springframework.web.bind.annotation.{RequestMapping, Mapping}
import javax.servlet.http.{HttpServletResponse, HttpServletRequest}
import org.springframework.web.portlet.ModelAndView

/**
 * Created with IntelliJ IDEA.
 * User: dy
 * Date: 6/26/12
 * Time: 2:28 AM
 * To change this template use File | Settings | File Templates.
 */

@Controller
class TestCtrl {

	@Autowired
	private val jdbcDao:JdbcDao = null

	@RequestMapping(Array("/test"))
	def test(request:HttpServletRequest, response:HttpServletResponse) = {
		"test"
	}


}
