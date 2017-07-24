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
public interface IAwardsplayers extends Serializable {

    /**
     * Setter for <code>baseballdb.AwardsPlayers.playerID</code>.
     */
    public IAwardsplayers setPlayerid(String value);

    /**
     * Getter for <code>baseballdb.AwardsPlayers.playerID</code>.
     */
    public String getPlayerid();

    /**
     * Setter for <code>baseballdb.AwardsPlayers.awardID</code>.
     */
    public IAwardsplayers setAwardid(String value);

    /**
     * Getter for <code>baseballdb.AwardsPlayers.awardID</code>.
     */
    public String getAwardid();

    /**
     * Setter for <code>baseballdb.AwardsPlayers.yearID</code>.
     */
    public IAwardsplayers setYearid(Integer value);

    /**
     * Getter for <code>baseballdb.AwardsPlayers.yearID</code>.
     */
    public Integer getYearid();

    /**
     * Setter for <code>baseballdb.AwardsPlayers.lgID</code>.
     */
    public IAwardsplayers setLgid(String value);

    /**
     * Getter for <code>baseballdb.AwardsPlayers.lgID</code>.
     */
    public String getLgid();

    /**
     * Setter for <code>baseballdb.AwardsPlayers.tie</code>.
     */
    public IAwardsplayers setTie(String value);

    /**
     * Getter for <code>baseballdb.AwardsPlayers.tie</code>.
     */
    public String getTie();

    /**
     * Setter for <code>baseballdb.AwardsPlayers.notes</code>.
     */
    public IAwardsplayers setNotes(String value);

    /**
     * Getter for <code>baseballdb.AwardsPlayers.notes</code>.
     */
    public String getNotes();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IAwardsplayers
     */
    public void from(io.corbs.baseballdb.schema.tables.interfaces.IAwardsplayers from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IAwardsplayers
     */
    public <E extends io.corbs.baseballdb.schema.tables.interfaces.IAwardsplayers> E into(E into);
}
