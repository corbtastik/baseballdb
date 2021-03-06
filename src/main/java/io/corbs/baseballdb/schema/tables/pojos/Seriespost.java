/*
 * This file is generated by jOOQ.
*/
package io.corbs.baseballdb.schema.tables.pojos;


import io.corbs.baseballdb.schema.tables.interfaces.ISeriespost;

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
public class Seriespost implements ISeriespost {

    private static final long serialVersionUID = -2100903598;

    private Integer yearid;
    private String  round;
    private String  teamidwinner;
    private String  lgidwinner;
    private String  teamidloser;
    private String  lgidloser;
    private Integer wins;
    private Integer losses;
    private Integer ties;

    public Seriespost() {}

    public Seriespost(Seriespost value) {
        this.yearid = value.yearid;
        this.round = value.round;
        this.teamidwinner = value.teamidwinner;
        this.lgidwinner = value.lgidwinner;
        this.teamidloser = value.teamidloser;
        this.lgidloser = value.lgidloser;
        this.wins = value.wins;
        this.losses = value.losses;
        this.ties = value.ties;
    }

    public Seriespost(
        Integer yearid,
        String  round,
        String  teamidwinner,
        String  lgidwinner,
        String  teamidloser,
        String  lgidloser,
        Integer wins,
        Integer losses,
        Integer ties
    ) {
        this.yearid = yearid;
        this.round = round;
        this.teamidwinner = teamidwinner;
        this.lgidwinner = lgidwinner;
        this.teamidloser = teamidloser;
        this.lgidloser = lgidloser;
        this.wins = wins;
        this.losses = losses;
        this.ties = ties;
    }

    @Override
    public Integer getYearid() {
        return this.yearid;
    }

    @Override
    public Seriespost setYearid(Integer yearid) {
        this.yearid = yearid;
        return this;
    }

    @Override
    public String getRound() {
        return this.round;
    }

    @Override
    public Seriespost setRound(String round) {
        this.round = round;
        return this;
    }

    @Override
    public String getTeamidwinner() {
        return this.teamidwinner;
    }

    @Override
    public Seriespost setTeamidwinner(String teamidwinner) {
        this.teamidwinner = teamidwinner;
        return this;
    }

    @Override
    public String getLgidwinner() {
        return this.lgidwinner;
    }

    @Override
    public Seriespost setLgidwinner(String lgidwinner) {
        this.lgidwinner = lgidwinner;
        return this;
    }

    @Override
    public String getTeamidloser() {
        return this.teamidloser;
    }

    @Override
    public Seriespost setTeamidloser(String teamidloser) {
        this.teamidloser = teamidloser;
        return this;
    }

    @Override
    public String getLgidloser() {
        return this.lgidloser;
    }

    @Override
    public Seriespost setLgidloser(String lgidloser) {
        this.lgidloser = lgidloser;
        return this;
    }

    @Override
    public Integer getWins() {
        return this.wins;
    }

    @Override
    public Seriespost setWins(Integer wins) {
        this.wins = wins;
        return this;
    }

    @Override
    public Integer getLosses() {
        return this.losses;
    }

    @Override
    public Seriespost setLosses(Integer losses) {
        this.losses = losses;
        return this;
    }

    @Override
    public Integer getTies() {
        return this.ties;
    }

    @Override
    public Seriespost setTies(Integer ties) {
        this.ties = ties;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Seriespost (");

        sb.append(yearid);
        sb.append(", ").append(round);
        sb.append(", ").append(teamidwinner);
        sb.append(", ").append(lgidwinner);
        sb.append(", ").append(teamidloser);
        sb.append(", ").append(lgidloser);
        sb.append(", ").append(wins);
        sb.append(", ").append(losses);
        sb.append(", ").append(ties);

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
    public void from(ISeriespost from) {
        setYearid(from.getYearid());
        setRound(from.getRound());
        setTeamidwinner(from.getTeamidwinner());
        setLgidwinner(from.getLgidwinner());
        setTeamidloser(from.getTeamidloser());
        setLgidloser(from.getLgidloser());
        setWins(from.getWins());
        setLosses(from.getLosses());
        setTies(from.getTies());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ISeriespost> E into(E into) {
        into.from(this);
        return into;
    }
}
