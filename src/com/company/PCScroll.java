package com.company;

public class PCScroll implements WebsiteScroll {
    @Override
    public void scroll() {
        System.out.println("Scrolling by cursor/keyboard");
    }
}
