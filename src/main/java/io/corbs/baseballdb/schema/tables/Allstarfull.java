/*
 * This file is generated by jOOQ.
*/
package io.corbs.baseballdb.schema.tables;


import io.corbs.baseballdb.schema.Baseballdb;
import io.corbs.baseballdb.schema.tables.records.AllstarfullRecord;

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
public class Allstarfull extends TableImpl<AllstarfullRecord> {

    private static final long serialVersionUID = -245517998;

    /**
     * The reference instance of <code>baseballdb.AllstarFull</code>
     */
    public static final Allstarfull ALLSTARFULL = new Allstarfull();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AllstarfullRecord> getRecordType() {
        return AllstarfullRecord.class;
    }

    /**
     * The column <code>baseballdb.AllstarFull.playerID</code>.
     */
    public final TableField<AllstarfullRecord, String> PLAYERID = createField("playerID", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.AllstarFull.yearID</code>.
     */
    public final TableField<AllstarfullRecord, Integer> YEARID = createField("yearID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.AllstarFull.gameNum</code>.
     */
    public final TableField<AllstarfullRecord, Integer> GAMENUM = createField("gameNum", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.AllstarFull.gameID</code>.
     */
    public final TableField<AllstarfullRecord, String> GAMEID = createField("gameID", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.AllstarFull.teamID</code>.
     */
    public final TableField<AllstarfullRecord, String> TEAMID = createField("teamID", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.AllstarFull.lgID</code>.
     */
    public final TableField<AllstarfullRecord, String> LGID = createField("lgID", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.AllstarFull.GP</code>.
     */
    public final TableField<AllstarfullRecord, Integer> GP = createField("GP", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.AllstarFull.startingPos</code>.
     */
    public final TableField<AllstarfullRecord, String> STARTINGPOS = createField("startingPos", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>baseballdb.AllstarFull</code> table reference
     */
    public Allstarfull() {
        this("AllstarFull", null);
    }

    /**
     * Create an aliased <code>baseballdb.AllstarFull</code> table reference
     */
    public Allstarfull(String alias) {
        this(alias, ALLSTARFULL);
    }

    private Allstarfull(String alias, Table<AllstarfullRecord> aliased) {
        this(alias, aliased, null);
    }

    private Allstarfull(String alias, Table<AllstarfullRecord> aliased, Field<?>[] parameters) {
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
    public Allstarfull as(String alias) {
        return new Allstarfull(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Allstarfull rename(String name) {
        return new Allstarfull(name, null);
    }
}