package com.company;

public class MobileScroll implements WebsiteScroll {
    @Override
    public void scroll() {
        System.out.println("Scrolls by touch");
    }
}
