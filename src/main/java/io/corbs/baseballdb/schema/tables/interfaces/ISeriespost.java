/*
 * This file is generated by jOOQ.
*/
package io.corbs.baseballdb.schema.tables.interfaces;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ISeriespost extends Serializable {

    /**
     * Setter for <code>baseballdb.SeriesPost.yearID</code>.
     */
    public ISeriespost setYearid(Integer value);

    /**
     * Getter for <code>baseballdb.SeriesPost.yearID</code>.
     */
    public Integer getYearid();

    /**
     * Setter for <code>baseballdb.SeriesPost.round</code>.
     */
    public ISeriespost setRound(String value);

    /**
     * Getter for <code>baseballdb.SeriesPost.round</code>.
     */
    public String getRound();

    /**
     * Setter for <code>baseballdb.SeriesPost.teamIDwinner</code>.
     */
    public ISeriespost setTeamidwinner(String value);

    /**
     * Getter for <code>baseballdb.SeriesPost.teamIDwinner</code>.
     */
    public String getTeamidwinner();

    /**
     * Setter for <code>baseballdb.SeriesPost.lgIDwinner</code>.
     */
    public ISeriespost setLgidwinner(String value);

    /**
     * Getter for <code>baseballdb.SeriesPost.lgIDwinner</code>.
     */
    public String getLgidwinner();

    /**
     * Setter for <code>baseballdb.SeriesPost.teamIDloser</code>.
     */
    public ISeriespost setTeamidloser(String value);

    /**
     * Getter for <code>baseballdb.SeriesPost.teamIDloser</code>.
     */
    public String getTeamidloser();

    /**
     * Setter for <code>baseballdb.SeriesPost.lgIDloser</code>.
     */
    public ISeriespost setLgidloser(String value);

    /**
     * Getter for <code>baseballdb.SeriesPost.lgIDloser</code>.
     */
    public String getLgidloser();

    /**
     * Setter for <code>baseballdb.SeriesPost.wins</code>.
     */
    public ISeriespost setWins(Integer value);

    /**
     * Getter for <code>baseballdb.SeriesPost.wins</code>.
     */
    public Integer getWins();

    /**
     * Setter for <code>baseballdb.SeriesPost.losses</code>.
     */
    public ISeriespost setLosses(Integer value);

    /**
     * Getter for <code>baseballdb.SeriesPost.losses</code>.
     */
    public Integer getLosses();

    /**
     * Setter for <code>baseballdb.SeriesPost.ties</code>.
     */
    public ISeriespost setTies(Integer value);

    /**
     * Getter for <code>baseballdb.SeriesPost.ties</code>.
     */
    public Integer getTies();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ISeriespost
     */
    public void from(io.corbs.baseballdb.schema.tables.interfaces.ISeriespost from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ISeriespost
     */
    public <E extends io.corbs.baseballdb.schema.tables.interfaces.ISeriespost> E into(E into);
}
