package com.dennsizhong.template;

public class TransferMoneyTask extends Task {
    public TransferMoneyTask() {
    }

    public TransferMoneyTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doExecute() {
        System.out.println("Transferring money");
    }
}
