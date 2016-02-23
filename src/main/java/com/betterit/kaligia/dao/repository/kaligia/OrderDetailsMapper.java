package com.betterit.kaligia.dao.repository.kaligia;

import com.betterit.kaligia.dao.model.kaligia.OrderDetails;
import com.betterit.kaligia.dao.model.kaligia.OrderDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.orderdetails
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	int deleteByExample(OrderDetailsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.orderdetails
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	int insert(OrderDetails record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.orderdetails
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	int insertSelective(OrderDetails record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.orderdetails
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	List<OrderDetails> selectByExample(OrderDetailsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.orderdetails
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	int updateByExampleSelective(@Param("record") OrderDetails record, @Param("example") OrderDetailsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.orderdetails
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	int updateByExample(@Param("record") OrderDetails record, @Param("example") OrderDetailsExample example);
}