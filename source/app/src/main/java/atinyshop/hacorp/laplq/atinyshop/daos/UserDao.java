package atinyshop.hacorp.laplq.atinyshop.daos;

import android.content.Context;

import java.util.List;

/**
 * Created by laplq on 15/09/05.
 */
public class UserDao extends Dao implements DaoInterface{

    String TABLE_NAME = "user";
    // Columns list

    final public static String  ID = "id";
    final public static String NAME = "name";
    final public static String AGE = "age";
    final public static String SEX = "sex";
    final public static String LINK_AVATAR = "link_avatar";

    public UserDao(Context context){
        super(context);
    }


    @Override
    public void setColumnList(List<ColumnProperties> columnList) {

    }
}
