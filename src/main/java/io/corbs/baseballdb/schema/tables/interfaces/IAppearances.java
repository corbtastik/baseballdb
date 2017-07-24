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
public interface IAppearances extends Serializable {

    /**
     * Setter for <code>baseballdb.Appearances.yearID</code>.
     */
    public IAppearances setYearid(Integer value);

    /**
     * Getter for <code>baseballdb.Appearances.yearID</code>.
     */
    public Integer getYearid();

    /**
     * Setter for <code>baseballdb.Appearances.teamID</code>.
     */
    public IAppearances setTeamid(String value);

    /**
     * Getter for <code>baseballdb.Appearances.teamID</code>.
     */
    public String getTeamid();

    /**
     * Setter for <code>baseballdb.Appearances.lgID</code>.
     */
    public IAppearances setLgid(String value);

    /**
     * Getter for <code>baseballdb.Appearances.lgID</code>.
     */
    public String getLgid();

    /**
     * Setter for <code>baseballdb.Appearances.playerID</code>.
     */
    public IAppearances setPlayerid(String value);

    /**
     * Getter for <code>baseballdb.Appearances.playerID</code>.
     */
    public String getPlayerid();

    /**
     * Setter for <code>baseballdb.Appearances.G_all</code>.
     */
    public IAppearances setGAll(Integer value);

    /**
     * Getter for <code>baseballdb.Appearances.G_all</code>.
     */
    public Integer getGAll();

    /**
     * Setter for <code>baseballdb.Appearances.GS</code>.
     */
    public IAppearances setGs(String value);

    /**
     * Getter for <code>baseballdb.Appearances.GS</code>.
     */
    public String getGs();

    /**
     * Setter for <code>baseballdb.Appearances.G_batting</code>.
     */
    public IAppearances setGBatting(Integer value);

    /**
     * Getter for <code>baseballdb.Appearances.G_batting</code>.
     */
    public Integer getGBatting();

    /**
     * Setter for <code>baseballdb.Appearances.G_defense</code>.
     */
    public IAppearances setGDefense(Integer value);

    /**
     * Getter for <code>baseballdb.Appearances.G_defense</code>.
     */
    public Integer getGDefense();

    /**
     * Setter for <code>baseballdb.Appearances.G_p</code>.
     */
    public IAppearances setGP(Integer value);

    /**
     * Getter for <code>baseballdb.Appearances.G_p</code>.
     */
    public Integer getGP();

    /**
     * Setter for <code>baseballdb.Appearances.G_c</code>.
     */
    public IAppearances setGC(Integer value);

    /**
     * Getter for <code>baseballdb.Appearances.G_c</code>.
     */
    public Integer getGC();

    /**
     * Setter for <code>baseballdb.Appearances.G_1b</code>.
     */
    public IAppearances setG_1b(Integer value);

    /**
     * Getter for <code>baseballdb.Appearances.G_1b</code>.
     */
    public Integer getG_1b();

    /**
     * Setter for <code>baseballdb.Appearances.G_2b</code>.
     */
    public IAppearances setG_2b(Integer value);

    /**
     * Getter for <code>baseballdb.Appearances.G_2b</code>.
     */
    public Integer getG_2b();

    /**
     * Setter for <code>baseballdb.Appearances.G_3b</code>.
     */
    public IAppearances setG_3b(Integer value);

    /**
     * Getter for <code>baseballdb.Appearances.G_3b</code>.
     */
    public Integer getG_3b();

    /**
     * Setter for <code>baseballdb.Appearances.G_ss</code>.
     */
    public IAppearances setGSs(Integer value);

    /**
     * Getter for <code>baseballdb.Appearances.G_ss</code>.
     */
    public Integer getGSs();

    /**
     * Setter for <code>baseballdb.Appearances.G_lf</code>.
     */
    public IAppearances setGLf(Integer value);

    /**
     * Getter for <code>baseballdb.Appearances.G_lf</code>.
     */
    public Integer getGLf();

    /**
     * Setter for <code>baseballdb.Appearances.G_cf</code>.
     */
    public IAppearances setGCf(Integer value);

    /**
     * Getter for <code>baseballdb.Appearances.G_cf</code>.
     */
    public Integer getGCf();

    /**
     * Setter for <code>baseballdb.Appearances.G_rf</code>.
     */
    public IAppearances setGRf(Integer value);

    /**
     * Getter for <code>baseballdb.Appearances.G_rf</code>.
     */
    public Integer getGRf();

    /**
     * Setter for <code>baseballdb.Appearances.G_of</code>.
     */
    public IAppearances setGOf(Integer value);

    /**
     * Getter for <code>baseballdb.Appearances.G_of</code>.
     */
    public Integer getGOf();

    /**
     * Setter for <code>baseballdb.Appearances.G_dh</code>.
     */
    public IAppearances setGDh(String value);

    /**
     * Getter for <code>baseballdb.Appearances.G_dh</code>.
     */
    public String getGDh();

    /**
     * Setter for <code>baseballdb.Appearances.G_ph</code>.
     */
    public IAppearances setGPh(String value);

    /**
     * Getter for <code>baseballdb.Appearances.G_ph</code>.
     */
    public String getGPh();

    /**
     * Setter for <code>baseballdb.Appearances.G_pr</code>.
     */
    public IAppearances setGPr(String value);

    /**
     * Getter for <code>baseballdb.Appearances.G_pr</code>.
     */
    public String getGPr();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IAppearances
     */
    public void from(io.corbs.baseballdb.schema.tables.interfaces.IAppearances from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IAppearances
     */
    public <E extends io.corbs.baseballdb.schema.tables.interfaces.IAppearances> E into(E into);
}
