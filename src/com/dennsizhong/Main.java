package com.dennsizhong;

import com.dennsizhong.adapter.CaramelFilter;
import com.dennsizhong.adapter.Image;
import com.dennsizhong.adapter.ImageView;
import com.dennsizhong.adapter.filterLib.Caramel;
import com.dennsizhong.composite.Group;
import com.dennsizhong.composite.Shape;
import com.dennsizhong.others.TaxCalculator;
import com.dennsizhong.others.TaxCalculator2019;
import com.dennsizhong.others.UIControl;

public class Main {
    public static void main(String[] args) {
        // Adapter pattern
        var image = new Image();
        var imageView = new ImageView(image);
        imageView.apply(new CaramelFilter(new Caramel()));

        // Composite pattern
        /*
        var shape1 = new Shape("shape1");
        var shape2 = new Shape("shape2");
        var group1 =  new Group("group1");
        group1.add(shape1);
        group1.add(shape2);

        var shape3 = new Shape("shape3");
        var group2 =  new Group("group2");
        group2.add(shape3);
        group2.add(group1);

        group2.render();
        group2.move();
        */

        // Visitor pattern
        /*
        var doc = new HtmlDocument();
        doc.add(new HeadingNode());
        doc.add(new AnchorNode());

        // Document execute an operation:
        // By using visitor pattern, every time when we add a new operation,
        //     we don't change anything for the new operation in client side,
        //     we only create a new class for new operation and implement the operation
        //     for all nodes in one place.
        doc.execute(new HighlightOperation());
        */

        // Chain of responsibility pattern
        /*
        // We want to handle in this order:
        // Authenticate -> log -> compress
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var auth = new Authenticator(logger);
        var webServer =  new WebServer(auth);
        // test: auth success, and will see logging and compressing
        webServer.process(new HttpRequest("Admin", "123"));
        */

        // Mediator Pattern - with observer pattern
        /*
        var dialog = new ArticleEditorDialogBox();
        dialog.simulateUserInteraction();
         */

        // Mediator Pattern
        /*
        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteraction();
         */

        // ObserverPull Pattern
        /*
        // Push mode
        var dataSource = new DataSource();
        var spreadsheet = new Spreadsheet();
        var chart = new Chart();
        dataSource.addObserver(spreadsheet);
        dataSource.addObserver(chart);
        dataSource.setValue(5);

        // Pull mode
        var dataSourcePull = new DataSourcePull();
        var spreadsheetPull = new SpreadsheetPull(dataSourcePull);
        var chartPull = new ChartPull(dataSourcePull);
        dataSourcePull.addObserver(spreadsheetPull);
        dataSourcePull.addObserver(chartPull);
        dataSourcePull.setValue(6);
        */

        // Command Pattern - Undoable command
        /*
        var document = new HtmlDocument();
        document.setContent("Hello design pattern!");
        var history = new History();

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
        */

        // Command Pattern
        /*
        // Sample code
        var customerService = new CustomerService();
        var command = new AddCustomerCommand(customerService);
        var button = new Button(command);
        button.click();

        // Record commands and reply
        var compositCommand = new CompositCommand();
        compositCommand.add(new ResizeCommand());
        compositCommand.add(new BlackAndWhiteCommand());
        compositCommand.execute();
        */

        // Template Pattern
        /*
        var task = new TransferMoneyTask(new AuditTrail());
        task.execute();
        var task2 = new TransferMoneyTask();
        task2.execute();
        */

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
