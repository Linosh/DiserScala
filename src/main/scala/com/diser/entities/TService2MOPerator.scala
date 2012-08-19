package com.diser.entities

/**
 * Project: Diser
 * Date: 8/20/12
 */

class TService2MOPerator(var tSrv: TelecomService, var operator: MobileOperator) {

	def setTSrv(tSrv:TelecomService) = this.tSrv = tSrv
	def setOperator(operator: MobileOperator) = this.operator = operator

	def getTSrv = tSrv
	def getOperator = operator

}
