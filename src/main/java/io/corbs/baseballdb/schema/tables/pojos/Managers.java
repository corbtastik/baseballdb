/*
 * This file is generated by jOOQ.
*/
package io.corbs.baseballdb.schema.tables.pojos;


import io.corbs.baseballdb.schema.tables.interfaces.IManagers;

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
public class Managers implements IManagers {

    private static final long serialVersionUID = 2104164919;

    private String  playerid;
    private Integer yearid;
    private String  teamid;
    private String  lgid;
    private Integer inseason;
    private Integer g;
    private Integer w;
    private Integer l;
    private Integer rank;
    private String  plyrmgr;

    public Managers() {}

    public Managers(Managers value) {
        this.playerid = value.playerid;
        this.yearid = value.yearid;
        this.teamid = value.teamid;
        this.lgid = value.lgid;
        this.inseason = value.inseason;
        this.g = value.g;
        this.w = value.w;
        this.l = value.l;
        this.rank = value.rank;
        this.plyrmgr = value.plyrmgr;
    }

    public Managers(
        String  playerid,
        Integer yearid,
        String  teamid,
        String  lgid,
        Integer inseason,
        Integer g,
        Integer w,
        Integer l,
        Integer rank,
        String  plyrmgr
    ) {
        this.playerid = playerid;
        this.yearid = yearid;
        this.teamid = teamid;
        this.lgid = lgid;
        this.inseason = inseason;
        this.g = g;
        this.w = w;
        this.l = l;
        this.rank = rank;
        this.plyrmgr = plyrmgr;
    }

    @Override
    public String getPlayerid() {
        return this.playerid;
    }

    @Override
    public Managers setPlayerid(String playerid) {
        this.playerid = playerid;
        return this;
    }

    @Override
    public Integer getYearid() {
        return this.yearid;
    }

    @Override
    public Managers setYearid(Integer yearid) {
        this.yearid = yearid;
        return this;
    }

    @Override
    public String getTeamid() {
        return this.teamid;
    }

    @Override
    public Managers setTeamid(String teamid) {
        this.teamid = teamid;
        return this;
    }

    @Override
    public String getLgid() {
        return this.lgid;
    }

    @Override
    public Managers setLgid(String lgid) {
        this.lgid = lgid;
        return this;
    }

    @Override
    public Integer getInseason() {
        return this.inseason;
    }

    @Override
    public Managers setInseason(Integer inseason) {
        this.inseason = inseason;
        return this;
    }

    @Override
    public Integer getG() {
        return this.g;
    }

    @Override
    public Managers setG(Integer g) {
        this.g = g;
        return this;
    }

    @Override
    public Integer getW() {
        return this.w;
    }

    @Override
    public Managers setW(Integer w) {
        this.w = w;
        return this;
    }

    @Override
    public Integer getL() {
        return this.l;
    }

    @Override
    public Managers setL(Integer l) {
        this.l = l;
        return this;
    }

    @Override
    public Integer getRank() {
        return this.rank;
    }

    @Override
    public Managers setRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    @Override
    public String getPlyrmgr() {
        return this.plyrmgr;
    }

    @Override
    public Managers setPlyrmgr(String plyrmgr) {
        this.plyrmgr = plyrmgr;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Managers (");

        sb.append(playerid);
        sb.append(", ").append(yearid);
        sb.append(", ").append(teamid);
        sb.append(", ").append(lgid);
        sb.append(", ").append(inseason);
        sb.append(", ").append(g);
        sb.append(", ").append(w);
        sb.append(", ").append(l);
        sb.append(", ").append(rank);
        sb.append(", ").append(plyrmgr);

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
    public void from(IManagers from) {
        setPlayerid(from.getPlayerid());
        setYearid(from.getYearid());
        setTeamid(from.getTeamid());
        setLgid(from.getLgid());
        setInseason(from.getInseason());
        setG(from.getG());
        setW(from.getW());
        setL(from.getL());
        setRank(from.getRank());
        setPlyrmgr(from.getPlyrmgr());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IManagers> E into(E into) {
        into.from(this);
        return into;
    }
}
