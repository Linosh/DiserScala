package com.diser.dao

import org.springframework.jdbc.core.support.JdbcDaoSupport
import com.diser.entities.MarketService
import org.springframework.jdbc.core.RowMapper
import java.sql.ResultSet

class JdbcDao extends JdbcDaoSupport{
	 def getAllMarketServices : java.util.List[MarketService] = {
	    getJdbcTemplate.query[MarketService]("select * from DISER.MARKET_SERVICE", new RowMapper[MarketService] {
		    def mapRow(p1: ResultSet, p2: Int): MarketService = {
			    new MarketService(p1 getInt 1, p1 getString 2, p1 getString 3)
		    }
	    })
	 }

	def newMarketService (srv:MarketService):Unit = {
		getJdbcTemplate.update("INSERT INTO DISER.MARKET_SERVICE(NAME, DESCRIPTION) values('"+ srv.getName +"', '"+ srv.getDescription +"')")
	}
}
