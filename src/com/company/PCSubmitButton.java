package com.company;

public class PCSubmitButton implements SubmitButton{
    @Override
    public void submit() {
        System.out.println("Submit by cursor/keyboard");
    }
}
