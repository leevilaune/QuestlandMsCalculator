package org.leevilaune.mscalculator.ui;

import java.util.Scanner;

public class CLI {

    private Scanner cliReader;

    public CLI(){

        this.cliReader = new Scanner(System.in);
    }
    public void start(){
        while(true){
            System.out.print("> ");
            String command = cliReader.next();
            switch(command){
                case "exit":
                    System.out.println("Exited");
                    break;
                case "run ms":

            }
        }
    }
}
