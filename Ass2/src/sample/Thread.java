package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class Thread extends java.lang.Thread {

    protected Socket socket = null;
    protected PrintWriter out = null;
    protected BufferedReader in = null;
    private String[] fileText = new String[10000000];
    String input = null;


    /**
     * Constructor for threads to allow multithreading
     * @param socket    Socket to connect to server
     * @param fileText  file that will be read/written from/to
     */
    public Thread(Socket socket, String[] fileText) {
        this.socket = socket;
        this.fileText = fileText;
        try {
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            out.println("IOException occurred while opening a read/write connections");
        }
    }


    /**
     * Starts the threads when run
     */
    public void run() {
        boolean endOfSession = false;
        while (!endOfSession) {
            //endOfSession = processCommand();
        }

        // end of session
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Class to handle the commands dir, upload, and download
     * @param input determines which command is entered
     * @return
     */

    public boolean processCommand(String input) {


        //Todo make buttons return a string

        if (input.equals("dir")) {
            return false;

        }

        if (input.equals("upload")) {
            return false;

        }
        if (input.equals("download")) {
            return false;
        }
        else {


            return true;
        }



    }
}
