package com.diser.entities

import com.diser.commons.Constants

/**
 * Project: Diser
 * Date: 8/16/12
 */

class MobileOperator extends Constants{

	private var id:Int = -1
	private var name:String = Defaults.EMPTY_STRING
	private var description:String = Defaults.EMPTY_STRING

	def setId(id:Int) = this.id = id
	def getId = id

	def setName(name:String) = this.name = name
	def getName = name

	def setDescription(description:String) = this.description = description
	def getDescription = description

}
