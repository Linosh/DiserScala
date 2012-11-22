package com.diser.entities

import com.diser.commons.Constants

/**
 * Project: Diser
 * Date: 8/16/12
 */

class MarketService(var id:Int, var name:String, var description:String) extends Constants{

	def this() = this(-1, null, null)

	def setId(id:Int) = this.id = id
	def getId = id

	def setName(name:String) = this.name = name
	def getName = name

	def setDescription(description:String) = this.description = description
	def getDescription = description
}
