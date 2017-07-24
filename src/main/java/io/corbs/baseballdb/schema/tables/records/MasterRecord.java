/*
 * This file is generated by jOOQ.
*/
package io.corbs.baseballdb.schema.tables.records;


import io.corbs.baseballdb.schema.tables.Master;
import io.corbs.baseballdb.schema.tables.interfaces.IMaster;

import javax.annotation.Generated;

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
public class MasterRecord extends TableRecordImpl<MasterRecord> implements IMaster {

    private static final long serialVersionUID = 717991308;

    /**
     * Setter for <code>baseballdb.Master.playerID</code>.
     */
    @Override
    public MasterRecord setPlayerid(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Master.playerID</code>.
     */
    @Override
    public String getPlayerid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>baseballdb.Master.birthYear</code>.
     */
    @Override
    public MasterRecord setBirthyear(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Master.birthYear</code>.
     */
    @Override
    public Integer getBirthyear() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>baseballdb.Master.birthMonth</code>.
     */
    @Override
    public MasterRecord setBirthmonth(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Master.birthMonth</code>.
     */
    @Override
    public Integer getBirthmonth() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>baseballdb.Master.birthDay</code>.
     */
    @Override
    public MasterRecord setBirthday(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Master.birthDay</code>.
     */
    @Override
    public Integer getBirthday() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>baseballdb.Master.birthCountry</code>.
     */
    @Override
    public MasterRecord setBirthcountry(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Master.birthCountry</code>.
     */
    @Override
    public String getBirthcountry() {
        return (String) get(4);
    }

    /**
     * Setter for <code>baseballdb.Master.birthState</code>.
     */
    @Override
    public MasterRecord setBirthstate(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Master.birthState</code>.
     */
    @Override
    public String getBirthstate() {
        return (String) get(5);
    }

    /**
     * Setter for <code>baseballdb.Master.birthCity</code>.
     */
    @Override
    public MasterRecord setBirthcity(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Master.birthCity</code>.
     */
    @Override
    public String getBirthcity() {
        return (String) get(6);
    }

    /**
     * Setter for <code>baseballdb.Master.deathYear</code>.
     */
    @Override
    public MasterRecord setDeathyear(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Master.deathYear</code>.
     */
    @Override
    public String getDeathyear() {
        return (String) get(7);
    }

    /**
     * Setter for <code>baseballdb.Master.deathMonth</code>.
     */
    @Override
    public MasterRecord setDeathmonth(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Master.deathMonth</code>.
     */
    @Override
    public String getDeathmonth() {
        return (String) get(8);
    }

    /**
     * Setter for <code>baseballdb.Master.deathDay</code>.
     */
    @Override
    public MasterRecord setDeathday(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Master.deathDay</code>.
     */
    @Override
    public String getDeathday() {
        return (String) get(9);
    }

    /**
     * Setter for <code>baseballdb.Master.deathCountry</code>.
     */
    @Override
    public MasterRecord setDeathcountry(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Master.deathCountry</code>.
     */
    @Override
    public String getDeathcountry() {
        return (String) get(10);
    }

    /**
     * Setter for <code>baseballdb.Master.deathState</code>.
     */
    @Override
    public MasterRecord setDeathstate(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Master.deathState</code>.
     */
    @Override
    public String getDeathstate() {
        return (String) get(11);
    }

    /**
     * Setter for <code>baseballdb.Master.deathCity</code>.
     */
    @Override
    public MasterRecord setDeathcity(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Master.deathCity</code>.
     */
    @Override
    public String getDeathcity() {
        return (String) get(12);
    }

    /**
     * Setter for <code>baseballdb.Master.nameFirst</code>.
     */
    @Override
    public MasterRecord setNamefirst(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Master.nameFirst</code>.
     */
    @Override
    public String getNamefirst() {
        return (String) get(13);
    }

    /**
     * Setter for <code>baseballdb.Master.nameLast</code>.
     */
    @Override
    public MasterRecord setNamelast(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Master.nameLast</code>.
     */
    @Override
    public String getNamelast() {
        return (String) get(14);
    }

    /**
     * Setter for <code>baseballdb.Master.nameGiven</code>.
     */
    @Override
    public MasterRecord setNamegiven(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Master.nameGiven</code>.
     */
    @Override
    public String getNamegiven() {
        return (String) get(15);
    }

    /**
     * Setter for <code>baseballdb.Master.weight</code>.
     */
    @Override
    public MasterRecord setWeight(Integer value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Master.weight</code>.
     */
    @Override
    public Integer getWeight() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>baseballdb.Master.height</code>.
     */
    @Override
    public MasterRecord setHeight(Integer value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Master.height</code>.
     */
    @Override
    public Integer getHeight() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>baseballdb.Master.bats</code>.
     */
    @Override
    public MasterRecord setBats(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Master.bats</code>.
     */
    @Override
    public String getBats() {
        return (String) get(18);
    }

    /**
     * Setter for <code>baseballdb.Master.throws</code>.
     */
    @Override
    public MasterRecord setThrows(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Master.throws</code>.
     */
    @Override
    public String getThrows() {
        return (String) get(19);
    }

    /**
     * Setter for <code>baseballdb.Master.debut</code>.
     */
    @Override
    public MasterRecord setDebut(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Master.debut</code>.
     */
    @Override
    public String getDebut() {
        return (String) get(20);
    }

    /**
     * Setter for <code>baseballdb.Master.finalGame</code>.
     */
    @Override
    public MasterRecord setFinalgame(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Master.finalGame</code>.
     */
    @Override
    public String getFinalgame() {
        return (String) get(21);
    }

    /**
     * Setter for <code>baseballdb.Master.retroID</code>.
     */
    @Override
    public MasterRecord setRetroid(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Master.retroID</code>.
     */
    @Override
    public String getRetroid() {
        return (String) get(22);
    }

    /**
     * Setter for <code>baseballdb.Master.bbrefID</code>.
     */
    @Override
    public MasterRecord setBbrefid(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>baseballdb.Master.bbrefID</code>.
     */
    @Override
    public String getBbrefid() {
        return (String) get(23);
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IMaster from) {
        setPlayerid(from.getPlayerid());
        setBirthyear(from.getBirthyear());
        setBirthmonth(from.getBirthmonth());
        setBirthday(from.getBirthday());
        setBirthcountry(from.getBirthcountry());
        setBirthstate(from.getBirthstate());
        setBirthcity(from.getBirthcity());
        setDeathyear(from.getDeathyear());
        setDeathmonth(from.getDeathmonth());
        setDeathday(from.getDeathday());
        setDeathcountry(from.getDeathcountry());
        setDeathstate(from.getDeathstate());
        setDeathcity(from.getDeathcity());
        setNamefirst(from.getNamefirst());
        setNamelast(from.getNamelast());
        setNamegiven(from.getNamegiven());
        setWeight(from.getWeight());
        setHeight(from.getHeight());
        setBats(from.getBats());
        setThrows(from.getThrows());
        setDebut(from.getDebut());
        setFinalgame(from.getFinalgame());
        setRetroid(from.getRetroid());
        setBbrefid(from.getBbrefid());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IMaster> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MasterRecord
     */
    public MasterRecord() {
        super(Master.MASTER);
    }

    /**
     * Create a detached, initialised MasterRecord
     */
    public MasterRecord(String playerid, Integer birthyear, Integer birthmonth, Integer birthday, String birthcountry, String birthstate, String birthcity, String deathyear, String deathmonth, String deathday, String deathcountry, String deathstate, String deathcity, String namefirst, String namelast, String namegiven, Integer weight, Integer height, String bats, String throws_, String debut, String finalgame, String retroid, String bbrefid) {
        super(Master.MASTER);

        set(0, playerid);
        set(1, birthyear);
        set(2, birthmonth);
        set(3, birthday);
        set(4, birthcountry);
        set(5, birthstate);
        set(6, birthcity);
        set(7, deathyear);
        set(8, deathmonth);
        set(9, deathday);
        set(10, deathcountry);
        set(11, deathstate);
        set(12, deathcity);
        set(13, namefirst);
        set(14, namelast);
        set(15, namegiven);
        set(16, weight);
        set(17, height);
        set(18, bats);
        set(19, throws_);
        set(20, debut);
        set(21, finalgame);
        set(22, retroid);
        set(23, bbrefid);
    }
}