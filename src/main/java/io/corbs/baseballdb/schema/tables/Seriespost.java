/*
 * This file is generated by jOOQ.
*/
package io.corbs.baseballdb.schema.tables;


import io.corbs.baseballdb.schema.Baseballdb;
import io.corbs.baseballdb.schema.tables.records.SeriespostRecord;

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
public class Seriespost extends TableImpl<SeriespostRecord> {

    private static final long serialVersionUID = 1451045430;

    /**
     * The reference instance of <code>baseballdb.SeriesPost</code>
     */
    public static final Seriespost SERIESPOST = new Seriespost();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SeriespostRecord> getRecordType() {
        return SeriespostRecord.class;
    }

    /**
     * The column <code>baseballdb.SeriesPost.yearID</code>.
     */
    public final TableField<SeriespostRecord, Integer> YEARID = createField("yearID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.SeriesPost.round</code>.
     */
    public final TableField<SeriespostRecord, String> ROUND = createField("round", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.SeriesPost.teamIDwinner</code>.
     */
    public final TableField<SeriespostRecord, String> TEAMIDWINNER = createField("teamIDwinner", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.SeriesPost.lgIDwinner</code>.
     */
    public final TableField<SeriespostRecord, String> LGIDWINNER = createField("lgIDwinner", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.SeriesPost.teamIDloser</code>.
     */
    public final TableField<SeriespostRecord, String> TEAMIDLOSER = createField("teamIDloser", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.SeriesPost.lgIDloser</code>.
     */
    public final TableField<SeriespostRecord, String> LGIDLOSER = createField("lgIDloser", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.SeriesPost.wins</code>.
     */
    public final TableField<SeriespostRecord, Integer> WINS = createField("wins", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.SeriesPost.losses</code>.
     */
    public final TableField<SeriespostRecord, Integer> LOSSES = createField("losses", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.SeriesPost.ties</code>.
     */
    public final TableField<SeriespostRecord, Integer> TIES = createField("ties", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>baseballdb.SeriesPost</code> table reference
     */
    public Seriespost() {
        this("SeriesPost", null);
    }

    /**
     * Create an aliased <code>baseballdb.SeriesPost</code> table reference
     */
    public Seriespost(String alias) {
        this(alias, SERIESPOST);
    }

    private Seriespost(String alias, Table<SeriespostRecord> aliased) {
        this(alias, aliased, null);
    }

    private Seriespost(String alias, Table<SeriespostRecord> aliased, Field<?>[] parameters) {
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
    public Seriespost as(String alias) {
        return new Seriespost(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Seriespost rename(String name) {
        return new Seriespost(name, null);
    }
}