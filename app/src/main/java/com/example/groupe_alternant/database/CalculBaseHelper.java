package com.example.groupe_alternant.database;

import android.content.Context;

public class CalculBaseHelper extends DataBaseHelper{
    public CalculBaseHelper(Context context, String dataBaseName, int dataBaseVersion) {
        super(context, dataBaseName, dataBaseVersion);
    }

    @Override
    protected String getCreationSql() {
        return "CREATE TABLE IF NOT EXISTS " + CalculDao.tableName + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                CalculDao.premierElement + " INTEGER NOT NULL," +
                CalculDao.deuxiemeElement + " INTEGER NOT NULL," +
                CalculDao.symbol + " VARCHAR(5) not null," +
                CalculDao.resultat + " INTEGER NOT NULL" +
                ")";
    }

    @Override
    protected String getDeleteSql() {
        return "DROP TABLE IF EXISTS "+CalculDao.tableName;    }
}
