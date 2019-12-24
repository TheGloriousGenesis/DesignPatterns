package main.decorator_pattern.Starbuzz;

import main.decorator_pattern.Starbuzz.models.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IODecorator {

    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream(System.getProperty("user.dir") +
                                    "\\src\\main\\decorator_pattern\\Starbuzz\\" + "test.txt")));
            while((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}