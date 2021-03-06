/*
 * This file is generated by jOOQ.
*/
package io.corbs.baseballdb.schema.tables.records;


import io.corbs.baseballdb.schema.tables.Pitching;
import io.corbs.baseballdb.schema.tables.interfaces.IPitching;

import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;


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
public class PitchingRecord extends TableRecordImpl<PitchingRecord> implements IPitching {

    private static final long serialVersionUID = 1092429065;

    /**
     * Setter for <code>baseballdb.Pitching.playerID</code>.
     */
    @Override
    public PitchingRecord setPlayerid(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.playerID</code>.
     */
    @Override
    public String getPlayerid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>baseballdb.Pitching.yearID</code>.
     */
    @Override
    public PitchingRecord setYearid(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.yearID</code>.
     */
    @Override
    public Integer getYearid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>baseballdb.Pitching.stint</code>.
     */
    @Override
    public PitchingRecord setStint(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.stint</code>.
     */
    @Override
    public Integer getStint() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>baseballdb.Pitching.teamID</code>.
     */
    @Override
    public PitchingRecord setTeamid(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.teamID</code>.
     */
    @Override
    public String getTeamid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>baseballdb.Pitching.lgID</code>.
     */
    @Override
    public PitchingRecord setLgid(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.lgID</code>.
     */
    @Override
    public String getLgid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>baseballdb.Pitching.W</code>.
     */
    @Override
    public PitchingRecord setW(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.W</code>.
     */
    @Override
    public Integer getW() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>baseballdb.Pitching.L</code>.
     */
    @Override
    public PitchingRecord setL(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.L</code>.
     */
    @Override
    public Integer getL() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>baseballdb.Pitching.G</code>.
     */
    @Override
    public PitchingRecord setG(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.G</code>.
     */
    @Override
    public Integer getG() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>baseballdb.Pitching.GS</code>.
     */
    @Override
    public PitchingRecord setGs(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.GS</code>.
     */
    @Override
    public Integer getGs() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>baseballdb.Pitching.CG</code>.
     */
    @Override
    public PitchingRecord setCg(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.CG</code>.
     */
    @Override
    public Integer getCg() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>baseballdb.Pitching.SHO</code>.
     */
    @Override
    public PitchingRecord setSho(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.SHO</code>.
     */
    @Override
    public Integer getSho() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>baseballdb.Pitching.SV</code>.
     */
    @Override
    public PitchingRecord setSv(Integer value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.SV</code>.
     */
    @Override
    public Integer getSv() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>baseballdb.Pitching.IPouts</code>.
     */
    @Override
    public PitchingRecord setIpouts(Integer value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.IPouts</code>.
     */
    @Override
    public Integer getIpouts() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>baseballdb.Pitching.H</code>.
     */
    @Override
    public PitchingRecord setH(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.H</code>.
     */
    @Override
    public Integer getH() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>baseballdb.Pitching.ER</code>.
     */
    @Override
    public PitchingRecord setEr(Integer value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.ER</code>.
     */
    @Override
    public Integer getEr() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>baseballdb.Pitching.HR</code>.
     */
    @Override
    public PitchingRecord setHr(Integer value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.HR</code>.
     */
    @Override
    public Integer getHr() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>baseballdb.Pitching.BB</code>.
     */
    @Override
    public PitchingRecord setBb(Integer value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.BB</code>.
     */
    @Override
    public Integer getBb() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>baseballdb.Pitching.SO</code>.
     */
    @Override
    public PitchingRecord setSo(Integer value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.SO</code>.
     */
    @Override
    public Integer getSo() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>baseballdb.Pitching.BAOpp</code>.
     */
    @Override
    public PitchingRecord setBaopp(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.BAOpp</code>.
     */
    @Override
    public String getBaopp() {
        return (String) get(18);
    }

    /**
     * Setter for <code>baseballdb.Pitching.ERA</code>.
     */
    @Override
    public PitchingRecord setEra(Double value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.ERA</code>.
     */
    @Override
    public Double getEra() {
        return (Double) get(19);
    }

    /**
     * Setter for <code>baseballdb.Pitching.IBB</code>.
     */
    @Override
    public PitchingRecord setIbb(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.IBB</code>.
     */
    @Override
    public String getIbb() {
        return (String) get(20);
    }

    /**
     * Setter for <code>baseballdb.Pitching.WP</code>.
     */
    @Override
    public PitchingRecord setWp(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.WP</code>.
     */
    @Override
    public String getWp() {
        return (String) get(21);
    }

    /**
     * Setter for <code>baseballdb.Pitching.HBP</code>.
     */
    @Override
    public PitchingRecord setHbp(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.HBP</code>.
     */
    @Override
    public String getHbp() {
        return (String) get(22);
    }

    /**
     * Setter for <code>baseballdb.Pitching.BK</code>.
     */
    @Override
    public PitchingRecord setBk(Integer value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.BK</code>.
     */
    @Override
    public Integer getBk() {
        return (Integer) get(23);
    }

    /**
     * Setter for <code>baseballdb.Pitching.BFP</code>.
     */
    @Override
    public PitchingRecord setBfp(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.BFP</code>.
     */
    @Override
    public String getBfp() {
        return (String) get(24);
    }

    /**
     * Setter for <code>baseballdb.Pitching.GF</code>.
     */
    @Override
    public PitchingRecord setGf(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.GF</code>.
     */
    @Override
    public String getGf() {
        return (String) get(25);
    }

    /**
     * Setter for <code>baseballdb.Pitching.R</code>.
     */
    @Override
    public PitchingRecord setR(Integer value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.R</code>.
     */
    @Override
    public Integer getR() {
        return (Integer) get(26);
    }

    /**
     * Setter for <code>baseballdb.Pitching.SH</code>.
     */
    @Override
    public PitchingRecord setSh(String value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.SH</code>.
     */
    @Override
    public String getSh() {
        return (String) get(27);
    }

    /**
     * Setter for <code>baseballdb.Pitching.SF</code>.
     */
    @Override
    public PitchingRecord setSf(String value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.SF</code>.
     */
    @Override
    public String getSf() {
        return (String) get(28);
    }

    /**
     * Setter for <code>baseballdb.Pitching.GIDP</code>.
     */
    @Override
    public PitchingRecord setGidp(String value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Pitching.GIDP</code>.
     */
    @Override
    public String getGidp() {
        return (String) get(29);
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IPitching from) {
        setPlayerid(from.getPlayerid());
        setYearid(from.getYearid());
        setStint(from.getStint());
        setTeamid(from.getTeamid());
        setLgid(from.getLgid());
        setW(from.getW());
        setL(from.getL());
        setG(from.getG());
        setGs(from.getGs());
        setCg(from.getCg());
        setSho(from.getSho());
        setSv(from.getSv());
        setIpouts(from.getIpouts());
        setH(from.getH());
        setEr(from.getEr());
        setHr(from.getHr());
        setBb(from.getBb());
        setSo(from.getSo());
        setBaopp(from.getBaopp());
        setEra(from.getEra());
        setIbb(from.getIbb());
        setWp(from.getWp());
        setHbp(from.getHbp());
        setBk(from.getBk());
        setBfp(from.getBfp());
        setGf(from.getGf());
        setR(from.getR());
        setSh(from.getSh());
        setSf(from.getSf());
        setGidp(from.getGidp());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IPitching> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PitchingRecord
     */
    public PitchingRecord() {
        super(Pitching.PITCHING);
    }

    /**
     * Create a detached, initialised PitchingRecord
     */
    public PitchingRecord(String playerid, Integer yearid, Integer stint, String teamid, String lgid, Integer w, Integer l, Integer g, Integer gs, Integer cg, Integer sho, Integer sv, Integer ipouts, Integer h, Integer er, Integer hr, Integer bb, Integer so, String baopp, Double era, String ibb, String wp, String hbp, Integer bk, String bfp, String gf, Integer r, String sh, String sf, String gidp) {
        super(Pitching.PITCHING);

        set(0, playerid);
        set(1, yearid);
        set(2, stint);
        set(3, teamid);
        set(4, lgid);
        set(5, w);
        set(6, l);
        set(7, g);
        set(8, gs);
        set(9, cg);
        set(10, sho);
        set(11, sv);
        set(12, ipouts);
        set(13, h);
        set(14, er);
        set(15, hr);
        set(16, bb);
        set(17, so);
        set(18, baopp);
        set(19, era);
        set(20, ibb);
        set(21, wp);
        set(22, hbp);
        set(23, bk);
        set(24, bfp);
        set(25, gf);
        set(26, r);
        set(27, sh);
        set(28, sf);
        set(29, gidp);
    }
}
