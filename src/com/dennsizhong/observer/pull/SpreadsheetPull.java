package com.dennsizhong.observer.pull;

public class SpreadsheetPull implements ObserverPull{
    private DataSourcePull dataSourcePull;

    public SpreadsheetPull(DataSourcePull dataSourcePull) {
        this.dataSourcePull = dataSourcePull;
    }

    @Override
    public void update() {
        System.out.println("Spreadsheet got updated: " + dataSourcePull.getValue());
    }
}
