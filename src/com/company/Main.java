package com.company;

public class Main {

    public static void main(String[] args) {
        WebsiteFeatureFactory factory = new MobileFeatureFactory();
        WebsiteScroll websiteScroll = factory.createWebsiteScroll();
        SubmitButton submitButton = factory.createSubmitButton();

        websiteScroll.scroll();
        submitButton.submit();
    }
}
