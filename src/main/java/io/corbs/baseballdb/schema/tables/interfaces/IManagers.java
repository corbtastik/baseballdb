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
public interface IManagers extends Serializable {

    /**
     * Setter for <code>baseballdb.Managers.playerID</code>.
     */
    public IManagers setPlayerid(String value);

    /**
     * Getter for <code>baseballdb.Managers.playerID</code>.
     */
    public String getPlayerid();

    /**
     * Setter for <code>baseballdb.Managers.yearID</code>.
     */
    public IManagers setYearid(Integer value);

    /**
     * Getter for <code>baseballdb.Managers.yearID</code>.
     */
    public Integer getYearid();

    /**
     * Setter for <code>baseballdb.Managers.teamID</code>.
     */
    public IManagers setTeamid(String value);

    /**
     * Getter for <code>baseballdb.Managers.teamID</code>.
     */
    public String getTeamid();

    /**
     * Setter for <code>baseballdb.Managers.lgID</code>.
     */
    public IManagers setLgid(String value);

    /**
     * Getter for <code>baseballdb.Managers.lgID</code>.
     */
    public String getLgid();

    /**
     * Setter for <code>baseballdb.Managers.inseason</code>.
     */
    public IManagers setInseason(Integer value);

    /**
     * Getter for <code>baseballdb.Managers.inseason</code>.
     */
    public Integer getInseason();

    /**
     * Setter for <code>baseballdb.Managers.G</code>.
     */
    public IManagers setG(Integer value);

    /**
     * Getter for <code>baseballdb.Managers.G</code>.
     */
    public Integer getG();

    /**
     * Setter for <code>baseballdb.Managers.W</code>.
     */
    public IManagers setW(Integer value);

    /**
     * Getter for <code>baseballdb.Managers.W</code>.
     */
    public Integer getW();

    /**
     * Setter for <code>baseballdb.Managers.L</code>.
     */
    public IManagers setL(Integer value);

    /**
     * Getter for <code>baseballdb.Managers.L</code>.
     */
    public Integer getL();

    /**
     * Setter for <code>baseballdb.Managers.rank</code>.
     */
    public IManagers setRank(Integer value);

    /**
     * Getter for <code>baseballdb.Managers.rank</code>.
     */
    public Integer getRank();

    /**
     * Setter for <code>baseballdb.Managers.plyrMgr</code>.
     */
    public IManagers setPlyrmgr(String value);

    /**
     * Getter for <code>baseballdb.Managers.plyrMgr</code>.
     */
    public String getPlyrmgr();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IManagers
     */
    public void from(io.corbs.baseballdb.schema.tables.interfaces.IManagers from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IManagers
     */
    public <E extends io.corbs.baseballdb.schema.tables.interfaces.IManagers> E into(E into);
}