package com.mahindra.be_lms.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "PRODUCT".
 */
public class ProductDao extends AbstractDao<Product, Long> {

    public static final String TABLENAME = "PRODUCT";

    public ProductDao(DaoConfig config) {
        super(config);
    }


    public ProductDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "\"PRODUCT\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"PRODUCT_ID\" TEXT," + // 1: productID
                "\"PRODUCT_NAME\" TEXT," + // 2: productName
                "\"PRODUCT_SEQUENCE\" TEXT," + // 3: productSequence
                "\"PRODUCT_IMAGE_URL\" TEXT);"); // 4: productImageUrl
    }

    /**
     * Drops the underlying database table.
     */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"PRODUCT\"";
        db.execSQL(sql);
    }

    /**
     * @inheritdoc
     */
    @Override
    protected void bindValues(SQLiteStatement stmt, Product entity) {
        stmt.clearBindings();

        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }

        String productID = entity.getProductID();
        if (productID != null) {
            stmt.bindString(2, productID);
        }

        String productName = entity.getProductName();
        if (productName != null) {
            stmt.bindString(3, productName);
        }

        String productSequence = entity.getProductSequence();
        if (productSequence != null) {
            stmt.bindString(4, productSequence);
        }

        String productImageUrl = entity.getProductImageUrl();
        if (productImageUrl != null) {
            stmt.bindString(5, productImageUrl);
        }
    }

    /**
     * @inheritdoc
     */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }

    /**
     * @inheritdoc
     */
    @Override
    public Product readEntity(Cursor cursor, int offset) {
        Product entity = new Product( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
                cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // productID
                cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // productName
                cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // productSequence
                cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // productImageUrl
        );
        return entity;
    }

    /**
     * @inheritdoc
     */
    @Override
    public void readEntity(Cursor cursor, Product entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setProductID(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setProductName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setProductSequence(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setProductImageUrl(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
    }

    /**
     * @inheritdoc
     */
    @Override
    protected Long updateKeyAfterInsert(Product entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }

    /**
     * @inheritdoc
     */
    @Override
    public Long getKey(Product entity) {
        if (entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /**
     * @inheritdoc
     */
    @Override
    protected boolean isEntityUpdateable() {
        return true;
    }

    /**
     * Properties of entity Product.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property ProductID = new Property(1, String.class, "productID", false, "PRODUCT_ID");
        public final static Property ProductName = new Property(2, String.class, "productName", false, "PRODUCT_NAME");
        public final static Property ProductSequence = new Property(3, String.class, "productSequence", false, "PRODUCT_SEQUENCE");
        public final static Property ProductImageUrl = new Property(4, String.class, "productImageUrl", false, "PRODUCT_IMAGE_URL");
    }

}
