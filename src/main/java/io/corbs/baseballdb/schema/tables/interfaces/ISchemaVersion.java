/*
 * This file is generated by jOOQ.
*/
package io.corbs.baseballdb.schema.tables.interfaces;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public interface ISchemaVersion extends Serializable {

    /**
     * Setter for <code>baseballdb.schema_version.installed_rank</code>.
     */
    public ISchemaVersion setInstalledRank(Integer value);

    /**
     * Getter for <code>baseballdb.schema_version.installed_rank</code>.
     */
    public Integer getInstalledRank();

    /**
     * Setter for <code>baseballdb.schema_version.version</code>.
     */
    public ISchemaVersion setVersion(String value);

    /**
     * Getter for <code>baseballdb.schema_version.version</code>.
     */
    public String getVersion();

    /**
     * Setter for <code>baseballdb.schema_version.description</code>.
     */
    public ISchemaVersion setDescription(String value);

    /**
     * Getter for <code>baseballdb.schema_version.description</code>.
     */
    public String getDescription();

    /**
     * Setter for <code>baseballdb.schema_version.type</code>.
     */
    public ISchemaVersion setType(String value);

    /**
     * Getter for <code>baseballdb.schema_version.type</code>.
     */
    public String getType();

    /**
     * Setter for <code>baseballdb.schema_version.script</code>.
     */
    public ISchemaVersion setScript(String value);

    /**
     * Getter for <code>baseballdb.schema_version.script</code>.
     */
    public String getScript();

    /**
     * Setter for <code>baseballdb.schema_version.checksum</code>.
     */
    public ISchemaVersion setChecksum(Integer value);

    /**
     * Getter for <code>baseballdb.schema_version.checksum</code>.
     */
    public Integer getChecksum();

    /**
     * Setter for <code>baseballdb.schema_version.installed_by</code>.
     */
    public ISchemaVersion setInstalledBy(String value);

    /**
     * Getter for <code>baseballdb.schema_version.installed_by</code>.
     */
    public String getInstalledBy();

    /**
     * Setter for <code>baseballdb.schema_version.installed_on</code>.
     */
    public ISchemaVersion setInstalledOn(Timestamp value);

    /**
     * Getter for <code>baseballdb.schema_version.installed_on</code>.
     */
    public Timestamp getInstalledOn();

    /**
     * Setter for <code>baseballdb.schema_version.execution_time</code>.
     */
    public ISchemaVersion setExecutionTime(Integer value);

    /**
     * Getter for <code>baseballdb.schema_version.execution_time</code>.
     */
    public Integer getExecutionTime();

    /**
     * Setter for <code>baseballdb.schema_version.success</code>.
     */
    public ISchemaVersion setSuccess(Byte value);

    /**
     * Getter for <code>baseballdb.schema_version.success</code>.
     */
    public Byte getSuccess();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ISchemaVersion
     */
    public void from(io.corbs.baseballdb.schema.tables.interfaces.ISchemaVersion from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ISchemaVersion
     */
    public <E extends io.corbs.baseballdb.schema.tables.interfaces.ISchemaVersion> E into(E into);
}
