package com.dennsizhong.command;

import com.dennsizhong.command.fx.Command;

public class AddCustomerCommand implements Command {
    private CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void execute() {
        this.customerService.addCustomer();
    }
}
