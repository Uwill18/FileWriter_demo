package filewriter.filewriter_demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.*;
import java.util.Scanner;

//source: https://wgu.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=01cbcd0a-6a5b-4193-b914-ab490112a69b

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
    }

    public static void main(String[] args) throws IOException{
        //Filename variable
        String filename ="src/main/java/files/groceries2.txt", item;

        //Create Scanner object
        Scanner keyboard = new Scanner(System.in);

        //Get items count

        System.out.print("How many items do you have? ");
        int numItems = keyboard.nextInt();

        //clear keyboard buffer
        keyboard.nextLine();


        //Create FileWriter object
        FileWriter fwriter = new FileWriter(filename, true);


        //Create and Open file
        PrintWriter outputFile = new PrintWriter(fwriter);

        //Get items and write to file
        for(int i=0; i < numItems;i++){
            System.out.print("Enter items "+(i+1) + ": ");
            item = keyboard.nextLine();
            outputFile.println(item);

        }

//Close file
        outputFile.close();
        System.out.println("File written!");


    }
}