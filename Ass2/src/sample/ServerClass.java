package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


/**
 * Class to setup the server that will host the client
 */
public class ServerClass {
    @FXML
    Button downloadButton;
    @FXML
    Button uploadButton;


    protected Socket clientSocket           = null;
    protected ServerSocket serverSocket     = null;
    protected int numClients                = 0;
    protected Thread[] threads    = null;
    public static int SERVER_PORT = 16789;
    public static int MAX_CLIENTS = 25;
    ArrayList <String> files = new ArrayList();

    /**
     * Constructor for serverclass
     * Creates server and starts listening for port
     */

    public ServerClass() {
        try {
            serverSocket = new ServerSocket(SERVER_PORT);
            System.out.println("---------------------------");
            System.out.println("Assignment 2 Server Application is running");
            System.out.println("---------------------------");
            System.out.println("Listening to port: "+SERVER_PORT);
            threads = new Thread[MAX_CLIENTS];

            while(true) {
                clientSocket = serverSocket.accept();
            //    Thread thread = new Thread(clientSocket, new ArrayList<String>);
             //   thread.start();
            //    threads[numClients] = thread;
                threads[numClients].start();
            }
        } catch (IOException e) {
            System.err.println("IOException while creating server connection");
        }
    }


    public static void main(String[] args) {
        System.out.println(args[0]);
        ServerClass server = new ServerClass();
    }
}