/*
 * This file is generated by jOOQ.
*/
package io.corbs.baseballdb.schema.tables.records;


import io.corbs.baseballdb.schema.tables.Managers;
import io.corbs.baseballdb.schema.tables.interfaces.IManagers;

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
public class ManagersRecord extends TableRecordImpl<ManagersRecord> implements Record10<String, Integer, String, String, Integer, Integer, Integer, Integer, Integer, String>, IManagers {

    private static final long serialVersionUID = -997152109;

    /**
     * Setter for <code>baseballdb.Managers.playerID</code>.
     */
    @Override
    public ManagersRecord setPlayerid(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Managers.playerID</code>.
     */
    @Override
    public String getPlayerid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>baseballdb.Managers.yearID</code>.
     */
    @Override
    public ManagersRecord setYearid(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Managers.yearID</code>.
     */
    @Override
    public Integer getYearid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>baseballdb.Managers.teamID</code>.
     */
    @Override
    public ManagersRecord setTeamid(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Managers.teamID</code>.
     */
    @Override
    public String getTeamid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>baseballdb.Managers.lgID</code>.
     */
    @Override
    public ManagersRecord setLgid(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Managers.lgID</code>.
     */
    @Override
    public String getLgid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>baseballdb.Managers.inseason</code>.
     */
    @Override
    public ManagersRecord setInseason(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Managers.inseason</code>.
     */
    @Override
    public Integer getInseason() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>baseballdb.Managers.G</code>.
     */
    @Override
    public ManagersRecord setG(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Managers.G</code>.
     */
    @Override
    public Integer getG() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>baseballdb.Managers.W</code>.
     */
    @Override
    public ManagersRecord setW(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Managers.W</code>.
     */
    @Override
    public Integer getW() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>baseballdb.Managers.L</code>.
     */
    @Override
    public ManagersRecord setL(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Managers.L</code>.
     */
    @Override
    public Integer getL() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>baseballdb.Managers.rank</code>.
     */
    @Override
    public ManagersRecord setRank(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Managers.rank</code>.
     */
    @Override
    public Integer getRank() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>baseballdb.Managers.plyrMgr</code>.
     */
    @Override
    public ManagersRecord setPlyrmgr(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Managers.plyrMgr</code>.
     */
    @Override
    public String getPlyrmgr() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, Integer, String, String, Integer, Integer, Integer, Integer, Integer, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, Integer, String, String, Integer, Integer, Integer, Integer, Integer, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Managers.MANAGERS.PLAYERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Managers.MANAGERS.YEARID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Managers.MANAGERS.TEAMID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Managers.MANAGERS.LGID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Managers.MANAGERS.INSEASON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Managers.MANAGERS.G;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Managers.MANAGERS.W;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Managers.MANAGERS.L;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Managers.MANAGERS.RANK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Managers.MANAGERS.PLYRMGR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getPlayerid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getYearid();
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
    public String value4() {
        return getLgid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getInseason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getG();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getW();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getL();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getRank();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getPlyrmgr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagersRecord value1(String value) {
        setPlayerid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagersRecord value2(Integer value) {
        setYearid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagersRecord value3(String value) {
        setTeamid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagersRecord value4(String value) {
        setLgid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagersRecord value5(Integer value) {
        setInseason(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagersRecord value6(Integer value) {
        setG(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagersRecord value7(Integer value) {
        setW(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagersRecord value8(Integer value) {
        setL(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagersRecord value9(Integer value) {
        setRank(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagersRecord value10(String value) {
        setPlyrmgr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagersRecord values(String value1, Integer value2, String value3, String value4, Integer value5, Integer value6, Integer value7, Integer value8, Integer value9, String value10) {
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
    public void from(IManagers from) {
        setPlayerid(from.getPlayerid());
        setYearid(from.getYearid());
        setTeamid(from.getTeamid());
        setLgid(from.getLgid());
        setInseason(from.getInseason());
        setG(from.getG());
        setW(from.getW());
        setL(from.getL());
        setRank(from.getRank());
        setPlyrmgr(from.getPlyrmgr());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IManagers> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ManagersRecord
     */
    public ManagersRecord() {
        super(Managers.MANAGERS);
    }

    /**
     * Create a detached, initialised ManagersRecord
     */
    public ManagersRecord(String playerid, Integer yearid, String teamid, String lgid, Integer inseason, Integer g, Integer w, Integer l, Integer rank, String plyrmgr) {
        super(Managers.MANAGERS);

        set(0, playerid);
        set(1, yearid);
        set(2, teamid);
        set(3, lgid);
        set(4, inseason);
        set(5, g);
        set(6, w);
        set(7, l);
        set(8, rank);
        set(9, plyrmgr);
    }
}
