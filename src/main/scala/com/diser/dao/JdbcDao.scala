package com.diser.dao

import org.springframework.jdbc.core.support.JdbcDaoSupport
import com.diser.entities.{MobileOperator, TelecomService, MarketService}
import org.springframework.jdbc.core.RowMapper
import java.sql.ResultSet

class JdbcDao extends JdbcDaoSupport{
	
	//START Market Services
	 def getAllMarketServices : java.util.List[MarketService] = {
	    getJdbcTemplate.query[MarketService]("SELECT * FROM DISER.MARKET_SERVICE", new RowMapper[MarketService] {
		    def mapRow(p1: ResultSet, p2: Int): MarketService = {
			    new MarketService(p1 getInt 1, p1 getString 2, p1 getString 3)
		    }
	    })
	 }

	def newMarketService (srv:MarketService):Unit = {
		getJdbcTemplate.update("INSERT INTO DISER.MARKET_SERVICE(NAME, DESCRIPTION) values('"+ srv.getName +"', '"+ srv.getDescription +"')")
	}

	def deleteMarketService (id:String):Unit = {
		getJdbcTemplate.update("DELETE FROM DISER.MARKET_SERVICE WHERE ID = " + id)
	}

	def editMarketService (srv:MarketService) = {
		getJdbcTemplate.update("UPDATE DISER.MARKET_SERVICE set name = '"+ srv.getName +"', description = '"+ srv.getDescription +"' where id = " + srv.getId)
	}

	def getMarketServiceById (id:String):java.util.List[MarketService] = {
		getJdbcTemplate.query[MarketService]("SELECT * FROM DISER.MARKET_SERVICE WHERE ID = " + id, new RowMapper[MarketService] {
			def mapRow(p1: ResultSet, p2: Int): MarketService = {
				new MarketService(p1 getInt 1, p1 getString 2, p1 getString 3)
			}
		})
	}

	
	// START Telecom Services Definitions
	def getAllTelecomServices : java.util.List[TelecomService] = {
		getJdbcTemplate.query[TelecomService]("SELECT * FROM DISER.TELECOM_SERVICE", new RowMapper[TelecomService] {
			def mapRow(p1: ResultSet, p2: Int): TelecomService = {
				new TelecomService(p1 getInt 1, p1 getString 2, p1 getString 3)
			}
		})
	}

	def newTelecomService (srv:TelecomService):Unit = {
		getJdbcTemplate.update("INSERT INTO DISER.TELECOM_SERVICE(NAME, DESCRIPTION) values('"+ srv.getName +"', '"+ srv.getDescription +"')")
	}

	def deleteTelecomService (id:String):Unit = {
		getJdbcTemplate.update("DELETE FROM DISER.TELECOM_SERVICE WHERE ID = " + id)
	}

	def editTelecomService (srv:TelecomService) = {
		getJdbcTemplate.update("UPDATE DISER.TELECOM_SERVICE set name = '"+ srv.getName +"', description = '"+ srv.getDescription +"' where id = " + srv.getId)
	}

	def getTelecomServiceById (id:String):java.util.List[TelecomService] = {
		getJdbcTemplate.query[TelecomService]("SELECT * FROM DISER.TELECOM_SERVICE WHERE ID = " + id, new RowMapper[TelecomService] {
			def mapRow(p1: ResultSet, p2: Int): TelecomService = {
				new TelecomService(p1 getInt 1, p1 getString 2, p1 getString 3)
			}
		})
	}

	//START Mobile Operators
	def getAllMobileOperators : java.util.List[MobileOperator] = {
		getJdbcTemplate.query[MobileOperator]("SELECT * FROM DISER.MOBILE_OPERATOR", new RowMapper[MobileOperator] {
			def mapRow(p1: ResultSet, p2: Int): MobileOperator = {
				new MobileOperator(p1 getInt 1, p1 getString 2, p1 getString 3)
			}
		})
	}

	def newMobileOperator (srv:MobileOperator):Unit = {
		getJdbcTemplate.update("INSERT INTO DISER.MOBILE_OPERATOR(NAME, DESCRIPTION) values('"+ srv.getName +"', '"+ srv.getDescription +"')")
	}

	def deleteMobileOperator (id:String):Unit = {
		getJdbcTemplate.update("DELETE FROM DISER.MOBILE_OPERATOR WHERE ID = " + id)
	}

	def editMobileOperator (srv:MobileOperator) = {
		getJdbcTemplate.update("UPDATE DISER.MOBILE_OPERATOR set name = '"+ srv.getName +"', description = '"+ srv.getDescription +"' where id = " + srv.getId)
	}

	def getMobileOperatorById (id:String):java.util.List[MobileOperator] = {
		getJdbcTemplate.query[MobileOperator]("SELECT * FROM DISER.MOBILE_OPERATOR WHERE ID = " + id, new RowMapper[MobileOperator] {
			def mapRow(p1: ResultSet, p2: Int): MobileOperator = {
				new MobileOperator(p1 getInt 1, p1 getString 2, p1 getString 3)
			}
		})
	}
}
