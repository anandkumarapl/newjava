package utilities;

import databasepackage.DbConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class delete {
    public static String getTaskList() {
        try {
            String output = "<center>\n<table class=\" shadow-lg table table-striped table-hover \" border='1'>\n";
            output += "<tr><th>mobile</th></tr>\n";
            PreparedStatement ps = DbConnect.connect().prepareStatement("delete from booking where mobileno=?");
                        ResultSet rs = ps.executeQuery();
            int count = 1;
            while (rs.next()) {
                String mobile = "" + rs.getObject("mobile");
                output += "<tr><td>" + count + " </td><td>" + mobile + " </td></tr>\n";

                count++;
            }
            output += "</table>\n</center>\n";
            return output;

        } catch (Exception ex) {
            System.out.println(ex);
            return "";
        }}
}
    