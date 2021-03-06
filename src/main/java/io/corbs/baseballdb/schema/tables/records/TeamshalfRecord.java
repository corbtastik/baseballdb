/*
 * This file is generated by jOOQ.
*/
package io.corbs.baseballdb.schema.tables.records;


import io.corbs.baseballdb.schema.tables.Teamshalf;
import io.corbs.baseballdb.schema.tables.interfaces.ITeamshalf;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class TeamshalfRecord extends TableRecordImpl<TeamshalfRecord> implements Record10<Integer, String, String, Integer, String, String, Integer, Integer, Integer, Integer>, ITeamshalf {

    private static final long serialVersionUID = -1692888504;

    /**
     * Setter for <code>baseballdb.TeamsHalf.yearID</code>.
     */
    @Override
    public TeamshalfRecord setYearid(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.TeamsHalf.yearID</code>.
     */
    @Override
    public Integer getYearid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>baseballdb.TeamsHalf.lgID</code>.
     */
    @Override
    public TeamshalfRecord setLgid(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.TeamsHalf.lgID</code>.
     */
    @Override
    public String getLgid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>baseballdb.TeamsHalf.teamID</code>.
     */
    @Override
    public TeamshalfRecord setTeamid(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.TeamsHalf.teamID</code>.
     */
    @Override
    public String getTeamid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>baseballdb.TeamsHalf.Half</code>.
     */
    @Override
    public TeamshalfRecord setHalf(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.TeamsHalf.Half</code>.
     */
    @Override
    public Integer getHalf() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>baseballdb.TeamsHalf.divID</code>.
     */
    @Override
    public TeamshalfRecord setDivid(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.TeamsHalf.divID</code>.
     */
    @Override
    public String getDivid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>baseballdb.TeamsHalf.DivWin</code>.
     */
    @Override
    public TeamshalfRecord setDivwin(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.TeamsHalf.DivWin</code>.
     */
    @Override
    public String getDivwin() {
        return (String) get(5);
    }

    /**
     * Setter for <code>baseballdb.TeamsHalf.Rank</code>.
     */
    @Override
    public TeamshalfRecord setRank(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.TeamsHalf.Rank</code>.
     */
    @Override
    public Integer getRank() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>baseballdb.TeamsHalf.G</code>.
     */
    @Override
    public TeamshalfRecord setG(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.TeamsHalf.G</code>.
     */
    @Override
    public Integer getG() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>baseballdb.TeamsHalf.W</code>.
     */
    @Override
    public TeamshalfRecord setW(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.TeamsHalf.W</code>.
     */
    @Override
    public Integer getW() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>baseballdb.TeamsHalf.L</code>.
     */
    @Override
    public TeamshalfRecord setL(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.TeamsHalf.L</code>.
     */
    @Override
    public Integer getL() {
        return (Integer) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, Integer, String, String, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, Integer, String, String, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Teamshalf.TEAMSHALF.YEARID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Teamshalf.TEAMSHALF.LGID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Teamshalf.TEAMSHALF.TEAMID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Teamshalf.TEAMSHALF.HALF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Teamshalf.TEAMSHALF.DIVID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Teamshalf.TEAMSHALF.DIVWIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Teamshalf.TEAMSHALF.RANK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Teamshalf.TEAMSHALF.G;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Teamshalf.TEAMSHALF.W;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Teamshalf.TEAMSHALF.L;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getYearid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getLgid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTeamid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getHalf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDivid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDivwin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getRank();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getG();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getW();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getL();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamshalfRecord value1(Integer value) {
        setYearid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamshalfRecord value2(String value) {
        setLgid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamshalfRecord value3(String value) {
        setTeamid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamshalfRecord value4(Integer value) {
        setHalf(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamshalfRecord value5(String value) {
        setDivid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamshalfRecord value6(String value) {
        setDivwin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamshalfRecord value7(Integer value) {
        setRank(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamshalfRecord value8(Integer value) {
        setG(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamshalfRecord value9(Integer value) {
        setW(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamshalfRecord value10(Integer value) {
        setL(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamshalfRecord values(Integer value1, String value2, String value3, Integer value4, String value5, String value6, Integer value7, Integer value8, Integer value9, Integer value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ITeamshalf from) {
        setYearid(from.getYearid());
        setLgid(from.getLgid());
        setTeamid(from.getTeamid());
        setHalf(from.getHalf());
        setDivid(from.getDivid());
        setDivwin(from.getDivwin());
        setRank(from.getRank());
        setG(from.getG());
        setW(from.getW());
        setL(from.getL());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ITeamshalf> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TeamshalfRecord
     */
    public TeamshalfRecord() {
        super(Teamshalf.TEAMSHALF);
    }

    /**
     * Create a detached, initialised TeamshalfRecord
     */
    public TeamshalfRecord(Integer yearid, String lgid, String teamid, Integer half, String divid, String divwin, Integer rank, Integer g, Integer w, Integer l) {
        super(Teamshalf.TEAMSHALF);

        set(0, yearid);
        set(1, lgid);
        set(2, teamid);
        set(3, half);
        set(4, divid);
        set(5, divwin);
        set(6, rank);
        set(7, g);
        set(8, w);
        set(9, l);
    }
}
