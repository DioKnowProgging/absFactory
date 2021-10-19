package com.company;

public class MobileFeatureFactory implements WebsiteFeatureFactory{
    @Override
    public SubmitButton createSubmitButton() {
        return new MobileSubmitButton();
    }

    @Override
    public WebsiteScroll createWebsiteScroll() {
        return new MobileScroll();
    }
}
