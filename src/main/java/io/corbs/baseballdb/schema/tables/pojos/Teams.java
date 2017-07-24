/*
 * This file is generated by jOOQ.
*/
package io.corbs.baseballdb.schema.tables.pojos;


import io.corbs.baseballdb.schema.tables.interfaces.ITeams;

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
public class Teams implements ITeams {

    private static final long serialVersionUID = -129704781;

    private Integer yearid;
    private String  lgid;
    private String  teamid;
    private String  franchid;
    private String  divid;
    private Integer rank;
    private Integer g;
    private String  ghome;
    private Integer w;
    private Integer l;
    private String  divwin;
    private String  wcwin;
    private String  lgwin;
    private String  wswin;
    private Integer r;
    private Integer ab;
    private Integer h;
    private Integer _2b;
    private Integer _3b;
    private Integer hr;
    private Integer bb;
    private Integer so;
    private Integer sb;
    private String  cs;
    private String  hbp;
    private String  sf;
    private Integer ra;
    private Integer er;
    private Double  era;
    private Integer cg;
    private Integer sho;
    private Integer sv;
    private Integer ipouts;
    private Integer ha;
    private Integer hra;
    private Integer bba;
    private Integer soa;
    private Integer e;
    private String  dp;
    private Double  fp;
    private String  name;
    private String  park;
    private String  attendance;
    private Integer bpf;
    private Integer ppf;
    private String  teamidbr;
    private String  teamidlahman45;
    private String  teamidretro;

    public Teams() {}

    public Teams(Teams value) {
        this.yearid = value.yearid;
        this.lgid = value.lgid;
        this.teamid = value.teamid;
        this.franchid = value.franchid;
        this.divid = value.divid;
        this.rank = value.rank;
        this.g = value.g;
        this.ghome = value.ghome;
        this.w = value.w;
        this.l = value.l;
        this.divwin = value.divwin;
        this.wcwin = value.wcwin;
        this.lgwin = value.lgwin;
        this.wswin = value.wswin;
        this.r = value.r;
        this.ab = value.ab;
        this.h = value.h;
        this._2b = value._2b;
        this._3b = value._3b;
        this.hr = value.hr;
        this.bb = value.bb;
        this.so = value.so;
        this.sb = value.sb;
        this.cs = value.cs;
        this.hbp = value.hbp;
        this.sf = value.sf;
        this.ra = value.ra;
        this.er = value.er;
        this.era = value.era;
        this.cg = value.cg;
        this.sho = value.sho;
        this.sv = value.sv;
        this.ipouts = value.ipouts;
        this.ha = value.ha;
        this.hra = value.hra;
        this.bba = value.bba;
        this.soa = value.soa;
        this.e = value.e;
        this.dp = value.dp;
        this.fp = value.fp;
        this.name = value.name;
        this.park = value.park;
        this.attendance = value.attendance;
        this.bpf = value.bpf;
        this.ppf = value.ppf;
        this.teamidbr = value.teamidbr;
        this.teamidlahman45 = value.teamidlahman45;
        this.teamidretro = value.teamidretro;
    }

    public Teams(
        Integer yearid,
        String  lgid,
        String  teamid,
        String  franchid,
        String  divid,
        Integer rank,
        Integer g,
        String  ghome,
        Integer w,
        Integer l,
        String  divwin,
        String  wcwin,
        String  lgwin,
        String  wswin,
        Integer r,
        Integer ab,
        Integer h,
        Integer _2b,
        Integer _3b,
        Integer hr,
        Integer bb,
        Integer so,
        Integer sb,
        String  cs,
        String  hbp,
        String  sf,
        Integer ra,
        Integer er,
        Double  era,
        Integer cg,
        Integer sho,
        Integer sv,
        Integer ipouts,
        Integer ha,
        Integer hra,
        Integer bba,
        Integer soa,
        Integer e,
        String  dp,
        Double  fp,
        String  name,
        String  park,
        String  attendance,
        Integer bpf,
        Integer ppf,
        String  teamidbr,
        String  teamidlahman45,
        String  teamidretro
    ) {
        this.yearid = yearid;
        this.lgid = lgid;
        this.teamid = teamid;
        this.franchid = franchid;
        this.divid = divid;
        this.rank = rank;
        this.g = g;
        this.ghome = ghome;
        this.w = w;
        this.l = l;
        this.divwin = divwin;
        this.wcwin = wcwin;
        this.lgwin = lgwin;
        this.wswin = wswin;
        this.r = r;
        this.ab = ab;
        this.h = h;
        this._2b = _2b;
        this._3b = _3b;
        this.hr = hr;
        this.bb = bb;
        this.so = so;
        this.sb = sb;
        this.cs = cs;
        this.hbp = hbp;
        this.sf = sf;
        this.ra = ra;
        this.er = er;
        this.era = era;
        this.cg = cg;
        this.sho = sho;
        this.sv = sv;
        this.ipouts = ipouts;
        this.ha = ha;
        this.hra = hra;
        this.bba = bba;
        this.soa = soa;
        this.e = e;
        this.dp = dp;
        this.fp = fp;
        this.name = name;
        this.park = park;
        this.attendance = attendance;
        this.bpf = bpf;
        this.ppf = ppf;
        this.teamidbr = teamidbr;
        this.teamidlahman45 = teamidlahman45;
        this.teamidretro = teamidretro;
    }

    @Override
    public Integer getYearid() {
        return this.yearid;
    }

    @Override
    public Teams setYearid(Integer yearid) {
        this.yearid = yearid;
        return this;
    }

    @Override
    public String getLgid() {
        return this.lgid;
    }

    @Override
    public Teams setLgid(String lgid) {
        this.lgid = lgid;
        return this;
    }

    @Override
    public String getTeamid() {
        return this.teamid;
    }

    @Override
    public Teams setTeamid(String teamid) {
        this.teamid = teamid;
        return this;
    }

    @Override
    public String getFranchid() {
        return this.franchid;
    }

    @Override
    public Teams setFranchid(String franchid) {
        this.franchid = franchid;
        return this;
    }

    @Override
    public String getDivid() {
        return this.divid;
    }

    @Override
    public Teams setDivid(String divid) {
        this.divid = divid;
        return this;
    }

    @Override
    public Integer getRank() {
        return this.rank;
    }

    @Override
    public Teams setRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    @Override
    public Integer getG() {
        return this.g;
    }

    @Override
    public Teams setG(Integer g) {
        this.g = g;
        return this;
    }

    @Override
    public String getGhome() {
        return this.ghome;
    }

    @Override
    public Teams setGhome(String ghome) {
        this.ghome = ghome;
        return this;
    }

    @Override
    public Integer getW() {
        return this.w;
    }

    @Override
    public Teams setW(Integer w) {
        this.w = w;
        return this;
    }

    @Override
    public Integer getL() {
        return this.l;
    }

    @Override
    public Teams setL(Integer l) {
        this.l = l;
        return this;
    }

    @Override
    public String getDivwin() {
        return this.divwin;
    }

    @Override
    public Teams setDivwin(String divwin) {
        this.divwin = divwin;
        return this;
    }

    @Override
    public String getWcwin() {
        return this.wcwin;
    }

    @Override
    public Teams setWcwin(String wcwin) {
        this.wcwin = wcwin;
        return this;
    }

    @Override
    public String getLgwin() {
        return this.lgwin;
    }

    @Override
    public Teams setLgwin(String lgwin) {
        this.lgwin = lgwin;
        return this;
    }

    @Override
    public String getWswin() {
        return this.wswin;
    }

    @Override
    public Teams setWswin(String wswin) {
        this.wswin = wswin;
        return this;
    }

    @Override
    public Integer getR() {
        return this.r;
    }

    @Override
    public Teams setR(Integer r) {
        this.r = r;
        return this;
    }

    @Override
    public Integer getAb() {
        return this.ab;
    }

    @Override
    public Teams setAb(Integer ab) {
        this.ab = ab;
        return this;
    }

    @Override
    public Integer getH() {
        return this.h;
    }

    @Override
    public Teams setH(Integer h) {
        this.h = h;
        return this;
    }

    @Override
    public Integer get_2b() {
        return this._2b;
    }

    @Override
    public Teams set_2b(Integer _2b) {
        this._2b = _2b;
        return this;
    }

    @Override
    public Integer get_3b() {
        return this._3b;
    }

    @Override
    public Teams set_3b(Integer _3b) {
        this._3b = _3b;
        return this;
    }

    @Override
    public Integer getHr() {
        return this.hr;
    }

    @Override
    public Teams setHr(Integer hr) {
        this.hr = hr;
        return this;
    }

    @Override
    public Integer getBb() {
        return this.bb;
    }

    @Override
    public Teams setBb(Integer bb) {
        this.bb = bb;
        return this;
    }

    @Override
    public Integer getSo() {
        return this.so;
    }

    @Override
    public Teams setSo(Integer so) {
        this.so = so;
        return this;
    }

    @Override
    public Integer getSb() {
        return this.sb;
    }

    @Override
    public Teams setSb(Integer sb) {
        this.sb = sb;
        return this;
    }

    @Override
    public String getCs() {
        return this.cs;
    }

    @Override
    public Teams setCs(String cs) {
        this.cs = cs;
        return this;
    }

    @Override
    public String getHbp() {
        return this.hbp;
    }

    @Override
    public Teams setHbp(String hbp) {
        this.hbp = hbp;
        return this;
    }

    @Override
    public String getSf() {
        return this.sf;
    }

    @Override
    public Teams setSf(String sf) {
        this.sf = sf;
        return this;
    }

    @Override
    public Integer getRa() {
        return this.ra;
    }

    @Override
    public Teams setRa(Integer ra) {
        this.ra = ra;
        return this;
    }

    @Override
    public Integer getEr() {
        return this.er;
    }

    @Override
    public Teams setEr(Integer er) {
        this.er = er;
        return this;
    }

    @Override
    public Double getEra() {
        return this.era;
    }

    @Override
    public Teams setEra(Double era) {
        this.era = era;
        return this;
    }

    @Override
    public Integer getCg() {
        return this.cg;
    }

    @Override
    public Teams setCg(Integer cg) {
        this.cg = cg;
        return this;
    }

    @Override
    public Integer getSho() {
        return this.sho;
    }

    @Override
    public Teams setSho(Integer sho) {
        this.sho = sho;
        return this;
    }

    @Override
    public Integer getSv() {
        return this.sv;
    }

    @Override
    public Teams setSv(Integer sv) {
        this.sv = sv;
        return this;
    }

    @Override
    public Integer getIpouts() {
        return this.ipouts;
    }

    @Override
    public Teams setIpouts(Integer ipouts) {
        this.ipouts = ipouts;
        return this;
    }

    @Override
    public Integer getHa() {
        return this.ha;
    }

    @Override
    public Teams setHa(Integer ha) {
        this.ha = ha;
        return this;
    }

    @Override
    public Integer getHra() {
        return this.hra;
    }

    @Override
    public Teams setHra(Integer hra) {
        this.hra = hra;
        return this;
    }

    @Override
    public Integer getBba() {
        return this.bba;
    }

    @Override
    public Teams setBba(Integer bba) {
        this.bba = bba;
        return this;
    }

    @Override
    public Integer getSoa() {
        return this.soa;
    }

    @Override
    public Teams setSoa(Integer soa) {
        this.soa = soa;
        return this;
    }

    @Override
    public Integer getE() {
        return this.e;
    }

    @Override
    public Teams setE(Integer e) {
        this.e = e;
        return this;
    }

    @Override
    public String getDp() {
        return this.dp;
    }

    @Override
    public Teams setDp(String dp) {
        this.dp = dp;
        return this;
    }

    @Override
    public Double getFp() {
        return this.fp;
    }

    @Override
    public Teams setFp(Double fp) {
        this.fp = fp;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Teams setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getPark() {
        return this.park;
    }

    @Override
    public Teams setPark(String park) {
        this.park = park;
        return this;
    }

    @Override
    public String getAttendance() {
        return this.attendance;
    }

    @Override
    public Teams setAttendance(String attendance) {
        this.attendance = attendance;
        return this;
    }

    @Override
    public Integer getBpf() {
        return this.bpf;
    }

    @Override
    public Teams setBpf(Integer bpf) {
        this.bpf = bpf;
        return this;
    }

    @Override
    public Integer getPpf() {
        return this.ppf;
    }

    @Override
    public Teams setPpf(Integer ppf) {
        this.ppf = ppf;
        return this;
    }

    @Override
    public String getTeamidbr() {
        return this.teamidbr;
    }

    @Override
    public Teams setTeamidbr(String teamidbr) {
        this.teamidbr = teamidbr;
        return this;
    }

    @Override
    public String getTeamidlahman45() {
        return this.teamidlahman45;
    }

    @Override
    public Teams setTeamidlahman45(String teamidlahman45) {
        this.teamidlahman45 = teamidlahman45;
        return this;
    }

    @Override
    public String getTeamidretro() {
        return this.teamidretro;
    }

    @Override
    public Teams setTeamidretro(String teamidretro) {
        this.teamidretro = teamidretro;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Teams (");

        sb.append(yearid);
        sb.append(", ").append(lgid);
        sb.append(", ").append(teamid);
        sb.append(", ").append(franchid);
        sb.append(", ").append(divid);
        sb.append(", ").append(rank);
        sb.append(", ").append(g);
        sb.append(", ").append(ghome);
        sb.append(", ").append(w);
        sb.append(", ").append(l);
        sb.append(", ").append(divwin);
        sb.append(", ").append(wcwin);
        sb.append(", ").append(lgwin);
        sb.append(", ").append(wswin);
        sb.append(", ").append(r);
        sb.append(", ").append(ab);
        sb.append(", ").append(h);
        sb.append(", ").append(_2b);
        sb.append(", ").append(_3b);
        sb.append(", ").append(hr);
        sb.append(", ").append(bb);
        sb.append(", ").append(so);
        sb.append(", ").append(sb);
        sb.append(", ").append(cs);
        sb.append(", ").append(hbp);
        sb.append(", ").append(sf);
        sb.append(", ").append(ra);
        sb.append(", ").append(er);
        sb.append(", ").append(era);
        sb.append(", ").append(cg);
        sb.append(", ").append(sho);
        sb.append(", ").append(sv);
        sb.append(", ").append(ipouts);
        sb.append(", ").append(ha);
        sb.append(", ").append(hra);
        sb.append(", ").append(bba);
        sb.append(", ").append(soa);
        sb.append(", ").append(e);
        sb.append(", ").append(dp);
        sb.append(", ").append(fp);
        sb.append(", ").append(name);
        sb.append(", ").append(park);
        sb.append(", ").append(attendance);
        sb.append(", ").append(bpf);
        sb.append(", ").append(ppf);
        sb.append(", ").append(teamidbr);
        sb.append(", ").append(teamidlahman45);
        sb.append(", ").append(teamidretro);

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
    public void from(ITeams from) {
        setYearid(from.getYearid());
        setLgid(from.getLgid());
        setTeamid(from.getTeamid());
        setFranchid(from.getFranchid());
        setDivid(from.getDivid());
        setRank(from.getRank());
        setG(from.getG());
        setGhome(from.getGhome());
        setW(from.getW());
        setL(from.getL());
        setDivwin(from.getDivwin());
        setWcwin(from.getWcwin());
        setLgwin(from.getLgwin());
        setWswin(from.getWswin());
        setR(from.getR());
        setAb(from.getAb());
        setH(from.getH());
        set_2b(from.get_2b());
        set_3b(from.get_3b());
        setHr(from.getHr());
        setBb(from.getBb());
        setSo(from.getSo());
        setSb(from.getSb());
        setCs(from.getCs());
        setHbp(from.getHbp());
        setSf(from.getSf());
        setRa(from.getRa());
        setEr(from.getEr());
        setEra(from.getEra());
        setCg(from.getCg());
        setSho(from.getSho());
        setSv(from.getSv());
        setIpouts(from.getIpouts());
        setHa(from.getHa());
        setHra(from.getHra());
        setBba(from.getBba());
        setSoa(from.getSoa());
        setE(from.getE());
        setDp(from.getDp());
        setFp(from.getFp());
        setName(from.getName());
        setPark(from.getPark());
        setAttendance(from.getAttendance());
        setBpf(from.getBpf());
        setPpf(from.getPpf());
        setTeamidbr(from.getTeamidbr());
        setTeamidlahman45(from.getTeamidlahman45());
        setTeamidretro(from.getTeamidretro());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ITeams> E into(E into) {
        into.from(this);
        return into;
    }
}