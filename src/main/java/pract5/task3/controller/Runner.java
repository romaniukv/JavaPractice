package pract5.task3.controller;

import pract5.task3.model.Translator;
import pract5.task3.model.TranslatorUtils;

import java.util.Scanner;

public class Runner {

    private Translator translator;

    public Runner(Translator translator) {
        this.translator = translator;
        TranslatorUtils.fillTranslator(translator);
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter phrase in english:");
        String englishPhrase = in.nextLine().toLowerCase();
        String russianPhrase = translator.translatePhrase(englishPhrase);
        System.out.println("Translated phrase:");
        System.out.println(russianPhrase);
    }
}
