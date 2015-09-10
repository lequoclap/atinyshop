package atinyshop.hacorp.laplq.atinyshop.daos;

import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by laplq on 15/09/05.
 */
public class Dao extends SQLiteOpenHelper {

    final public static String SCHEMA_NAME = "";

    String DATABASE_NAME = "atinyshop";
    String TABLE_NAME = "";
    List<ColumnProperties> columnList = new ArrayList<ColumnProperties>();

//     hashmap to add values that u wanna insert or update
//     key: column name
//     value: value of that column
    HashMap<String,String> valueMap = new HashMap<String,String>();

    public Dao(Context context)
    {
        super(context, DATABASE_NAME , null, 1);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


    }


    public int numberOfRows(){
        SQLiteDatabase db = this.getReadableDatabase();
        int numRows = (int) DatabaseUtils.queryNumEntries(db, TABLE_NAME);
        return numRows;
    }






}



