package com.betterit.kaligia.dao.model.kaligia;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Iterator;

public class UsersExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table kaligia.users
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table kaligia.users
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table kaligia.users
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.users
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public UsersExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.users
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.users
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.users
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.users
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.users
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.users
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.users
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.users
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.users
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.users
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table kaligia.users
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(Integer value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Integer value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Integer value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Integer value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Integer value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Integer> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Integer> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Integer value1, Integer value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andLoginIdIsNull() {
			addCriterion("login_id is null");
			return (Criteria) this;
		}

		public Criteria andLoginIdIsNotNull() {
			addCriterion("login_id is not null");
			return (Criteria) this;
		}

		public Criteria andLoginIdEqualTo(String value) {
			addCriterion("login_id =", value, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdNotEqualTo(String value) {
			addCriterion("login_id <>", value, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdGreaterThan(String value) {
			addCriterion("login_id >", value, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdGreaterThanOrEqualTo(String value) {
			addCriterion("login_id >=", value, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdLessThan(String value) {
			addCriterion("login_id <", value, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdLessThanOrEqualTo(String value) {
			addCriterion("login_id <=", value, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdLike(String value) {
			addCriterion("login_id like", value, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdNotLike(String value) {
			addCriterion("login_id not like", value, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdIn(List<String> values) {
			addCriterion("login_id in", values, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdNotIn(List<String> values) {
			addCriterion("login_id not in", values, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdBetween(String value1, String value2) {
			addCriterion("login_id between", value1, value2, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdNotBetween(String value1, String value2) {
			addCriterion("login_id not between", value1, value2, "loginId");
			return (Criteria) this;
		}

		public Criteria andFirstnameIsNull() {
			addCriterion("firstname is null");
			return (Criteria) this;
		}

		public Criteria andFirstnameIsNotNull() {
			addCriterion("firstname is not null");
			return (Criteria) this;
		}

		public Criteria andFirstnameEqualTo(String value) {
			addCriterion("firstname =", value, "firstname");
			return (Criteria) this;
		}

		public Criteria andFirstnameNotEqualTo(String value) {
			addCriterion("firstname <>", value, "firstname");
			return (Criteria) this;
		}

		public Criteria andFirstnameGreaterThan(String value) {
			addCriterion("firstname >", value, "firstname");
			return (Criteria) this;
		}

		public Criteria andFirstnameGreaterThanOrEqualTo(String value) {
			addCriterion("firstname >=", value, "firstname");
			return (Criteria) this;
		}

		public Criteria andFirstnameLessThan(String value) {
			addCriterion("firstname <", value, "firstname");
			return (Criteria) this;
		}

		public Criteria andFirstnameLessThanOrEqualTo(String value) {
			addCriterion("firstname <=", value, "firstname");
			return (Criteria) this;
		}

		public Criteria andFirstnameLike(String value) {
			addCriterion("firstname like", value, "firstname");
			return (Criteria) this;
		}

		public Criteria andFirstnameNotLike(String value) {
			addCriterion("firstname not like", value, "firstname");
			return (Criteria) this;
		}

		public Criteria andFirstnameIn(List<String> values) {
			addCriterion("firstname in", values, "firstname");
			return (Criteria) this;
		}

		public Criteria andFirstnameNotIn(List<String> values) {
			addCriterion("firstname not in", values, "firstname");
			return (Criteria) this;
		}

		public Criteria andFirstnameBetween(String value1, String value2) {
			addCriterion("firstname between", value1, value2, "firstname");
			return (Criteria) this;
		}

		public Criteria andFirstnameNotBetween(String value1, String value2) {
			addCriterion("firstname not between", value1, value2, "firstname");
			return (Criteria) this;
		}

		public Criteria andLastnameIsNull() {
			addCriterion("lastname is null");
			return (Criteria) this;
		}

		public Criteria andLastnameIsNotNull() {
			addCriterion("lastname is not null");
			return (Criteria) this;
		}

		public Criteria andLastnameEqualTo(String value) {
			addCriterion("lastname =", value, "lastname");
			return (Criteria) this;
		}

		public Criteria andLastnameNotEqualTo(String value) {
			addCriterion("lastname <>", value, "lastname");
			return (Criteria) this;
		}

		public Criteria andLastnameGreaterThan(String value) {
			addCriterion("lastname >", value, "lastname");
			return (Criteria) this;
		}

		public Criteria andLastnameGreaterThanOrEqualTo(String value) {
			addCriterion("lastname >=", value, "lastname");
			return (Criteria) this;
		}

		public Criteria andLastnameLessThan(String value) {
			addCriterion("lastname <", value, "lastname");
			return (Criteria) this;
		}

		public Criteria andLastnameLessThanOrEqualTo(String value) {
			addCriterion("lastname <=", value, "lastname");
			return (Criteria) this;
		}

		public Criteria andLastnameLike(String value) {
			addCriterion("lastname like", value, "lastname");
			return (Criteria) this;
		}

		public Criteria andLastnameNotLike(String value) {
			addCriterion("lastname not like", value, "lastname");
			return (Criteria) this;
		}

		public Criteria andLastnameIn(List<String> values) {
			addCriterion("lastname in", values, "lastname");
			return (Criteria) this;
		}

		public Criteria andLastnameNotIn(List<String> values) {
			addCriterion("lastname not in", values, "lastname");
			return (Criteria) this;
		}

		public Criteria andLastnameBetween(String value1, String value2) {
			addCriterion("lastname between", value1, value2, "lastname");
			return (Criteria) this;
		}

		public Criteria andLastnameNotBetween(String value1, String value2) {
			addCriterion("lastname not between", value1, value2, "lastname");
			return (Criteria) this;
		}

		public Criteria andPasswdIsNull() {
			addCriterion("passwd is null");
			return (Criteria) this;
		}

		public Criteria andPasswdIsNotNull() {
			addCriterion("passwd is not null");
			return (Criteria) this;
		}

		public Criteria andPasswdEqualTo(String value) {
			addCriterion("passwd =", value, "passwd");
			return (Criteria) this;
		}

		public Criteria andPasswdNotEqualTo(String value) {
			addCriterion("passwd <>", value, "passwd");
			return (Criteria) this;
		}

		public Criteria andPasswdGreaterThan(String value) {
			addCriterion("passwd >", value, "passwd");
			return (Criteria) this;
		}

		public Criteria andPasswdGreaterThanOrEqualTo(String value) {
			addCriterion("passwd >=", value, "passwd");
			return (Criteria) this;
		}

		public Criteria andPasswdLessThan(String value) {
			addCriterion("passwd <", value, "passwd");
			return (Criteria) this;
		}

		public Criteria andPasswdLessThanOrEqualTo(String value) {
			addCriterion("passwd <=", value, "passwd");
			return (Criteria) this;
		}

		public Criteria andPasswdLike(String value) {
			addCriterion("passwd like", value, "passwd");
			return (Criteria) this;
		}

		public Criteria andPasswdNotLike(String value) {
			addCriterion("passwd not like", value, "passwd");
			return (Criteria) this;
		}

		public Criteria andPasswdIn(List<String> values) {
			addCriterion("passwd in", values, "passwd");
			return (Criteria) this;
		}

		public Criteria andPasswdNotIn(List<String> values) {
			addCriterion("passwd not in", values, "passwd");
			return (Criteria) this;
		}

		public Criteria andPasswdBetween(String value1, String value2) {
			addCriterion("passwd between", value1, value2, "passwd");
			return (Criteria) this;
		}

		public Criteria andPasswdNotBetween(String value1, String value2) {
			addCriterion("passwd not between", value1, value2, "passwd");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(String value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(String value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(String value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(String value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(String value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(String value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLike(String value) {
			addCriterion("status like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotLike(String value) {
			addCriterion("status not like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<String> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<String> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(String value1, String value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(String value1, String value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andTypeIsNull() {
			addCriterion("type is null");
			return (Criteria) this;
		}

		public Criteria andTypeIsNotNull() {
			addCriterion("type is not null");
			return (Criteria) this;
		}

		public Criteria andTypeEqualTo(String value) {
			addCriterion("type =", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotEqualTo(String value) {
			addCriterion("type <>", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThan(String value) {
			addCriterion("type >", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(String value) {
			addCriterion("type >=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThan(String value) {
			addCriterion("type <", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThanOrEqualTo(String value) {
			addCriterion("type <=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLike(String value) {
			addCriterion("type like", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotLike(String value) {
			addCriterion("type not like", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIn(List<String> values) {
			addCriterion("type in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotIn(List<String> values) {
			addCriterion("type not in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeBetween(String value1, String value2) {
			addCriterion("type between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotBetween(String value1, String value2) {
			addCriterion("type not between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andRoleIdIsNull() {
			addCriterion("role_id is null");
			return (Criteria) this;
		}

		public Criteria andRoleIdIsNotNull() {
			addCriterion("role_id is not null");
			return (Criteria) this;
		}

		public Criteria andRoleIdEqualTo(Integer value) {
			addCriterion("role_id =", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotEqualTo(Integer value) {
			addCriterion("role_id <>", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdGreaterThan(Integer value) {
			addCriterion("role_id >", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("role_id >=", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdLessThan(Integer value) {
			addCriterion("role_id <", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
			addCriterion("role_id <=", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdIn(List<Integer> values) {
			addCriterion("role_id in", values, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotIn(List<Integer> values) {
			addCriterion("role_id not in", values, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdBetween(Integer value1, Integer value2) {
			addCriterion("role_id between", value1, value2, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
			addCriterion("role_id not between", value1, value2, "roleId");
			return (Criteria) this;
		}

		public Criteria andEmailIsNull() {
			addCriterion("email is null");
			return (Criteria) this;
		}

		public Criteria andEmailIsNotNull() {
			addCriterion("email is not null");
			return (Criteria) this;
		}

		public Criteria andEmailEqualTo(String value) {
			addCriterion("email =", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("email <>", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThan(String value) {
			addCriterion("email >", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("email >=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThan(String value) {
			addCriterion("email <", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("email <=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLike(String value) {
			addCriterion("email like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("email not like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailIn(List<String> values) {
			addCriterion("email in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("email not in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("email between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("email not between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNull() {
			addCriterion("phone is null");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNotNull() {
			addCriterion("phone is not null");
			return (Criteria) this;
		}

		public Criteria andPhoneEqualTo(String value) {
			addCriterion("phone =", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotEqualTo(String value) {
			addCriterion("phone <>", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThan(String value) {
			addCriterion("phone >", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("phone >=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThan(String value) {
			addCriterion("phone <", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThanOrEqualTo(String value) {
			addCriterion("phone <=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLike(String value) {
			addCriterion("phone like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotLike(String value) {
			addCriterion("phone not like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneIn(List<String> values) {
			addCriterion("phone in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotIn(List<String> values) {
			addCriterion("phone not in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneBetween(String value1, String value2) {
			addCriterion("phone between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotBetween(String value1, String value2) {
			addCriterion("phone not between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andSupervisorIsNull() {
			addCriterion("supervisor is null");
			return (Criteria) this;
		}

		public Criteria andSupervisorIsNotNull() {
			addCriterion("supervisor is not null");
			return (Criteria) this;
		}

		public Criteria andSupervisorEqualTo(String value) {
			addCriterion("supervisor =", value, "supervisor");
			return (Criteria) this;
		}

		public Criteria andSupervisorNotEqualTo(String value) {
			addCriterion("supervisor <>", value, "supervisor");
			return (Criteria) this;
		}

		public Criteria andSupervisorGreaterThan(String value) {
			addCriterion("supervisor >", value, "supervisor");
			return (Criteria) this;
		}

		public Criteria andSupervisorGreaterThanOrEqualTo(String value) {
			addCriterion("supervisor >=", value, "supervisor");
			return (Criteria) this;
		}

		public Criteria andSupervisorLessThan(String value) {
			addCriterion("supervisor <", value, "supervisor");
			return (Criteria) this;
		}

		public Criteria andSupervisorLessThanOrEqualTo(String value) {
			addCriterion("supervisor <=", value, "supervisor");
			return (Criteria) this;
		}

		public Criteria andSupervisorLike(String value) {
			addCriterion("supervisor like", value, "supervisor");
			return (Criteria) this;
		}

		public Criteria andSupervisorNotLike(String value) {
			addCriterion("supervisor not like", value, "supervisor");
			return (Criteria) this;
		}

		public Criteria andSupervisorIn(List<String> values) {
			addCriterion("supervisor in", values, "supervisor");
			return (Criteria) this;
		}

		public Criteria andSupervisorNotIn(List<String> values) {
			addCriterion("supervisor not in", values, "supervisor");
			return (Criteria) this;
		}

		public Criteria andSupervisorBetween(String value1, String value2) {
			addCriterion("supervisor between", value1, value2, "supervisor");
			return (Criteria) this;
		}

		public Criteria andSupervisorNotBetween(String value1, String value2) {
			addCriterion("supervisor not between", value1, value2, "supervisor");
			return (Criteria) this;
		}

		public Criteria andStartDateIsNull() {
			addCriterion("start_date is null");
			return (Criteria) this;
		}

		public Criteria andStartDateIsNotNull() {
			addCriterion("start_date is not null");
			return (Criteria) this;
		}

		public Criteria andStartDateEqualTo(Date value) {
			addCriterionForJDBCDate("start_date =", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("start_date <>", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateGreaterThan(Date value) {
			addCriterionForJDBCDate("start_date >", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("start_date >=", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateLessThan(Date value) {
			addCriterionForJDBCDate("start_date <", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("start_date <=", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateIn(List<Date> values) {
			addCriterionForJDBCDate("start_date in", values, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("start_date not in", values, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("start_date between", value1, value2, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("start_date not between", value1, value2, "startDate");
			return (Criteria) this;
		}

		public Criteria andEndDateIsNull() {
			addCriterion("end_date is null");
			return (Criteria) this;
		}

		public Criteria andEndDateIsNotNull() {
			addCriterion("end_date is not null");
			return (Criteria) this;
		}

		public Criteria andEndDateEqualTo(Date value) {
			addCriterionForJDBCDate("end_date =", value, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("end_date <>", value, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateGreaterThan(Date value) {
			addCriterionForJDBCDate("end_date >", value, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("end_date >=", value, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateLessThan(Date value) {
			addCriterionForJDBCDate("end_date <", value, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("end_date <=", value, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateIn(List<Date> values) {
			addCriterionForJDBCDate("end_date in", values, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("end_date not in", values, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("end_date between", value1, value2, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("end_date not between", value1, value2, "endDate");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table kaligia.users
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table kaligia.users
     *
     * @mbggenerated do_not_delete_during_merge Mon Feb 22 16:13:38 EST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}