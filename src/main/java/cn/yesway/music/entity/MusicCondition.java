package cn.yesway.music.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Music的Condition类。
 * 由Code Generator生成。
 *
 * @author Code Generator
 */
public class MusicCondition implements Serializable {

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
    public MusicCondition() {
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
        private static final String NAME = "name";

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, NAME);
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, NAME);
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, NAME);
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, NAME);
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, NAME);
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, NAME);
            return (Criteria) this;
        }

        private static final String NAME_LIKE = "`name` like";
        private static final String NAME_NOT_LIKE = "`name` not like";

        public Criteria andNameLike(String value) {
            addCriterion(NAME_LIKE, value, NAME);
            return (Criteria) this;
        }

        public Criteria andNameLikeOnLeft(String value) {
            addCriterion(NAME_LIKE, "%" + value, NAME);
            return (Criteria) this;
        }

        public Criteria andNameLikeOnRight(String value) {
            addCriterion(NAME_LIKE, value + "%", NAME);
            return (Criteria) this;
        }

        public Criteria andNameLikeOnBoth(String value) {
            addCriterion(NAME_LIKE, "%" + value + "%", NAME);
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion(NAME_NOT_LIKE, value, NAME);
            return (Criteria) this;
        }

        public Criteria andNameNotLikeOnLeft(String value) {
            addCriterion(NAME_NOT_LIKE, "%" + value, NAME);
            return (Criteria) this;
        }

        public Criteria andNameNotLikeOnRight(String value) {
            addCriterion(NAME_NOT_LIKE, value + "%", NAME);
            return (Criteria) this;
        }

        public Criteria andNameNotLikeOnBoth(String value) {
            addCriterion(NAME_NOT_LIKE, "%" + value + "%", NAME);
            return (Criteria) this;
        }
        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, NAME);
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, NAME);
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, NAME);
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, NAME);
            return (Criteria) this;
        }
        private static final String DESCRIPTION = "description";

        public Criteria andDescriptionIsNull() {
            addCriterion("`description` is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("`description` is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("`description` =", value, DESCRIPTION);
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("`description` <>", value, DESCRIPTION);
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("`description` >", value, DESCRIPTION);
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("`description` >=", value, DESCRIPTION);
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("`description` <", value, DESCRIPTION);
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("`description` <=", value, DESCRIPTION);
            return (Criteria) this;
        }

        private static final String DESCRIPTION_LIKE = "`description` like";
        private static final String DESCRIPTION_NOT_LIKE = "`description` not like";

        public Criteria andDescriptionLike(String value) {
            addCriterion(DESCRIPTION_LIKE, value, DESCRIPTION);
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeOnLeft(String value) {
            addCriterion(DESCRIPTION_LIKE, "%" + value, DESCRIPTION);
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeOnRight(String value) {
            addCriterion(DESCRIPTION_LIKE, value + "%", DESCRIPTION);
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeOnBoth(String value) {
            addCriterion(DESCRIPTION_LIKE, "%" + value + "%", DESCRIPTION);
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion(DESCRIPTION_NOT_LIKE, value, DESCRIPTION);
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLikeOnLeft(String value) {
            addCriterion(DESCRIPTION_NOT_LIKE, "%" + value, DESCRIPTION);
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLikeOnRight(String value) {
            addCriterion(DESCRIPTION_NOT_LIKE, value + "%", DESCRIPTION);
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLikeOnBoth(String value) {
            addCriterion(DESCRIPTION_NOT_LIKE, "%" + value + "%", DESCRIPTION);
            return (Criteria) this;
        }
        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("`description` in", values, DESCRIPTION);
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("`description` not in", values, DESCRIPTION);
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("`description` between", value1, value2, DESCRIPTION);
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("`description` not between", value1, value2, DESCRIPTION);
            return (Criteria) this;
        }
        private static final String COVER = "cover";

        public Criteria andCoverIsNull() {
            addCriterion("`cover` is null");
            return (Criteria) this;
        }

        public Criteria andCoverIsNotNull() {
            addCriterion("`cover` is not null");
            return (Criteria) this;
        }

        public Criteria andCoverEqualTo(String value) {
            addCriterion("`cover` =", value, COVER);
            return (Criteria) this;
        }

        public Criteria andCoverNotEqualTo(String value) {
            addCriterion("`cover` <>", value, COVER);
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThan(String value) {
            addCriterion("`cover` >", value, COVER);
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThanOrEqualTo(String value) {
            addCriterion("`cover` >=", value, COVER);
            return (Criteria) this;
        }

        public Criteria andCoverLessThan(String value) {
            addCriterion("`cover` <", value, COVER);
            return (Criteria) this;
        }

        public Criteria andCoverLessThanOrEqualTo(String value) {
            addCriterion("`cover` <=", value, COVER);
            return (Criteria) this;
        }

        private static final String COVER_LIKE = "`cover` like";
        private static final String COVER_NOT_LIKE = "`cover` not like";

        public Criteria andCoverLike(String value) {
            addCriterion(COVER_LIKE, value, COVER);
            return (Criteria) this;
        }

        public Criteria andCoverLikeOnLeft(String value) {
            addCriterion(COVER_LIKE, "%" + value, COVER);
            return (Criteria) this;
        }

        public Criteria andCoverLikeOnRight(String value) {
            addCriterion(COVER_LIKE, value + "%", COVER);
            return (Criteria) this;
        }

        public Criteria andCoverLikeOnBoth(String value) {
            addCriterion(COVER_LIKE, "%" + value + "%", COVER);
            return (Criteria) this;
        }

        public Criteria andCoverNotLike(String value) {
            addCriterion(COVER_NOT_LIKE, value, COVER);
            return (Criteria) this;
        }

        public Criteria andCoverNotLikeOnLeft(String value) {
            addCriterion(COVER_NOT_LIKE, "%" + value, COVER);
            return (Criteria) this;
        }

        public Criteria andCoverNotLikeOnRight(String value) {
            addCriterion(COVER_NOT_LIKE, value + "%", COVER);
            return (Criteria) this;
        }

        public Criteria andCoverNotLikeOnBoth(String value) {
            addCriterion(COVER_NOT_LIKE, "%" + value + "%", COVER);
            return (Criteria) this;
        }
        public Criteria andCoverIn(List<String> values) {
            addCriterion("`cover` in", values, COVER);
            return (Criteria) this;
        }

        public Criteria andCoverNotIn(List<String> values) {
            addCriterion("`cover` not in", values, COVER);
            return (Criteria) this;
        }

        public Criteria andCoverBetween(String value1, String value2) {
            addCriterion("`cover` between", value1, value2, COVER);
            return (Criteria) this;
        }

        public Criteria andCoverNotBetween(String value1, String value2) {
            addCriterion("`cover` not between", value1, value2, COVER);
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
        private static final String MUSICIANID = "musicianId";

        public Criteria andMusicianIdIsNull() {
            addCriterion("`musician_id` is null");
            return (Criteria) this;
        }

        public Criteria andMusicianIdIsNotNull() {
            addCriterion("`musician_id` is not null");
            return (Criteria) this;
        }

        public Criteria andMusicianIdEqualTo(Long value) {
            addCriterion("`musician_id` =", value, MUSICIANID);
            return (Criteria) this;
        }

        public Criteria andMusicianIdNotEqualTo(Long value) {
            addCriterion("`musician_id` <>", value, MUSICIANID);
            return (Criteria) this;
        }

        public Criteria andMusicianIdGreaterThan(Long value) {
            addCriterion("`musician_id` >", value, MUSICIANID);
            return (Criteria) this;
        }

        public Criteria andMusicianIdGreaterThanOrEqualTo(Long value) {
            addCriterion("`musician_id` >=", value, MUSICIANID);
            return (Criteria) this;
        }

        public Criteria andMusicianIdLessThan(Long value) {
            addCriterion("`musician_id` <", value, MUSICIANID);
            return (Criteria) this;
        }

        public Criteria andMusicianIdLessThanOrEqualTo(Long value) {
            addCriterion("`musician_id` <=", value, MUSICIANID);
            return (Criteria) this;
        }
        public Criteria andMusicianIdIn(List<Long> values) {
            addCriterion("`musician_id` in", values, MUSICIANID);
            return (Criteria) this;
        }

        public Criteria andMusicianIdNotIn(List<Long> values) {
            addCriterion("`musician_id` not in", values, MUSICIANID);
            return (Criteria) this;
        }

        public Criteria andMusicianIdBetween(Long value1, Long value2) {
            addCriterion("`musician_id` between", value1, value2, MUSICIANID);
            return (Criteria) this;
        }

        public Criteria andMusicianIdNotBetween(Long value1, Long value2) {
            addCriterion("`musician_id` not between", value1, value2, MUSICIANID);
            return (Criteria) this;
        }
        private static final String MUSICSOCRE = "musicSocre";

        public Criteria andMusicSocreIsNull() {
            addCriterion("`music_socre` is null");
            return (Criteria) this;
        }

        public Criteria andMusicSocreIsNotNull() {
            addCriterion("`music_socre` is not null");
            return (Criteria) this;
        }

        public Criteria andMusicSocreEqualTo(String value) {
            addCriterion("`music_socre` =", value, MUSICSOCRE);
            return (Criteria) this;
        }

        public Criteria andMusicSocreNotEqualTo(String value) {
            addCriterion("`music_socre` <>", value, MUSICSOCRE);
            return (Criteria) this;
        }

        public Criteria andMusicSocreGreaterThan(String value) {
            addCriterion("`music_socre` >", value, MUSICSOCRE);
            return (Criteria) this;
        }

        public Criteria andMusicSocreGreaterThanOrEqualTo(String value) {
            addCriterion("`music_socre` >=", value, MUSICSOCRE);
            return (Criteria) this;
        }

        public Criteria andMusicSocreLessThan(String value) {
            addCriterion("`music_socre` <", value, MUSICSOCRE);
            return (Criteria) this;
        }

        public Criteria andMusicSocreLessThanOrEqualTo(String value) {
            addCriterion("`music_socre` <=", value, MUSICSOCRE);
            return (Criteria) this;
        }

        private static final String MUSICSOCRE_LIKE = "`music_socre` like";
        private static final String MUSICSOCRE_NOT_LIKE = "`music_socre` not like";

        public Criteria andMusicSocreLike(String value) {
            addCriterion(MUSICSOCRE_LIKE, value, MUSICSOCRE);
            return (Criteria) this;
        }

        public Criteria andMusicSocreLikeOnLeft(String value) {
            addCriterion(MUSICSOCRE_LIKE, "%" + value, MUSICSOCRE);
            return (Criteria) this;
        }

        public Criteria andMusicSocreLikeOnRight(String value) {
            addCriterion(MUSICSOCRE_LIKE, value + "%", MUSICSOCRE);
            return (Criteria) this;
        }

        public Criteria andMusicSocreLikeOnBoth(String value) {
            addCriterion(MUSICSOCRE_LIKE, "%" + value + "%", MUSICSOCRE);
            return (Criteria) this;
        }

        public Criteria andMusicSocreNotLike(String value) {
            addCriterion(MUSICSOCRE_NOT_LIKE, value, MUSICSOCRE);
            return (Criteria) this;
        }

        public Criteria andMusicSocreNotLikeOnLeft(String value) {
            addCriterion(MUSICSOCRE_NOT_LIKE, "%" + value, MUSICSOCRE);
            return (Criteria) this;
        }

        public Criteria andMusicSocreNotLikeOnRight(String value) {
            addCriterion(MUSICSOCRE_NOT_LIKE, value + "%", MUSICSOCRE);
            return (Criteria) this;
        }

        public Criteria andMusicSocreNotLikeOnBoth(String value) {
            addCriterion(MUSICSOCRE_NOT_LIKE, "%" + value + "%", MUSICSOCRE);
            return (Criteria) this;
        }
        public Criteria andMusicSocreIn(List<String> values) {
            addCriterion("`music_socre` in", values, MUSICSOCRE);
            return (Criteria) this;
        }

        public Criteria andMusicSocreNotIn(List<String> values) {
            addCriterion("`music_socre` not in", values, MUSICSOCRE);
            return (Criteria) this;
        }

        public Criteria andMusicSocreBetween(String value1, String value2) {
            addCriterion("`music_socre` between", value1, value2, MUSICSOCRE);
            return (Criteria) this;
        }

        public Criteria andMusicSocreNotBetween(String value1, String value2) {
            addCriterion("`music_socre` not between", value1, value2, MUSICSOCRE);
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