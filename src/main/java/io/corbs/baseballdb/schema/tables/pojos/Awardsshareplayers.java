/*
 * This file is generated by jOOQ.
*/
package io.corbs.baseballdb.schema.tables.pojos;


import io.corbs.baseballdb.schema.tables.interfaces.IAwardsshareplayers;

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
public class Awardsshareplayers implements IAwardsshareplayers {

    private static final long serialVersionUID = -75210868;

    private String  awardid;
    private Integer yearid;
    private String  lgid;
    private String  playerid;
    private Integer pointswon;
    private Integer pointsmax;
    private Integer votesfirst;

    public Awardsshareplayers() {}

    public Awardsshareplayers(Awardsshareplayers value) {
        this.awardid = value.awardid;
        this.yearid = value.yearid;
        this.lgid = value.lgid;
        this.playerid = value.playerid;
        this.pointswon = value.pointswon;
        this.pointsmax = value.pointsmax;
        this.votesfirst = value.votesfirst;
    }

    public Awardsshareplayers(
        String  awardid,
        Integer yearid,
        String  lgid,
        String  playerid,
        Integer pointswon,
        Integer pointsmax,
        Integer votesfirst
    ) {
        this.awardid = awardid;
        this.yearid = yearid;
        this.lgid = lgid;
        this.playerid = playerid;
        this.pointswon = pointswon;
        this.pointsmax = pointsmax;
        this.votesfirst = votesfirst;
    }

    @Override
    public String getAwardid() {
        return this.awardid;
    }

    @Override
    public Awardsshareplayers setAwardid(String awardid) {
        this.awardid = awardid;
        return this;
    }

    @Override
    public Integer getYearid() {
        return this.yearid;
    }

    @Override
    public Awardsshareplayers setYearid(Integer yearid) {
        this.yearid = yearid;
        return this;
    }

    @Override
    public String getLgid() {
        return this.lgid;
    }

    @Override
    public Awardsshareplayers setLgid(String lgid) {
        this.lgid = lgid;
        return this;
    }

    @Override
    public String getPlayerid() {
        return this.playerid;
    }

    @Override
    public Awardsshareplayers setPlayerid(String playerid) {
        this.playerid = playerid;
        return this;
    }

    @Override
    public Integer getPointswon() {
        return this.pointswon;
    }

    @Override
    public Awardsshareplayers setPointswon(Integer pointswon) {
        this.pointswon = pointswon;
        return this;
    }

    @Override
    public Integer getPointsmax() {
        return this.pointsmax;
    }

    @Override
    public Awardsshareplayers setPointsmax(Integer pointsmax) {
        this.pointsmax = pointsmax;
        return this;
    }

    @Override
    public Integer getVotesfirst() {
        return this.votesfirst;
    }

    @Override
    public Awardsshareplayers setVotesfirst(Integer votesfirst) {
        this.votesfirst = votesfirst;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Awardsshareplayers (");

        sb.append(awardid);
        sb.append(", ").append(yearid);
        sb.append(", ").append(lgid);
        sb.append(", ").append(playerid);
        sb.append(", ").append(pointswon);
        sb.append(", ").append(pointsmax);
        sb.append(", ").append(votesfirst);

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
    public void from(IAwardsshareplayers from) {
        setAwardid(from.getAwardid());
        setYearid(from.getYearid());
        setLgid(from.getLgid());
        setPlayerid(from.getPlayerid());
        setPointswon(from.getPointswon());
        setPointsmax(from.getPointsmax());
        setVotesfirst(from.getVotesfirst());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IAwardsshareplayers> E into(E into) {
        into.from(this);
        return into;
    }
}
