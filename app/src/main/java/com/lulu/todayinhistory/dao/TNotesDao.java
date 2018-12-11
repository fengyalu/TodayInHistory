package com.lulu.todayinhistory.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.lulu.todayinhistory.bean.localdata.TNotes;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TNOTES".
*/
public class TNotesDao extends AbstractDao<TNotes, String> {

    public static final String TABLENAME = "TNOTES";

    /**
     * Properties of entity TNotes.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Title = new Property(0, String.class, "title", true, "TITLE");
        public final static Property Content = new Property(1, String.class, "content", false, "CONTENT");
        public final static Property DataTime = new Property(2, String.class, "dataTime", false, "DATA_TIME");
    }


    public TNotesDao(DaoConfig config) {
        super(config);
    }
    
    public TNotesDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TNOTES\" (" + //
                "\"TITLE\" TEXT PRIMARY KEY NOT NULL ," + // 0: title
                "\"CONTENT\" TEXT," + // 1: content
                "\"DATA_TIME\" TEXT);"); // 2: dataTime
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TNOTES\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, TNotes entity) {
        stmt.clearBindings();
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(1, title);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(2, content);
        }
 
        String dataTime = entity.getDataTime();
        if (dataTime != null) {
            stmt.bindString(3, dataTime);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, TNotes entity) {
        stmt.clearBindings();
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(1, title);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(2, content);
        }
 
        String dataTime = entity.getDataTime();
        if (dataTime != null) {
            stmt.bindString(3, dataTime);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public TNotes readEntity(Cursor cursor, int offset) {
        TNotes entity = new TNotes( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // title
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // content
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // dataTime
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, TNotes entity, int offset) {
        entity.setTitle(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setContent(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDataTime(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    @Override
    protected final String updateKeyAfterInsert(TNotes entity, long rowId) {
        return entity.getTitle();
    }
    
    @Override
    public String getKey(TNotes entity) {
        if(entity != null) {
            return entity.getTitle();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(TNotes entity) {
        return entity.getTitle() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
