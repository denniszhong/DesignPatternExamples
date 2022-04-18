package com.dennsizhong.iterator;

import java.util.ArrayList;
import java.util.List;


/*
* Here for Iterator pattern, we keep the change inside BrowseHistory class
* e.g. if we want to use String[] to replace List<String> , all changes will keep inside,
* and the caller ( from Main() ) will not be affected.
*/

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        var lastIndex = urls.size() -1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastIndex);

        return lastUrl;
    }

    // After implementing ListIterator, we don't need to expose getUrls,
    // we only need to expose Iterator interface
    //public List<String> getUrls() { return urls; }
    public Iterator getIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator {
        private BrowseHistory history;
        private int index; // Current index

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
