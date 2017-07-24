/*
 * This file is generated by jOOQ.
*/
package io.corbs.baseballdb.schema.tables.pojos;


import io.corbs.baseballdb.schema.tables.interfaces.IBatting;

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
public class Batting implements IBatting {

    private static final long serialVersionUID = -2112414642;

    private String  playerid;
    private Integer yearid;
    private Integer stint;
    private String  teamid;
    private String  lgid;
    private Integer g;
    private Integer ab;
    private Integer r;
    private Integer h;
    private Integer _2b;
    private Integer _3b;
    private Integer hr;
    private Integer rbi;
    private Integer sb;
    private Integer cs;
    private Integer bb;
    private Integer so;
    private String  ibb;
    private String  hbp;
    private String  sh;
    private String  sf;
    private String  gidp;

    public Batting() {}

    public Batting(Batting value) {
        this.playerid = value.playerid;
        this.yearid = value.yearid;
        this.stint = value.stint;
        this.teamid = value.teamid;
        this.lgid = value.lgid;
        this.g = value.g;
        this.ab = value.ab;
        this.r = value.r;
        this.h = value.h;
        this._2b = value._2b;
        this._3b = value._3b;
        this.hr = value.hr;
        this.rbi = value.rbi;
        this.sb = value.sb;
        this.cs = value.cs;
        this.bb = value.bb;
        this.so = value.so;
        this.ibb = value.ibb;
        this.hbp = value.hbp;
        this.sh = value.sh;
        this.sf = value.sf;
        this.gidp = value.gidp;
    }

    public Batting(
        String  playerid,
        Integer yearid,
        Integer stint,
        String  teamid,
        String  lgid,
        Integer g,
        Integer ab,
        Integer r,
        Integer h,
        Integer _2b,
        Integer _3b,
        Integer hr,
        Integer rbi,
        Integer sb,
        Integer cs,
        Integer bb,
        Integer so,
        String  ibb,
        String  hbp,
        String  sh,
        String  sf,
        String  gidp
    ) {
        this.playerid = playerid;
        this.yearid = yearid;
        this.stint = stint;
        this.teamid = teamid;
        this.lgid = lgid;
        this.g = g;
        this.ab = ab;
        this.r = r;
        this.h = h;
        this._2b = _2b;
        this._3b = _3b;
        this.hr = hr;
        this.rbi = rbi;
        this.sb = sb;
        this.cs = cs;
        this.bb = bb;
        this.so = so;
        this.ibb = ibb;
        this.hbp = hbp;
        this.sh = sh;
        this.sf = sf;
        this.gidp = gidp;
    }

    @Override
    public String getPlayerid() {
        return this.playerid;
    }

    @Override
    public Batting setPlayerid(String playerid) {
        this.playerid = playerid;
        return this;
    }

    @Override
    public Integer getYearid() {
        return this.yearid;
    }

    @Override
    public Batting setYearid(Integer yearid) {
        this.yearid = yearid;
        return this;
    }

    @Override
    public Integer getStint() {
        return this.stint;
    }

    @Override
    public Batting setStint(Integer stint) {
        this.stint = stint;
        return this;
    }

    @Override
    public String getTeamid() {
        return this.teamid;
    }

    @Override
    public Batting setTeamid(String teamid) {
        this.teamid = teamid;
        return this;
    }

    @Override
    public String getLgid() {
        return this.lgid;
    }

    @Override
    public Batting setLgid(String lgid) {
        this.lgid = lgid;
        return this;
    }

    @Override
    public Integer getG() {
        return this.g;
    }

    @Override
    public Batting setG(Integer g) {
        this.g = g;
        return this;
    }

    @Override
    public Integer getAb() {
        return this.ab;
    }

    @Override
    public Batting setAb(Integer ab) {
        this.ab = ab;
        return this;
    }

    @Override
    public Integer getR() {
        return this.r;
    }

    @Override
    public Batting setR(Integer r) {
        this.r = r;
        return this;
    }

    @Override
    public Integer getH() {
        return this.h;
    }

    @Override
    public Batting setH(Integer h) {
        this.h = h;
        return this;
    }

    @Override
    public Integer get_2b() {
        return this._2b;
    }

    @Override
    public Batting set_2b(Integer _2b) {
        this._2b = _2b;
        return this;
    }

    @Override
    public Integer get_3b() {
        return this._3b;
    }

    @Override
    public Batting set_3b(Integer _3b) {
        this._3b = _3b;
        return this;
    }

    @Override
    public Integer getHr() {
        return this.hr;
    }

    @Override
    public Batting setHr(Integer hr) {
        this.hr = hr;
        return this;
    }

    @Override
    public Integer getRbi() {
        return this.rbi;
    }

    @Override
    public Batting setRbi(Integer rbi) {
        this.rbi = rbi;
        return this;
    }

    @Override
    public Integer getSb() {
        return this.sb;
    }

    @Override
    public Batting setSb(Integer sb) {
        this.sb = sb;
        return this;
    }

    @Override
    public Integer getCs() {
        return this.cs;
    }

    @Override
    public Batting setCs(Integer cs) {
        this.cs = cs;
        return this;
    }

    @Override
    public Integer getBb() {
        return this.bb;
    }

    @Override
    public Batting setBb(Integer bb) {
        this.bb = bb;
        return this;
    }

    @Override
    public Integer getSo() {
        return this.so;
    }

    @Override
    public Batting setSo(Integer so) {
        this.so = so;
        return this;
    }

    @Override
    public String getIbb() {
        return this.ibb;
    }

    @Override
    public Batting setIbb(String ibb) {
        this.ibb = ibb;
        return this;
    }

    @Override
    public String getHbp() {
        return this.hbp;
    }

    @Override
    public Batting setHbp(String hbp) {
        this.hbp = hbp;
        return this;
    }

    @Override
    public String getSh() {
        return this.sh;
    }

    @Override
    public Batting setSh(String sh) {
        this.sh = sh;
        return this;
    }

    @Override
    public String getSf() {
        return this.sf;
    }

    @Override
    public Batting setSf(String sf) {
        this.sf = sf;
        return this;
    }

    @Override
    public String getGidp() {
        return this.gidp;
    }

    @Override
    public Batting setGidp(String gidp) {
        this.gidp = gidp;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Batting (");

        sb.append(playerid);
        sb.append(", ").append(yearid);
        sb.append(", ").append(stint);
        sb.append(", ").append(teamid);
        sb.append(", ").append(lgid);
        sb.append(", ").append(g);
        sb.append(", ").append(ab);
        sb.append(", ").append(r);
        sb.append(", ").append(h);
        sb.append(", ").append(_2b);
        sb.append(", ").append(_3b);
        sb.append(", ").append(hr);
        sb.append(", ").append(rbi);
        sb.append(", ").append(sb);
        sb.append(", ").append(cs);
        sb.append(", ").append(bb);
        sb.append(", ").append(so);
        sb.append(", ").append(ibb);
        sb.append(", ").append(hbp);
        sb.append(", ").append(sh);
        sb.append(", ").append(sf);
        sb.append(", ").append(gidp);

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
    public void from(IBatting from) {
        setPlayerid(from.getPlayerid());
        setYearid(from.getYearid());
        setStint(from.getStint());
        setTeamid(from.getTeamid());
        setLgid(from.getLgid());
        setG(from.getG());
        setAb(from.getAb());
        setR(from.getR());
        setH(from.getH());
        set_2b(from.get_2b());
        set_3b(from.get_3b());
        setHr(from.getHr());
        setRbi(from.getRbi());
        setSb(from.getSb());
        setCs(from.getCs());
        setBb(from.getBb());
        setSo(from.getSo());
        setIbb(from.getIbb());
        setHbp(from.getHbp());
        setSh(from.getSh());
        setSf(from.getSf());
        setGidp(from.getGidp());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IBatting> E into(E into) {
        into.from(this);
        return into;
    }
}