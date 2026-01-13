package com.sl.rowset;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class FilteredRowSetDemo {

	private static final String URL = "jdbc:mysql://localhost:3306/cis_estore";
    private static final String USER = "root";
    private static final String PASSWORD = "rootroot";

    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

        RowSetFactory factory = RowSetProvider.newFactory();
        FilteredRowSet frs = factory.createFilteredRowSet();

        // Load data
        frs.setCommand("SELECT id, name, price FROM products");
        frs.execute(con);

        // Apply filter: price > 20000
        frs.setFilter(new PriceFilter(20000));

        System.out.println("Filtered products (price > 20000):");
        printRowSet(frs);

        frs.close();
        con.close();
    }

    // ---------------- PRINT ----------------
    private static void printRowSet(FilteredRowSet rowSet) throws Exception {

        System.out.printf("%-4s  %-20s  %12s%n", "ID", "Name", "Price");
        System.out.println("-".repeat(55));

        while (rowSet.next()) {
            System.out.printf(
                    "%-4d  %-20s  %12.2f%n",
                    rowSet.getInt("id"),
                    rowSet.getString("name"),
                    rowSet.getFloat("price")
            );
        }
    }

}
