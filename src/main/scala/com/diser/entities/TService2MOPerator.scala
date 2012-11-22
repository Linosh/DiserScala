package com.diser.entities

/**
 * Project: Diser
 * Date: 8/20/12
 */

class TService2MOPerator(var tsrv: TelecomService, var operator: MobileOperator) {

	def setTsrv(tsrv:TelecomService) = this.tsrv = tsrv
	def setOperator(operator: MobileOperator) = this.operator = operator

	def getTsrv = tsrv
	def getOperator = operator

}
