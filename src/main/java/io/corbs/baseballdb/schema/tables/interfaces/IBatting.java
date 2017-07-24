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
public interface IBatting extends Serializable {

    /**
     * Setter for <code>baseballdb.Batting.playerID</code>.
     */
    public IBatting setPlayerid(String value);

    /**
     * Getter for <code>baseballdb.Batting.playerID</code>.
     */
    public String getPlayerid();

    /**
     * Setter for <code>baseballdb.Batting.yearID</code>.
     */
    public IBatting setYearid(Integer value);

    /**
     * Getter for <code>baseballdb.Batting.yearID</code>.
     */
    public Integer getYearid();

    /**
     * Setter for <code>baseballdb.Batting.stint</code>.
     */
    public IBatting setStint(Integer value);

    /**
     * Getter for <code>baseballdb.Batting.stint</code>.
     */
    public Integer getStint();

    /**
     * Setter for <code>baseballdb.Batting.teamID</code>.
     */
    public IBatting setTeamid(String value);

    /**
     * Getter for <code>baseballdb.Batting.teamID</code>.
     */
    public String getTeamid();

    /**
     * Setter for <code>baseballdb.Batting.lgID</code>.
     */
    public IBatting setLgid(String value);

    /**
     * Getter for <code>baseballdb.Batting.lgID</code>.
     */
    public String getLgid();

    /**
     * Setter for <code>baseballdb.Batting.G</code>.
     */
    public IBatting setG(Integer value);

    /**
     * Getter for <code>baseballdb.Batting.G</code>.
     */
    public Integer getG();

    /**
     * Setter for <code>baseballdb.Batting.AB</code>.
     */
    public IBatting setAb(Integer value);

    /**
     * Getter for <code>baseballdb.Batting.AB</code>.
     */
    public Integer getAb();

    /**
     * Setter for <code>baseballdb.Batting.R</code>.
     */
    public IBatting setR(Integer value);

    /**
     * Getter for <code>baseballdb.Batting.R</code>.
     */
    public Integer getR();

    /**
     * Setter for <code>baseballdb.Batting.H</code>.
     */
    public IBatting setH(Integer value);

    /**
     * Getter for <code>baseballdb.Batting.H</code>.
     */
    public Integer getH();

    /**
     * Setter for <code>baseballdb.Batting.2B</code>.
     */
    public IBatting set_2b(Integer value);

    /**
     * Getter for <code>baseballdb.Batting.2B</code>.
     */
    public Integer get_2b();

    /**
     * Setter for <code>baseballdb.Batting.3B</code>.
     */
    public IBatting set_3b(Integer value);

    /**
     * Getter for <code>baseballdb.Batting.3B</code>.
     */
    public Integer get_3b();

    /**
     * Setter for <code>baseballdb.Batting.HR</code>.
     */
    public IBatting setHr(Integer value);

    /**
     * Getter for <code>baseballdb.Batting.HR</code>.
     */
    public Integer getHr();

    /**
     * Setter for <code>baseballdb.Batting.RBI</code>.
     */
    public IBatting setRbi(Integer value);

    /**
     * Getter for <code>baseballdb.Batting.RBI</code>.
     */
    public Integer getRbi();

    /**
     * Setter for <code>baseballdb.Batting.SB</code>.
     */
    public IBatting setSb(Integer value);

    /**
     * Getter for <code>baseballdb.Batting.SB</code>.
     */
    public Integer getSb();

    /**
     * Setter for <code>baseballdb.Batting.CS</code>.
     */
    public IBatting setCs(Integer value);

    /**
     * Getter for <code>baseballdb.Batting.CS</code>.
     */
    public Integer getCs();

    /**
     * Setter for <code>baseballdb.Batting.BB</code>.
     */
    public IBatting setBb(Integer value);

    /**
     * Getter for <code>baseballdb.Batting.BB</code>.
     */
    public Integer getBb();

    /**
     * Setter for <code>baseballdb.Batting.SO</code>.
     */
    public IBatting setSo(Integer value);

    /**
     * Getter for <code>baseballdb.Batting.SO</code>.
     */
    public Integer getSo();

    /**
     * Setter for <code>baseballdb.Batting.IBB</code>.
     */
    public IBatting setIbb(String value);

    /**
     * Getter for <code>baseballdb.Batting.IBB</code>.
     */
    public String getIbb();

    /**
     * Setter for <code>baseballdb.Batting.HBP</code>.
     */
    public IBatting setHbp(String value);

    /**
     * Getter for <code>baseballdb.Batting.HBP</code>.
     */
    public String getHbp();

    /**
     * Setter for <code>baseballdb.Batting.SH</code>.
     */
    public IBatting setSh(String value);

    /**
     * Getter for <code>baseballdb.Batting.SH</code>.
     */
    public String getSh();

    /**
     * Setter for <code>baseballdb.Batting.SF</code>.
     */
    public IBatting setSf(String value);

    /**
     * Getter for <code>baseballdb.Batting.SF</code>.
     */
    public String getSf();

    /**
     * Setter for <code>baseballdb.Batting.GIDP</code>.
     */
    public IBatting setGidp(String value);

    /**
     * Getter for <code>baseballdb.Batting.GIDP</code>.
     */
    public String getGidp();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IBatting
     */
    public void from(io.corbs.baseballdb.schema.tables.interfaces.IBatting from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IBatting
     */
    public <E extends io.corbs.baseballdb.schema.tables.interfaces.IBatting> E into(E into);
}
