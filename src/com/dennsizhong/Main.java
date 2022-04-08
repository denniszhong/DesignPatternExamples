package com.dennsizhong;

import com.dennsizhong.factorymethod.Blog;
import com.dennsizhong.factorymethod.Website;
import com.dennsizhong.factorymethod.WebsiteFactory;
import com.dennsizhong.factorymethod.WebsiteType;
import com.dennsizhong.memento.Editor;
import com.dennsizhong.memento.History;
import com.dennsizhong.state.BrushTool;
import com.dennsizhong.state.Canvas;
import org.w3c.dom.Text;

public class Main {
    public static void main(String[] args) {
        // Factory method
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(site.getPages());
        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(site.getPages());

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
