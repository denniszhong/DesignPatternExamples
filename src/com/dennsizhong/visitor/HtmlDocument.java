package com.dennsizhong.visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    private List<HtmlNode> htmlNodes = new ArrayList<>();

    public void add(HtmlNode node) {
        htmlNodes.add(node);
    }

    public void execute(Operation operation)
    {
        for (var node: htmlNodes) {
            node.execute(operation);
        }
    }
}
