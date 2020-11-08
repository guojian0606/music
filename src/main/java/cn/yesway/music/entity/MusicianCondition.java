package cn.yesway.music.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Musician的Condition类。
 * 由Code Generator生成。
 *
 * @author Code Generator
 */
public class MusicianCondition implements Serializable {

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
    public MusicianCondition() {
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
        private static final String CHINESENAME = "chineseName";

        public Criteria andChineseNameIsNull() {
            addCriterion("`chinese_name` is null");
            return (Criteria) this;
        }

        public Criteria andChineseNameIsNotNull() {
            addCriterion("`chinese_name` is not null");
            return (Criteria) this;
        }

        public Criteria andChineseNameEqualTo(String value) {
            addCriterion("`chinese_name` =", value, CHINESENAME);
            return (Criteria) this;
        }

        public Criteria andChineseNameNotEqualTo(String value) {
            addCriterion("`chinese_name` <>", value, CHINESENAME);
            return (Criteria) this;
        }

        public Criteria andChineseNameGreaterThan(String value) {
            addCriterion("`chinese_name` >", value, CHINESENAME);
            return (Criteria) this;
        }

        public Criteria andChineseNameGreaterThanOrEqualTo(String value) {
            addCriterion("`chinese_name` >=", value, CHINESENAME);
            return (Criteria) this;
        }

        public Criteria andChineseNameLessThan(String value) {
            addCriterion("`chinese_name` <", value, CHINESENAME);
            return (Criteria) this;
        }

        public Criteria andChineseNameLessThanOrEqualTo(String value) {
            addCriterion("`chinese_name` <=", value, CHINESENAME);
            return (Criteria) this;
        }

        private static final String CHINESENAME_LIKE = "`chinese_name` like";
        private static final String CHINESENAME_NOT_LIKE = "`chinese_name` not like";

        public Criteria andChineseNameLike(String value) {
            addCriterion(CHINESENAME_LIKE, value, CHINESENAME);
            return (Criteria) this;
        }

        public Criteria andChineseNameLikeOnLeft(String value) {
            addCriterion(CHINESENAME_LIKE, "%" + value, CHINESENAME);
            return (Criteria) this;
        }

        public Criteria andChineseNameLikeOnRight(String value) {
            addCriterion(CHINESENAME_LIKE, value + "%", CHINESENAME);
            return (Criteria) this;
        }

        public Criteria andChineseNameLikeOnBoth(String value) {
            addCriterion(CHINESENAME_LIKE, "%" + value + "%", CHINESENAME);
            return (Criteria) this;
        }

        public Criteria andChineseNameNotLike(String value) {
            addCriterion(CHINESENAME_NOT_LIKE, value, CHINESENAME);
            return (Criteria) this;
        }

        public Criteria andChineseNameNotLikeOnLeft(String value) {
            addCriterion(CHINESENAME_NOT_LIKE, "%" + value, CHINESENAME);
            return (Criteria) this;
        }

        public Criteria andChineseNameNotLikeOnRight(String value) {
            addCriterion(CHINESENAME_NOT_LIKE, value + "%", CHINESENAME);
            return (Criteria) this;
        }

        public Criteria andChineseNameNotLikeOnBoth(String value) {
            addCriterion(CHINESENAME_NOT_LIKE, "%" + value + "%", CHINESENAME);
            return (Criteria) this;
        }
        public Criteria andChineseNameIn(List<String> values) {
            addCriterion("`chinese_name` in", values, CHINESENAME);
            return (Criteria) this;
        }

        public Criteria andChineseNameNotIn(List<String> values) {
            addCriterion("`chinese_name` not in", values, CHINESENAME);
            return (Criteria) this;
        }

        public Criteria andChineseNameBetween(String value1, String value2) {
            addCriterion("`chinese_name` between", value1, value2, CHINESENAME);
            return (Criteria) this;
        }

        public Criteria andChineseNameNotBetween(String value1, String value2) {
            addCriterion("`chinese_name` not between", value1, value2, CHINESENAME);
            return (Criteria) this;
        }
        private static final String ENGLISHNAME = "englishName";

        public Criteria andEnglishNameIsNull() {
            addCriterion("`english_name` is null");
            return (Criteria) this;
        }

        public Criteria andEnglishNameIsNotNull() {
            addCriterion("`english_name` is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishNameEqualTo(String value) {
            addCriterion("`english_name` =", value, ENGLISHNAME);
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotEqualTo(String value) {
            addCriterion("`english_name` <>", value, ENGLISHNAME);
            return (Criteria) this;
        }

        public Criteria andEnglishNameGreaterThan(String value) {
            addCriterion("`english_name` >", value, ENGLISHNAME);
            return (Criteria) this;
        }

        public Criteria andEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("`english_name` >=", value, ENGLISHNAME);
            return (Criteria) this;
        }

        public Criteria andEnglishNameLessThan(String value) {
            addCriterion("`english_name` <", value, ENGLISHNAME);
            return (Criteria) this;
        }

        public Criteria andEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("`english_name` <=", value, ENGLISHNAME);
            return (Criteria) this;
        }

        private static final String ENGLISHNAME_LIKE = "`english_name` like";
        private static final String ENGLISHNAME_NOT_LIKE = "`english_name` not like";

        public Criteria andEnglishNameLike(String value) {
            addCriterion(ENGLISHNAME_LIKE, value, ENGLISHNAME);
            return (Criteria) this;
        }

        public Criteria andEnglishNameLikeOnLeft(String value) {
            addCriterion(ENGLISHNAME_LIKE, "%" + value, ENGLISHNAME);
            return (Criteria) this;
        }

        public Criteria andEnglishNameLikeOnRight(String value) {
            addCriterion(ENGLISHNAME_LIKE, value + "%", ENGLISHNAME);
            return (Criteria) this;
        }

        public Criteria andEnglishNameLikeOnBoth(String value) {
            addCriterion(ENGLISHNAME_LIKE, "%" + value + "%", ENGLISHNAME);
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotLike(String value) {
            addCriterion(ENGLISHNAME_NOT_LIKE, value, ENGLISHNAME);
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotLikeOnLeft(String value) {
            addCriterion(ENGLISHNAME_NOT_LIKE, "%" + value, ENGLISHNAME);
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotLikeOnRight(String value) {
            addCriterion(ENGLISHNAME_NOT_LIKE, value + "%", ENGLISHNAME);
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotLikeOnBoth(String value) {
            addCriterion(ENGLISHNAME_NOT_LIKE, "%" + value + "%", ENGLISHNAME);
            return (Criteria) this;
        }
        public Criteria andEnglishNameIn(List<String> values) {
            addCriterion("`english_name` in", values, ENGLISHNAME);
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotIn(List<String> values) {
            addCriterion("`english_name` not in", values, ENGLISHNAME);
            return (Criteria) this;
        }

        public Criteria andEnglishNameBetween(String value1, String value2) {
            addCriterion("`english_name` between", value1, value2, ENGLISHNAME);
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotBetween(String value1, String value2) {
            addCriterion("`english_name` not between", value1, value2, ENGLISHNAME);
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
        private static final String PROFILE = "profile";

        public Criteria andProfileIsNull() {
            addCriterion("`profile` is null");
            return (Criteria) this;
        }

        public Criteria andProfileIsNotNull() {
            addCriterion("`profile` is not null");
            return (Criteria) this;
        }

        public Criteria andProfileEqualTo(String value) {
            addCriterion("`profile` =", value, PROFILE);
            return (Criteria) this;
        }

        public Criteria andProfileNotEqualTo(String value) {
            addCriterion("`profile` <>", value, PROFILE);
            return (Criteria) this;
        }

        public Criteria andProfileGreaterThan(String value) {
            addCriterion("`profile` >", value, PROFILE);
            return (Criteria) this;
        }

        public Criteria andProfileGreaterThanOrEqualTo(String value) {
            addCriterion("`profile` >=", value, PROFILE);
            return (Criteria) this;
        }

        public Criteria andProfileLessThan(String value) {
            addCriterion("`profile` <", value, PROFILE);
            return (Criteria) this;
        }

        public Criteria andProfileLessThanOrEqualTo(String value) {
            addCriterion("`profile` <=", value, PROFILE);
            return (Criteria) this;
        }

        private static final String PROFILE_LIKE = "`profile` like";
        private static final String PROFILE_NOT_LIKE = "`profile` not like";

        public Criteria andProfileLike(String value) {
            addCriterion(PROFILE_LIKE, value, PROFILE);
            return (Criteria) this;
        }

        public Criteria andProfileLikeOnLeft(String value) {
            addCriterion(PROFILE_LIKE, "%" + value, PROFILE);
            return (Criteria) this;
        }

        public Criteria andProfileLikeOnRight(String value) {
            addCriterion(PROFILE_LIKE, value + "%", PROFILE);
            return (Criteria) this;
        }

        public Criteria andProfileLikeOnBoth(String value) {
            addCriterion(PROFILE_LIKE, "%" + value + "%", PROFILE);
            return (Criteria) this;
        }

        public Criteria andProfileNotLike(String value) {
            addCriterion(PROFILE_NOT_LIKE, value, PROFILE);
            return (Criteria) this;
        }

        public Criteria andProfileNotLikeOnLeft(String value) {
            addCriterion(PROFILE_NOT_LIKE, "%" + value, PROFILE);
            return (Criteria) this;
        }

        public Criteria andProfileNotLikeOnRight(String value) {
            addCriterion(PROFILE_NOT_LIKE, value + "%", PROFILE);
            return (Criteria) this;
        }

        public Criteria andProfileNotLikeOnBoth(String value) {
            addCriterion(PROFILE_NOT_LIKE, "%" + value + "%", PROFILE);
            return (Criteria) this;
        }
        public Criteria andProfileIn(List<String> values) {
            addCriterion("`profile` in", values, PROFILE);
            return (Criteria) this;
        }

        public Criteria andProfileNotIn(List<String> values) {
            addCriterion("`profile` not in", values, PROFILE);
            return (Criteria) this;
        }

        public Criteria andProfileBetween(String value1, String value2) {
            addCriterion("`profile` between", value1, value2, PROFILE);
            return (Criteria) this;
        }

        public Criteria andProfileNotBetween(String value1, String value2) {
            addCriterion("`profile` not between", value1, value2, PROFILE);
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