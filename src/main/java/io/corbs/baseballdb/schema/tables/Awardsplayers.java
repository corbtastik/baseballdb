/*
 * This file is generated by jOOQ.
*/
package io.corbs.baseballdb.schema.tables;


import io.corbs.baseballdb.schema.Baseballdb;
import io.corbs.baseballdb.schema.tables.records.AwardsplayersRecord;

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
public class Awardsplayers extends TableImpl<AwardsplayersRecord> {

    private static final long serialVersionUID = -583226645;

    /**
     * The reference instance of <code>baseballdb.AwardsPlayers</code>
     */
    public static final Awardsplayers AWARDSPLAYERS = new Awardsplayers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AwardsplayersRecord> getRecordType() {
        return AwardsplayersRecord.class;
    }

    /**
     * The column <code>baseballdb.AwardsPlayers.playerID</code>.
     */
    public final TableField<AwardsplayersRecord, String> PLAYERID = createField("playerID", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.AwardsPlayers.awardID</code>.
     */
    public final TableField<AwardsplayersRecord, String> AWARDID = createField("awardID", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.AwardsPlayers.yearID</code>.
     */
    public final TableField<AwardsplayersRecord, Integer> YEARID = createField("yearID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.AwardsPlayers.lgID</code>.
     */
    public final TableField<AwardsplayersRecord, String> LGID = createField("lgID", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.AwardsPlayers.tie</code>.
     */
    public final TableField<AwardsplayersRecord, String> TIE = createField("tie", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.AwardsPlayers.notes</code>.
     */
    public final TableField<AwardsplayersRecord, String> NOTES = createField("notes", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>baseballdb.AwardsPlayers</code> table reference
     */
    public Awardsplayers() {
        this("AwardsPlayers", null);
    }

    /**
     * Create an aliased <code>baseballdb.AwardsPlayers</code> table reference
     */
    public Awardsplayers(String alias) {
        this(alias, AWARDSPLAYERS);
    }

    private Awardsplayers(String alias, Table<AwardsplayersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Awardsplayers(String alias, Table<AwardsplayersRecord> aliased, Field<?>[] parameters) {
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
    public Awardsplayers as(String alias) {
        return new Awardsplayers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Awardsplayers rename(String name) {
        return new Awardsplayers(name, null);
    }
}
