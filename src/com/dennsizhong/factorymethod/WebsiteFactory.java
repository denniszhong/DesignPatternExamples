package com.dennsizhong.factorymethod;

public class WebsiteFactory {
    // This is the factory method:
    public static Website getWebsite(WebsiteType siteType)
    {
        switch (siteType) {
            case BLOG: return new Blog();
            case SHOP: return new Shop();
            default: return null;
        }
    }
}
