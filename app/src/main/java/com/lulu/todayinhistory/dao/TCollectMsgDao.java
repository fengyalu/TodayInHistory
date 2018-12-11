package com.lulu.todayinhistory.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.lulu.todayinhistory.bean.localdata.TCollectMsg;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TCOLLECT_MSG".
*/
public class TCollectMsgDao extends AbstractDao<TCollectMsg, String> {

    public static final String TABLENAME = "TCOLLECT_MSG";

    /**
     * Properties of entity TCollectMsg.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Titleid = new Property(0, String.class, "titleid", true, "TITLEID");
        public final static Property Year = new Property(1, String.class, "year", false, "YEAR");
        public final static Property Title = new Property(2, String.class, "title", false, "TITLE");
        public final static Property Thumbnail_url = new Property(3, String.class, "thumbnail_url", false, "THUMBNAIL_URL");
    }


    public TCollectMsgDao(DaoConfig config) {
        super(config);
    }
    
    public TCollectMsgDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TCOLLECT_MSG\" (" + //
                "\"TITLEID\" TEXT PRIMARY KEY NOT NULL ," + // 0: titleid
                "\"YEAR\" TEXT," + // 1: year
                "\"TITLE\" TEXT," + // 2: title
                "\"THUMBNAIL_URL\" TEXT);"); // 3: thumbnail_url
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TCOLLECT_MSG\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, TCollectMsg entity) {
        stmt.clearBindings();
 
        String titleid = entity.getTitleid();
        if (titleid != null) {
            stmt.bindString(1, titleid);
        }
 
        String year = entity.getYear();
        if (year != null) {
            stmt.bindString(2, year);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String thumbnail_url = entity.getThumbnail_url();
        if (thumbnail_url != null) {
            stmt.bindString(4, thumbnail_url);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, TCollectMsg entity) {
        stmt.clearBindings();
 
        String titleid = entity.getTitleid();
        if (titleid != null) {
            stmt.bindString(1, titleid);
        }
 
        String year = entity.getYear();
        if (year != null) {
            stmt.bindString(2, year);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String thumbnail_url = entity.getThumbnail_url();
        if (thumbnail_url != null) {
            stmt.bindString(4, thumbnail_url);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public TCollectMsg readEntity(Cursor cursor, int offset) {
        TCollectMsg entity = new TCollectMsg( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // titleid
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // year
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // title
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // thumbnail_url
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, TCollectMsg entity, int offset) {
        entity.setTitleid(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setYear(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTitle(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setThumbnail_url(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final String updateKeyAfterInsert(TCollectMsg entity, long rowId) {
        return entity.getTitleid();
    }
    
    @Override
    public String getKey(TCollectMsg entity) {
        if(entity != null) {
            return entity.getTitleid();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(TCollectMsg entity) {
        return entity.getTitleid() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
