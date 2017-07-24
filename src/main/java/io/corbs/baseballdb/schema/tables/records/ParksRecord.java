/*
 * This file is generated by jOOQ.
*/
package io.corbs.baseballdb.schema.tables.records;


import io.corbs.baseballdb.schema.tables.Parks;
import io.corbs.baseballdb.schema.tables.interfaces.IParks;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class ParksRecord extends TableRecordImpl<ParksRecord> implements Record6<String, String, String, String, String, String>, IParks {

    private static final long serialVersionUID = 28756963;

    /**
     * Setter for <code>baseballdb.Parks.park.key</code>.
     */
    @Override
    public ParksRecord setParkKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Parks.park.key</code>.
     */
    @Override
    public String getParkKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>baseballdb.Parks.park.name</code>.
     */
    @Override
    public ParksRecord setParkName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Parks.park.name</code>.
     */
    @Override
    public String getParkName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>baseballdb.Parks.park.alias</code>.
     */
    @Override
    public ParksRecord setParkAlias(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Parks.park.alias</code>.
     */
    @Override
    public String getParkAlias() {
        return (String) get(2);
    }

    /**
     * Setter for <code>baseballdb.Parks.city</code>.
     */
    @Override
    public ParksRecord setCity(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Parks.city</code>.
     */
    @Override
    public String getCity() {
        return (String) get(3);
    }

    /**
     * Setter for <code>baseballdb.Parks.state</code>.
     */
    @Override
    public ParksRecord setState(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Parks.state</code>.
     */
    @Override
    public String getState() {
        return (String) get(4);
    }

    /**
     * Setter for <code>baseballdb.Parks.country</code>.
     */
    @Override
    public ParksRecord setCountry(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Parks.country</code>.
     */
    @Override
    public String getCountry() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Parks.PARKS.PARK_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Parks.PARKS.PARK_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Parks.PARKS.PARK_ALIAS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Parks.PARKS.CITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Parks.PARKS.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Parks.PARKS.COUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getParkKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getParkName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getParkAlias();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParksRecord value1(String value) {
        setParkKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParksRecord value2(String value) {
        setParkName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParksRecord value3(String value) {
        setParkAlias(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParksRecord value4(String value) {
        setCity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParksRecord value5(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParksRecord value6(String value) {
        setCountry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParksRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IParks from) {
        setParkKey(from.getParkKey());
        setParkName(from.getParkName());
        setParkAlias(from.getParkAlias());
        setCity(from.getCity());
        setState(from.getState());
        setCountry(from.getCountry());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IParks> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ParksRecord
     */
    public ParksRecord() {
        super(Parks.PARKS);
    }

    /**
     * Create a detached, initialised ParksRecord
     */
    public ParksRecord(String parkKey, String parkName, String parkAlias, String city, String state, String country) {
        super(Parks.PARKS);

        set(0, parkKey);
        set(1, parkName);
        set(2, parkAlias);
        set(3, city);
        set(4, state);
        set(5, country);
    }
}
