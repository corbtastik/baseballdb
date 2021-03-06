/*
 * This file is generated by jOOQ.
*/
package io.corbs.baseballdb.schema.tables.records;


import io.corbs.baseballdb.schema.tables.Homegames;
import io.corbs.baseballdb.schema.tables.interfaces.IHomegames;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class HomegamesRecord extends TableRecordImpl<HomegamesRecord> implements Record9<Integer, String, String, String, String, String, Integer, Integer, Integer>, IHomegames {

    private static final long serialVersionUID = 1743797343;

    /**
     * Setter for <code>baseballdb.HomeGames.year.key</code>.
     */
    @Override
    public HomegamesRecord setYearKey(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.HomeGames.year.key</code>.
     */
    @Override
    public Integer getYearKey() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>baseballdb.HomeGames.league.key</code>.
     */
    @Override
    public HomegamesRecord setLeagueKey(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.HomeGames.league.key</code>.
     */
    @Override
    public String getLeagueKey() {
        return (String) get(1);
    }

    /**
     * Setter for <code>baseballdb.HomeGames.team.key</code>.
     */
    @Override
    public HomegamesRecord setTeamKey(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.HomeGames.team.key</code>.
     */
    @Override
    public String getTeamKey() {
        return (String) get(2);
    }

    /**
     * Setter for <code>baseballdb.HomeGames.park.key</code>.
     */
    @Override
    public HomegamesRecord setParkKey(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.HomeGames.park.key</code>.
     */
    @Override
    public String getParkKey() {
        return (String) get(3);
    }

    /**
     * Setter for <code>baseballdb.HomeGames.span.first</code>.
     */
    @Override
    public HomegamesRecord setSpanFirst(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.HomeGames.span.first</code>.
     */
    @Override
    public String getSpanFirst() {
        return (String) get(4);
    }

    /**
     * Setter for <code>baseballdb.HomeGames.span.last</code>.
     */
    @Override
    public HomegamesRecord setSpanLast(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.HomeGames.span.last</code>.
     */
    @Override
    public String getSpanLast() {
        return (String) get(5);
    }

    /**
     * Setter for <code>baseballdb.HomeGames.games</code>.
     */
    @Override
    public HomegamesRecord setGames(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.HomeGames.games</code>.
     */
    @Override
    public Integer getGames() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>baseballdb.HomeGames.openings</code>.
     */
    @Override
    public HomegamesRecord setOpenings(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.HomeGames.openings</code>.
     */
    @Override
    public Integer getOpenings() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>baseballdb.HomeGames.attendance</code>.
     */
    @Override
    public HomegamesRecord setAttendance(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.HomeGames.attendance</code>.
     */
    @Override
    public Integer getAttendance() {
        return (Integer) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, String, String, Integer, Integer, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, String, String, Integer, Integer, Integer> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Homegames.HOMEGAMES.YEAR_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Homegames.HOMEGAMES.LEAGUE_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Homegames.HOMEGAMES.TEAM_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Homegames.HOMEGAMES.PARK_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Homegames.HOMEGAMES.SPAN_FIRST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Homegames.HOMEGAMES.SPAN_LAST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Homegames.HOMEGAMES.GAMES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Homegames.HOMEGAMES.OPENINGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Homegames.HOMEGAMES.ATTENDANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getYearKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getLeagueKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTeamKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getParkKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSpanFirst();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSpanLast();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getGames();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getOpenings();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getAttendance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomegamesRecord value1(Integer value) {
        setYearKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomegamesRecord value2(String value) {
        setLeagueKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomegamesRecord value3(String value) {
        setTeamKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomegamesRecord value4(String value) {
        setParkKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomegamesRecord value5(String value) {
        setSpanFirst(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomegamesRecord value6(String value) {
        setSpanLast(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomegamesRecord value7(Integer value) {
        setGames(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomegamesRecord value8(Integer value) {
        setOpenings(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomegamesRecord value9(Integer value) {
        setAttendance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomegamesRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, Integer value7, Integer value8, Integer value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IHomegames from) {
        setYearKey(from.getYearKey());
        setLeagueKey(from.getLeagueKey());
        setTeamKey(from.getTeamKey());
        setParkKey(from.getParkKey());
        setSpanFirst(from.getSpanFirst());
        setSpanLast(from.getSpanLast());
        setGames(from.getGames());
        setOpenings(from.getOpenings());
        setAttendance(from.getAttendance());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IHomegames> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HomegamesRecord
     */
    public HomegamesRecord() {
        super(Homegames.HOMEGAMES);
    }

    /**
     * Create a detached, initialised HomegamesRecord
     */
    public HomegamesRecord(Integer yearKey, String leagueKey, String teamKey, String parkKey, String spanFirst, String spanLast, Integer games, Integer openings, Integer attendance) {
        super(Homegames.HOMEGAMES);

        set(0, yearKey);
        set(1, leagueKey);
        set(2, teamKey);
        set(3, parkKey);
        set(4, spanFirst);
        set(5, spanLast);
        set(6, games);
        set(7, openings);
        set(8, attendance);
    }
}
