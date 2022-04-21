package com.dennsizhong.observer.pull;

public class ChartPull implements ObserverPull{
    private DataSourcePull dataSourcePull;

    public ChartPull(DataSourcePull dataSourcePull) {
        this.dataSourcePull = dataSourcePull;
    }

    @Override
    public void update() {
        System.out.println("Chart got updated: "+ dataSourcePull.getValue());
    }
}
