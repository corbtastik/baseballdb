/*
 * This file is generated by jOOQ.
*/
package io.corbs.baseballdb.schema.tables;


import io.corbs.baseballdb.schema.Baseballdb;
import io.corbs.baseballdb.schema.tables.records.AppearancesRecord;

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
public class Appearances extends TableImpl<AppearancesRecord> {

    private static final long serialVersionUID = 854048640;

    /**
     * The reference instance of <code>baseballdb.Appearances</code>
     */
    public static final Appearances APPEARANCES = new Appearances();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AppearancesRecord> getRecordType() {
        return AppearancesRecord.class;
    }

    /**
     * The column <code>baseballdb.Appearances.yearID</code>.
     */
    public final TableField<AppearancesRecord, Integer> YEARID = createField("yearID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Appearances.teamID</code>.
     */
    public final TableField<AppearancesRecord, String> TEAMID = createField("teamID", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Appearances.lgID</code>.
     */
    public final TableField<AppearancesRecord, String> LGID = createField("lgID", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Appearances.playerID</code>.
     */
    public final TableField<AppearancesRecord, String> PLAYERID = createField("playerID", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Appearances.G_all</code>.
     */
    public final TableField<AppearancesRecord, Integer> G_ALL = createField("G_all", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Appearances.GS</code>.
     */
    public final TableField<AppearancesRecord, String> GS = createField("GS", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Appearances.G_batting</code>.
     */
    public final TableField<AppearancesRecord, Integer> G_BATTING = createField("G_batting", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Appearances.G_defense</code>.
     */
    public final TableField<AppearancesRecord, Integer> G_DEFENSE = createField("G_defense", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Appearances.G_p</code>.
     */
    public final TableField<AppearancesRecord, Integer> G_P = createField("G_p", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Appearances.G_c</code>.
     */
    public final TableField<AppearancesRecord, Integer> G_C = createField("G_c", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Appearances.G_1b</code>.
     */
    public final TableField<AppearancesRecord, Integer> G_1B = createField("G_1b", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Appearances.G_2b</code>.
     */
    public final TableField<AppearancesRecord, Integer> G_2B = createField("G_2b", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Appearances.G_3b</code>.
     */
    public final TableField<AppearancesRecord, Integer> G_3B = createField("G_3b", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Appearances.G_ss</code>.
     */
    public final TableField<AppearancesRecord, Integer> G_SS = createField("G_ss", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Appearances.G_lf</code>.
     */
    public final TableField<AppearancesRecord, Integer> G_LF = createField("G_lf", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Appearances.G_cf</code>.
     */
    public final TableField<AppearancesRecord, Integer> G_CF = createField("G_cf", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Appearances.G_rf</code>.
     */
    public final TableField<AppearancesRecord, Integer> G_RF = createField("G_rf", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Appearances.G_of</code>.
     */
    public final TableField<AppearancesRecord, Integer> G_OF = createField("G_of", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Appearances.G_dh</code>.
     */
    public final TableField<AppearancesRecord, String> G_DH = createField("G_dh", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Appearances.G_ph</code>.
     */
    public final TableField<AppearancesRecord, String> G_PH = createField("G_ph", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Appearances.G_pr</code>.
     */
    public final TableField<AppearancesRecord, String> G_PR = createField("G_pr", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>baseballdb.Appearances</code> table reference
     */
    public Appearances() {
        this("Appearances", null);
    }

    /**
     * Create an aliased <code>baseballdb.Appearances</code> table reference
     */
    public Appearances(String alias) {
        this(alias, APPEARANCES);
    }

    private Appearances(String alias, Table<AppearancesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Appearances(String alias, Table<AppearancesRecord> aliased, Field<?>[] parameters) {
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
    public Appearances as(String alias) {
        return new Appearances(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Appearances rename(String name) {
        return new Appearances(name, null);
    }
}
