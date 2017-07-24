/*
 * This file is generated by jOOQ.
*/
package io.corbs.baseballdb.schema.tables.pojos;


import io.corbs.baseballdb.schema.tables.interfaces.ITeamshalf;

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
public class Teamshalf implements ITeamshalf {

    private static final long serialVersionUID = 584253454;

    private Integer yearid;
    private String  lgid;
    private String  teamid;
    private Integer half;
    private String  divid;
    private String  divwin;
    private Integer rank;
    private Integer g;
    private Integer w;
    private Integer l;

    public Teamshalf() {}

    public Teamshalf(Teamshalf value) {
        this.yearid = value.yearid;
        this.lgid = value.lgid;
        this.teamid = value.teamid;
        this.half = value.half;
        this.divid = value.divid;
        this.divwin = value.divwin;
        this.rank = value.rank;
        this.g = value.g;
        this.w = value.w;
        this.l = value.l;
    }

    public Teamshalf(
        Integer yearid,
        String  lgid,
        String  teamid,
        Integer half,
        String  divid,
        String  divwin,
        Integer rank,
        Integer g,
        Integer w,
        Integer l
    ) {
        this.yearid = yearid;
        this.lgid = lgid;
        this.teamid = teamid;
        this.half = half;
        this.divid = divid;
        this.divwin = divwin;
        this.rank = rank;
        this.g = g;
        this.w = w;
        this.l = l;
    }

    @Override
    public Integer getYearid() {
        return this.yearid;
    }

    @Override
    public Teamshalf setYearid(Integer yearid) {
        this.yearid = yearid;
        return this;
    }

    @Override
    public String getLgid() {
        return this.lgid;
    }

    @Override
    public Teamshalf setLgid(String lgid) {
        this.lgid = lgid;
        return this;
    }

    @Override
    public String getTeamid() {
        return this.teamid;
    }

    @Override
    public Teamshalf setTeamid(String teamid) {
        this.teamid = teamid;
        return this;
    }

    @Override
    public Integer getHalf() {
        return this.half;
    }

    @Override
    public Teamshalf setHalf(Integer half) {
        this.half = half;
        return this;
    }

    @Override
    public String getDivid() {
        return this.divid;
    }

    @Override
    public Teamshalf setDivid(String divid) {
        this.divid = divid;
        return this;
    }

    @Override
    public String getDivwin() {
        return this.divwin;
    }

    @Override
    public Teamshalf setDivwin(String divwin) {
        this.divwin = divwin;
        return this;
    }

    @Override
    public Integer getRank() {
        return this.rank;
    }

    @Override
    public Teamshalf setRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    @Override
    public Integer getG() {
        return this.g;
    }

    @Override
    public Teamshalf setG(Integer g) {
        this.g = g;
        return this;
    }

    @Override
    public Integer getW() {
        return this.w;
    }

    @Override
    public Teamshalf setW(Integer w) {
        this.w = w;
        return this;
    }

    @Override
    public Integer getL() {
        return this.l;
    }

    @Override
    public Teamshalf setL(Integer l) {
        this.l = l;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Teamshalf (");

        sb.append(yearid);
        sb.append(", ").append(lgid);
        sb.append(", ").append(teamid);
        sb.append(", ").append(half);
        sb.append(", ").append(divid);
        sb.append(", ").append(divwin);
        sb.append(", ").append(rank);
        sb.append(", ").append(g);
        sb.append(", ").append(w);
        sb.append(", ").append(l);

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
    public void from(ITeamshalf from) {
        setYearid(from.getYearid());
        setLgid(from.getLgid());
        setTeamid(from.getTeamid());
        setHalf(from.getHalf());
        setDivid(from.getDivid());
        setDivwin(from.getDivwin());
        setRank(from.getRank());
        setG(from.getG());
        setW(from.getW());
        setL(from.getL());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ITeamshalf> E into(E into) {
        into.from(this);
        return into;
    }
}