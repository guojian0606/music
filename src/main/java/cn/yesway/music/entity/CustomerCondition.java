package cn.yesway.music.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Customer的Condition类。
 * 由Code Generator生成。
 *
 * @author Code Generator
 */
public class CustomerCondition implements Serializable {

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
    public CustomerCondition() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("`id` =", value, ID);
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("`id` <>", value, ID);
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("`id` >", value, ID);
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`id` >=", value, ID);
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("`id` <", value, ID);
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("`id` <=", value, ID);
            return (Criteria) this;
        }
        public Criteria andIdIn(List<Integer> values) {
            addCriterion("`id` in", values, ID);
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("`id` not in", values, ID);
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("`id` between", value1, value2, ID);
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`id` not between", value1, value2, ID);
            return (Criteria) this;
        }
        private static final String PHONENUMBER = "phoneNumber";

        public Criteria andPhoneNumberIsNull() {
            addCriterion("`phone_number` is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("`phone_number` is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("`phone_number` =", value, PHONENUMBER);
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("`phone_number` <>", value, PHONENUMBER);
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("`phone_number` >", value, PHONENUMBER);
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("`phone_number` >=", value, PHONENUMBER);
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("`phone_number` <", value, PHONENUMBER);
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("`phone_number` <=", value, PHONENUMBER);
            return (Criteria) this;
        }

        private static final String PHONENUMBER_LIKE = "`phone_number` like";
        private static final String PHONENUMBER_NOT_LIKE = "`phone_number` not like";

        public Criteria andPhoneNumberLike(String value) {
            addCriterion(PHONENUMBER_LIKE, value, PHONENUMBER);
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLikeOnLeft(String value) {
            addCriterion(PHONENUMBER_LIKE, "%" + value, PHONENUMBER);
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLikeOnRight(String value) {
            addCriterion(PHONENUMBER_LIKE, value + "%", PHONENUMBER);
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLikeOnBoth(String value) {
            addCriterion(PHONENUMBER_LIKE, "%" + value + "%", PHONENUMBER);
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion(PHONENUMBER_NOT_LIKE, value, PHONENUMBER);
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLikeOnLeft(String value) {
            addCriterion(PHONENUMBER_NOT_LIKE, "%" + value, PHONENUMBER);
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLikeOnRight(String value) {
            addCriterion(PHONENUMBER_NOT_LIKE, value + "%", PHONENUMBER);
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLikeOnBoth(String value) {
            addCriterion(PHONENUMBER_NOT_LIKE, "%" + value + "%", PHONENUMBER);
            return (Criteria) this;
        }
        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("`phone_number` in", values, PHONENUMBER);
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("`phone_number` not in", values, PHONENUMBER);
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("`phone_number` between", value1, value2, PHONENUMBER);
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("`phone_number` not between", value1, value2, PHONENUMBER);
            return (Criteria) this;
        }
        private static final String BIRTHDAY = "birthday";

        public Criteria andBirthdayIsNull() {
            addCriterion("`birthday` is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("`birthday` is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("`birthday` =", value, BIRTHDAY);
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("`birthday` <>", value, BIRTHDAY);
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("`birthday` >", value, BIRTHDAY);
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("`birthday` >=", value, BIRTHDAY);
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("`birthday` <", value, BIRTHDAY);
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("`birthday` <=", value, BIRTHDAY);
            return (Criteria) this;
        }
        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("`birthday` in", values, BIRTHDAY);
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("`birthday` not in", values, BIRTHDAY);
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("`birthday` between", value1, value2, BIRTHDAY);
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("`birthday` not between", value1, value2, BIRTHDAY);
            return (Criteria) this;
        }
        private static final String GENDER = "gender";

        public Criteria andGenderIsNull() {
            addCriterion("`gender` is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("`gender` is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Byte value) {
            addCriterion("`gender` =", value, GENDER);
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Byte value) {
            addCriterion("`gender` <>", value, GENDER);
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Byte value) {
            addCriterion("`gender` >", value, GENDER);
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Byte value) {
            addCriterion("`gender` >=", value, GENDER);
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Byte value) {
            addCriterion("`gender` <", value, GENDER);
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Byte value) {
            addCriterion("`gender` <=", value, GENDER);
            return (Criteria) this;
        }
        public Criteria andGenderIn(List<Byte> values) {
            addCriterion("`gender` in", values, GENDER);
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Byte> values) {
            addCriterion("`gender` not in", values, GENDER);
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Byte value1, Byte value2) {
            addCriterion("`gender` between", value1, value2, GENDER);
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Byte value1, Byte value2) {
            addCriterion("`gender` not between", value1, value2, GENDER);
            return (Criteria) this;
        }
        private static final String NICKNAME = "nickName";

        public Criteria andNickNameIsNull() {
            addCriterion("`nick_name` is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("`nick_name` is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("`nick_name` =", value, NICKNAME);
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("`nick_name` <>", value, NICKNAME);
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("`nick_name` >", value, NICKNAME);
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("`nick_name` >=", value, NICKNAME);
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("`nick_name` <", value, NICKNAME);
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("`nick_name` <=", value, NICKNAME);
            return (Criteria) this;
        }

        private static final String NICKNAME_LIKE = "`nick_name` like";
        private static final String NICKNAME_NOT_LIKE = "`nick_name` not like";

        public Criteria andNickNameLike(String value) {
            addCriterion(NICKNAME_LIKE, value, NICKNAME);
            return (Criteria) this;
        }

        public Criteria andNickNameLikeOnLeft(String value) {
            addCriterion(NICKNAME_LIKE, "%" + value, NICKNAME);
            return (Criteria) this;
        }

        public Criteria andNickNameLikeOnRight(String value) {
            addCriterion(NICKNAME_LIKE, value + "%", NICKNAME);
            return (Criteria) this;
        }

        public Criteria andNickNameLikeOnBoth(String value) {
            addCriterion(NICKNAME_LIKE, "%" + value + "%", NICKNAME);
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion(NICKNAME_NOT_LIKE, value, NICKNAME);
            return (Criteria) this;
        }

        public Criteria andNickNameNotLikeOnLeft(String value) {
            addCriterion(NICKNAME_NOT_LIKE, "%" + value, NICKNAME);
            return (Criteria) this;
        }

        public Criteria andNickNameNotLikeOnRight(String value) {
            addCriterion(NICKNAME_NOT_LIKE, value + "%", NICKNAME);
            return (Criteria) this;
        }

        public Criteria andNickNameNotLikeOnBoth(String value) {
            addCriterion(NICKNAME_NOT_LIKE, "%" + value + "%", NICKNAME);
            return (Criteria) this;
        }
        public Criteria andNickNameIn(List<String> values) {
            addCriterion("`nick_name` in", values, NICKNAME);
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("`nick_name` not in", values, NICKNAME);
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("`nick_name` between", value1, value2, NICKNAME);
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("`nick_name` not between", value1, value2, NICKNAME);
            return (Criteria) this;
        }
        private static final String AVATAR = "avatar";

        public Criteria andAvatarIsNull() {
            addCriterion("`avatar` is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("`avatar` is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("`avatar` =", value, AVATAR);
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("`avatar` <>", value, AVATAR);
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("`avatar` >", value, AVATAR);
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("`avatar` >=", value, AVATAR);
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("`avatar` <", value, AVATAR);
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("`avatar` <=", value, AVATAR);
            return (Criteria) this;
        }

        private static final String AVATAR_LIKE = "`avatar` like";
        private static final String AVATAR_NOT_LIKE = "`avatar` not like";

        public Criteria andAvatarLike(String value) {
            addCriterion(AVATAR_LIKE, value, AVATAR);
            return (Criteria) this;
        }

        public Criteria andAvatarLikeOnLeft(String value) {
            addCriterion(AVATAR_LIKE, "%" + value, AVATAR);
            return (Criteria) this;
        }

        public Criteria andAvatarLikeOnRight(String value) {
            addCriterion(AVATAR_LIKE, value + "%", AVATAR);
            return (Criteria) this;
        }

        public Criteria andAvatarLikeOnBoth(String value) {
            addCriterion(AVATAR_LIKE, "%" + value + "%", AVATAR);
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion(AVATAR_NOT_LIKE, value, AVATAR);
            return (Criteria) this;
        }

        public Criteria andAvatarNotLikeOnLeft(String value) {
            addCriterion(AVATAR_NOT_LIKE, "%" + value, AVATAR);
            return (Criteria) this;
        }

        public Criteria andAvatarNotLikeOnRight(String value) {
            addCriterion(AVATAR_NOT_LIKE, value + "%", AVATAR);
            return (Criteria) this;
        }

        public Criteria andAvatarNotLikeOnBoth(String value) {
            addCriterion(AVATAR_NOT_LIKE, "%" + value + "%", AVATAR);
            return (Criteria) this;
        }
        public Criteria andAvatarIn(List<String> values) {
            addCriterion("`avatar` in", values, AVATAR);
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("`avatar` not in", values, AVATAR);
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("`avatar` between", value1, value2, AVATAR);
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("`avatar` not between", value1, value2, AVATAR);
            return (Criteria) this;
        }
        private static final String CREATETIME = "createTime";

        public Criteria andCreateTimeIsNull() {
            addCriterion("`create_time` is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("`create_time` is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("`create_time` =", value, CREATETIME);
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("`create_time` <>", value, CREATETIME);
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("`create_time` >", value, CREATETIME);
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`create_time` >=", value, CREATETIME);
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("`create_time` <", value, CREATETIME);
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("`create_time` <=", value, CREATETIME);
            return (Criteria) this;
        }
        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("`create_time` in", values, CREATETIME);
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("`create_time` not in", values, CREATETIME);
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("`create_time` between", value1, value2, CREATETIME);
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("`create_time` not between", value1, value2, CREATETIME);
            return (Criteria) this;
        }
        private static final String LOGINTIME = "loginTime";

        public Criteria andLoginTimeIsNull() {
            addCriterion("`login_time` is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("`login_time` is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Date value) {
            addCriterion("`login_time` =", value, LOGINTIME);
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Date value) {
            addCriterion("`login_time` <>", value, LOGINTIME);
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Date value) {
            addCriterion("`login_time` >", value, LOGINTIME);
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`login_time` >=", value, LOGINTIME);
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Date value) {
            addCriterion("`login_time` <", value, LOGINTIME);
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("`login_time` <=", value, LOGINTIME);
            return (Criteria) this;
        }
        public Criteria andLoginTimeIn(List<Date> values) {
            addCriterion("`login_time` in", values, LOGINTIME);
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Date> values) {
            addCriterion("`login_time` not in", values, LOGINTIME);
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Date value1, Date value2) {
            addCriterion("`login_time` between", value1, value2, LOGINTIME);
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("`login_time` not between", value1, value2, LOGINTIME);
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