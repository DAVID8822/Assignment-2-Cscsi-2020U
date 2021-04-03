package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;

public class Main extends Application {
    @FXML
    void initialize(){


    }

    // Following methods are commented out to have the UI launch

    /**
     * Reads from a file and writes from the file to a "Location" file
     * @throws IOException
     */

    @FXML
    public void download() throws IOException {
        /*
        File file;
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = "";
        BufferedWriter bw = new BufferedWriter(new FileWriter("Location"));
        while ((line = br.readLine()) != null){
            System.out.println(line);
            bw.write(line);
        }
        */
    }

    /**
     * Selects a file from local directory
     * Reads from said file and adds to the table
     * @throws IOException
     */

    @FXML
    public void upload() throws IOException {
        /*

        String line = "";
        FileChooser fileChooser = new FileChooser();
        String currentFilename = fileChooser.showOpenDialog(stage).getName();
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Text Files", ".txt"));
        BufferedReader reader = new BufferedReader(new FileReader(currentFilename));
        while ((line = reader.readLine()) != null) {

            text += line;
            Entry entry =  new Entry();
            Table.add(entry);
        }
        finish reading
        reader.close();

        */
    }

    /**
     * Takes a file and reads from it in order to print the contents of the file
     * @param file the file to be read from
     * @throws IOException
     */

    @FXML
    public void dir(File file) throws IOException {
        // read the contents from the file
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        //output the contents of the file
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();

    }



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("File Sharing System");
        primaryStage.setScene(new Scene(root, 600, 425));
        //add UI elements to control the inputs for the client to replace the ChatServClient.run
        primaryStage.show();
        //Thread client = new Thread();
    }

}