package cn.yesway.music.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * CustomerThridLogin的Condition类。
 * 由Code Generator生成。
 *
 * @author Code Generator
 */
public class CustomerThridLoginCondition implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 排序字段。
     */
    protected String orderBy;
    /**
     * 是否过滤重复。
     */
    protected boolean distinct;
    /**
     * 条件参数。
     */
    private List<Criteria> criterias;

    /**
     * 构造函数。
     */
    public CustomerThridLoginCondition() {
        criterias = new ArrayList<>();
    }

    /**
     * @return 获取排序字段。
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * 设置排序字段。
     *
     * @param orderBy 排序字段。
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * @return 获取是否去掉重复数据的字段。
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 设置获取是否去掉重复数据的字段。
     *
     * @param distinct 获取是否去掉重复数据的字段。
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * @return 获取条件参数。
     */
    public List<Criteria> getCriterias() {
        return criterias;
    }

    /**
     * 设置多个条件参数，以or的形式拼接。
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        criterias.add(criteria);
        return criteria;
    }

    /**
     * 设置多个条件参数，以or的形式拼接。
     *
     * @param criteria 条件参数。
     */
    public void or(Criteria criteria) {
        criterias.add(criteria);
    }

    /**
     * @return 创建一个条件查询。
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (criterias.isEmpty()) {
            criterias.add(criteria);
        }
        return criteria;
    }

    /**
     * @return 创建一个条件参数。
     */
    protected Criteria createCriteriaInternal() {
        return new Criteria();
    }

    /**
     * 清空条件参数。
     */
    public void clear() {
        criterias.clear();
        orderBy = null;
        distinct = false;
    }

    /**
     * 查询条件生成器。
     */
    protected abstract static class GeneratedCriteria {

        /**
        * 查询条件。
        */
        protected List<Criterion> criteria;

        /**
         * 构造函数。
         */
        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        /**
         * @return 查询条件是否合法。
         */
        public boolean isValid() {
            return criteria.isEmpty();
        }

        /**
         * @return 获取全部的查询条件。
         */
        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        /**
         * @return 获取查询条件。
         */
        public List<Criterion> getCriteria() {
            return criteria;
        }

        /**
         * 添加查询条件。
         *
         * @param condition 条件语句。
         */
        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new IllegalArgumentException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        /**
         * 添加查询条件。
         *
         * @param condition 条件语句。
         * @param value     value。
         * @param property  属性。
         */
        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new IllegalArgumentException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        /**
         * 添加查询条件。
         *
         * @param condition 条件语句。
         * @param value1    value1。
         * @param value2    value2。
         * @param property  属性。
         */
        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new IllegalArgumentException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        private static final String ID = "id";

        public Criteria andIdIsNull() {
            addCriterion("`id` is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("`id` is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("`id` =", value, ID);
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("`id` <>", value, ID);
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("`id` >", value, ID);
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("`id` >=", value, ID);
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("`id` <", value, ID);
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("`id` <=", value, ID);
            return (Criteria) this;
        }
        public Criteria andIdIn(List<Long> values) {
            addCriterion("`id` in", values, ID);
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("`id` not in", values, ID);
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("`id` between", value1, value2, ID);
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("`id` not between", value1, value2, ID);
            return (Criteria) this;
        }
        private static final String OPENID = "openId";

        public Criteria andOpenIdIsNull() {
            addCriterion("`open_id` is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("`open_id` is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("`open_id` =", value, OPENID);
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("`open_id` <>", value, OPENID);
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("`open_id` >", value, OPENID);
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("`open_id` >=", value, OPENID);
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("`open_id` <", value, OPENID);
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("`open_id` <=", value, OPENID);
            return (Criteria) this;
        }

        private static final String OPENID_LIKE = "`open_id` like";
        private static final String OPENID_NOT_LIKE = "`open_id` not like";

        public Criteria andOpenIdLike(String value) {
            addCriterion(OPENID_LIKE, value, OPENID);
            return (Criteria) this;
        }

        public Criteria andOpenIdLikeOnLeft(String value) {
            addCriterion(OPENID_LIKE, "%" + value, OPENID);
            return (Criteria) this;
        }

        public Criteria andOpenIdLikeOnRight(String value) {
            addCriterion(OPENID_LIKE, value + "%", OPENID);
            return (Criteria) this;
        }

        public Criteria andOpenIdLikeOnBoth(String value) {
            addCriterion(OPENID_LIKE, "%" + value + "%", OPENID);
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion(OPENID_NOT_LIKE, value, OPENID);
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLikeOnLeft(String value) {
            addCriterion(OPENID_NOT_LIKE, "%" + value, OPENID);
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLikeOnRight(String value) {
            addCriterion(OPENID_NOT_LIKE, value + "%", OPENID);
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLikeOnBoth(String value) {
            addCriterion(OPENID_NOT_LIKE, "%" + value + "%", OPENID);
            return (Criteria) this;
        }
        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("`open_id` in", values, OPENID);
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("`open_id` not in", values, OPENID);
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("`open_id` between", value1, value2, OPENID);
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("`open_id` not between", value1, value2, OPENID);
            return (Criteria) this;
        }
        private static final String TYPE = "type";

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("`type` =", value, TYPE);
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("`type` <>", value, TYPE);
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("`type` >", value, TYPE);
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("`type` >=", value, TYPE);
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("`type` <", value, TYPE);
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("`type` <=", value, TYPE);
            return (Criteria) this;
        }
        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("`type` in", values, TYPE);
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("`type` not in", values, TYPE);
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("`type` between", value1, value2, TYPE);
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("`type` not between", value1, value2, TYPE);
            return (Criteria) this;
        }

    }

    /**
     * 条件参数。
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        /**
         * 构造函数。
         */
        protected Criteria() {
            super();
        }

    }

    /**
     * Mapper中用到的条件参数对象。
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

}