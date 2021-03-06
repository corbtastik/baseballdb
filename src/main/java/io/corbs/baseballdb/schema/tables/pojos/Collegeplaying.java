/*
 * This file is generated by jOOQ.
*/
package io.corbs.baseballdb.schema.tables.pojos;


import io.corbs.baseballdb.schema.tables.interfaces.ICollegeplaying;

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
public class Collegeplaying implements ICollegeplaying {

    private static final long serialVersionUID = 141790410;

    private String  playerid;
    private String  schoolid;
    private Integer yearid;

    public Collegeplaying() {}

    public Collegeplaying(Collegeplaying value) {
        this.playerid = value.playerid;
        this.schoolid = value.schoolid;
        this.yearid = value.yearid;
    }

    public Collegeplaying(
        String  playerid,
        String  schoolid,
        Integer yearid
    ) {
        this.playerid = playerid;
        this.schoolid = schoolid;
        this.yearid = yearid;
    }

    @Override
    public String getPlayerid() {
        return this.playerid;
    }

    @Override
    public Collegeplaying setPlayerid(String playerid) {
        this.playerid = playerid;
        return this;
    }

    @Override
    public String getSchoolid() {
        return this.schoolid;
    }

    @Override
    public Collegeplaying setSchoolid(String schoolid) {
        this.schoolid = schoolid;
        return this;
    }

    @Override
    public Integer getYearid() {
        return this.yearid;
    }

    @Override
    public Collegeplaying setYearid(Integer yearid) {
        this.yearid = yearid;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Collegeplaying (");

        sb.append(playerid);
        sb.append(", ").append(schoolid);
        sb.append(", ").append(yearid);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ICollegeplaying from) {
        setPlayerid(from.getPlayerid());
        setSchoolid(from.getSchoolid());
        setYearid(from.getYearid());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ICollegeplaying> E into(E into) {
        into.from(this);
        return into;
    }
}
