/*
 * This file is generated by jOOQ.
*/
package io.corbs.baseballdb.schema.tables.records;


import io.corbs.baseballdb.schema.tables.Fieldingpost;
import io.corbs.baseballdb.schema.tables.interfaces.IFieldingpost;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record17;
import org.jooq.Row17;
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
public class FieldingpostRecord extends TableRecordImpl<FieldingpostRecord> implements Record17<String, Integer, String, String, String, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, String, String>, IFieldingpost {

    private static final long serialVersionUID = -1666060452;

    /**
     * Setter for <code>baseballdb.FieldingPost.playerID</code>.
     */
    @Override
    public FieldingpostRecord setPlayerid(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.FieldingPost.playerID</code>.
     */
    @Override
    public String getPlayerid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>baseballdb.FieldingPost.yearID</code>.
     */
    @Override
    public FieldingpostRecord setYearid(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.FieldingPost.yearID</code>.
     */
    @Override
    public Integer getYearid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>baseballdb.FieldingPost.teamID</code>.
     */
    @Override
    public FieldingpostRecord setTeamid(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.FieldingPost.teamID</code>.
     */
    @Override
    public String getTeamid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>baseballdb.FieldingPost.lgID</code>.
     */
    @Override
    public FieldingpostRecord setLgid(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.FieldingPost.lgID</code>.
     */
    @Override
    public String getLgid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>baseballdb.FieldingPost.round</code>.
     */
    @Override
    public FieldingpostRecord setRound(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.FieldingPost.round</code>.
     */
    @Override
    public String getRound() {
        return (String) get(4);
    }

    /**
     * Setter for <code>baseballdb.FieldingPost.POS</code>.
     */
    @Override
    public FieldingpostRecord setPos(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.FieldingPost.POS</code>.
     */
    @Override
    public String getPos() {
        return (String) get(5);
    }

    /**
     * Setter for <code>baseballdb.FieldingPost.G</code>.
     */
    @Override
    public FieldingpostRecord setG(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.FieldingPost.G</code>.
     */
    @Override
    public Integer getG() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>baseballdb.FieldingPost.GS</code>.
     */
    @Override
    public FieldingpostRecord setGs(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.FieldingPost.GS</code>.
     */
    @Override
    public Integer getGs() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>baseballdb.FieldingPost.InnOuts</code>.
     */
    @Override
    public FieldingpostRecord setInnouts(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.FieldingPost.InnOuts</code>.
     */
    @Override
    public Integer getInnouts() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>baseballdb.FieldingPost.PO</code>.
     */
    @Override
    public FieldingpostRecord setPo(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.FieldingPost.PO</code>.
     */
    @Override
    public Integer getPo() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>baseballdb.FieldingPost.A</code>.
     */
    @Override
    public FieldingpostRecord setA(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.FieldingPost.A</code>.
     */
    @Override
    public Integer getA() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>baseballdb.FieldingPost.E</code>.
     */
    @Override
    public FieldingpostRecord setE(Integer value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.FieldingPost.E</code>.
     */
    @Override
    public Integer getE() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>baseballdb.FieldingPost.DP</code>.
     */
    @Override
    public FieldingpostRecord setDp(Integer value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.FieldingPost.DP</code>.
     */
    @Override
    public Integer getDp() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>baseballdb.FieldingPost.TP</code>.
     */
    @Override
    public FieldingpostRecord setTp(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.FieldingPost.TP</code>.
     */
    @Override
    public Integer getTp() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>baseballdb.FieldingPost.PB</code>.
     */
    @Override
    public FieldingpostRecord setPb(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.FieldingPost.PB</code>.
     */
    @Override
    public String getPb() {
        return (String) get(14);
    }

    /**
     * Setter for <code>baseballdb.FieldingPost.SB</code>.
     */
    @Override
    public FieldingpostRecord setSb(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.FieldingPost.SB</code>.
     */
    @Override
    public String getSb() {
        return (String) get(15);
    }

    /**
     * Setter for <code>baseballdb.FieldingPost.CS</code>.
     */
    @Override
    public FieldingpostRecord setCs(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.FieldingPost.CS</code>.
     */
    @Override
    public String getCs() {
        return (String) get(16);
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<String, Integer, String, String, String, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, String, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<String, Integer, String, String, String, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, String, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Fieldingpost.FIELDINGPOST.PLAYERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Fieldingpost.FIELDINGPOST.YEARID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Fieldingpost.FIELDINGPOST.TEAMID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Fieldingpost.FIELDINGPOST.LGID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Fieldingpost.FIELDINGPOST.ROUND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Fieldingpost.FIELDINGPOST.POS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Fieldingpost.FIELDINGPOST.G;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Fieldingpost.FIELDINGPOST.GS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Fieldingpost.FIELDINGPOST.INNOUTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Fieldingpost.FIELDINGPOST.PO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return Fieldingpost.FIELDINGPOST.A;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return Fieldingpost.FIELDINGPOST.E;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return Fieldingpost.FIELDINGPOST.DP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return Fieldingpost.FIELDINGPOST.TP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Fieldingpost.FIELDINGPOST.PB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Fieldingpost.FIELDINGPOST.SB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return Fieldingpost.FIELDINGPOST.CS;
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
    public String value5() {
        return getRound();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPos();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getG();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getGs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getInnouts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getPo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getA();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getE();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getDp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getTp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getPb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getSb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getCs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FieldingpostRecord value1(String value) {
        setPlayerid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FieldingpostRecord value2(Integer value) {
        setYearid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FieldingpostRecord value3(String value) {
        setTeamid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FieldingpostRecord value4(String value) {
        setLgid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FieldingpostRecord value5(String value) {
        setRound(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FieldingpostRecord value6(String value) {
        setPos(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FieldingpostRecord value7(Integer value) {
        setG(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FieldingpostRecord value8(Integer value) {
        setGs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FieldingpostRecord value9(Integer value) {
        setInnouts(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FieldingpostRecord value10(Integer value) {
        setPo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FieldingpostRecord value11(Integer value) {
        setA(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FieldingpostRecord value12(Integer value) {
        setE(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FieldingpostRecord value13(Integer value) {
        setDp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FieldingpostRecord value14(Integer value) {
        setTp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FieldingpostRecord value15(String value) {
        setPb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FieldingpostRecord value16(String value) {
        setSb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FieldingpostRecord value17(String value) {
        setCs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FieldingpostRecord values(String value1, Integer value2, String value3, String value4, String value5, String value6, Integer value7, Integer value8, Integer value9, Integer value10, Integer value11, Integer value12, Integer value13, Integer value14, String value15, String value16, String value17) {
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
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IFieldingpost from) {
        setPlayerid(from.getPlayerid());
        setYearid(from.getYearid());
        setTeamid(from.getTeamid());
        setLgid(from.getLgid());
        setRound(from.getRound());
        setPos(from.getPos());
        setG(from.getG());
        setGs(from.getGs());
        setInnouts(from.getInnouts());
        setPo(from.getPo());
        setA(from.getA());
        setE(from.getE());
        setDp(from.getDp());
        setTp(from.getTp());
        setPb(from.getPb());
        setSb(from.getSb());
        setCs(from.getCs());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IFieldingpost> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FieldingpostRecord
     */
    public FieldingpostRecord() {
        super(Fieldingpost.FIELDINGPOST);
    }

    /**
     * Create a detached, initialised FieldingpostRecord
     */
    public FieldingpostRecord(String playerid, Integer yearid, String teamid, String lgid, String round, String pos, Integer g, Integer gs, Integer innouts, Integer po, Integer a, Integer e, Integer dp, Integer tp, String pb, String sb, String cs) {
        super(Fieldingpost.FIELDINGPOST);

        set(0, playerid);
        set(1, yearid);
        set(2, teamid);
        set(3, lgid);
        set(4, round);
        set(5, pos);
        set(6, g);
        set(7, gs);
        set(8, innouts);
        set(9, po);
        set(10, a);
        set(11, e);
        set(12, dp);
        set(13, tp);
        set(14, pb);
        set(15, sb);
        set(16, cs);
    }
}
