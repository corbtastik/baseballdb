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
public interface ITeamsfranchises extends Serializable {

    /**
     * Setter for <code>baseballdb.TeamsFranchises.franchID</code>.
     */
    public ITeamsfranchises setFranchid(String value);

    /**
     * Getter for <code>baseballdb.TeamsFranchises.franchID</code>.
     */
    public String getFranchid();

    /**
     * Setter for <code>baseballdb.TeamsFranchises.franchName</code>.
     */
    public ITeamsfranchises setFranchname(String value);

    /**
     * Getter for <code>baseballdb.TeamsFranchises.franchName</code>.
     */
    public String getFranchname();

    /**
     * Setter for <code>baseballdb.TeamsFranchises.active</code>.
     */
    public ITeamsfranchises setActive(String value);

    /**
     * Getter for <code>baseballdb.TeamsFranchises.active</code>.
     */
    public String getActive();

    /**
     * Setter for <code>baseballdb.TeamsFranchises.NAassoc</code>.
     */
    public ITeamsfranchises setNaassoc(String value);

    /**
     * Getter for <code>baseballdb.TeamsFranchises.NAassoc</code>.
     */
    public String getNaassoc();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ITeamsfranchises
     */
    public void from(io.corbs.baseballdb.schema.tables.interfaces.ITeamsfranchises from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ITeamsfranchises
     */
    public <E extends io.corbs.baseballdb.schema.tables.interfaces.ITeamsfranchises> E into(E into);
}
