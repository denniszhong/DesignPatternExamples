package com.dennsizhong;

import com.dennsizhong.abstractfactory.CardType;
import com.dennsizhong.abstractfactory.CreditCard;
import com.dennsizhong.abstractfactory.CreditCardFactory;
import com.dennsizhong.factorymethod.Website;
import com.dennsizhong.factorymethod.WebsiteFactory;
import com.dennsizhong.factorymethod.WebsiteType;
import com.dennsizhong.iterator.BrowseHistory;
import com.dennsizhong.others.TaxCalculator;
import com.dennsizhong.others.TaxCalculator2019;
import com.dennsizhong.others.UIControl;
import com.dennsizhong.stragety.*;
import com.dennsizhong.template.AuditTrail;
import com.dennsizhong.template.TransferMoneyTask;

public class Main {
    public static void main(String[] args) {
        // Template Pattern
        var task = new TransferMoneyTask(new AuditTrail());
        task.execute();
        var task2 = new TransferMoneyTask();
        task2.execute();

        // Strategy Pattern
        /*
        var imageStorage = new ImageStorage(new JpegCompressor(), new HighContractFilter());
        imageStorage.store("a.jpg");
        var imageStorage2 = new ImageStorage(new PngCompressor(), new BlackAndWriteFilter());
        imageStorage2.store("b.png");
        */

        // Iterator
        /*
        var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        var iterator = history.getIterator();
        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
        */

        // Abstract Factory
        /*
        CreditCardFactory cardFactory = CreditCardFactory.getCreditCardFactory(780);
        CreditCard card = cardFactory.getCreditCard(CardType.GOLD);
        System.out.println(card.getClass());

        cardFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard card2 = cardFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(card2);
        */

        // Factory method
        /*
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(site.getPages());
        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(site.getPages());
        */

        // State Pattern
        /*
        var canvas = new Canvas();
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
        */

        // Memento Pattern
        /*
        var editor = new Editor();
        var history = new History();

        editor.setContent("ABC");
        history.push(editor.createState()); // abc

        editor.setContent("DEF");
        history.push(editor.createState()); // abc def

        history.pop(); // abc
        editor.restore(history.pop()); // undo 1
        System.out.println(editor.getContent());
        */

        // abstraction
        /*
        var mailService = new MailService();
        mailService.sendEmail();
        */

        // Inheritance
        /*
        // TextBox
        // Button
        // CheckBox
        // funcs: enable() / focus() / setPosition()

        //var textBox = new TextBox();
        //textBox.enable();
        */

        // Polymorphism
        //drawUIControl(new CheckBox());
    }

    public static void drawUIControl(UIControl control) {
        control.draw();
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }
}
