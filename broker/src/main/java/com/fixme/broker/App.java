package com.fixme.broker;


import jline.console.ConsoleReader;

import java.io.IOException;

public class App 
{
    public static void main( String[] args )
    {

        //Router router = new Router();

        try {
            ConsoleReader reader = new ConsoleReader();

            String line;

            while ((line = reader.readLine("Enter command: ")) != null) {
                System.out.println("Got: [" + line + "]");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
