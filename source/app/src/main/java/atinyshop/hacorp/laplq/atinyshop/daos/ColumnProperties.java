package atinyshop.hacorp.laplq.atinyshop.daos;

public class ColumnProperties{

    String name = "";
    String datatype = "";
    String size = "";
    String defaultValue = "";
    String other = "";
    boolean isPrimaryKey = false;


    public ColumnProperties(String name, String datatype, String size, String defaultValue, String other, boolean isPrimaryKey) {
        this.name = name;
        this.datatype = datatype;
        this.size = size;
        this.defaultValue = defaultValue;
        this.other = other;
        this.isPrimaryKey = isPrimaryKey;
    }
}
