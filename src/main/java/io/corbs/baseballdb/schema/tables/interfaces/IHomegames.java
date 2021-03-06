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
public interface IHomegames extends Serializable {

    /**
     * Setter for <code>baseballdb.HomeGames.year.key</code>.
     */
    public IHomegames setYearKey(Integer value);

    /**
     * Getter for <code>baseballdb.HomeGames.year.key</code>.
     */
    public Integer getYearKey();

    /**
     * Setter for <code>baseballdb.HomeGames.league.key</code>.
     */
    public IHomegames setLeagueKey(String value);

    /**
     * Getter for <code>baseballdb.HomeGames.league.key</code>.
     */
    public String getLeagueKey();

    /**
     * Setter for <code>baseballdb.HomeGames.team.key</code>.
     */
    public IHomegames setTeamKey(String value);

    /**
     * Getter for <code>baseballdb.HomeGames.team.key</code>.
     */
    public String getTeamKey();

    /**
     * Setter for <code>baseballdb.HomeGames.park.key</code>.
     */
    public IHomegames setParkKey(String value);

    /**
     * Getter for <code>baseballdb.HomeGames.park.key</code>.
     */
    public String getParkKey();

    /**
     * Setter for <code>baseballdb.HomeGames.span.first</code>.
     */
    public IHomegames setSpanFirst(String value);

    /**
     * Getter for <code>baseballdb.HomeGames.span.first</code>.
     */
    public String getSpanFirst();

    /**
     * Setter for <code>baseballdb.HomeGames.span.last</code>.
     */
    public IHomegames setSpanLast(String value);

    /**
     * Getter for <code>baseballdb.HomeGames.span.last</code>.
     */
    public String getSpanLast();

    /**
     * Setter for <code>baseballdb.HomeGames.games</code>.
     */
    public IHomegames setGames(Integer value);

    /**
     * Getter for <code>baseballdb.HomeGames.games</code>.
     */
    public Integer getGames();

    /**
     * Setter for <code>baseballdb.HomeGames.openings</code>.
     */
    public IHomegames setOpenings(Integer value);

    /**
     * Getter for <code>baseballdb.HomeGames.openings</code>.
     */
    public Integer getOpenings();

    /**
     * Setter for <code>baseballdb.HomeGames.attendance</code>.
     */
    public IHomegames setAttendance(Integer value);

    /**
     * Getter for <code>baseballdb.HomeGames.attendance</code>.
     */
    public Integer getAttendance();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IHomegames
     */
    public void from(io.corbs.baseballdb.schema.tables.interfaces.IHomegames from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IHomegames
     */
    public <E extends io.corbs.baseballdb.schema.tables.interfaces.IHomegames> E into(E into);
}
