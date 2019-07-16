package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class TPositionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TPositionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

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

        public Criteria andPoIdIsNull() {
            addCriterion("poId is null");
            return (Criteria) this;
        }

        public Criteria andPoIdIsNotNull() {
            addCriterion("poId is not null");
            return (Criteria) this;
        }

        public Criteria andPoIdEqualTo(Integer value) {
            addCriterion("poId =", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdNotEqualTo(Integer value) {
            addCriterion("poId <>", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdGreaterThan(Integer value) {
            addCriterion("poId >", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("poId >=", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdLessThan(Integer value) {
            addCriterion("poId <", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdLessThanOrEqualTo(Integer value) {
            addCriterion("poId <=", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdIn(List<Integer> values) {
            addCriterion("poId in", values, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdNotIn(List<Integer> values) {
            addCriterion("poId not in", values, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdBetween(Integer value1, Integer value2) {
            addCriterion("poId between", value1, value2, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("poId not between", value1, value2, "poId");
            return (Criteria) this;
        }

        public Criteria andPoNameIsNull() {
            addCriterion("poName is null");
            return (Criteria) this;
        }

        public Criteria andPoNameIsNotNull() {
            addCriterion("poName is not null");
            return (Criteria) this;
        }

        public Criteria andPoNameEqualTo(String value) {
            addCriterion("poName =", value, "poName");
            return (Criteria) this;
        }

        public Criteria andPoNameNotEqualTo(String value) {
            addCriterion("poName <>", value, "poName");
            return (Criteria) this;
        }

        public Criteria andPoNameGreaterThan(String value) {
            addCriterion("poName >", value, "poName");
            return (Criteria) this;
        }

        public Criteria andPoNameGreaterThanOrEqualTo(String value) {
            addCriterion("poName >=", value, "poName");
            return (Criteria) this;
        }

        public Criteria andPoNameLessThan(String value) {
            addCriterion("poName <", value, "poName");
            return (Criteria) this;
        }

        public Criteria andPoNameLessThanOrEqualTo(String value) {
            addCriterion("poName <=", value, "poName");
            return (Criteria) this;
        }

        public Criteria andPoNameLike(String value) {
            addCriterion("poName like", value, "poName");
            return (Criteria) this;
        }

        public Criteria andPoNameNotLike(String value) {
            addCriterion("poName not like", value, "poName");
            return (Criteria) this;
        }

        public Criteria andPoNameIn(List<String> values) {
            addCriterion("poName in", values, "poName");
            return (Criteria) this;
        }

        public Criteria andPoNameNotIn(List<String> values) {
            addCriterion("poName not in", values, "poName");
            return (Criteria) this;
        }

        public Criteria andPoNameBetween(String value1, String value2) {
            addCriterion("poName between", value1, value2, "poName");
            return (Criteria) this;
        }

        public Criteria andPoNameNotBetween(String value1, String value2) {
            addCriterion("poName not between", value1, value2, "poName");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("deptId is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("deptId is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Integer value) {
            addCriterion("deptId =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Integer value) {
            addCriterion("deptId <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Integer value) {
            addCriterion("deptId >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("deptId >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Integer value) {
            addCriterion("deptId <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("deptId <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Integer> values) {
            addCriterion("deptId in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Integer> values) {
            addCriterion("deptId not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("deptId between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("deptId not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andPoSalaryIsNull() {
            addCriterion("poSalary is null");
            return (Criteria) this;
        }

        public Criteria andPoSalaryIsNotNull() {
            addCriterion("poSalary is not null");
            return (Criteria) this;
        }

        public Criteria andPoSalaryEqualTo(Double value) {
            addCriterion("poSalary =", value, "poSalary");
            return (Criteria) this;
        }

        public Criteria andPoSalaryNotEqualTo(Double value) {
            addCriterion("poSalary <>", value, "poSalary");
            return (Criteria) this;
        }

        public Criteria andPoSalaryGreaterThan(Double value) {
            addCriterion("poSalary >", value, "poSalary");
            return (Criteria) this;
        }

        public Criteria andPoSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("poSalary >=", value, "poSalary");
            return (Criteria) this;
        }

        public Criteria andPoSalaryLessThan(Double value) {
            addCriterion("poSalary <", value, "poSalary");
            return (Criteria) this;
        }

        public Criteria andPoSalaryLessThanOrEqualTo(Double value) {
            addCriterion("poSalary <=", value, "poSalary");
            return (Criteria) this;
        }

        public Criteria andPoSalaryIn(List<Double> values) {
            addCriterion("poSalary in", values, "poSalary");
            return (Criteria) this;
        }

        public Criteria andPoSalaryNotIn(List<Double> values) {
            addCriterion("poSalary not in", values, "poSalary");
            return (Criteria) this;
        }

        public Criteria andPoSalaryBetween(Double value1, Double value2) {
            addCriterion("poSalary between", value1, value2, "poSalary");
            return (Criteria) this;
        }

        public Criteria andPoSalaryNotBetween(Double value1, Double value2) {
            addCriterion("poSalary not between", value1, value2, "poSalary");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("isDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("isDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("isDelete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("isDelete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("isDelete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDelete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("isDelete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("isDelete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("isDelete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("isDelete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("isDelete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("isDelete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
}