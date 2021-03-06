/*
 * This file is generated by jOOQ.
*/
package io.corbs.baseballdb.schema.tables;


import io.corbs.baseballdb.schema.Baseballdb;
import io.corbs.baseballdb.schema.tables.records.TeamsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


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
public class Teams extends TableImpl<TeamsRecord> {

    private static final long serialVersionUID = -1078998435;

    /**
     * The reference instance of <code>baseballdb.Teams</code>
     */
    public static final Teams TEAMS = new Teams();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TeamsRecord> getRecordType() {
        return TeamsRecord.class;
    }

    /**
     * The column <code>baseballdb.Teams.yearID</code>.
     */
    public final TableField<TeamsRecord, Integer> YEARID = createField("yearID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.lgID</code>.
     */
    public final TableField<TeamsRecord, String> LGID = createField("lgID", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Teams.teamID</code>.
     */
    public final TableField<TeamsRecord, String> TEAMID = createField("teamID", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Teams.franchID</code>.
     */
    public final TableField<TeamsRecord, String> FRANCHID = createField("franchID", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Teams.divID</code>.
     */
    public final TableField<TeamsRecord, String> DIVID = createField("divID", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Teams.Rank</code>.
     */
    public final TableField<TeamsRecord, Integer> RANK = createField("Rank", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.G</code>.
     */
    public final TableField<TeamsRecord, Integer> G = createField("G", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.Ghome</code>.
     */
    public final TableField<TeamsRecord, String> GHOME = createField("Ghome", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Teams.W</code>.
     */
    public final TableField<TeamsRecord, Integer> W = createField("W", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.L</code>.
     */
    public final TableField<TeamsRecord, Integer> L = createField("L", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.DivWin</code>.
     */
    public final TableField<TeamsRecord, String> DIVWIN = createField("DivWin", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Teams.WCWin</code>.
     */
    public final TableField<TeamsRecord, String> WCWIN = createField("WCWin", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Teams.LgWin</code>.
     */
    public final TableField<TeamsRecord, String> LGWIN = createField("LgWin", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Teams.WSWin</code>.
     */
    public final TableField<TeamsRecord, String> WSWIN = createField("WSWin", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Teams.R</code>.
     */
    public final TableField<TeamsRecord, Integer> R = createField("R", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.AB</code>.
     */
    public final TableField<TeamsRecord, Integer> AB = createField("AB", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.H</code>.
     */
    public final TableField<TeamsRecord, Integer> H = createField("H", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.2B</code>.
     */
    public final TableField<TeamsRecord, Integer> _2B = createField("2B", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.3B</code>.
     */
    public final TableField<TeamsRecord, Integer> _3B = createField("3B", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.HR</code>.
     */
    public final TableField<TeamsRecord, Integer> HR = createField("HR", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.BB</code>.
     */
    public final TableField<TeamsRecord, Integer> BB = createField("BB", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.SO</code>.
     */
    public final TableField<TeamsRecord, Integer> SO = createField("SO", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.SB</code>.
     */
    public final TableField<TeamsRecord, Integer> SB = createField("SB", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.CS</code>.
     */
    public final TableField<TeamsRecord, String> CS = createField("CS", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Teams.HBP</code>.
     */
    public final TableField<TeamsRecord, String> HBP = createField("HBP", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Teams.SF</code>.
     */
    public final TableField<TeamsRecord, String> SF = createField("SF", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Teams.RA</code>.
     */
    public final TableField<TeamsRecord, Integer> RA = createField("RA", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.ER</code>.
     */
    public final TableField<TeamsRecord, Integer> ER = createField("ER", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.ERA</code>.
     */
    public final TableField<TeamsRecord, Double> ERA = createField("ERA", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>baseballdb.Teams.CG</code>.
     */
    public final TableField<TeamsRecord, Integer> CG = createField("CG", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.SHO</code>.
     */
    public final TableField<TeamsRecord, Integer> SHO = createField("SHO", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.SV</code>.
     */
    public final TableField<TeamsRecord, Integer> SV = createField("SV", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.IPouts</code>.
     */
    public final TableField<TeamsRecord, Integer> IPOUTS = createField("IPouts", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.HA</code>.
     */
    public final TableField<TeamsRecord, Integer> HA = createField("HA", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.HRA</code>.
     */
    public final TableField<TeamsRecord, Integer> HRA = createField("HRA", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.BBA</code>.
     */
    public final TableField<TeamsRecord, Integer> BBA = createField("BBA", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.SOA</code>.
     */
    public final TableField<TeamsRecord, Integer> SOA = createField("SOA", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.E</code>.
     */
    public final TableField<TeamsRecord, Integer> E = createField("E", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.DP</code>.
     */
    public final TableField<TeamsRecord, String> DP = createField("DP", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Teams.FP</code>.
     */
    public final TableField<TeamsRecord, Double> FP = createField("FP", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>baseballdb.Teams.name</code>.
     */
    public final TableField<TeamsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Teams.park</code>.
     */
    public final TableField<TeamsRecord, String> PARK = createField("park", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Teams.attendance</code>.
     */
    public final TableField<TeamsRecord, String> ATTENDANCE = createField("attendance", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Teams.BPF</code>.
     */
    public final TableField<TeamsRecord, Integer> BPF = createField("BPF", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.PPF</code>.
     */
    public final TableField<TeamsRecord, Integer> PPF = createField("PPF", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Teams.teamIDBR</code>.
     */
    public final TableField<TeamsRecord, String> TEAMIDBR = createField("teamIDBR", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Teams.teamIDlahman45</code>.
     */
    public final TableField<TeamsRecord, String> TEAMIDLAHMAN45 = createField("teamIDlahman45", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Teams.teamIDretro</code>.
     */
    public final TableField<TeamsRecord, String> TEAMIDRETRO = createField("teamIDretro", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>baseballdb.Teams</code> table reference
     */
    public Teams() {
        this("Teams", null);
    }

    /**
     * Create an aliased <code>baseballdb.Teams</code> table reference
     */
    public Teams(String alias) {
        this(alias, TEAMS);
    }

    private Teams(String alias, Table<TeamsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Teams(String alias, Table<TeamsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Baseballdb.BASEBALLDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Teams as(String alias) {
        return new Teams(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Teams rename(String name) {
        return new Teams(name, null);
    }
}
