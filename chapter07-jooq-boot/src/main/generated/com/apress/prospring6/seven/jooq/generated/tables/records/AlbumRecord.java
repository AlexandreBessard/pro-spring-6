/*
 * This file is generated by jOOQ.
 */
package com.apress.prospring6.seven.jooq.generated.tables.records;


import com.apress.prospring6.seven.jooq.generated.tables.Album;

import java.time.LocalDate;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AlbumRecord extends UpdatableRecordImpl<AlbumRecord> implements Record5<Integer, Integer, Integer, String, LocalDate> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>musicdb.ALBUM.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>musicdb.ALBUM.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>musicdb.ALBUM.VERSION</code>.
     */
    public void setVersion(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>musicdb.ALBUM.VERSION</code>.
     */
    public Integer getVersion() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>musicdb.ALBUM.SINGER_ID</code>.
     */
    public void setSingerId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>musicdb.ALBUM.SINGER_ID</code>.
     */
    public Integer getSingerId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>musicdb.ALBUM.TITLE</code>.
     */
    public void setTitle(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>musicdb.ALBUM.TITLE</code>.
     */
    public String getTitle() {
        return (String) get(3);
    }

    /**
     * Setter for <code>musicdb.ALBUM.RELEASE_DATE</code>.
     */
    public void setReleaseDate(LocalDate value) {
        set(4, value);
    }

    /**
     * Getter for <code>musicdb.ALBUM.RELEASE_DATE</code>.
     */
    public LocalDate getReleaseDate() {
        return (LocalDate) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, Integer, String, LocalDate> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, Integer, Integer, String, LocalDate> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Album.ALBUM.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Album.ALBUM.VERSION;
    }

    @Override
    public Field<Integer> field3() {
        return Album.ALBUM.SINGER_ID;
    }

    @Override
    public Field<String> field4() {
        return Album.ALBUM.TITLE;
    }

    @Override
    public Field<LocalDate> field5() {
        return Album.ALBUM.RELEASE_DATE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getVersion();
    }

    @Override
    public Integer component3() {
        return getSingerId();
    }

    @Override
    public String component4() {
        return getTitle();
    }

    @Override
    public LocalDate component5() {
        return getReleaseDate();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getVersion();
    }

    @Override
    public Integer value3() {
        return getSingerId();
    }

    @Override
    public String value4() {
        return getTitle();
    }

    @Override
    public LocalDate value5() {
        return getReleaseDate();
    }

    @Override
    public AlbumRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public AlbumRecord value2(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public AlbumRecord value3(Integer value) {
        setSingerId(value);
        return this;
    }

    @Override
    public AlbumRecord value4(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public AlbumRecord value5(LocalDate value) {
        setReleaseDate(value);
        return this;
    }

    @Override
    public AlbumRecord values(Integer value1, Integer value2, Integer value3, String value4, LocalDate value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AlbumRecord
     */
    public AlbumRecord() {
        super(Album.ALBUM);
    }

    /**
     * Create a detached, initialised AlbumRecord
     */
    public AlbumRecord(Integer id, Integer version, Integer singerId, String title, LocalDate releaseDate) {
        super(Album.ALBUM);

        setId(id);
        setVersion(version);
        setSingerId(singerId);
        setTitle(title);
        setReleaseDate(releaseDate);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised AlbumRecord
     */
    public AlbumRecord(com.apress.prospring6.seven.jooq.generated.tables.pojos.Album value) {
        super(Album.ALBUM);

        if (value != null) {
            setId(value.getId());
            setVersion(value.getVersion());
            setSingerId(value.getSingerId());
            setTitle(value.getTitle());
            setReleaseDate(value.getReleaseDate());
            resetChangedOnNotNull();
        }
    }
}