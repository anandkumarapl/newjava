package utilities;

import databasepackage.DbConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class allbookings {
    public static String getTaskList() {
        try {
            String output = "<center>\n<table class=\" shadow-lg table table-striped table-hover \" border='1'>\n";
            output += "<tr><th>mobile</th><th>otp</th></tr>\n";
            PreparedStatement ps = DbConnect.connect().prepareStatement("select * from booking order by mobileno");
                        ResultSet rs = ps.executeQuery();
            int count = 1;
            while (rs.next()) {
                String mobile = "" + rs.getObject("mobile");
                String otp = "" + rs.getObject("otp");
                output += "<tr><td>" + count + " </td><td>" + mobile + " </td><td>" + otp + " </td></tr>\n";

                count++;
            }
            output += "</table>\n</center>\n";
            return output;

        } catch (Exception ex) {
            System.out.println(ex);
            return "";
        }}
}
