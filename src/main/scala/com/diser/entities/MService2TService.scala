package com.diser.entities

/**
 * Project: Diser
 * Date: 8/20/12
 */

class MService2TService(var mSrv: MarketService, var tSrv: TelecomService) {

	def setTSrv(tSrv:TelecomService) = this.tSrv = tSrv
	def setMSrv(mSrv:MarketService) = this.mSrv = mSrv

	def getTSrv = tSrv
	def getMSrv = mSrv
}
