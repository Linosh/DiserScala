package com.diser.main

import com.diser.dao.JdbcDao
import org.springframework.context.support.ClassPathXmlApplicationContext

/**
 * Created with IntelliJ IDEA.
 * User: dy
 * Date: 6/21/12
 * Time: 1:24 AM
 * To change this template use File | Settings | File Templates.
 */

object DiserMain {
  def main(args: Array[String]) {
    val dao:JdbcDao = new ClassPathXmlApplicationContext("spring-config.xml").getBean("jdbcDao").asInstanceOf[JdbcDao]

    print(dao.getJdbcTemplate.queryForList("select * from kpi"))
  }
}
