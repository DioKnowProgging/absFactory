package com.company;

public class MobileSubmitButton implements SubmitButton {
    @Override
    public void submit() {
        System.out.println("Submit by touch");
    }
}
