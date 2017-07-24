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
public interface IPitching extends Serializable {

    /**
     * Setter for <code>baseballdb.Pitching.playerID</code>.
     */
    public IPitching setPlayerid(String value);

    /**
     * Getter for <code>baseballdb.Pitching.playerID</code>.
     */
    public String getPlayerid();

    /**
     * Setter for <code>baseballdb.Pitching.yearID</code>.
     */
    public IPitching setYearid(Integer value);

    /**
     * Getter for <code>baseballdb.Pitching.yearID</code>.
     */
    public Integer getYearid();

    /**
     * Setter for <code>baseballdb.Pitching.stint</code>.
     */
    public IPitching setStint(Integer value);

    /**
     * Getter for <code>baseballdb.Pitching.stint</code>.
     */
    public Integer getStint();

    /**
     * Setter for <code>baseballdb.Pitching.teamID</code>.
     */
    public IPitching setTeamid(String value);

    /**
     * Getter for <code>baseballdb.Pitching.teamID</code>.
     */
    public String getTeamid();

    /**
     * Setter for <code>baseballdb.Pitching.lgID</code>.
     */
    public IPitching setLgid(String value);

    /**
     * Getter for <code>baseballdb.Pitching.lgID</code>.
     */
    public String getLgid();

    /**
     * Setter for <code>baseballdb.Pitching.W</code>.
     */
    public IPitching setW(Integer value);

    /**
     * Getter for <code>baseballdb.Pitching.W</code>.
     */
    public Integer getW();

    /**
     * Setter for <code>baseballdb.Pitching.L</code>.
     */
    public IPitching setL(Integer value);

    /**
     * Getter for <code>baseballdb.Pitching.L</code>.
     */
    public Integer getL();

    /**
     * Setter for <code>baseballdb.Pitching.G</code>.
     */
    public IPitching setG(Integer value);

    /**
     * Getter for <code>baseballdb.Pitching.G</code>.
     */
    public Integer getG();

    /**
     * Setter for <code>baseballdb.Pitching.GS</code>.
     */
    public IPitching setGs(Integer value);

    /**
     * Getter for <code>baseballdb.Pitching.GS</code>.
     */
    public Integer getGs();

    /**
     * Setter for <code>baseballdb.Pitching.CG</code>.
     */
    public IPitching setCg(Integer value);

    /**
     * Getter for <code>baseballdb.Pitching.CG</code>.
     */
    public Integer getCg();

    /**
     * Setter for <code>baseballdb.Pitching.SHO</code>.
     */
    public IPitching setSho(Integer value);

    /**
     * Getter for <code>baseballdb.Pitching.SHO</code>.
     */
    public Integer getSho();

    /**
     * Setter for <code>baseballdb.Pitching.SV</code>.
     */
    public IPitching setSv(Integer value);

    /**
     * Getter for <code>baseballdb.Pitching.SV</code>.
     */
    public Integer getSv();

    /**
     * Setter for <code>baseballdb.Pitching.IPouts</code>.
     */
    public IPitching setIpouts(Integer value);

    /**
     * Getter for <code>baseballdb.Pitching.IPouts</code>.
     */
    public Integer getIpouts();

    /**
     * Setter for <code>baseballdb.Pitching.H</code>.
     */
    public IPitching setH(Integer value);

    /**
     * Getter for <code>baseballdb.Pitching.H</code>.
     */
    public Integer getH();

    /**
     * Setter for <code>baseballdb.Pitching.ER</code>.
     */
    public IPitching setEr(Integer value);

    /**
     * Getter for <code>baseballdb.Pitching.ER</code>.
     */
    public Integer getEr();

    /**
     * Setter for <code>baseballdb.Pitching.HR</code>.
     */
    public IPitching setHr(Integer value);

    /**
     * Getter for <code>baseballdb.Pitching.HR</code>.
     */
    public Integer getHr();

    /**
     * Setter for <code>baseballdb.Pitching.BB</code>.
     */
    public IPitching setBb(Integer value);

    /**
     * Getter for <code>baseballdb.Pitching.BB</code>.
     */
    public Integer getBb();

    /**
     * Setter for <code>baseballdb.Pitching.SO</code>.
     */
    public IPitching setSo(Integer value);

    /**
     * Getter for <code>baseballdb.Pitching.SO</code>.
     */
    public Integer getSo();

    /**
     * Setter for <code>baseballdb.Pitching.BAOpp</code>.
     */
    public IPitching setBaopp(String value);

    /**
     * Getter for <code>baseballdb.Pitching.BAOpp</code>.
     */
    public String getBaopp();

    /**
     * Setter for <code>baseballdb.Pitching.ERA</code>.
     */
    public IPitching setEra(Double value);

    /**
     * Getter for <code>baseballdb.Pitching.ERA</code>.
     */
    public Double getEra();

    /**
     * Setter for <code>baseballdb.Pitching.IBB</code>.
     */
    public IPitching setIbb(String value);

    /**
     * Getter for <code>baseballdb.Pitching.IBB</code>.
     */
    public String getIbb();

    /**
     * Setter for <code>baseballdb.Pitching.WP</code>.
     */
    public IPitching setWp(String value);

    /**
     * Getter for <code>baseballdb.Pitching.WP</code>.
     */
    public String getWp();

    /**
     * Setter for <code>baseballdb.Pitching.HBP</code>.
     */
    public IPitching setHbp(String value);

    /**
     * Getter for <code>baseballdb.Pitching.HBP</code>.
     */
    public String getHbp();

    /**
     * Setter for <code>baseballdb.Pitching.BK</code>.
     */
    public IPitching setBk(Integer value);

    /**
     * Getter for <code>baseballdb.Pitching.BK</code>.
     */
    public Integer getBk();

    /**
     * Setter for <code>baseballdb.Pitching.BFP</code>.
     */
    public IPitching setBfp(String value);

    /**
     * Getter for <code>baseballdb.Pitching.BFP</code>.
     */
    public String getBfp();

    /**
     * Setter for <code>baseballdb.Pitching.GF</code>.
     */
    public IPitching setGf(String value);

    /**
     * Getter for <code>baseballdb.Pitching.GF</code>.
     */
    public String getGf();

    /**
     * Setter for <code>baseballdb.Pitching.R</code>.
     */
    public IPitching setR(Integer value);

    /**
     * Getter for <code>baseballdb.Pitching.R</code>.
     */
    public Integer getR();

    /**
     * Setter for <code>baseballdb.Pitching.SH</code>.
     */
    public IPitching setSh(String value);

    /**
     * Getter for <code>baseballdb.Pitching.SH</code>.
     */
    public String getSh();

    /**
     * Setter for <code>baseballdb.Pitching.SF</code>.
     */
    public IPitching setSf(String value);

    /**
     * Getter for <code>baseballdb.Pitching.SF</code>.
     */
    public String getSf();

    /**
     * Setter for <code>baseballdb.Pitching.GIDP</code>.
     */
    public IPitching setGidp(String value);

    /**
     * Getter for <code>baseballdb.Pitching.GIDP</code>.
     */
    public String getGidp();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IPitching
     */
    public void from(io.corbs.baseballdb.schema.tables.interfaces.IPitching from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IPitching
     */
    public <E extends io.corbs.baseballdb.schema.tables.interfaces.IPitching> E into(E into);
}
