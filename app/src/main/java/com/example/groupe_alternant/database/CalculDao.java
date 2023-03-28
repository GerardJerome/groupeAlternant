package com.example.groupe_alternant.database;

import android.content.ContentValues;
import android.database.Cursor;

import com.example.groupe_alternant.entities.Calcul;

public class CalculDao  extends  BaseDao<Calcul>{

    public static String premierElement = "PREMIER_ELEMENT";
    public static String deuxiemeElement = "DEUXIEME_ELEMENT";
    public static String symbol = "SYMBOLE";
    public static String resultat = "RESULTAT";

    public static String tableName = "CALCULS";
    public CalculDao(DataBaseHelper helper) {
        super(helper);
    }

    @Override
    protected String getTableName() {
        return tableName;
    }

    @Override
    protected void putValues(ContentValues values, Calcul entity) {
        values.put(premierElement,entity.getPremierElement());
        values.put(deuxiemeElement,entity.getDeuxiemeElement());
        values.put(symbol,entity.getSymbol());
        values.put(resultat,entity.getResultat());
    }

    @Override
    protected Calcul getEntity(Cursor cursor) {
        Calcul calcul = new Calcul();
        Integer indexPremierElement = cursor.getColumnIndex(premierElement);
        Integer indexDeuxiemeElement = cursor.getColumnIndex(deuxiemeElement);
        Integer indexSymbol = cursor.getColumnIndex(symbol);
        Integer indexResultat = cursor.getColumnIndex(resultat);
        calcul.setSymbol(cursor.getString(indexSymbol));
        calcul.setPremierElement(cursor.getInt(indexPremierElement));
        calcul.setDeuxiemeElement(cursor.getInt(indexDeuxiemeElement));
        calcul.setResultat(cursor.getInt(indexResultat));
        return calcul;
    }
}
