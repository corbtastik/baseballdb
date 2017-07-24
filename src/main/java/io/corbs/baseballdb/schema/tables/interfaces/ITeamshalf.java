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
public interface ITeamshalf extends Serializable {

    /**
     * Setter for <code>baseballdb.TeamsHalf.yearID</code>.
     */
    public ITeamshalf setYearid(Integer value);

    /**
     * Getter for <code>baseballdb.TeamsHalf.yearID</code>.
     */
    public Integer getYearid();

    /**
     * Setter for <code>baseballdb.TeamsHalf.lgID</code>.
     */
    public ITeamshalf setLgid(String value);

    /**
     * Getter for <code>baseballdb.TeamsHalf.lgID</code>.
     */
    public String getLgid();

    /**
     * Setter for <code>baseballdb.TeamsHalf.teamID</code>.
     */
    public ITeamshalf setTeamid(String value);

    /**
     * Getter for <code>baseballdb.TeamsHalf.teamID</code>.
     */
    public String getTeamid();

    /**
     * Setter for <code>baseballdb.TeamsHalf.Half</code>.
     */
    public ITeamshalf setHalf(Integer value);

    /**
     * Getter for <code>baseballdb.TeamsHalf.Half</code>.
     */
    public Integer getHalf();

    /**
     * Setter for <code>baseballdb.TeamsHalf.divID</code>.
     */
    public ITeamshalf setDivid(String value);

    /**
     * Getter for <code>baseballdb.TeamsHalf.divID</code>.
     */
    public String getDivid();

    /**
     * Setter for <code>baseballdb.TeamsHalf.DivWin</code>.
     */
    public ITeamshalf setDivwin(String value);

    /**
     * Getter for <code>baseballdb.TeamsHalf.DivWin</code>.
     */
    public String getDivwin();

    /**
     * Setter for <code>baseballdb.TeamsHalf.Rank</code>.
     */
    public ITeamshalf setRank(Integer value);

    /**
     * Getter for <code>baseballdb.TeamsHalf.Rank</code>.
     */
    public Integer getRank();

    /**
     * Setter for <code>baseballdb.TeamsHalf.G</code>.
     */
    public ITeamshalf setG(Integer value);

    /**
     * Getter for <code>baseballdb.TeamsHalf.G</code>.
     */
    public Integer getG();

    /**
     * Setter for <code>baseballdb.TeamsHalf.W</code>.
     */
    public ITeamshalf setW(Integer value);

    /**
     * Getter for <code>baseballdb.TeamsHalf.W</code>.
     */
    public Integer getW();

    /**
     * Setter for <code>baseballdb.TeamsHalf.L</code>.
     */
    public ITeamshalf setL(Integer value);

    /**
     * Getter for <code>baseballdb.TeamsHalf.L</code>.
     */
    public Integer getL();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ITeamshalf
     */
    public void from(io.corbs.baseballdb.schema.tables.interfaces.ITeamshalf from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ITeamshalf
     */
    public <E extends io.corbs.baseballdb.schema.tables.interfaces.ITeamshalf> E into(E into);
}
