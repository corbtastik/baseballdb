/*
 * This file is generated by jOOQ.
*/
package io.corbs.baseballdb.schema.tables;


import io.corbs.baseballdb.schema.Baseballdb;
import io.corbs.baseballdb.schema.tables.records.SalariesRecord;

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
public class Salaries extends TableImpl<SalariesRecord> {

    private static final long serialVersionUID = 1680541224;

    /**
     * The reference instance of <code>baseballdb.Salaries</code>
     */
    public static final Salaries SALARIES = new Salaries();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SalariesRecord> getRecordType() {
        return SalariesRecord.class;
    }

    /**
     * The column <code>baseballdb.Salaries.yearID</code>.
     */
    public final TableField<SalariesRecord, Integer> YEARID = createField("yearID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>baseballdb.Salaries.teamID</code>.
     */
    public final TableField<SalariesRecord, String> TEAMID = createField("teamID", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Salaries.lgID</code>.
     */
    public final TableField<SalariesRecord, String> LGID = createField("lgID", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Salaries.playerID</code>.
     */
    public final TableField<SalariesRecord, String> PLAYERID = createField("playerID", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>baseballdb.Salaries.salary</code>.
     */
    public final TableField<SalariesRecord, Integer> SALARY = createField("salary", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>baseballdb.Salaries</code> table reference
     */
    public Salaries() {
        this("Salaries", null);
    }

    /**
     * Create an aliased <code>baseballdb.Salaries</code> table reference
     */
    public Salaries(String alias) {
        this(alias, SALARIES);
    }

    private Salaries(String alias, Table<SalariesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Salaries(String alias, Table<SalariesRecord> aliased, Field<?>[] parameters) {
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
    public Salaries as(String alias) {
        return new Salaries(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Salaries rename(String name) {
        return new Salaries(name, null);
    }
}